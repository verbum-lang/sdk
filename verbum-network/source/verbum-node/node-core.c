
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-core.h"

node_param_t *param;

void * node_core (void *tparam)
{
    say("node core interface - started!");

    struct sockaddr_in address;
    socklen_t address_size;
    int ssock = -1, nsock = -1;
    int status = -1, port = 0;
    
    param = (node_param_t *) tparam;
    
    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;

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
            say("error finding available port for node creation (interface).");
        else
            break;
    }

    say("interface port: %d", port);

    if (listen(ssock, param->max_connections) != 0)
        say_exit("error listen server.");

    // Add node, and ping.
    param->information.port = port;
    add_node_on_node_mapper();
    ping_node_action();

    // Node core interface communication.
    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            // Send header (handshake).
            status = send_handshake(nsock);
            if (status == 1) {

                // Node protocol.
                char *response = get_client_request(nsock);
                if (response) {

                    /**
                     * Delete node.
                     */
                    if (strstr(response, "delete-node"))
                        delete_node(nsock, response);

                    free(response);
                }
            }

            close(nsock);
        }
    }

    close(ssock);
}

void add_node_on_node_mapper (void)
{
    char address []= LOCALHOST;
    char *id = NULL;
    
    while (1) {
        id = generate_node_id(
            address, param->node_mapper_port, param->information.port);
        
        if (id)
            break;

        usleep(100);
    }

    memory_scopy(id, param->information.id);
    memory_sclean(id);
}

void ping_node_action (void) 
{
    int status = 0;
    pthread_t tid;

    node_param_t *lparam = (node_param_t *) malloc(sizeof(node_param_t));
    if (!lparam)
        debug_exit("error allocating memory.");

    memory_scopy(param->information.id, lparam->information.id);
    lparam->information.port = param->information.port;
    lparam->node_mapper_port = param->node_mapper_port;

    if ((status = pthread_create(&tid, NULL, ping_node_handler, lparam)) !=0)
        debug_exit("error while creating thread - ping node.");
}

void * ping_node_handler (void *tparam)
{
    node_param_t *lparam = (node_param_t *) tparam;
    char address []= LOCALHOST;
    
    say("node ping handler:");
    say("node id: %s", lparam->information.id);
    say("node port (interface): %d", lparam->information.port);

    while (1) {
        char *response = ping_node(address, 
            lparam->node_mapper_port, lparam->information.id, lparam->information.port);
        
        if (response) {
            #ifdef NCDBG_PING
                say("ping response: %s", response);
            #endif

            memory_sclean(response);
        }

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}

char * get_client_request (int sock)
{
    char *content = NULL;
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

            // Check end of header.
            if (strstr(content, "\r\n\r\n"))
                break;
        }
    }

    if (!status || !content)
        return NULL;

    #ifdef NCDBG
        say("raw data received: \"%s\"", content);
    #endif

    return content;
}

int send_handshake (int sock)
{
    char handshake[] = "Verbum Node - v1.0.0 - I Love Jesus <3\n\n";
    int status = -1, result = 0, counter = 0;

    while (1) {
        status = send(sock, handshake, strlen(handshake), 0);
        
        if (status > 0) {
            result = 1;
            break;
        }

        usleep(10000);
        counter++;

        if (counter >= 30)
            break;
    }

    return result;
}

void delete_node (int sock, char *content)
{
    char tmp[1024], prefix [] = "delete-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS;
    char response_error    [] = VERBUM_DEFAULT_ERROR;
    char *ptr = NULL;
    int bytes = 0, size = 0, status = 0;

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

    // Check node.
    if (strcmp(param->information.id, tmp) == 0) {
        status = 1;
    }

    // Finish.
    dn_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    say("sended success node message.");
    exit(0);
}


