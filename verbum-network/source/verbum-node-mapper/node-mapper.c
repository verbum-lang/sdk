
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

pthread_mutex_t mutex_workers = PTHREAD_MUTEX_INITIALIZER;
pthread_mutex_t mutex_nodes   = PTHREAD_MUTEX_INITIALIZER;

thread_worker_t * workers = NULL;
node_control_t *  nodes   = NULL;

/**
 * Initialization.
 */

void node_mapper (void)
{
    int status = 0, size = 0;
    pthread_t tid;

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) {
        debug_print("mutex init failed - workers.");
        return;
    }

    if (pthread_mutex_init(&mutex_nodes, NULL) != 0) {
        debug_print("mutex init failed.");
        return;
    }

    // Prepare workers and nodes list.
    workers = worker_create_item(0);
    nodes = node_create_item();

    // Prepare thread param.
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));
    if (!param)
        debug_exit("error allocating memory.");

    param->max_connections  = SERVERS_MAX_CONNECTION;
    param->port             = global.configuration.node_mapper.server_port;

    // Copy path.
    size = sizeof(char) * (strlen(global.configuration.path) + 1);
    param->path = (char *) malloc(size);

    if (!param->path)
        debug_exit("error memory allocation.");

    memset(param->path, 0x0, size);
    memcpy(param->path, global.configuration.path, strlen(global.configuration.path));

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

    prepare_workers(param->path);

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

void prepare_workers (char *path)
{
    thread_worker_t *worker;
    int status = -1, size = 0;

    // Prepare items.
    for (int a=1; a<NM_THREAD_LIMIT; a++)
        worker_insert_item(worker_create_item(a));

    // Prepare thread.
    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        worker_param_t *param = (worker_param_t *) malloc(sizeof(worker_param_t));
        if (!param)
            debug_exit("error allocating memory.");
        
        size = sizeof(char) * (strlen(path) + 1);
        param->path = (char *) malloc(size);

        if (!param->path)
            debug_exit("error memory allocation.");

        memset(param->path, 0x0, size);
        memcpy(param->path, path, strlen(path));

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
    worker->sock   = -1;
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
    worker_param_t  *param = (worker_param_t *) tparam;
    thread_worker_t *worker;
    int wid = -1, run = 0, sock = -1;
    int status = 0, size = 0;
    char *path = NULL;

    // Copy path.
    size = sizeof(char) * (strlen(param->path) + 1);
    path = (char *) malloc(size);

    if (!path) {
        debug_print("error memory allocation.");
        return NULL;
    }

    memset(path, 0x0, size);
    memcpy(path, param->path, strlen(param->path));

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

        status = send_handshake(sock);

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
}

int send_handshake (int sock)
{
    char handshake[] = "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\r\n\r\n";
    int status = -1, result = 0, counter = 0;

    while (1) {
        status = send(sock, handshake, strlen(handshake), 0);
        
        if (status > 0) {
            result = 1;
            break;
        }

        usleep(100);
        counter++;

        if (counter >= 30)
            break;
    }

    #ifdef NMDBG
        say("handshake sended!");
    #endif

    return result;
}

void process_communication (int sock, char *path)
{
    char *response = NULL;

    // Node Mapper protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return;

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

    /**
     * Create node client connection.
     */
    else if (strstr(response, "create-node-client-connection:"))
        create_node_client_connection(sock, response);

    /**
     * Create node server connection.
     */
    else if (strstr(response, "create-node-server-connection:"))
        create_node_server_connection(sock, response);
}

node_control_t * node_create_item (void)
{
    node_control_t *node = (node_control_t *) malloc(sizeof(node_control_t));

    if (!node)
        debug_exit("error memory allocation.");

    node->status           = 0;
    node->port             = 0;
    node->id               = NULL;
    node->next             = NULL;
    memset(node->last_connect_date, 0x0, 99);

    return node;
}

void node_insert_item (node_control_t *new_node)
{
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
}

