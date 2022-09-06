
#include "communication.h"
#include "add-node.h"
#include "ping-node.h"
#include "get-nodes.h"
#include "create-node.h"
#include "delete-node.h"

int process_communication (int sock, char *path)
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
     * Get node list.
     */
    else if (strstr(response, "get-verbum-node-list"))
        get_node_list(sock);

    /**
     * Create new node.
     */
    else if (strstr(response, "create-verbum-node"))
        create_node(sock, path);

    /**
     * Delete node.
     */
    else if (strstr(response, "delete-verbum-node:"))
        delete_node(sock, response);

    mem_sfree(response);
    return 1;
}


