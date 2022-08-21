
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "connection.h"
#include "memory.h"

/*
 * It connects to the "Node Mapper" and "Fault Tolerance" servers, 
 * and checks the header.
 */

void check_connection_banner_nm_ft (char *prefix, int port, char *header)
{
    int status = -1;
    int handle = -1;
    char packet [100];

    say("%s - checking...", prefix);

    // Create socket.
    check_connection_step1:
    handle = socket(AF_INET, SOCK_STREAM, 0);

    if (handle == -1) {
        say("%s - creating socket error.", prefix);
        goto check_connection_step1;
    }
    
    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( port );

    say("%s - server port: %d", prefix, port);

    // Connect.
    check_connection_step2:
    status = connect(handle, (struct sockaddr*) &address, sizeof(address));
    
    if (status < 0)
        goto check_connection_step2;

    // Receive data.
    check_connection_step3:
    memset(packet, 0x0, 100);

    status = recv(handle, packet, 99, 0);
    if (status == -1)
        goto check_connection_step3;
    
    // Check header.
    if (strlen(header) > strlen(packet) || strlen(packet) <= 0)
        goto check_connection_step3;
    
    packet[ strlen(header) ] = '\0';
    if (strcmp(header, packet) != 0)
        goto check_connection_step3;

    say("%s online.", prefix);

    // Close.
    close(handle);
    memset(packet, 0x0, 100);
}


