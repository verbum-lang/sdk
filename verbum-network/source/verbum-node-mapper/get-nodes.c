
#include "get-nodes.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

int get_node_list (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("get verbum node informations.");
    #endif

    char *message = NULL;
    char tmp [1024];
    int size = 0, status = 1, a = 1;
    node_control_t *node;
    node_connection_t *connection;

    pthread_mutex_lock(&mutex_nodes);
    pthread_mutex_lock(&mutex_connections);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        // Node informations.
        memset(tmp, 0x0, 1024);
        sprintf(tmp, "node: %d\nid: %s\ncore port: %d\nserver port: %d\nlast connection date: %s\n\n", 
            a, node->id, node->core_port, node->server_port, node->last_connect_date);
        
        message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
        if (!message) {
            status = 0;
            break;
        }

        memcpy(&message[size], tmp, strlen(tmp));
        size += strlen(tmp);
        message[size] = '\0';

        // Search connections.
        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1)
                continue;
            if (!connection->id)
                continue;

            // Update data.
            if (strcmp(connection->src_node_id, node->id) == 0) {

            }
        }

        // End node informations.
        memset(tmp, 0x0, 1024);
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

    pthread_mutex_unlock(&mutex_connections);
    pthread_mutex_unlock(&mutex_nodes);

    if (!status) {
        size = 256;
        mem_salloc_ret(message, size, 0);
        sprintf(message, "nodes not found.\n");
        size = strlen(message);
    }

    status = send(sock, message, size, 0);
    mem_sfree(message);

    return 1;
}


