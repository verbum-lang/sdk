
#include "communication.h"
#include "delete-node.h"
#include "check-node-exists.h"
#include "create-node-connection.h"

static int process_communication_core   (int sock);
static int process_communication_server (int sock);

int process_communication (int sock, int sector)
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
    char *response = NULL;

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
        delete_node(sock, response);

    /**
     * Check node exists.
     */
    else if (strstr(response, "check-verbum-node-exists:"))
        check_node_exists(sock, response);

    /**
     * Create node output connection.
     */
    else if (strstr(response, "create-verbum-node-output-connection:"))
        create_node_connection(sock, response, 0);

    mem_sfree(response);
    return 1;
}

static int process_communication_server (int sock)
{
    char *response = NULL;

    if (!sock)
        return 0;

    // Node protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Ping node / check connection.
     */
    if (strstr(response, "connection-ping-verbum-node:")) {
        char data[]= VERBUM_DEFAULT_SUCCESS "-Santissima Trindade-" VERBUM_EOH;
        send(sock, data, strlen(data), 0);
    }

    mem_sfree(response);
    return 1;
}


