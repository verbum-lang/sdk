
#include <unistd.h>
#include <errno.h> 
#include <sys/types.h> 
#include <netinet/in.h> 
#include <sys/socket.h> 
#include <sys/wait.h> 
#include <arpa/inet.h>
#include <fcntl.h>
#include <time.h>

#include "connection.h"
#include "memory.h"

/*
 * It connects to the "Node Mapper" and "Fault Tolerance" servers, and checks the header.
 *
 * Success: return 1. Error: return 0.
 */

int check_connection_banner_nm_ft (char *prefix, char *address, int port, char *header)
{
    // return check_connection_banner_nm_ft_blocking(prefix, address, port, header);
    return check_connection_banner_nm_ft_non_blocking(prefix, address, port, header, 3.0);
}

int check_connection_banner_nm_ft_blocking (char *prefix, char *laddr, int port, char *header)
{
    int status = -1, handle = -1;
    char packet [100];

    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( port );

    if (inet_pton(AF_INET, laddr, &address.sin_addr) <= 0) {
        debug_print("%s - error set IP address - socket configuration.", prefix);
        return 0;
    }

    // Create socket.
    handle = socket(AF_INET, SOCK_STREAM, 0);
    if (handle == -1) {
        say("%s - creating socket error.", prefix);
        return 0;
    }
    
    // Connect.
    status = connect(handle, (struct sockaddr*) &address, sizeof(address));
    if (status < 0)
        return 0;

    // Receive data.
    memset(packet, 0x0, 100);

    status = recv(handle, packet, 99, 0);
    if (status == -1)
        goto connection_end_fail;
    
    // Check header.
    if (strlen(header) > strlen(packet) || strlen(packet) <= 0)
        goto connection_end_fail;
    
    packet[ strlen(header) ] = '\0';
    if (strcmp(header, packet) != 0)
        goto connection_end_fail;

    goto connection_end_success;

    // Close.
    connection_end_fail:
    close(handle);
    return 0;

    connection_end_success:
    close(handle);
    return 1;
}

int check_connection_banner_nm_ft_non_blocking (char *prefix, char *laddr, int port, char *header, int timeout)
{
    int status = -1, handle = -1, flags  = 0;
    char packet [100];

    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( port );

    if (inet_pton(AF_INET, laddr, &address.sin_addr) <= 0) {
        debug_print("%s - error set IP address - socket configuration.", prefix);
        return 0;
    }

    handle = socket(AF_INET, SOCK_STREAM, 0);
    if (handle == -1) {
        debug_print("%s - creating socket error.", prefix);
        return 0;
    }
    
    // Non-blocking.
    flags = fcntl(handle, F_GETFL, 0); 
    if (fcntl(handle, F_SETFL, flags | O_NONBLOCK) == -1) {
        debug_print("%s - error set non-blocking socket.", prefix);
        return 0;
    }

    // Connect.
    clock_t start = clock();
    clock_t end;

    while (1) {
        status = connect(handle, (struct sockaddr*) &address, sizeof(address));
        if (status != -1) 
            break;

        double tmv = (double)(clock() - start) / CLOCKS_PER_SEC;
        if (tmv >= (double) timeout)
            break;
    }

    if (status == -1) {
        debug_print("%s - error connect socket.", prefix);
        return 0;
    }

    // Select.
    struct timeval stv;
    fd_set rfds;

    stv.tv_sec = timeout;
    stv.tv_usec = 0;

    FD_ZERO(&rfds);
    FD_SET(handle, &rfds);

    int st = select(handle+1, &rfds, NULL, NULL, &stv);
    
    if (st <= 0) {
        debug_print("%s - error select socket.", prefix);
        goto connection_end_fail;
    }

    // Remove non blocking.
    if (fcntl(handle, F_SETFL, flags) == -1) {
        debug_print("%s - error remove non-blocking socket.", prefix);
        goto connection_end_fail;
    }

    // Receive data.
    memset(packet, 0x0, 100);
    status = recv(handle, packet, 99, 0);

    if (status == -1) 
        goto connection_end_fail;

    // Check header.
    if (strlen(header) > strlen(packet) || strlen(packet) <= 0)
        goto connection_end_fail;
    
    packet[ strlen(header) ] = '\0';
    if (strcmp(header, packet) != 0)
        goto connection_end_fail;

    goto connection_end_success;

    // Close.
    connection_end_fail:
    close(handle);
    return 0;

    connection_end_success:
    close(handle);
    return 1;
}


