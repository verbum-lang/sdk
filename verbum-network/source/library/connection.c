
#include "connection.h"
#include "memory.h"

/**
 * Check connection.
 * 
 * address: host address
 * port...: host port
 * enable_timeout: 
 *       0 = disabled.
 *       1 = enabled.
 * 
 * Return: 
 *      -1 = error.
 *   != -1 = socket.
 */

int create_connection (char *address, int port, int enable_timeout)
{
    int status     = -1, sock = -1, flags  = 0;
    int timeout    = CONNECTIONS_TIMEOUT1;
    char *packet   = NULL;
    char header [] = "Verbum Node";

    // Configure connection.
    struct sockaddr_in saddress;
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
    #ifdef CONDBG
        say("process connect...");
    #endif

    time_t start, end;
    double diff;

    time(&start);

    while (1) {
        status = connect(sock, (struct sockaddr*) &saddress, sizeof(saddress));
        if (status != -1) 
            break;

        time(&end);
        diff = difftime(end, start);

        if (diff >= (double) timeout)
            break;
    
        usleep(1000);
    }
    
    #ifdef CONDBG
        say("connect finished, status: %d", status);
    #endif
    
    if (status == -1)
        say_ret(-1, "error connect socket.");

    // Select enabled.
    if (enable_timeout == 1) {
        #ifdef CONDBG
            say("process select...");
        #endif

        struct timeval stv;
        fd_set rfds;

        stv.tv_sec = timeout;
        stv.tv_usec = 0;

        FD_ZERO(&rfds);
        FD_SET(sock, &rfds);

        int st = select(sock+1, &rfds, NULL, NULL, &stv);
        
        if (st <= 0) {
            #ifdef CONDBG
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
        struct timeval tms;
        tms.tv_sec  = CONNECTIONS_TIMEOUT1;
        tms.tv_usec = 0;

        if (setsockopt(sock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval)) != 0)
            say_end_con(-1, "error setsocketopt.");
    }

    // Receive data.
    #ifdef CONDBG
        say("recv data...");
    #endif
    
    packet = get_recv_content(sock);
    if (!packet)
        say_end_con(-1, "error recv content.");
    
    // Check header.
    if (!strstr(packet, header))
        say_end_con(-1, "header not found on packet.");

    #ifdef CONDBG
        say("connection success!");
    #endif

    return sock;
}

int check_protocol (char *address, int port, int enable_timeout)
{
    int sock = -1;

    if (!address || !port)
        return 0;

    sock = create_connection(address, port, enable_timeout);
    if (sock == -1)
        return 0;

    close(sock);
    return 1;
}

char *get_recv_content (int sock)
{
    char *content = NULL;
    char tmp [128];
    int bytes = -1, status = 0, eoh = 0;
    int bytes_received = 0, size = 0;

    while (1) {
        memset(tmp, 0x0, 128);
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

    #ifdef CONDBG
        if (eoh)
            say("raw data received: \"%s + EOH\"", content);
        else
            say("raw data received: \"%s\"", content);
    #endif

    return content;
}

int send_handshake (int sock, char *handshake)
{
    int status = -1, result = 0, counter = 0;

    if (!sock || !handshake)
        return 0;

    while (1) {
        status = send(sock, handshake, strlen(handshake), 0);
        
        if (status > 0) {
            result = 1;
            break;
        }

        usleep(1000);
        counter++;

        if (counter >= 10)
            break;
    }

    return result;
}

char *send_raw_data (int sock, char *message)
{
    char prefix [] = "verbum-node-";
    char *response = NULL;
    int status     = 0;
    
    if (!sock || !message)
        return NULL;

    status = send(sock, message, strlen(message), 0);
    if (status == -1) 
        say_ret(NULL, "error send raw data.");
    
    response = get_recv_content(sock);
    if (!response)
        say_ret(NULL, "error recv data.");

    // Check message.
    if (!strstr(response, prefix)) {
        mem_sfree(response);
        return NULL;
    }

    return response;
}

char *process_generate_node_id (char *address, int nm_port, int node_port) 
{
    char prefix     [] = "generate-verbum-node-id:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!address || !nm_port || !node_port)
        return NULL;

    while (1) {
        sock = create_connection(address, nm_port, 0);
        if (sock != -1)
            break;

        usleep(1000);
    }

    size = sizeof(char) * (strlen(prefix) + 1024);
    mem_alloc_ret(message, size, char *, NULL);

    sprintf(message, "%s%d%s", prefix, node_port, end_header);
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);
    
    return response;
}

char *process_ping_node (
    char *address, int nm_port, char *node_id, int core_port, int server_port) 
{
    char prefix     [] = "ping-verbum-node:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!address || !nm_port || !node_id || !core_port || !server_port)
        return NULL;

    while (1) {
        sock = create_connection(address, nm_port, 1);
        if (sock != -1)
            break;

        usleep(1000);
    }
    
    size = sizeof(char) * (strlen(prefix) + strlen(node_id) + 1024);
    mem_alloc_ret(message, size, char *, NULL);
    
    sprintf(message, "%s%s:%d:%d:%s", 
        prefix, node_id, core_port, server_port, end_header);
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);
    
    return response;
}

