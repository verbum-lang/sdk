
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "connection.h"
#include "memory.h"

/**
 * Create new non-blocking socket connection.
 * On success return socket, on error return -1.
 */

int create_connection (char *address, int port, int enable_timeout, int one_connection)
{
    int status     = -1, sock = -1, flags  = 0;
    char *packet   = NULL;
    char header [] = "Verbum Node";

    struct sockaddr_in saddress;
    struct timeval stv;
    struct timeval tms;
    time_t start, end;
    fd_set rfds;
    double diff;

    // Configure connection.
    saddress.sin_family      = AF_INET;
    saddress.sin_addr.s_addr = INADDR_ANY;
    saddress.sin_port        = htons( port );

    if (inet_pton(AF_INET, address, &saddress.sin_addr) <= 0)
        say_ret(-1, "error set IP address - socket configuration.");

    sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock == -1) 
        say_ret(-1, "creating socket error.");
    
    // Enable non-blocking.
    flags = fcntl(sock, F_GETFL, 0); 
    if (fcntl(sock, F_SETFL, flags | O_NONBLOCK) == -1)
        say_ret(-1, "error set non-blocking socket.");

    // Connect.
    #ifdef DBG_CONNECTION
        say("process connect...");
    #endif

    for (int timeout=1; timeout<=CONNECTION_TIMEOUT_LIMIT; timeout++) {
        time(&start);

        while (1) {
            status = connect(sock, (struct sockaddr*) &saddress, sizeof(saddress));
            if (status != -1) 
                break;

            time(&end);
            diff = difftime(end, start);

            if (diff >= (double) timeout)
                break;
        
            usleep(CONNECTION_DELAY_CONNECT);
        }

        if (status != -1) 
            break;

        if (one_connection)
            break;
    }
    
    #ifdef DBG_CONNECTION
        say("connect finished, status: %d", status);
    #endif
    
    if (status == -1) {
        #ifdef DBG_CONNECTION
            say("error connect socket.");
        #endif

        return -1;
    }

    // Select enabled.
    if (enable_timeout == 1) {
        #ifdef DBG_CONNECTION
            say("process select...");
        #endif

        stv.tv_sec  = CONNECTION_TIMEOUT_SELECT;
        stv.tv_usec = 0;

        FD_ZERO(&rfds);
        FD_SET(sock, &rfds);

        int st = select(sock+1, &rfds, NULL, NULL, &stv);
        
        if (st <= 0) {
            #ifdef DBG_CONNECTION
                say("error select socket.");
            #endif
            
            close(sock);
            return -1;
        }
    }

    // Disable non blocking.
    if (fcntl(sock, F_SETFL, flags) == -1)
        say_end_con(-1, "error remove non-blocking socket.");

    // Set recv timeout.
    if (enable_timeout == 1) {
        tms.tv_sec  = CONNECTION_TIMEOUT_RECV;
        tms.tv_usec = 0;

        if (setsockopt(sock, SOL_SOCKET, SO_RCVTIMEO, 
                (const char*)&tms, sizeof(struct timeval)) != 0)
            say_end_con(-1, "error setsocketopt.");
    }

    // Receive data.
    #ifdef DBG_CONNECTION
        say("recv data...");
    #endif
    
    packet = get_recv_content(sock);
    if (!packet) {
        #ifdef DBG_CONNECTION
            say("error recv content.");
        #endif
        
        return -1;
    }
    
    // Check header.
    if (!strstr(packet, header)) {
        #ifdef DBG_CONNECTION
            say("header not found on packet.");
        #endif

        mem_sfree(packet);
        return -1;
    }

    #ifdef DBG_CONNECTION
        say("connection success!");
    #endif

    mem_sfree(packet);
    return sock;
}

int check_protocol (char *address, int port, int enable_timeout, int one_connection)
{
    int sock = -1;

    if (!address || !port)
        return -1;

    sock = create_connection(address, port, enable_timeout, one_connection);
    if (sock == -1)
        return -1;

    return sock;
}

