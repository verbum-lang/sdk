
#include "delete-connection.h"
#include "node-connection.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

int delete_connection (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS "-IHS-" VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    int bytes = 0, status = 0;

    char tmp [1024];
    char *ptr = NULL;

    char *connection_id     = NULL;
    char *src_node_id       = NULL;
    char *dst_node_id       = NULL;
    int   connection_type   = -1; // 0 = Input, 1 = Output.

    node_connection_t *connection, *last;

    if (!sock || !content)
        goto error;

    ptr = strstr(content, prefix);
    if (!ptr)
        goto error;

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
    
    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    if (strcmp(gconfig->information.id, src_node_id) == 0)
        status = 1;

    pthread_mutex_unlock(&mutex_gconfig);

    if (!status)
        goto error;

    // Search connection, and delete.
    status = 0;
    pthread_mutex_lock(&mutex_connections);

    for (connection=connections; connection != NULL; connection=connection->next) {
        if (!connection->id) {
            last = connection;
            continue;
        } else if (!connection->dst_node_id) {
            last = connection;
            continue;
        }

        if (strcmp(connection->id, connection_id) == 0          &&
            strcmp(connection->dst_node_id, dst_node_id) == 0   &&
            connection->type == connection_type                  )
        {
            // Kill thread.
            if (connection->tr_ping_controller_enabled == 1) {
                // ...
            }

            // Remove item.
            if (!connection->next)
                last->next = NULL;
            else 
                last->next = connection->next;

            mem_sfree(connection->id);
            mem_sfree(connection->remote_id);
            mem_sfree(connection->dst_node_id);
            mem_sfree(connection->dst_nm_id);
            mem_sfree(connection->dst_nm_address);
            free(connection);

            status = 1;
            break;
        }

        last = connection;
    }

    pthread_mutex_unlock(&mutex_connections);

    if (!status)
        goto error;

    // Finish.
    success:
    bytes = send(sock, response_success, strlen(response_success), 0);
    return 1;

    error:
    bytes = send(sock, response_error, strlen(response_error), 0);
    return 0;
}


