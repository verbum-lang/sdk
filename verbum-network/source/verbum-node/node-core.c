
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-core.h"

pthread_mutex_t  mutex_workers = PTHREAD_MUTEX_INITIALIZER;
thread_worker_t *workers       = NULL;
node_param_t    *param;

void *node_core (void *tparam)
{
    say("node core interface started!");

    param = (node_param_t *) tparam;
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
            if (port == param->node_mapper_port)
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

    if (listen(ssock, param->max_connections) != 0)
        say_ret(NULL, "error listen server.");

    // Register node on Node Mapper, and active ping controller.
    param->information.port = port;

    if (!add_node_on_node_mapper())
        say_ret(NULL, "error adding node in Node Mapper.");

    if (!ping_node_action())
        say_ret(NULL, "error starting ping controller.");

    // Prepare workers and nodes list.
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "error create worker item.");

    if (!prepare_workers())
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

int add_node_on_node_mapper (void)
{
    char address [] = LOCALHOST;
    char *id        = NULL;
    
    while (1) {
        id = process_generate_node_id(
                address, param->node_mapper_port, param->information.port);
        
        if (id)
            break;

        usleep(1000);
    }

    mem_scopy_ret(id, param->information.id, 0);
    mem_sfree(id);

    return 1;
}

int ping_node_action (void)
{
    int status = -1;
    node_param_t *lparam;
    pthread_t tid;

    mem_alloc_ret(lparam, sizeof(node_param_t), node_param_t *, 0);
    mem_scopy_ret(param->information.id, lparam->information.id, 0);

    lparam->information.port = param->information.port;
    lparam->node_mapper_port = param->node_mapper_port;

    status = pthread_create(&tid, NULL, ping_node_handler, lparam);
    if (status != 0)
        say_ret(0, "error while creating thread - ping node controller.");

    return 1;
}

void *ping_node_handler (void *tparam)
{
    node_param_t *lparam = (node_param_t *) tparam;
    char address [] = LOCALHOST;
    
    say("node ping handler:");
    say("node id: %s", lparam->information.id);
    say("node port (interface): %d", lparam->information.port);

    while (1) {
        char *response = 
            process_ping_node(address, lparam->node_mapper_port, 
                lparam->information.id, lparam->information.port);
        
        if (response) {
            #ifdef NCDBG_PING
                say("ping response: %s", response);
            #endif

            mem_sfree(response);
        }

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}

int prepare_workers (void)
{
    thread_worker_t *worker;
    int status = -1, size = 0, result = 1;

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

        if (status == 1) {
            
            // Node protocol.
            char *response = get_recv_content(sock);
            if (response) {

                /**
                 * Delete node.
                 */
                if (strstr(response, "delete-verbum-node"))
                    delete_node(sock, response);

                mem_sfree(response);
            }
        }

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

void delete_node (int sock, char *content)
{
    char tmp[1024], prefix [] = "delete-verbum-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char *ptr = NULL;
    int bytes = 0, size = 0, status = 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto dn_end;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Check node.
    if (strcmp(param->information.id, tmp) == 0)
        status = 1;

    // Finish.
    dn_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    say("Verbum Node finished.");
    exit(0);
}


