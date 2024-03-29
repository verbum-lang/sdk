
#include "communication.h"
#include "delete-node.h"
#include "check-node-exists.h"
#include "create-node-connection.h"
#include "node-server-ping.h"
#include "delete-connection.h"

static int process_communication_core   (int sock);
static int process_communication_server (int sock);

int node_process_communication (int sock, int sector)
{
    int result = 0;

    switch (sector) {

        // Node Core interface.
        case 0:
            result = process_communication_core(sock);
            break;

        // Node Server connections interface.
        case 1:
            result = process_communication_server(sock);
            break;
    }

    return result;
}

static int process_communication_core (int sock)
{
    char error_message [] = VERBUM_DEFAULT_ERROR VERBUM_EOH;
    char *response = NULL;
    int   status   = 0, bytes = 0;

    if (!sock)
        return 0;

    // Node protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Delete node.
     */
    if (strstr(response, "delete-verbum-node:"))
        status = node_delete_node(sock, response);

    /**
     * Check node exists.
     */
    else if (strstr(response, "check-verbum-node-exists:"))
        status = node_check_node_exists(sock, response);

    /**
     * Create node output connection.
     */
    else if (strstr(response, "create-verbum-node-output-connection:"))
        status = node_create_node_connection(sock, response, 0);

    /**
     * Delete connection.
     */
    else if (strstr(response, "delete-verbum-connection:"))
        status = node_delete_connection(sock, response);

    if (status) {
        mem_sfree(response);
        return 1;
    }

    bytes = send(sock, error_message, strlen(error_message), VERBUM_SEND_FLAGS);
    mem_sfree(response);
    return 0;
}

static int process_communication_server (int sock)
{
    char error_message [] = VERBUM_DEFAULT_ERROR VERBUM_EOH;
    char *response = NULL;
    int   status   = 0, bytes = 0;

    if (!sock)
        return 0;

    // Node protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Ping node / check connection.
     */
    if (strstr(response, "connection-ping-verbum-node:"))
        status = node_server_ping(sock, response);
    
    /**
     * Delete connection.
     */
    else if (strstr(response, "delete-verbum-connection-server:"))
        status = node_delete_connection_server(sock, response);

    if (status) {
        mem_sfree(response);
        return 1;
    }

    bytes = send(sock, error_message, strlen(error_message), VERBUM_SEND_FLAGS);
    mem_sfree(response);
    return 0;
}


