
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-interface.h"

void * node_interface (void *tparam)
{
    debug_print("node interface - started!");

    node_param_t *param = (node_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock = -1, nsock = -1;
    int status = -1, port = 0;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;

    for (port=3333; port<65000; port++) {
        address.sin_port = htons(port);
        status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
        if (status == 0)
            break;
    }

    say("interface port: %d", port);

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("error listen server.");

    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            

            close(nsock);
        }
    }
}


