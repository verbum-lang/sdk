
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

pthread_mutex_t mutex_workers = PTHREAD_MUTEX_INITIALIZER;
pthread_mutex_t mutex_nodes   = PTHREAD_MUTEX_INITIALIZER;

thread_worker_t *workers = NULL;
node_control_t  *nodes   = NULL;

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

    // Copy path.
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

        status = send_handshake(sock, "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\r\n\r\n");

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

int process_communication (int sock, char *path)
{
    char *response = NULL;

    if (!sock || !path)
        return 0;

    // Node Mapper protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Generate new node ID, and save.
     */
    if (strstr(response, "generate-verbum-node-id:"))
        add_new_node(sock, response);

    /**
     * Ping node.
     */
    else if (strstr(response, "ping-verbum-node:"))
        update_ping_node(sock, response);

    /**
     * Get node list.
     */
    else if (strstr(response, "get-node-list"))
        get_node_list(sock);

    /**
     * Create new node.
     */
    else if (strstr(response, "create-node"))
        create_node(sock, path);

    /**
     * Delete node.
     */
    else if (strstr(response, "delete-node:"))
        delete_node(sock, response);

    return 1;
}

node_control_t *node_create_item (void)
{
    node_control_t *node;
    mem_alloc_ret(node, sizeof(node_control_t), node_control_t *, NULL);

    node->status = 0;
    node->port   = 0;
    node->id     = NULL;
    node->next   = NULL;
    memset(node->last_connect_date, 0x0, 100);

    return node;
}

int node_insert_item (node_control_t *new_node)
{
    if (!new_node)
        return 0;

    pthread_mutex_lock(&mutex_nodes);
    node_control_t *node = nodes;

    while (1) {
        if (!node->next) {
            node->next = new_node;
            break;
        }

        node = node->next;
    }

    pthread_mutex_unlock(&mutex_nodes);
    return 1;
}

int add_new_node (int sock, char *content)
{
    #ifdef NMDBG
        say("generate new verbum node.");
    #endif

    if (!sock || !content)
        return 0;

    char port[256], prefix []= "generate-verbum-node-id:";
    char *id = NULL, *ptr = NULL, *date = NULL, *resp = NULL;
    int bytes = 0, size = 0, result = 1;
    node_control_t *node = node_create_item();

    if (!node)
        say_ret(0, "error create node item.");

    // Enable flag.
    node->status = 1;

    // Extract port.
    ptr = strstr(content, prefix);
    if (!ptr) {
        result = 0;
        goto ann_end;
    }

    ptr += strlen(prefix);
    memset(port, 0x0, 256);
    memcpy(port, ptr, strlen(ptr));

    node->port = atoi(port);

    // Generate ID.
    id = generate_new_id();
    if (!id) {
        result = 0;
        goto ann_end;
    }

    mem_scopy_ret(id, node->id, 0);

    // Generate date.
    date = make_datetime();
    if (!date) {
        result = 0;
        goto ann_end;
    }

    sprintf(node->last_connect_date, "%s", date);

    // Send new node ID to client.
    size = sizeof(char) * (strlen(node->id) + 256);
    mem_alloc_ret(resp, size, char *, 0);

    sprintf(resp, "%s\r\n\r\n", node->id);
    bytes = send(sock, resp, strlen(resp), 0);

    if (bytes == strlen(resp)) {
        if (!node_insert_item(node)) 
            say_ret(0, "error insert node item.");
    } else {
        memset(node->id, 0x0, strlen(node->id));
        free(node->id);
        free(node);
    }

    mem_sfree(resp);

    // Fail.
    ann_end:

    mem_sfree(id);
    mem_sfree(date);

    return result;
}

