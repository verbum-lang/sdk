
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "fault-tolerance.h"

void fault_tolerance (void)
{
    fault_tolerance_interface();
}

void fault_tolerance_interface (void)
{
    int status = 0;
    pthread_t tid;
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));
    
    if (!param)
        debug_exit("error allocating memory.");

    param->max_connections = 1000;
    param->path = CNULL;
    param->port = global.configuration.fault_tolerance.server_port;
    memory_scopy(global.configuration

    if ((status = pthread_create(&tid, NULL, fault_tolerance_interface_handler, param)) !=0)
        debug_exit("error while creating thread - control of Fault Tolerance interface.");
}

/*
 * Responsible for communicating with the Fault Tolerance interface.
 */

void * fault_tolerance_interface_handler (void *tparam)
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
            char header[] = "Verbum Fault Tolerance - v1.0.0 - I Love Jesus <3";

            while (1) {
                status = send(nsock, header, strlen(header), 0);
                if (status > 0) 
                    break;
            }

            // Fault Tolerance protocol.
            
            // Fault Tolerance options (add log, get log, and others).

            close(nsock);
        }
    }
}





