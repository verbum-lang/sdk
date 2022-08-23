
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
        }
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

    say("data received: \"%s\"", content);

    // ***
    // Process messages - Verbum Node Mapper Protocol.
    //

    /**
     * Generate new node ID, and save.
     */
    if (strcmp(content, "generate-node-id") == 0) {
        add_new_node(sock);
    }
}

void add_new_node (int sock)
{
    node_control_t node;
    time_t now = time(NULL);
    struct tm *tms = localtime(&now);
    char *id = generate_new_id();
    int bytes = 0;

    if (id) {
        memory_scopy(id, node.id);
        memory_szero(node.last_connect_date);

        sprintf(node.last_connect_date, "%d-%d-%d %d-%d-%d", 
            tms->tm_mday, tms->tm_mon, tms->tm_year,
            tms->tm_hour, tms->tm_min, tms->tm_sec);

        if (nodes)
            cvector_push_back(nodes, node);

        // Send node ID to client.
        bytes = send(sock, id, strlen(id), 0);
        memset(id, 0x0, strlen(id));
        free(id);
    }

    say("current node(s) found:");
    if (nodes) {
        for (int a=0; a < cvector_size(nodes); ++a) {
            say("v[%d] = %s\n", a, nodes[a].id);
        }
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


