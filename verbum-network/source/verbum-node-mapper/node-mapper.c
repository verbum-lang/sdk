
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

cvector_vector_type(node_control_t) nodes = NULL;
pthread_mutex_t mutex_nodes;

/**
 * Initialization.
 */

void node_mapper (void)
{
    int status = 0;
    pthread_t tid;
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));

    if (!param)
        debug_exit("error allocating memory.");

    if (pthread_mutex_init(&mutex_nodes, NULL) != 0) {
        debug_print("mutex init failed.");
        return;
    }

    param->max_connections  = SERVERS_MAX_CONNECTION;
    param->path             = CNULL;
    param->port             = global.configuration.node_mapper.server_port;
    param->sock             = -1;

    memory_scopy(global.configuration.path, param->path);

    if ((status = pthread_create(&tid, NULL, node_mapper_interface, param)) !=0)
        debug_exit("error while creating thread - control of Node Mapper interface.");
}

/**
 * Responsible for communicating with the Node Mapper interface.
 */

void * node_mapper_interface (void *tparam)
{
    interface_param_t *param = (interface_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    pthread_t tid;
    int ssock = -1, nsock = -1, status = -1;
    const int enable = 1;

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

    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            // Configure socket.
            struct timeval tms;
            tms.tv_sec  = CONNECTIONS_TIMEOUT1;
            tms.tv_usec = 0;
            setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

            // Create client handler.
            interface_param_t *hparam = (interface_param_t *) malloc(sizeof(interface_param_t));

            if (!hparam)
                debug_exit("error allocating memory.");

            hparam->max_connections  = SERVERS_MAX_CONNECTION;
            hparam->path             = CNULL;
            hparam->port             = param->port;
            hparam->sock             = nsock;
                        
            if ((status = pthread_create(&tid, NULL, node_mapper_interface_handler, hparam)) !=0)
                debug_exit("error while creating thread - handler of Node Mapper interface.");
        } else
            say_exit("error accept server.");
    }
}

/**
 * Client handler.
 */

void * node_mapper_interface_handler (void *tparam)
{
    interface_param_t *param = (interface_param_t *) tparam;
    char handshake[] = "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\n";
    int status = -1, sock = param->sock;

    // Send header (handshake).
    while (1) {
        status = send(sock, handshake, strlen(handshake), 0);
        if (status > 0) 
            break;
    }

    // Node Mapper protocol communication.
    node_mapper_process_communication(sock);

    close(sock);
}

void node_mapper_process_communication (int sock)
{
    char *content = CNULL;
    char tmp [512];
    int bytes = -1, status = 0;
    int bytes_received = 0, size = 0;

    while (1) {
        memset(tmp, 0x0, 512);
        bytes = recv(sock, tmp, 511, 0);

        if (bytes <= -1) 
            break;

        else if (bytes == 0) {
            status = 1;
            if (bytes_received > 0)
                content[ bytes_received ] = '\0';
            break;
        }
        
        else if (bytes > 0) {
            size = bytes + bytes_received + 1;
            content = (char *) realloc(content, size);

            if (!content)
                break;

            memcpy(&content[ bytes_received ], tmp, bytes);
            bytes_received += bytes;

            if (bytes_received > 0)
                content[ bytes_received ] = '\0';

            status = 1;
        }
    }

    if (!status || !content)
        return;

    #ifdef NMDBG
        say("raw data received: \"%s\"", content);
    #endif

    // ***
    // Process messages - Verbum Node Mapper Protocol.
    //

    /**
     * Generate new node ID, and save.
     */
    if (strstr(content, "generate-verbum-node-id:"))
        add_new_node(sock, content);

    /**
     * Ping node.
     */
    else if (strstr(content, "ping-verbum-node:"))
        update_ping_node(sock, content);

    /**
     * Get node list.
     */
    else if (strstr(content, "get-node-list"))
        get_node_list(sock);
}

