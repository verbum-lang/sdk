
#include "communication.h"
#include "delete-node.h"

int process_communication (int sock, char *id)
{
    char *response = NULL;

    if (!sock || !id)
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

    mem_sfree(response);
    return 1;
}


