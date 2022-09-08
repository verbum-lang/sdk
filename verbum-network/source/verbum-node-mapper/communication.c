
#include "communication.h"
#include "add-node.h"
#include "ping-node.h"
#include "get-nodes.h"
#include "create-node.h"
#include "delete-node.h"
#include "check-node-exists.h"
#include "create-node-connection.h"
#include "connection-manager.h"

int process_communication(int sock, char *path)
{
    char *response = NULL;

    if (!sock || !path)
        return 0;

    // Node Mapper protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;

    /**
     * Generate new node ID, and save.
     */
    if (strstr(response, "generate-verbum-node-id:"))
        add_new_node(sock, response);

    /**
     * Ping node.
     */
    else if (strstr(response, "ping-verbum-node:"))
        update_ping_node(sock, response);

    /**
     * Ping - Connections Manager.
     */
    else if (check_connections_request(response))
        update_connections(sock, response);

    /**
     * Get node list.
     */
    else if (strstr(response, "get-verbum-node-list:"))
        get_node_list(sock);

    /**
     * Create new node.
     */
    else if (strstr(response, "create-verbum-node:"))
        create_node(sock, path);

    /**
     * Delete node.
     */
    else if (strstr(response, "delete-verbum-node:"))
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

    /**
     * Create node input connection.
     */
    else if (strstr(response, "create-verbum-node-input-connection:"))
        create_node_connection(sock, response, 1);

    mem_sfree(response);
    return 1;
}
