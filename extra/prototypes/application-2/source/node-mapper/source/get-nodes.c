
#include "get-nodes.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *node_mapper_nodes;
extern pthread_mutex_t    node_mapper_mutex_nodes;

extern pthread_mutex_t    node_mapper_mutex_connections;
extern node_mapper_connection_t *node_mapper_connections;

int node_mapper_get_node_list (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("get verbum node informations.");
    #endif

    char *message = NULL;
    char tmp [2048];
    int size = 0, status = 1, a = 1, b = 1;
    node_control_t *node;
    node_mapper_connection_t *connection;

    pthread_mutex_lock(&node_mapper_mutex_nodes);
    pthread_mutex_lock(&node_mapper_mutex_connections);
    
    for (node=node_mapper_nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        // Node informations.
        memset(tmp, 0x0, 2048);
        sprintf(tmp, "node: %d\nid: %s\ncore port: %d\nserver port: %d\nlast connection date: %s\noffline by timeout: %d\n\n", 
            a, node->id, node->core_port, node->server_port, node->last_connect_date, node->offline_by_timeout);
        
        message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
        if (!message) {
            status = 0;
            break;
        }

        memcpy(&message[size], tmp, strlen(tmp));
        size += strlen(tmp);
        message[size] = '\0';

        // Search connections.
        b = 0;
        
        for (connection=node_mapper_connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1)
                continue;
            if (!connection->id)
                continue;

            if (strcmp(connection->src_node_id, node->id) == 0) {
                memset(tmp, 0x0, 2048);

                sprintf(tmp,
                        "connection: %d\n" 
                        "id: %s\n" 
                        "type: %d\n" 
                        "src-node-id: %s\n" 
                        "dst-node-id: %s\n" 
                        "dst-nm-id: %s\n" 
                        "dst-nm-addr: %s\n" 
                        "dst-nm-port: %d\n" 
                        "last connection date: %s\n"
                        "error: %d\n"
                        "error count: %d\n"
                        "dst-node-sv-port: %d\n"
                        "dst-nm-direct: %d\n"
                        "\n",

                        b,
                        connection->id, 
                        connection->type, 
                        connection->src_node_id, 
                        connection->dst_node_id, 
                        connection->dst_nm_id, 
                        connection->dst_nm_address, 
                        connection->dst_nm_port, 
                        connection->last_connect_date,
                        connection->connection_error,
                        connection->connection_error_count,
                        connection->dst_node_sv_port,
                        connection->dst_nm_direct);
                
                message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
                if (!message) {
                    status = 0;
                    break;
                }

                memcpy(&message[size], tmp, strlen(tmp));
                size += strlen(tmp);
                message[size] = '\0';

                b++;
            }
        }

        // End node informations.
        memset(tmp, 0x0, 2048);
        sprintf(tmp, "+++\n");

        message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
        if (!message) {
            status = 0;
            break;
        }

        memcpy(&message[size], tmp, strlen(tmp));
        size += strlen(tmp);
        message[size] = '\0';

        if (!status)
            break;

        a++;
    }

    pthread_mutex_unlock(&node_mapper_mutex_connections);
    pthread_mutex_unlock(&node_mapper_mutex_nodes);

    if (!status || !size) {
        size    = sizeof(char) * 256;
        message = (char *) realloc(message, size);
        
        if (message) {
            memset(message, 0x0, size);
            sprintf(message, "nodes not found.\n");
            size = strlen(message);
        }
    }
    
    status = send(sock, message, size, VERBUM_SEND_FLAGS);
    mem_sfree(message);
    return 1;
}


