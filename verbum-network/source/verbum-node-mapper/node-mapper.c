
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

pthread_mutex_t mutex_workers = PTHREAD_MUTEX_INITIALIZER;
thread_worker_t *workers = NULL;

/**
 * Initialization.
 */

void node_mapper (void)
{
    int status = 0;
    pthread_t tid;

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) {
        debug_print("mutex init failed - workers.");
        return;
    }

    // Prepare workers.
    workers = worker_create_item(0);

    // Prepare thread param.
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));

    if (!param)
        debug_exit("error allocating memory.");

    param->max_connections  = SERVERS_MAX_CONNECTION;
    param->port             = global.configuration.node_mapper.server_port;

    if ((status = pthread_create(&tid, NULL, node_mapper_interface, param)) != 0)
        debug_exit("error while creating thread - control of Node Mapper interface.");
}

void * node_mapper_interface (void *tparam)
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
        say("setsockopt (SO_REUSEADDR) failed.");

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
    if (status != 0)
        say_exit("error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("error listen server.");

    prepare_workers();

    while (1) {
        
        // Checks if the thread is free to use.
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->status == 0) {

                // Process connection.
                nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
                if (nsock != -1) {

                    // Configure socket.
                    struct timeval tms;
                    tms.tv_sec  = CONNECTIONS_TIMEOUT1;
                    tms.tv_usec = 0;
                    setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

                    // Send signal do worker.
                    worker->sock = nsock;
                    worker->status = 1;

                } else
                    debug_print("error accept client.");

                break;
            }
        }

        pthread_mutex_unlock(&mutex_workers);
        usleep(1000);
    }
}

void prepare_workers (void)
{
    thread_worker_t *worker;
    int status = -1;

    // Prepare items.
    for (int a=1; a<NM_THREAD_LIMIT; a++)
        worker_insert_item(worker_create_item(a));

    // Prepare thread.
    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        worker_param_t *param = (worker_param_t *) malloc(sizeof(worker_param_t));
        if (!param)
            debug_exit("error allocating memory.");
        
        param->wid = worker->wid;
        
        if ((status = pthread_create(&worker->tid, NULL, worker_handler, param)) != 0)
            debug_exit("error while creating thread - worker handler.");
    }

    pthread_mutex_unlock(&mutex_workers);
}

thread_worker_t * worker_create_item (int wid)
{
    thread_worker_t * worker = (thread_worker_t *) malloc(sizeof(thread_worker_t));

    if (!worker)
        debug_exit("error memory allocation.");

    worker->wid    = wid;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

void worker_insert_item (thread_worker_t *new_worker)
{
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
}

void * worker_handler (void *tparam)
{
    worker_param_t *param = (worker_param_t *) tparam;
    thread_worker_t *worker;
    int wid = -1, run = 0, sock = -1;

    while (1) {

        /**
         * Checks if there is order to execute thread.
         */

        run = 0;
        usleep(1000);
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

        /**
         * Process actions.
         */

        say("%d - Process actions...", wid);
        sleep(1);

        /**
         * Finish.
         */
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->wid == wid) {
                worker->status = 0;
                break;
            }
        }
        
        pthread_mutex_unlock(&mutex_workers);
    }
}


