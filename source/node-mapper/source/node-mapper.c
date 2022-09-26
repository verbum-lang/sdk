
#include "node-mapper.h"
#include "node-control.h"
#include "connection-control.h"
#include "communication.h"
#include "timeout-control.h"

static int              prepare_node_mapper     (void);
static int              prepare_timeout_control (void);
static void            *node_mapper_interface   (void *tparam);
static int              prepare_workers         (char *path, char *nm_id);
static thread_worker_t *worker_create_item      (int wid);
static int              worker_insert_item      (thread_worker_t *new_worker);
static void            *worker_handler          (void *tparam);

static pthread_mutex_t           mutex_workers = PTHREAD_MUTEX_INITIALIZER;
static thread_worker_t          *workers       = NULL;

extern node_control_t    *node_mapper_nodes;
extern pthread_mutex_t    node_mapper_mutex_nodes;

extern pthread_mutex_t    node_mapper_mutex_connections;
extern node_mapper_connection_t *node_mapper_connections;

/**
 * Initialization.
 */

int node_mapper (void)
{
    if (!ignore_sigpipe())
        say_ret(0, "sigaction() error.");

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) 
        say_ret(0, "mutex init failed - workers.");

    if (pthread_mutex_init(&node_mapper_mutex_nodes, NULL) != 0) 
        say_ret(0, "mutex init failed.");

    if (pthread_mutex_init(&node_mapper_mutex_connections, NULL) != 0) 
        say_ret(0, "mutex init failed.");

    // Prepare workers, node list and connection list.
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "error create worker item.");
    
    node_mapper_nodes = node_mapper_node_create_item();
    if (!node_mapper_nodes)
        say_ret(0, "error create node item.");

    node_mapper_connections = node_mapper_connection_create_item();
    if (!node_mapper_connections)
        say_ret(0, "error create connection item.");

    if (!prepare_node_mapper())
        return 0;

    if (!prepare_timeout_control())
        return 0;

    return 1;
}

int prepare_node_mapper (void)
{
    int status = 0, size = 0;
    pthread_t tid;
    interface_param_t *param;

    // Prepare thread param.
    mem_alloc_ret(param, sizeof(interface_param_t), interface_param_t *, 0);
    param->max_connections = SERVERS_MAX_CONNECTION;
    param->port            = global.configuration.node_mapper.server_port;

    // Copy path.
    // mem_scopy_ret(global.configuration.path, param->path, 0);
    mem_scopy_ret(global.configuration.node_mapper.id, param->id, 0);

    // Create thread.
    status = pthread_create(&tid, NULL, node_mapper_interface, param);
    if (status != 0)
        say_ret(0, "error creating thread - control of Node Mapper interface.");

    return 1;
}

int prepare_timeout_control (void)
{
    int status = 0, size = 0;
    pthread_t tid;
    interface_param_t *param;

    // Prepare thread param.
    mem_alloc_ret(param, sizeof(interface_param_t), interface_param_t *, 0);
    param->max_connections = SERVERS_MAX_CONNECTION;
    param->port            = global.configuration.node_mapper.server_port;

    // Copy path.
    // mem_scopy_ret(global.configuration.path, param->path, 0);
    mem_scopy_ret(global.configuration.node_mapper.id, param->id, 0);

    // Create thread.
    status = pthread_create(&tid, NULL, node_mapper_timeout_control, param);
    if (status != 0)
        say_ret(0, "error creating thread - timeout control (nodes and connections).");

    return 1;
}

void *node_mapper_interface (void *tparam)
{
    say("Node mapper interface - started!");

    interface_param_t *param = (interface_param_t *) tparam;
    struct sockaddr_in address, client;
    socklen_t client_size;
    int ssock = -1, nsock = -1, status = -1, block = 0;
    const int enable = 1;
    thread_worker_t *worker;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family      = AF_INET;
    address.sin_port        = htons(param->port);

    if (setsockopt(ssock, SOL_SOCKET, SO_REUSEADDR, &enable, sizeof(int)) < 0)
        say_ret(NULL, "Setsockopt (SO_REUSEADDR) failed.");

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
    if (status != 0)
        say_exit("Error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("Error listen server.");

    if (!prepare_workers(param->path, param->id))
        say_exit("Error prepare workers.");

    say("Node Mapper ID: %s", param->id);
    say("Node Mapper server port: %d", param->port);

    while (1) {
        
        // Process connection.
        client_size = sizeof(client);
        nsock = accept(ssock, (struct sockaddr*) &client, &client_size);

        if (nsock != -1) {

            #ifdef NMDBG
                say("connection accepted!");
            #endif

            // Configure socket.
            struct timeval tms;
            tms.tv_sec  = CONNECTION_TIMEOUT_RECV;
            tms.tv_usec = 0;
            setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

            // Checks if the thread is free to use.
            status = 0;
            pthread_mutex_lock(&mutex_workers);
            
            for (worker=workers; worker!=NULL; worker=worker->next) {
                if (worker->status == 0) {

                    // Send signal do worker.
                    worker->status = 1;
                    worker->sock   = nsock;

                    status = 1;
                    break;
                }
            }

            pthread_mutex_unlock(&mutex_workers);

            if (status == 0) {
                close(nsock);
                usleep(100000);
            }

        } else
            say("Error accept client.");
    }

    close(ssock);
    return NULL;
}

int prepare_workers (char *path, char *nm_id)
{
    thread_worker_t *worker;
    int status = -1, size = 0, result = 1;

    if (!nm_id)
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
        
        // // Path.
        // mem_salloc_scopy(path, param->path);

        // NM ID.
        mem_salloc_scopy(nm_id, param->nm_id);

        // Worker ID.
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
    char *path = NULL, *nm_id = NULL;

    // mem_scopy_ret(param->path, path, NULL);
    mem_scopy_ret(param->nm_id, nm_id, NULL);

    while (1) {

        /**
         * Checks if there is order to execute thread.
         */

        run = 0;
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

        if (run == 0) {
            usleep(100000);
            continue;
        }

        #ifdef NMDBG
            say("task started!");
        #endif

        /**
         * Process actions.
         */

        status = send_handshake(sock, 
            "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\r\n\r\n");

        if (status == 1)
            node_mapper_process_communication(sock, path, nm_id);

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


