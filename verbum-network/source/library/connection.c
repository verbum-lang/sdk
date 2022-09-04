
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
 * address  = IP address destination.
 * port     = port to connect.
 * header   = header data to check.
 * timeout  = non-blocking timeout.
 *
 * Success: return 1. Error: return 0.
 */

int check_connection_banner_nm (char *address, int port)
{
    return check_connection_banner_nm_non_blocking(address, port, 0);
}

int check_connection_banner_nm_select (char *address, int port)
{
    return check_connection_banner_nm_non_blocking(address, port, 1);
}

int check_connection_banner_nm_non_blocking (char *laddr, int port, int use_select)
{
    int status = -1, handle = -1, flags  = 0;
    int timeout = CONNECTIONS_TIMEOUT1;
    char packet [1024];
    char header []= "Verbum Node";
    // char header1 []= "Verbum Node Mapper";
    // char header2 []= "Verbum Node";

    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( port );

    if (inet_pton(AF_INET, laddr, &address.sin_addr) <= 0) {
        debug_print("error set IP address - socket configuration.");
        return 0;
    }

    handle = socket(AF_INET, SOCK_STREAM, 0);
    if (handle == -1) {
        debug_print("creating socket error.");
        return 0;
    }
    
    // Enable non-blocking.
    flags = fcntl(handle, F_GETFL, 0); 
    if (fcntl(handle, F_SETFL, flags | O_NONBLOCK) == -1) {
        debug_print("error set non-blocking socket.");
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

        usleep(1000);
    }

    if (status == -1) {
        debug_print("error connect socket.");
        return 0;
    }

    // Select.
    if (use_select == 1) {
        struct timeval stv;
        fd_set rfds;

        stv.tv_sec = timeout;
        stv.tv_usec = 0;

        FD_ZERO(&rfds);
        FD_SET(handle, &rfds);

        int st = select(handle+1, &rfds, NULL, NULL, &stv);
        
        if (st <= 0) {
            #ifdef CONDBG
                debug_print("error select socket.");
            #endif
            goto connection_end_fail;
        }
    }

    // Disable non blocking.
    if (fcntl(handle, F_SETFL, flags) == -1) {
        debug_print("error remove non-blocking socket.");
        goto connection_end_fail;
    }

    // Set recv timeout.
    if (use_select == 1) {
        struct timeval tms;
        tms.tv_sec  = CONNECTIONS_TIMEOUT1;
        tms.tv_usec = 0;
        setsockopt(handle, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));
    }

    // Receive data.
    // memset(packet, 0x0, 1024);
    // status = recv(handle, packet, 100, 0);
    // if (status == -1) 
    //     goto connection_end_fail;

    char *rdata = get_recv_content(handle);
    int sizel = 0, size = 0;

    if (!rdata)
        goto connection_end_fail;
    
    if (strlen(rdata) >= 1024)
        sizel = 1023;
    else 
        sizel = strlen(rdata);
    
    memset(packet, 0x0, 1024);
    memcpy(packet, rdata, sizel);

    memset(rdata, 0x0, strlen(rdata));
    free(rdata);

    // Check header.
    if (strlen(packet) <= 0              ||
        strlen(header) > strlen(packet)   )
        goto connection_end_fail;
    
    // packet[ strlen(header) ] = '\0';
    // if (strcmp(header, packet) != 0)
    //     goto connection_end_fail;

    if (!strstr(packet, header))
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

char * get_recv_content (int sock)
{
    #ifdef CONDBG
        say("get_recv_content() - called!");
    #endif

    char *content = NULL;
    char tmp [512];
    int bytes = -1, status = 0, eoh = 0;
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

    if (!status) {
        if (!content)
            return NULL;
        
        free(content);
        return NULL;    
    } else if (!content) 
        return NULL;

    // Remove end of header: \r\n\r\n.
    if (strstr(content, "\r\n\r\n")) {
        size = strlen(content);
        for (int a=0; a<size; a++) {
            if (content[a] == '\r' && (a + 3) <= size) {
                if (content[a  ] == '\r' &&
                    content[a+1] == '\n' &&
                    content[a+2] == '\r' &&
                    content[a+3] == '\n'  )
                {
                    content[a] = '\0';
                    eoh = 1;
                    break;
                }
            }
        }
    }

    #ifdef CONDBG
        if (eoh)
            say("raw data received: \"%s + EOH\"", content);
        else
            say("raw data received: \"%s\"", content);
    #endif

    return content;
}

/*
 * Send a raw message do Node Mapper, and recv response.
 */
