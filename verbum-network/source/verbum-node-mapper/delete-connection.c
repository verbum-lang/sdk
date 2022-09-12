
#include "delete-connection.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

int delete_connection (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection:";
    char tmp [1024];
    char *ptr = NULL;

    char *connection_id = NULL;
    char *src_node_id   = NULL;
    char *dst_node_id   = NULL;
    int connection_type = -1; // 0 = Input, 1 = Output.

    node_connection_t *connection, *last_connection;
    node_control_t *node;
    char address [] = LOCALHOST;
    int core_port = 0, status = 0;

    if (!sock || !content)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr)
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    // Request informations.
    for (int a=0,b=0,c=0; ; a++) {
        if (ptr[a] == ':' || ptr[a] == '\0') {
            
            switch (c) {
                // Connection ID.
                case 0:
                    mem_salloc_scopy(tmp, connection_id);
                    break;
                // Source node ID.
                case 1:
                    mem_salloc_scopy(tmp, src_node_id);
                    break;
                // Destination/target node ID.
                case 2:
                    mem_salloc_scopy(tmp, dst_node_id);
                    break;
                // Connection type.
                case 3:
                    connection_type = atoi(tmp);
                    break;
            }

            b = 0;
            c ++ ;
            memset(tmp, 0x0, 1024);

            if (ptr[a] == '\0')
                break;
        }

        else
            tmp[b++] = ptr[a];
    }

    if (!connection_id || !src_node_id || !dst_node_id || connection_type == -1)
        return 0;
    
    say("Connection type: \"%d\"", connection_type);
    say("Connection ID..: \"%s\"", connection_id);
    say("Src node ID....: \"%s\"", src_node_id);
    say("Dst node ID....: \"%s\"", dst_node_id);

    // Search node.
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1) 
            continue;

        if (strcmp(node->id, tmp) == 0) {
            core_port = node->core_port;
            status = 1;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);


    // Input.
    if (connection_type == 0) {  }

    // Output.
    else if (connection_type == 1) {
        char *response = process_delete_connection(address, core_port, src_node_id, connection_id, dst_node_id);
        if (response) {
            say("Delete con resp: \"%s\"", response);
            mem_sfree(response);
        }

        // Delete connection.
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (!connection->id) {
                last_connection = connection;
                continue;
            } else if (!connection->src_node_id) {
                last_connection = connection;
                continue;
            } else if (!connection->dst_node_id) {
                last_connection = connection;
                continue;
            }

            if (strcmp(connection->id, connection_id)        == 0 &&
                strcmp(connection->src_node_id, src_node_id) == 0 &&
                strcmp(connection->dst_node_id, dst_node_id) == 0  )
            {
                if (!connection->next)
                    last_connection->next = NULL;
                else 
                    last_connection->next = connection->next;

                mem_sfree(connection->id);
                mem_sfree(connection->src_node_id);
                mem_sfree(connection->dst_node_id);
                mem_sfree(connection->dst_nm_id);
                mem_sfree(connection->dst_nm_address);
                free(connection);

                break;
            }
        
            last_connection = connection;
        }

        pthread_mutex_unlock(&mutex_connections);
    }

    return 1;
}


