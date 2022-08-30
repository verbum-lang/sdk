
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
    int connection_counter = 1;
    
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
    // ping_node_action();

    // Node core interface communication.
    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            // Send header (handshake).
            char header[] = "Verbum Node - v1.0.0 - I Love Jesus <3";

            while (1) {
                status = send(nsock, header, strlen(header), 0);
                if (status > 0)
                    break;
            }

            // Node protocol.
            say("Connection: %d", connection_counter);

            connection_counter++;
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
    
    say("node ping handler.");
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


