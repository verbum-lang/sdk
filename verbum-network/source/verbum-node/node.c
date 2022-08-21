
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node.h"

void verbum_node (void)
{
    prepare_node_mapper();
    prepare_fault_tolerance();
}

void prepare_node_mapper (void) 
{
    int status = -1;
    int handle = -1;
    
    say(NM_PREFIX "checking...");

    // Create socket.
    check_connection_step1:
    handle = socket(AF_INET, SOCK_STREAM, 0);

    if (handle == -1) {
        say(NM_PREFIX "creating socket error.");
        goto check_connection_step1;
    }
    
    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( global.configuration.node_mapper.server_port );

    say(NM_PREFIX "server port: %d", global.configuration.node_mapper.server_port);

    // Connect.
    check_connection_step2:
    status = connect(handle, (struct sockaddr*) &address, sizeof(address));
    
    if (status < 0)
        goto check_connection_step2;



    // // Packet.
    // char packet []=
    //     ""
    //     "Deus eh Bom!"
    //     "";

    // // Send packet.
    // send(handle, packet, strlen(packet), 0);
}

void prepare_fault_tolerance (void) 
{
    say("checking Fault Tolerance...");
}


