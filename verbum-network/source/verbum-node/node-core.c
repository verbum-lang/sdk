
#include "node-core.h"
#include "communication.h"
#include "ping-node-mapper.h"
#include "add-on-node-mapper.h"

static int              prepare_workers    (char *id, int port);
static thread_worker_t *worker_create_item (int wid);
static int              worker_insert_item (thread_worker_t *new_worker);
static void            *worker_handler     (void *tparam);

static pthread_mutex_t  mutex_workers = PTHREAD_MUTEX_INITIALIZER;
static thread_worker_t *workers       = NULL;
       node_param_t    *nc_param;

void *node_core (void *tparam)
{
    say("node core interface started!");

    nc_param = (node_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock  = -1, nsock = -1;
    int status = -1, port  =  0;
    const int enable = 1;
    thread_worker_t *worker;
        
    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;

    if (setsockopt(ssock, SOL_SOCKET, SO_REUSEADDR, &enable, sizeof(int)) < 0)
        say_ret(NULL, "setsockopt (SO_REUSEADDR) failed.");

    // Search node interface port.
    while (1) {
        for (port=3333; port<65000; port++) {
            if (port == nc_param->node_mapper_port)
                continue;

            address.sin_port = htons(port);
            status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
            if (status == 0)
                break;
        }

        if (status == -1)
            say_ret(NULL, "error finding available port for node creation (interface).");
        else
            break;
    }

    if (listen(ssock, nc_param->max_connections) != 0)
        say_ret(NULL, "error listen server.");

    // Register node on Node Mapper, and active ping controller.
    nc_param->information.port = port;

    if (!add_node_on_node_mapper())
        say_ret(NULL, "error adding node in Node Mapper.");

    if (!ping_node_action())
        say_ret(NULL, "error starting ping controller.");

    // Prepare workers and nodes list.
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "error create worker item.");

    if (!prepare_workers(nc_param->information.id, port))
        say_ret(NULL, "error prepare workers.");

    // Node core interface communication.
    while (1) {
        
        // Checks if the thread is free to use.
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->status == 0) {

                // Process connection.
                nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
                if (nsock != -1) {

                    #ifdef NCDBG
                        say("connection accepted!");
                    #endif

                    // Configure socket.
                    struct timeval tms;
                    tms.tv_sec  = CONNECTIONS_TIMEOUT1;
                    tms.tv_usec = 0;
                    setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

                    // Send signal do worker.
                    worker->sock   = nsock;
                    worker->status = 1;

                } else
                    debug_print("error accept client.");

                break;
            }
        }

        pthread_mutex_unlock(&mutex_workers);
        usleep(100);
    }

    close(ssock);
    return NULL;
}

static int prepare_workers (char *id, int port)
{
    thread_worker_t *worker;
    int status = -1, size = 0, result = 1;

    if (!id)
        return 0;

    // Prepare items.
    for (int a=1; a<NC_THREAD_LIMIT; a++) {
        thread_worker_t *new_worker = worker_create_item(a);

        if (!new_worker) {
            say("error allocationg memory.");
            result = 0;
            break;
        }

        if (!worker_insert_item(new_worker)) {
            say("error insert worker item.");
            result = 0;
            break;
        }
    }

    if (result == 0)
        goto pw_end;

    // Prepare threads.
    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        worker_param_t *param = (worker_param_t *) malloc(sizeof(worker_param_t));

        if (!param) {
            say("error allocating memory.");
            result = 0;
            break;
        }
        
        size = sizeof(char) * (strlen(id) + 1);
        param->nid = (char *) malloc(size);

        if (!param->nid) {
            say("error memory allocation.");
            result = 0;
            break;
        }

        memset(param->nid, 0x0, size);
        memcpy(param->nid, id, strlen(id));

        param->wid = worker->wid;
        param->interface_port = port;

        status = pthread_create(&worker->tid, NULL, worker_handler, param);

        if (status != 0) {
            say("error while creating thread - worker handler.");
            result = 0;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_workers);

    pw_end:
    return result;
}

static thread_worker_t *worker_create_item (int wid)
{
    thread_worker_t * worker;
    mem_alloc_ret(worker, sizeof(thread_worker_t), thread_worker_t *, NULL);

    worker->wid    = wid;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

static int worker_insert_item (thread_worker_t *new_worker)
{
    if (!new_worker)
        return 0;

    pthread_mutex_lock(&mutex_workers);
    thread_worker_t *worker = workers;

    while (1) {
        if (!worker->next) {
            worker->next = new_worker;
            break;
        }

        worker = worker->next;
    }

    pthread_mutex_unlock(&mutex_workers);
    return 1;
}

static void *worker_handler (void *tparam)
{
    worker_param_t  *param = (worker_param_t *) tparam;
    thread_worker_t *worker;
    int wid = -1, run = 0, sock = -1;
    int status = 0, size = 0;
    int interface_port = 0;
    char *id = NULL;

    interface_port = param->interface_port;
    mem_scopy_ret(param->nid, id, NULL);

    while (1) {

        /**
         * Checks if there is order to execute thread.
         */

        run = 0;
        usleep(100);
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->status == 1) {
                worker->status = 2;
                run  = 1;
                sock = worker->sock;
                wid  = worker->wid;
                break;
            }
        }
        
        pthread_mutex_unlock(&mutex_workers);

        if (run == 0)
            continue;

        #ifdef NCDBG
            say("task started!");
        #endif

        /**
         * Process actions.
         */

        status = send_handshake(sock, 
            "Verbum Node - v1.0.0 - I Love Jesus <3\r\n\r\n");

        if (status == 1)
            process_communication(sock, id, interface_port);

        /**
         * Finish.
         */

        w_finish:
        close(sock);
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->wid == wid) {
                worker->status = 0;
                worker->sock   = -1;
                break;
            }
        }
        
        pthread_mutex_unlock(&mutex_workers);
    }

    return NULL;
}


