
#include "node-mapper.h"
#include "node-control.h"
#include "communication.h"

pthread_mutex_t mutex_workers = PTHREAD_MUTEX_INITIALIZER;
thread_worker_t *workers      = NULL;

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

/**
 * Initialization.
 */

int node_mapper (void)
{
    int status = 0, size = 0;
    pthread_t tid;
    interface_param_t *param;

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) 
        say_ret(0, "mutex init failed - workers.");

    if (pthread_mutex_init(&mutex_nodes, NULL) != 0) 
        say_ret(0, "mutex init failed.");

    // Prepare workers and nodes list.
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "error create worker item.");
    
    nodes = node_create_item();
    if (!nodes)
        say_ret(0, "error create node item.");

    // Prepare thread param.
    mem_alloc_ret(param, sizeof(interface_param_t), interface_param_t *, 0);
    param->max_connections = SERVERS_MAX_CONNECTION;
    param->port            = global.configuration.node_mapper.server_port;

    // Copy path.
    mem_scopy_ret(global.configuration.path, param->path, 0);

    // Create thread.
    status = pthread_create(&tid, NULL, node_mapper_interface, param);
    if (status != 0)
        say_ret(0, "error while creating thread - control of Node Mapper interface.");

    return 1;
}

void *node_mapper_interface (void *tparam)
{
    interface_param_t *param = (interface_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock = -1, nsock = -1, status = -1, block = 0;
    const int enable = 1;
    thread_worker_t *worker;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family      = AF_INET;
    address.sin_port        = htons(param->port);

    if (setsockopt(ssock, SOL_SOCKET, SO_REUSEADDR, &enable, sizeof(int)) < 0)
        say_ret(NULL, "setsockopt (SO_REUSEADDR) failed.");

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
    if (status != 0)
        say_ret(NULL, "error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_ret(NULL, "error listen server.");

    if (!prepare_workers(param->path))
        say_ret(NULL, "error prepare workers.");

    while (1) {
        
        // Checks if the thread is free to use.
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->status == 0) {

                // Process connection.
                nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
                if (nsock != -1) {

                    #ifdef NMDBG
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
}

int prepare_workers (char *path)
{
    thread_worker_t *worker;
    int status = -1, size = 0, result = 1;

    if (!path)
        return 0;

    // Prepare items.
    for (int a=1; a<NM_THREAD_LIMIT; a++) {
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
        
        size = sizeof(char) * (strlen(path) + 1);
        param->path = (char *) malloc(size);

        if (!param->path) {
            say("error memory allocation.");
            result = 0;
            break;
        }

        memset(param->path, 0x0, size);
        memcpy(param->path, path, strlen(path));
        param->wid = worker->wid;
        
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

thread_worker_t *worker_create_item (int wid)
{
    thread_worker_t * worker;
    mem_alloc_ret(worker, sizeof(thread_worker_t), thread_worker_t *, NULL);

    worker->wid    = wid;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

int worker_insert_item (thread_worker_t *new_worker)
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

void *worker_handler (void *tparam)
{
    worker_param_t  *param = (worker_param_t *) tparam;
    thread_worker_t *worker;
    int wid = -1, run = 0, sock = -1;
    int status = 0, size = 0;
    char *path = NULL;

    mem_scopy_ret(param->path, path, NULL);

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

        #ifdef NMDBG
            say("task started!");
        #endif

        /**
         * Process actions.
         */

        status = send_handshake(sock, 
            "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\r\n\r\n");

        if (status == 1)
            process_communication(sock, path);

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


