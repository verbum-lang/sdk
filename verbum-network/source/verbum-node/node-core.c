
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-core.h"

void * node_core (void *tparam)
{
    say("node core interface - started!");

    node_param_t *param = (node_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock = -1, nsock = -1;
    int status = -1, port = 0;
    
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

    // Node Mapper information sender.
    add_node_on_node_mapper(param);

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

            close(nsock);
        }
    }

    close(ssock);
}

void add_node_on_node_mapper (node_param_t *param)
{
    char address []= LOCALHOST;
    char *id = CNULL;
    
    while (1) {
        id = generate_node_id(address, param->node_mapper_port, CONNECTIONS_TIMEOUT1);
        if (id)
            break;
    }

    say("node id: %s", id);
}

void * add_node_on_node_mapper_handler (void *tparam)
{
    node_param_t *param = (node_param_t *) tparam;

    // say("> node id: %s", param->information.id);
    // say("> node port: %d", param->information.port);
}


