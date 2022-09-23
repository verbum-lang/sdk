
#include "debug.h"

#include <sys/socket.h> // socket
#include <netinet/in.h> // struct sockaddr_in
#include <arpa/inet.h>  // inet_pton
#include <fcntl.h>      // fcntl
#include <errno.h>      // errno

/**
 * Send data to log viewer server.
 * On success, returns 1. On error, returns 0.
 */

int verbum_debug_send_data (char *content)
{
    struct sockaddr_in address;
    int sock, flags, status = 0, counter = 0, limit = 10;

    if (!content)
        return 0;

    address.sin_family      = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port        = htons(VERBUM_DEBUG_SERVER_PORT);

    if (inet_pton(AF_INET, VERBUM_DEBUG_R_ADDRESS, &address.sin_addr) <= 0)
        say_ret(0, "error set IP address - socket configuration.");

    sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock == -1) 
        say_ret(0, "creating socket error.");
    
    // Enable non-blocking.
    flags = fcntl(sock, F_GETFL, 0); 
    if (fcntl(sock, F_SETFL, flags | O_NONBLOCK) == -1)
        say_ret(0, "error set non-blocking socket.");

    // Connect.
    if (connect(sock, (struct sockaddr*) &address, sizeof(address)) == -1) {
        if (errno != EINPROGRESS) 
            say_ret(0, "connect error");
    }

    // Disable non blocking.
    if (fcntl(sock, F_SETFL, flags) == -1) {
        close(sock);
        say_ret(0, "error remove non-blocking socket.");
    }

    // Send data.
    while (counter <= limit) {
        if (send(sock, content, strlen(content), MSG_NOSIGNAL) == strlen(content)) {
            status = 1;
            break;
        }

        counter++;
    }

    if (!status) {
        close(sock);
        return 0;
    }

    close(sock);
    return 1;
}