char * send_message_nm (char *laddr, int port, char *message, int message_size, int use_tmo)
{
    int status = -1, handle = -1, flags = 0;
    int timeout = CONNECTIONS_TIMEOUT1, size = 0;
    char packet [1024], check[33];
    char header []= "Verbum Node";
    // char header []= "Verbum Node Mapper";
    char prefix []= "verbum-node-"; // verbum-node-000000000, verbum-node-ok, verbum-node-fail.
    char *result = NULL;

    // Configure connection.
    struct sockaddr_in address;
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons( port );

    if (inet_pton(AF_INET, laddr, &address.sin_addr) <= 0) {
        debug_print("error set IP address - socket configuration.");
        return NULL;
    }

    handle = socket(AF_INET, SOCK_STREAM, 0);
    if (handle == -1) {
        debug_print("creating socket error.");
        return NULL;
    }
    
    // Enable non-blocking.
    flags = fcntl(handle, F_GETFL, 0); 
    if (fcntl(handle, F_SETFL, flags | O_NONBLOCK) == -1) {
        debug_print("error set non-blocking socket.");
        return NULL;
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

        usleep(1000);
    }

    if (status == -1) {
        debug_print("error connect socket.");
        return NULL;
    }

    // Select.
    // struct timeval stv;
    // fd_set rfds;

    // stv.tv_sec = timeout;
    // stv.tv_usec = 0;

    // FD_ZERO(&rfds);
    // FD_SET(handle, &rfds);

    // int st = select(handle+1, &rfds, NULL, NULL, &stv);
    
    // if (st <= 0) {
    //     #ifdef CONDBG
    //         debug_print("error select socket.");
    //     #endif
    //     goto connection_end_fail;
    // }

    // Disable non-blocking.
    if (fcntl(handle, F_SETFL, flags) == -1) {
        debug_print("error remove non-blocking socket.");
        goto connection_end_fail;
    }

    // Set recv timeout.
    if (use_tmo == 1) {
        struct timeval tms;
        tms.tv_sec  = CONNECTIONS_TIMEOUT1;
        tms.tv_usec = 0;
        setsockopt(handle, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));
    }

    // Receive data.
    // memset(packet, 0x0, 1024);
    // status = recv(handle, packet, 100, 0);
    // if (status == -1) 
    //     goto connection_end_fail;

    char *rdata = get_recv_content(handle);
    int sizel = 0;

    if (!rdata)
        goto connection_end_fail;
    
    if (strlen(rdata) >= 1024)
        sizel = 1023;
    else 
        sizel = strlen(rdata);
    
    memset(packet, 0x0, 1024);
    memcpy(packet, rdata, sizel);
    memset(rdata, 0x0, strlen(rdata));
    free(rdata);

    // Check header.
    if (strlen(header) > strlen(packet) || strlen(packet) <= 0)
        goto connection_end_fail;
    
    // packet[ strlen(header) ] = '\0';
    // if (strcmp(header, packet) != 0)
    //     goto connection_end_fail;

    if (!strstr(packet, header))
        goto connection_end_fail;

    // ***
    // Process messages.
    //

    status = send(handle, message, message_size, 0);
    if (status == -1)
        goto connection_end_fail;
    
    // Recv data.
    // memset(packet, 0x0, 1024);
    // status = recv(handle, packet, 1023, 0);
    // if (status == -1 || status == 0) 
    //     goto connection_end_fail;

    char *xdata = get_recv_content(handle);
    sizel = 0;

    if (!xdata)
        goto connection_end_fail;
    
    if (strlen(xdata) >= 1024)
        sizel = 1023;
    else 
        sizel = strlen(xdata);
    
    memset(packet, 0x0, 1024);
    memcpy(packet, xdata, sizel);

    // Check message.
    memset(check, 0x0, 33);
    memcpy(check, packet, strlen(prefix));

    if (strcmp(check, prefix) != 0) {
        memset(xdata, 0x0, strlen(xdata));
        free(xdata);
        goto connection_end_fail;
    }

    // size = sizeof(char) * (status + 1);
    // result = (char *) malloc(size);
    
    // if (!result)
    //     goto connection_end_fail;

    // memset(result, 0x0, size);
    // memcpy(result, packet, status);
    
    close(handle);
    return xdata;
    // return result;

    // Close fail.
    connection_end_fail:
    close(handle);
    return NULL;
}

/**
 * Connect to Node Mapper and generate node ID.
 */

char * generate_node_id (char *address, int node_mapper_port, int node_port) 
{
    char prefix[]= "generate-verbum-node-id:";
    char *message = NULL;
    char end_header [] = "\r\n\r\n";
    int size = 0;

    while (!check_connection_banner_nm(address, node_mapper_port)) {
        usleep(1000);
    }

    size = sizeof(char) * (strlen(prefix) + 1024);
    message = (char *) malloc(size);

    if (!message) {
        debug_print("error alloc memory.");
        return NULL;
    }

    memset(message, 0x0, size);
    sprintf(message, "%s%d%s", prefix, node_port, end_header);

    return send_message_nm(address, node_mapper_port, message, strlen(message), 0);
}

/**
 * Ping node.
 */
char * ping_node (char *address, int node_mapper_port, char *node_id, int node_interface_port) 
{
    char prefix[]= "ping-verbum-node:";
    char *message = NULL;
    char end_header [] = "\r\n\r\n";
    int size = 0;

    while (!check_connection_banner_nm(address, node_mapper_port)) {
        usleep(1000);
    }

    size = sizeof(char) * (strlen(node_id) + strlen(prefix) + 256);
    message = (char *) malloc(size);

    if (!message) {
        debug_print("error alloc memory.");
        return NULL;
    }

    memset(message, 0x0, size);
    sprintf(message, "%s%s:%d%s", prefix, node_id, node_interface_port, end_header);

    return send_message_nm(address, node_mapper_port, message, strlen(message), 0);
}

/**
 * Send delete node.
 */
char * send_delete_node (char *address, int node_port, char *node_id) 
{
    char prefix[]= "delete-node:";
    char *message = NULL;
    char end_header [] = "\r\n\r\n";
    int size = 0;

    if (!check_connection_banner_nm(address, node_port)) 
        return NULL;

    size = sizeof(char) * (strlen(node_id) + strlen(prefix) + 256);
    message = (char *) malloc(size);

    if (!message) {
        debug_print("error alloc memory.");
        return NULL;
    }

    memset(message, 0x0, size);
    sprintf(message, "%s%s%s", prefix, node_id, end_header);

    return send_message_nm(address, node_port, message, strlen(message), 1);
}