void add_new_node (int sock, char *content)
{
    #ifdef NMDBG
        say("generate new verbum node.");
    #endif

    char port[256], prefix []= "generate-verbum-node-id:";
    char *id = NULL, *ptr = NULL, *date = NULL, *resp = NULL;
    int bytes = 0, size = 0;
    node_control_t *node = node_create_item();

    // Enable flag.
    node->status = 1;

    // Extract port.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto ann_end;

    ptr += strlen(prefix);
    memset(port, 0x0, 256);
    memcpy(port, ptr, strlen(ptr));

    node->port = atoi(port);

    // Generate ID.
    id = generate_new_id();
    if (!id)
        goto ann_end;

    size = sizeof(char) * (strlen(id) + 1);
    node->id = (char *) malloc(size);

    if (!node->id)
        debug_exit("error memory allocation.");

    memset(node->id, 0x0, size);
    memcpy(node->id, id, strlen(id));

    // Generate date.
    date = make_datetime();
    if (!date)
        goto ann_end;

    sprintf(node->last_connect_date, "%s", date);

    // Send new node ID to client.
    size = sizeof(char) * (strlen(node->id) + 256);
    resp = (char *) malloc(size);

    if (!resp)
        debug_exit("error memory allocation.");

    memset(resp, 0x0, size);
    sprintf(resp, "%s\r\n\r\n", node->id);

    bytes = send(sock, resp, strlen(resp), 0);
    if (bytes == strlen(resp))
        node_insert_item(node);
    else {
        memset(node->id, 0x0, strlen(node->id));
        free(node->id);
        free(node);
    }

    memset(resp, 0x0, size);
    free(resp);

    // Fail.
    ann_end:

    if (id) {
        memset(id, 0x0, strlen(id));
        free(id);
    }

    if (date) {
        memset(date, 0x0, strlen(date));
        free(date);
    }
}

char * generate_new_id (void)
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

    size = sizeof(char) * (strlen(tmp) + 1);
    id = (char *) malloc(size);
    if (!id)
        debug_exit("error memory allocation.");

    memset(id, 0x0, size);
    memcpy(id, tmp, strlen(tmp));
    memset(tmp, 0x0, 1023);

    return id;    
}

void update_ping_node (int sock, char *content)
{
    #ifdef NMDBG
        say("ping verbum node.");
    #endif
    
    char prefix   [] = "ping-verbum-node:";
    char response [] = VERBUM_DEFAULT_SUCCESS "\r\n\r\n";
    char tmp [1024];
    char *ptr = NULL, *date = NULL;
    int bytes = 0, index = -1, found = 0, size = 0;
    node_control_t *node_information;
    node_control_t *node;

    date = make_datetime();
    if (!date)
        return;

    ptr = strstr(content, prefix);
    if (!ptr) {
        memset(date, 0x0, strlen(date));
        free(date);
        return;
    }

    node_information = node_create_item();
    node_information->status = 1;
    sprintf(node_information->last_connect_date, "%s", date);

    // Extract request node informations.
    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; ptr[a] != '\0'; a++) {
        if (ptr[a] == ':') {
            memory_scopy(tmp, node_information->id);

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
            memset(node->last_connect_date, 0x0, 99);
            sprintf(node->last_connect_date, "%s", date);
            found = 1;

            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // New existing node.
    if (found == 0)
        node_insert_item(node_information);
    else {
        if (node_information->id) {
            memset(node_information->id, 0x0, strlen(node_information->id));
            free(node_information->id);
        }
    
        free(node_information);
    }

    memset(date, 0x0, strlen(date));
    free(date);

    bytes = send(sock, response, strlen(response), 0);
}

void get_node_list (int sock)
{
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
        if (!message) {
            debug_print("error alloc memory.");
            return;
        }

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
        memory_alloc(message, size);
        sprintf(message, "nodes not found.\n");
        size = strlen(message);
    }

    sts = send(sock, message, size, 0);
    memset(message, 0x0, size);
    free(message);
}

void create_node (int sock, char *path)
{
    #ifdef NMDBG
        say("create node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS;
    int status       = -1;

    system_execution("verbum-node -c \"%s\" &", path);

    status = send(sock, response, strlen(response), 0);
}

void delete_node (int sock, char *content)
{
    #ifdef NMDBG
        say("delete verbum node.");
    #endif

    char tmp[1024], prefix [] = "delete-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS "\r\n\r\n";
    char response_error    [] = VERBUM_DEFAULT_ERROR    "\r\n\r\n";
    char address           [] = LOCALHOST;
    char *ptr = NULL;
    int bytes = 0, status = 0, counter = 0;
    node_control_t *node;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto dn_end;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Clean \n, \r, \t.
    for (int a=0; tmp[a]!='\0'; a++) {
        switch (tmp[a]) {
            case '\n': case '\r': case '\t':
                tmp[a] = '\0';
                break;
        }
    }

    // Search node.
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        if (strcmp(node->id, tmp) == 0) {
            
            // Send message to node.
            while (1) {
                char *response = send_delete_node(address, node->port, node->id);
                if (response) {
                    if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                        status = 1;
                        node->status = 0;
                        memory_sclean(response);
                        break;
                    }

                    memory_sclean(response);
                }
 
                usleep(100);
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

    if (!status)
        bytes = send(sock, response_error, strlen(response_error), 0);
    else
        bytes = send(sock, response_success, strlen(response_success), 0);
}

void create_node_client_connection (int sock, char *content)
{

}

void create_node_server_connection (int sock, char *content)
{

}


