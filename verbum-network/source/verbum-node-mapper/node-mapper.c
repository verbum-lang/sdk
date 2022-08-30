
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

cvector_vector_type(node_control_t) nodes = NULL;

void node_mapper (void)
{
    node_mapper_interface();
}

void node_mapper_interface (void)
{
    int status = 0;
    pthread_t tid;
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));

    if (!param)
        debug_exit("error allocating memory.");

    param->max_connections = SERVERS_MAX_CONNECTION;
    param->path = CNULL;
    param->port = global.configuration.node_mapper.server_port;
    memory_scopy(global.configuration.path, param->path);
    
    if ((status = pthread_create(&tid, NULL, node_mapper_interface_handler, param)) !=0)
        debug_exit("error while creating thread - control of Node Mapper interface.");
}

/*
 * Responsible for communicating with the Node Mapper interface.
 */

void * node_mapper_interface_handler (void *tparam)
{
    interface_param_t *param = (interface_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock = -1, nsock = -1, status = -1;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;
    address.sin_port = htons(param->port);

    const int enable = 1;
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
            tms.tv_sec = CONNECTIONS_TIMEOUT1;
            tms.tv_usec = 0;
            setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

            // Send header (handshake).
            char header[] = "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\n";

            while (1) {
                status = send(nsock, header, strlen(header), 0);
                if (status > 0) 
                    break;
            }

            // Node Mapper protocol.
            nm_process_communication(nsock);

            close(nsock);
        } else
            say_exit("error accept server.");
    }
}

void nm_process_communication (int sock)
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

    id = generate_new_id();
    if (!id)
        return;

    // Prepare port.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return;

    ptr += strlen(prefix);
    memset(port, 0x0, 256);
    memcpy(port, ptr, strlen(ptr));

    // Add node in struct control.
    node.port = atoi(port);
    memory_scopy(id, node.id);

    date = make_datetime();
    if (!date)
        return;

    memset(node.last_connect_date, 0x0, 100);
    sprintf(node.last_connect_date, "%s", date);

    cvector_push_back(nodes, node);

    // Send new node ID to client.
    bytes = send(sock, id, strlen(id), 0);

    memset(id, 0x0, strlen(id));
    memset(date, 0x0, strlen(date));

    free(id);
    free(date);
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
    char *ptr = CNULL, *date = CNULL, id [256];
    int bytes = 0;

    // Prepare ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return;

    ptr += strlen(prefix);
    memset(id, 0x0, 256);
    memcpy(id, ptr, strlen(ptr));

    // Search node.
    if (!nodes) 
        return;

    for (int a=0; a < cvector_size(nodes); ++a) {
        if (strcmp(nodes[a].id, id) == 0) {
            date = make_datetime();
            if (!date)
                break;

            memset(nodes[a].last_connect_date, 0x0, 100);
            sprintf(nodes[a].last_connect_date, "%s", date);

            bytes = send(sock, response, strlen(response), 0);

            memset(date, 0x0, strlen(date));
            free(date);
            break;
        }
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