char *process_delete_node (char *address, int node_port, char *node_id) 
{
    char prefix     [] = "delete-verbum-node:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!address || !node_port || !node_id)
        return NULL;

    sock = create_connection(address, node_port, 0);
    if (sock == -1)
        return NULL;

    size = sizeof(char) * (strlen(prefix) + strlen(node_id) + strlen(end_header) + 1);
    mem_alloc_ret(message, size, char *, NULL);

    sprintf(message, "%s%s%s", prefix, node_id, end_header);
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}

char *process_check_node_exists (char *address, int node_port, char *node_id)
{
    char prefix     [] = "check-verbum-node-exists:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!address || !node_port || !node_id)
        return NULL;

    sock = create_connection(address, node_port, 1);
    if (sock == -1)
        return NULL;

    size = sizeof(char) * (strlen(prefix) + strlen(node_id) + strlen(end_header) + 1);
    mem_alloc_ret(message, size, char *, NULL);

    sprintf(message, "%s%s%s", prefix, node_id, end_header);
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}

char *process_create_node_output_connection (char *src_node_address, 
                                             char *src_node_id, int   src_node_interface_port, 
                                             char *dst_node_id, char *dst_nm_address, int dst_nm_port)
{
    char prefix     [] = "create-verbum-node-output-connection:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!src_node_address || !src_node_id || 
        !src_node_interface_port || !dst_node_id || 
        !dst_nm_address || !dst_nm_port)
        return NULL;

    sock = create_connection(src_node_address, src_node_interface_port, 0);
    if (sock == -1)
        return NULL;

    size = sizeof(char) * (
                strlen(prefix) + 
                strlen(src_node_id) + 
                strlen(dst_node_id) + 
                strlen(dst_nm_address) + 
                strlen(end_header) + 
                1024);

    mem_alloc_ret(message, size, char *, NULL);

    sprintf(message, "%s%s:%s:%s:%d%s", 
                prefix, 
                src_node_id, 
                dst_node_id,
                dst_nm_address,
                dst_nm_port,
                end_header);

    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}

char *process_connection_ping (char *address, int node_port, 
    char *dst_node_id, char *src_node_id, int src_nm_port, 
    char *connection_id, char *node_mapper_id)
{
    char prefix     [] = "connection-ping-verbum-node:";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int size           = 0, sock = -1;

    if (!address || !node_port || !dst_node_id || 
        !src_node_id || !src_nm_port || !connection_id || !node_mapper_id)
        return NULL;

    sock = create_connection(address, node_port, 1);
    if (sock == -1)
        return NULL;

    size = sizeof(char) * (strlen(prefix) + strlen(dst_node_id) + 
        strlen(src_node_id) + strlen(connection_id) + 
        strlen(node_mapper_id) + strlen(end_header) + 256);
    
    mem_alloc_ret(message, size, char *, NULL);

    sprintf(message, "%s%s:%s:%d:%s:%s%s", prefix, 
        dst_node_id, src_node_id, src_nm_port, 
        connection_id, node_mapper_id, end_header);
    
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}

char *process_ping_connections (char *address, int nm_port, char *connections_list)
{
    char prefix     [] = "ping-verbum-connection:IHS\n\n";
    char end_header [] = VERBUM_EOH;
    char *message      = NULL, *response = NULL;
    int sock = -1, size = 0, s1 = 0, s2 = 0, s3 = 0;

    if (!address || !nm_port || !connections_list)
        return NULL;

    sock = create_connection(address, nm_port, 1);
    if (sock == -1)
        return NULL;

    s1   = strlen(prefix);
    s2   = strlen(connections_list);
    s3   = strlen(end_header);
    size = sizeof(char) * ( s1 + s2 + s3 + 1);
    mem_alloc_ret(message, size, char *, NULL);

    memcpy( message,            prefix,           s1);
    memcpy(&message[ s1      ], connections_list, s2);
    memcpy(&message[ s1 + s2 ], end_header,       s3);

    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}

char *process_delete_connection (
    char *address, int core_port, char *src_node_id, char *connection_id, char *dst_node_id)
{
    char prefix     [] = "delete-verbum-connection:";
    char end_header [] = VERBUM_EOH;
    char separator  [] = ":";
    char *message      = NULL, *response = NULL;
    int sock = -1, size = 0;
    int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;

    if (!address || !core_port || !src_node_id || !connection_id || !dst_node_id)
        return NULL;

    sock = create_connection(address, core_port, 1);
    if (sock == -1)
        return NULL;

    s1 = strlen(prefix);
    s2 = strlen(src_node_id);
    s3 = strlen(connection_id);
    s4 = strlen(dst_node_id);
    s5 = strlen(end_header);

    size = sizeof(char) * (s1 + s2 + s3 + s4 + s5 + 256);
    mem_alloc_ret(message, size, char *, NULL);

    // prefix:con-id:src-node:dst-node:EOH
    sprintf(message, "%s%s:%s:%s%s", 
                prefix, connection_id, src_node_id, dst_node_id, end_header);
    
    response = send_raw_data(sock, message);

    if (!response) {
        close(sock);
        mem_sfree(message);
        return NULL;
    }

    mem_sfree(message);
    close(sock);

    return response;
}


