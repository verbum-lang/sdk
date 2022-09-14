
#include "communication.h"
#include "add-node.h"
#include "ping-node.h"
#include "get-nodes.h"
#include "create-node.h"
#include "delete-node.h"
#include "check-node-exists.h"
#include "create-node-connection.h"
#include "connection-manager.h"
#include "delete-connection.h"

static int get_node_mapper_id      (int sock, char *nm_id);
static int check_direct_connection (int sock);

int process_communication(int sock, char *path, char *nm_id)
{
    char *response = NULL;
    int   status   = 0;

    if (!sock || !path || !nm_id)
        return 0;

    // Node Mapper protocol communication.
    response = get_recv_content(sock);
    if (!response)
        return 0;
    
    /**
     * Get Node Mapper ID.
     */
    if (strstr(response, "get-verbum-node-node-mapper-id:"))
        status = get_node_mapper_id(sock, nm_id);

    /**
     * Generate new node ID, and save.
     */
    else if (strstr(response, "generate-verbum-node-id:"))
        add_new_node(sock, response);

    /**
     * Ping node.
     */
    else if (strstr(response, "ping-verbum-node:"))
        status = update_ping_node(sock, response);

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
     * Delete connection.
     */
    else if (strstr(response, "delete-verbum-connection:"))
        delete_connection(sock, response);

    else if (strstr(response, "delete-verbum-connection-server:"))
        delete_connection_server(sock, response);

    /**
     * Check direct connection.
     */
    else if (strstr(response, "check-direct-node-mapper:"))
        check_direct_connection(sock);

    mem_sfree(response);
    return 1;
}

static int get_node_mapper_id (int sock, char *nm_id)
{
    char default_success []= VERBUM_DEFAULT_SUCCESS;
    char default_eoh     []= VERBUM_EOH;
    char *response = NULL;
    int bytes = 0, size = 0;

    if (!sock || !nm_id)
        return 0;

    size = strlen(default_success) + strlen(default_eoh) + strlen(nm_id) + 256;
    response = (char *) malloc(size);
    if (!response)
        return 0;

    memset(response, 0x0, size);
    sprintf(response, "%s\n\nverbum-node-mapper-id:%s%s", default_success, nm_id, default_eoh);

    bytes = send(sock, response, strlen(response), 0);
    return 1;
}

static int check_direct_connection (int sock)
{
    if (!sock)
        return 0;

    char default_success []= VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int bytes = 0;
    
    bytes = send(sock, default_success, strlen(default_success), 0);
    return 1;
}