char *get_recv_content (int sock)
{
    char *content = NULL;
    char tmp [128];
    int bytes = -1, status = 0, eoh = 0;
    int bytes_received = 0, size = 0;

    if (!sock)
        return NULL;

    while (1) {
        memset(tmp, '\0', 128);
        bytes = recv(sock, tmp, 128, 0);

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

    #ifdef DBG_CONNECTION
        if (eoh)
            say("raw data received: \"%s + EOH\"", content);
        else
            say("raw data received: \"%s\"", content);
    #endif

    return content;
}

int send_handshake (int sock, char *handshake)
{
    int status = -1, result = 0, counter = 0, limit = 5;

    if (!sock || !handshake)
        return 0;

    while (1) {
        status = send(sock, handshake, strlen(handshake), VERBUM_SEND_FLAGS);
        
        if (status > 0)
            break;

        usleep(CONNECTION_DELAY_SEND_HANDSHAKE);
        counter++;

        if (counter >= limit)
            break;
    }

    return (status > 0) ? 1 : 0;
}

char *send_raw_data (int sock, char *message)
{
    char prefix [] = "verbum-node-";
    char *response = NULL;
    int status     = 0;
    
    if (!sock || !message)
        return NULL;

    status = send(sock, message, strlen(message), VERBUM_SEND_FLAGS);
    if (status == -1) {
        #ifdef DBG_CONNECTION
           say("error send raw data.");
        #endif

        return NULL;
    }
    
    response = get_recv_content(sock);
    if (!response) {
        #ifdef DBG_CONNECTION
            say("error recv data.");
        #endif

        return NULL;
    }

    // Check message is valid.
    if (!strstr(response, prefix)) {
        mem_sfree(response);
        return NULL;
    }

    return response;
}

int check_interface (int port)
{
	char message[]= "no-data:" VERBUM_EOH;
    char *response = NULL;
    int sock;

    if (!port)
        return 0;

    sock = check_protocol(LOCALHOST, port, 1, 1);
    if (sock == -1)
        return 0;

    response = send_raw_data(sock, message);

    if (response) {
        mem_sfree(response);
        close(sock);
        return 1;
    }

    close(sock);
    return 0;
}

int configure_recv_timeout (int sock)
{
    struct timeval tms;
    
    if (!sock)
        return 0;

    tms.tv_sec  = CONNECTION_TIMEOUT_RECV;
    tms.tv_usec = 0;
    
    if (setsockopt(sock, SOL_SOCKET, SO_RCVTIMEO, 
        (const char*)&tms, sizeof(struct timeval)) != 0)
            say_error_ret(0, "Setsockopt (SO_RCVTIMEO) failed.");

    return 1;
}

char *process_request (
    int   type,          int timeout,

    char *src_nm_id,     char *src_nm_address,  int src_nm_port, 
    char *src_node_id,   int   src_core_port,   int src_server_port, 

    char *dst_nm_id,     char *dst_nm_address,  int dst_nm_port,
    char *dst_node_id,   int   dst_server_port,

    char *connection_id, int connection_type,   char *connection_list)
{
    char *nm_address = NULL, *message = NULL, *response = NULL;
    int   nm_port = 0, sock = -1, size = 1024, counter = 0, limit = 5;

    switch (type) {
        case CONNECTION_GENERATE_NODE_ID:
            if (!src_nm_address || !src_nm_port || !src_core_port)
                return NULL;
            break;

        case CONNECTION_PING_NODE:
            if (!src_nm_address || !src_nm_port     || !src_node_id || 
                !src_core_port  || !src_server_port                  )
                return NULL;
            break;

        case CONNECTION_DELETE_NODE:
            if (!src_nm_address || !src_nm_port || !src_node_id)
                return NULL;
            break;

        case CONNECTION_CHECK_NODE_EXISTS:
            if (!src_nm_address || !src_nm_port || !src_node_id)
                return NULL;
            break;

        case CONNECTION_CONNECTION_PING_NODE_MAPPER:
            if (!src_nm_address || !src_nm_port || !connection_list)
                return NULL;
            break;

        case CONNECTION_DELETE_CONNECTION_SERVER:
            if (!src_nm_address || !src_nm_port || !src_node_id ||
                !dst_node_id    || !connection_id                )
                return NULL;
            break;

        case CONNECTION_CHECK_DIRECT_NODE_MAPPER:
            if (!src_nm_address || !src_nm_port)
                return NULL;
            break;

        case CONNECTION_CREATE_NODE_OUTPUT_CONNECTION:
            if (!src_nm_address || !src_core_port || !src_node_id || 
                !dst_nm_address || !dst_nm_port   || !dst_node_id  )
                return NULL;
            break;

        case CONNECTION_DELETE_CONNECTION:
            if (!src_nm_address || !src_node_id   || !src_core_port ||
                !dst_node_id    || !connection_id                    )
                return NULL;
            break;

        case CONNECTION_CONNECTION_PING_NODE:
            if (!src_nm_id   || !src_nm_address  || !src_nm_port || !src_node_id ||
                !dst_node_id || !dst_server_port || !connection_id                )
                return NULL;
            break;
    }

    switch (type) {
        case CONNECTION_GENERATE_NODE_ID:
        case CONNECTION_PING_NODE:
        case CONNECTION_DELETE_NODE:
        case CONNECTION_CHECK_NODE_EXISTS:
        case CONNECTION_CONNECTION_PING_NODE_MAPPER:
        case CONNECTION_DELETE_CONNECTION_SERVER:
        case CONNECTION_CHECK_DIRECT_NODE_MAPPER:
            nm_address = src_nm_address;
            nm_port    = src_nm_port;
            break;

        case CONNECTION_CREATE_NODE_OUTPUT_CONNECTION:
        case CONNECTION_DELETE_CONNECTION:
            nm_address = src_nm_address;
            nm_port    = src_core_port;
            break;

        case CONNECTION_CONNECTION_PING_NODE:
            nm_address = src_nm_address;
            nm_port    = dst_server_port;
            break;
    }

    // Start connection.
    while (1) {
        sock = create_connection(nm_address, nm_port, timeout, 0);
        if (sock != -1)
            break;

        if (counter >= limit)
            break;

        counter++;
        usleep(CONNECTION_DELAY_PROCESS_REQUEST);
    }

    if (src_nm_id)       size += strlen(src_nm_id);
    if (src_nm_address)  size += strlen(src_nm_address);
    if (src_node_id)     size += strlen(src_node_id);
    if (dst_nm_id)       size += strlen(dst_nm_id);
    if (dst_nm_address)  size += strlen(dst_nm_address);
    if (dst_node_id)     size += strlen(dst_node_id);
    if (connection_id)   size += strlen(connection_id);
    if (connection_list) size += strlen(connection_list);

    mem_alloc_ret(message, mem_smake_size(size), char *, NULL);

    switch (type) {
        case CONNECTION_GENERATE_NODE_ID:
            sprintf(message, "generate-verbum-node-id:%d" VERBUM_EOH, src_core_port);
            break;

        case CONNECTION_PING_NODE:
            sprintf(message, "ping-verbum-node:%s:%d:%d:" VERBUM_EOH, 
                 src_node_id, src_core_port , src_server_port);
            break;

        case CONNECTION_DELETE_NODE:
            sprintf(message, "delete-verbum-node:%s" VERBUM_EOH, src_node_id);
            break;

        case CONNECTION_CHECK_NODE_EXISTS:
            sprintf(message, "check-verbum-node-exists:%s" VERBUM_EOH, src_node_id);
            break;

        case CONNECTION_CREATE_NODE_OUTPUT_CONNECTION:
            sprintf(message, "create-verbum-node-output-connection:%s:%s:%s:%d" VERBUM_EOH, 
                        src_node_id, dst_node_id, dst_nm_address, dst_nm_port);
            break;

        case CONNECTION_CONNECTION_PING_NODE:
            sprintf(message, "connection-ping-verbum-node:%s:%s:%d:%s:%s" VERBUM_EOH,  
                        dst_node_id, src_node_id, src_nm_port, connection_id, src_nm_id);
            break;

        case CONNECTION_CONNECTION_PING_NODE_MAPPER: {
                char prefix     [] = "ping-verbum-connection:IHS\n\n";
                char end_header [] = VERBUM_EOH;

                int s1 = strlen(prefix);
                int s2 = strlen(connection_list);
                int s3 = strlen(end_header);

                memcpy( message,            prefix,          s1);
                memcpy(&message[ s1      ], connection_list, s2);
                memcpy(&message[ s1 + s2 ], end_header,      s3);
            }
            break;

        case CONNECTION_DELETE_CONNECTION:
            sprintf(message, "delete-verbum-connection:%s:%s:%s:%d" VERBUM_EOH, 
                        connection_id, src_node_id, dst_node_id, connection_type);
            break;

        case CONNECTION_DELETE_CONNECTION_SERVER:
            sprintf(message, "delete-verbum-connection-server:%s:%s:%s" VERBUM_EOH, 
                        connection_id, src_node_id, dst_node_id);
            break;

        case CONNECTION_CHECK_DIRECT_NODE_MAPPER:
            sprintf(message, "check-direct-node-mapper:" VERBUM_EOH);
            break;
    }
    
    // Send request.
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    close(sock);
    mem_sfree(message);
    return response;
}

char *process_generate_node_id (char *src_nm_address, int src_nm_port, int src_core_port) 
{
    return process_request(
        CONNECTION_GENERATE_NODE_ID, 0, NULL, 
            src_nm_address, src_nm_port, NULL, src_core_port, 
                0, NULL, NULL, 0, NULL, 0, NULL, 0, NULL);
}

char *process_ping_node (
    char *src_nm_address, int src_nm_port,    char *src_node_id, 
    int   src_core_port,  int src_server_port ) 
{
    return process_request(
        CONNECTION_PING_NODE, 1, NULL,
            src_nm_address, src_nm_port, 
                src_node_id, src_core_port, src_server_port, 
                    NULL, NULL, 0, NULL, 0, NULL, 0, NULL);
}

char *process_delete_node (char *src_nm_address, int src_nm_port, char *src_node_id) 
{
    return process_request(
        CONNECTION_DELETE_NODE, 1, NULL,
            src_nm_address, src_nm_port, src_node_id, 
                0, 0, NULL, NULL, 0, NULL, 0, NULL, 0, NULL);
}

char *process_check_node_exists (char *src_nm_address, int src_nm_port, char *src_node_id)
{
    return process_request(
        CONNECTION_CHECK_NODE_EXISTS, 1, NULL,
            src_nm_address, src_nm_port, src_node_id, 
                0, 0, NULL, NULL, 0, NULL, 0, NULL, 0, NULL);
}

char *process_create_connection (
    char *src_nm_address, 
    char *src_node_id,    int   src_core_port, 
    char *dst_node_id,    char *dst_nm_address, int dst_nm_port)
{
    return process_request(
        CONNECTION_CREATE_NODE_OUTPUT_CONNECTION, 1, NULL,
            src_nm_address, 0, src_node_id, src_core_port, 0, NULL, 
                dst_nm_address, dst_nm_port, dst_node_id, 0, NULL, 0, NULL);
}

char *process_connection_ping (
    char *src_nm_id,   char *src_nm_address,  int src_nm_port,    char *src_node_id, 
    char *dst_node_id, int   dst_server_port, char *connection_id)
{
    return process_request(CONNECTION_CONNECTION_PING_NODE, 1,
        src_nm_id, src_nm_address, src_nm_port, src_node_id, 0, 0, NULL, NULL, 0, 
            dst_node_id, dst_server_port, connection_id, 0, NULL);
}

char *process_ping_connections (char *src_nm_address, int src_nm_port, char *connections_list)
{
    return process_request(CONNECTION_CONNECTION_PING_NODE_MAPPER, 1, NULL,
        src_nm_address, src_nm_port, 
            NULL, 0, 0, NULL, NULL, 0, NULL, 0, NULL, 0, connections_list);
}

char *process_delete_connection (
    char *src_nm_address, char *src_node_id,   int src_core_port, 
    char *dst_node_id,    char *connection_id, int connection_type)
{
    return process_request(CONNECTION_DELETE_CONNECTION, 1, NULL,
        src_nm_address, 0, src_node_id, src_core_port, 0, NULL, NULL, 0, 
            dst_node_id, 0, connection_id, connection_type, NULL);
}

char *process_delete_connection_sv (
    char *src_nm_address, int   src_nm_port, 
    char *src_node_id,    char *dst_node_id, char *connection_id)
{
    return process_request(CONNECTION_DELETE_CONNECTION_SERVER, 1, NULL,
        src_nm_address, src_nm_port, src_node_id, 0, 0, NULL, NULL, 0, 
            dst_node_id, 0, connection_id, 0, NULL);
}

int process_check_direct_nm (char *src_nm_address, int src_nm_port)
{
    char *response = NULL;

    response = process_request(CONNECTION_CHECK_DIRECT_NODE_MAPPER, 1, NULL,
        src_nm_address, src_nm_port, NULL, 0, 0, NULL, NULL, 0, NULL, 0, NULL, 0, NULL);

    if (!response)
        return 0;

    mem_sfree(response);
    return 1;
}

int process_create_node (char *address, int port, char *node_param)
{
    int sock = -1, counter = 0, limit = 5, size = 0;
    char *response = NULL;
    char *message = NULL;
    
    if (!address || !port)
        return 0;

    if (!node_param) 
        size = sizeof(char) * 100;
    else
        size = sizeof(char) * (strlen(node_param) + 100);

    message = (char *) malloc(size);
    if (!message)
        return 0;
    memset(message, '\0', size);

    if (!node_param) 
        sprintf(message, "create-verbum-node:" VERBUM_EOH);
    else 
        sprintf(message, "create-verbum-node:%s" VERBUM_EOH, node_param);

    while (1) {
        sock = create_connection(address, port, 1, 0);
        if (sock != -1)
            break;

        if (counter >= limit)
            break;

        counter++;
        usleep(CONNECTION_DELAY_CREATE_NODE);
    }

    if (!sock || sock == -1)
        return 0;

    response = send_raw_data(sock, message);
    mem_sfree(message);

    if (!response) {
        close(sock);
        return 0;
    }

    close(sock);
    mem_sfree(response);
    return 1;
}


