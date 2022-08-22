
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-mapper.h"

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

    param->max_connections = 1000;
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
    int ssock = -1, nsock = -1;
    int status = -1;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;
    address.sin_port = htons(param->port);

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));

    if (status != 0)
        say_exit("error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("error listen server.");

    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            // Send header (handshake).
            char header[] = "Verbum Node Mapper - v1.0.0 - I Love Jesus <3";

            while (1) {
                status = send(nsock, header, strlen(header), 0);
                if (status > 0)
                    break;
            }

            // Node Mapper protocol.

            // Receive node information.

            // Node Mapper options (create, delete, and others).

            close(nsock);
        }
    }
}