void add_new_node (int sock, char *content)
{
    #ifdef NMDBG
        say("generate new verbum node.");
    #endif

    char port[256], prefix []= "generate-verbum-node-id:";
    char *id = CNULL, *ptr = CNULL, *date = CNULL;
    int bytes = 0;
    node_control_t node;

    node.id = CNULL;
    node.port = 0;
    memset(node.last_connect_date, 0x0, 100);

    // Extract port.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto ann_end;

    ptr += strlen(prefix);
    memset(port, 0x0, 256);
    memcpy(port, ptr, strlen(ptr));

    node.port = atoi(port);

    // Generate ID.
    pthread_mutex_lock(&mutex_nodes);

    id = generate_new_id();
    if (!id)
        goto ann_end;

    memory_scopy(id, node.id);

    date = make_datetime();
    if (!date)
        goto ann_end;

    sprintf(node.last_connect_date, "%s", date);
    cvector_push_back(nodes, node);

    pthread_mutex_unlock(&mutex_nodes);

    // Send new node ID to client.
    bytes = send(sock, id, strlen(id), 0);

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
    char *id = CNULL;
    char tmp [1024];
    int limit = 24;

    srand(time(NULL));
    memset(tmp, 0x0, 1024);
    sprintf(tmp, "verbum-node-%d%d%d", rand(), rand(), rand());

    if (strlen(tmp) > limit)
        tmp[limit] = '\0';

    if (nodes) {
        for (int a=0; a < cvector_size(nodes); ++a)
            if (strcmp(nodes[a].id, tmp) == 0) 
                return generate_new_id();
    }

    memory_scopy(tmp, id);
    memset(tmp, 0x0, 1024);

    return id;    
}

void update_ping_node (int sock, char *content)
{
    #ifdef NMDBG
        say("ping verbum node.");
    #endif
    
    char prefix   [] = "ping-verbum-node:";
    char response [] = "verbum-node-ok";
    char *ptr = CNULL, *date = CNULL;
    int bytes = 0, cnt = 0, index = -1;
    node_control_t node;

    node.port = 0;
    node.id = CNULL;
    memset(node.last_connect_date, 0x0, 100);

    // Extract request node informations.
    ptr = strtok(content, ":");
    while (ptr != NULL) {
        switch (cnt) {
            case 1:
                memory_scopy(ptr, node.id);
                break;
            case 2:
                node.port = atoi(ptr);
                break;
        }

        ptr = strtok(NULL, ":");
        cnt++;
    }

    date = make_datetime();
    if (!date)
        return;

    sprintf(node.last_connect_date, "%s", date);

    // Process node.
    pthread_mutex_lock(&mutex_nodes);

    // Search node.
    if (nodes) {
        for (int a=0; a < cvector_size(nodes); ++a) {
            if (strcmp(nodes[a].id, node.id) == 0) {
                index = a;
                break;
            }
        }
    }

    // Update node information.
    if (index != -1) {
        memset(nodes[index].last_connect_date, 0x0, 100);
        sprintf(nodes[index].last_connect_date, "%s", date);

        bytes = send(sock, response, strlen(response), 0);
    }

    // Add new existing node.
    else {
        
    }

    upn_end:
    pthread_mutex_unlock(&mutex_nodes);

    if (index != -1) {
        memset(node.id, 0x0, strlen(node.id));
        free(node.id);
    }

    if (date) {
        memset(date, 0x0, strlen(date));
        free(date);
    }
}

void get_node_list(int sock)
{
    #ifdef NMDBG
        say("get node list - called.");
    #endif

    char *message = CNULL;
    char tmp [1024];
    int size = 0, sts = 0;

    pthread_mutex_lock(&mutex_nodes);

    if (nodes) {
        for (int a=0; a < cvector_size(nodes); ++a) {
            memset(tmp, 0x0, 1024);
            sprintf(tmp, "node: %d\nid: %s\nport: %d\nlast connection: %s\n\n", 
                a, nodes[a].id, nodes[a].port, nodes[a].last_connect_date);

            message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
            if (!message) {
                debug_print("error alloc memory.");
                return;
            }

            memcpy(&message[size], tmp, strlen(tmp));
            size += strlen(tmp);
            sts++;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    if (sts)
        message[size] = '\0';
    else {
        size = 256;
        memory_alloc(message, size);
        sprintf(message, "nodes not found.\n");
    }

    sts = send(sock, message, size, 0);
    memset(message, 0x0, size);
    free(message);
}