char *generate_new_id (void)
{
    char *id = NULL;
    char tmp [1024];
    int limit = 24, found = 0, size = 0;
    node_control_t *node;

    memset(tmp, 0x0, 1023);
    sprintf(tmp, "verbum-node-%d%d%d", 
        random_number(100, 999),
        random_number(100, 999),
        random_number(100, 999)
    );

    if (strlen(tmp) > limit)
        tmp[limit] = '\0';

    pthread_mutex_lock(&mutex_nodes);

    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;

        if (strcmp(node->id, tmp) == 0) {
            found = 1;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    if (found == 1)
        return generate_new_id();

    mem_scopy_ret(tmp, id, NULL);
    memset(tmp, 0x0, 1023);

    return id;    
}

int update_ping_node (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    #ifdef NMDBG
        say("ping verbum node.");
    #endif
    
    char prefix   [] = "ping-verbum-node:";
    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char tmp [1024];
    char *ptr = NULL, *date = NULL;
    int bytes = 0, index = -1, found = 0, size = 0;
    node_control_t *node_information;
    node_control_t *node;

    date = make_datetime();
    if (!date)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr) 
        goto upn_end;

    node_information = node_create_item();
    if (!node_information) {
        say("error create node item.");
        goto upn_end;
    }

    node_information->status = 1;
    sprintf(node_information->last_connect_date, "%s", date);

    // Extract request node informations.
    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; ptr[a] != '\0'; a++) {
        if (ptr[a] == ':') {
            mem_scopy_ret(tmp, node_information->id, 0);

            b = 0;
            a++;
            memset(tmp, 0x0, 1024);
        }

        tmp[b++] = ptr[a];
    }

    node_information->port = atoi(tmp);

    // Search node.
    pthread_mutex_lock(&mutex_nodes);

    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;
        if (!node_information->id)
            continue;

        if (strcmp(node->id, node_information->id) == 0) {
            
            // Update node information.
            memset(node->last_connect_date, 0x0, 100);
            sprintf(node->last_connect_date, "%s", date);
            found = 1;

            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // New existing node.
    if (found == 0) {
        if (!node_insert_item(node_information))
            say_ret(0, "error insert node item.");
    }
    else {
        mem_sfree(node_information->id);
        free(node_information);
    }

    bytes = send(sock, response, strlen(response), 0);

    upn_end:
    mem_sfree(date);
    return 1;
}

int get_node_list (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("get node list - called.");
    #endif

    char *message = NULL;
    char tmp [1024];
    int size = 0, sts = 0, a = 1;
    node_control_t *node;

    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        memset(tmp, 0x0, 1024);
        sprintf(tmp, "node: %d\nid: %s\nport: %d\nlast connection date: %s\n\n", 
            a, node->id, node->port, node->last_connect_date);

        message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
        if (!message)
            say_ret(0, "error alloc memory.");

        memcpy(&message[size], tmp, strlen(tmp));
        size += strlen(tmp);
        sts++;
        a++;
    }

    pthread_mutex_unlock(&mutex_nodes);

    if (sts)
        message[size] = '\0';
    else {
        size = 256;
        mem_salloc_ret(message, size, 0);
        sprintf(message, "nodes not found.\n");
        size = strlen(message);
    }

    sts = send(sock, message, size, 0);
    mem_sfree(message);
    return 1;
}

int create_node (int sock, char *path)
{
    if (!sock || !path)
        return 0;

    #ifdef NMDBG
        say("create node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS "\r\n\r\n";
    int status       = -1;

    system_execution_ret(0, "verbum-node -c \"%s\" &", path);

    status = send(sock, response, strlen(response), 0);
    return 1;
}

int delete_node (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    #ifdef NMDBG
        say("delete verbum node.");
    #endif

    char tmp[1024], prefix [] = "delete-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char address           [] = LOCALHOST;
    char *ptr = NULL;
    int bytes = 0, status = 0, counter = 0;
    node_control_t *node;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Search node.
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        if (strcmp(node->id, tmp) == 0) {
            
            // Send message to node.
            while (1) {
                char *response = process_delete_node(address, node->port, node->id);
                if (response) {
                    if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                        status = 1;
                        node->status = 0;
                        mem_sfree(response);
                        break;
                    }

                    mem_sfree(response);
                }
 
                usleep(1000);
                counter++;
                if (counter >= 3)
                    break;
            }

            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // Finish.
    dn_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return 0;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    return 1;
}


