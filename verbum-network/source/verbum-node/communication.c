
#include "communication.h"
#include "delete-node.h"
#include "check-node-exists.h"

int process_communication (int sock, char *id, int interface_port)
{
    char *response = NULL;

    if (!sock || !id || !interface_port)
        return 0;

    // Node Mapper protocol communication.
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

    mem_sfree(response);
    return 1;
}


