
#include "communication.h"
#include "delete-node.h"
#include "check-node-exists.h"
#include "create-node-connection.h"

int process_communication (int sock, char *id, int interface_port)
{
    char *response = NULL;

    if (!sock || !id || !interface_port)
        return 0;

    // Node protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Delete node.
     */
    if (strstr(response, "delete-verbum-node:"))
        delete_node(sock, response, id);

    /**
     * Check node exists.
     */
    else if (strstr(response, "check-verbum-node-exists:"))
        check_node_exists(sock, response, id, interface_port);

    /**
     * Create node output connection.
     */
    else if (strstr(response, "create-verbum-node-output-connection:"))
        create_node_connection(sock, response, 0, id);

    mem_sfree(response);
    return 1;
}


