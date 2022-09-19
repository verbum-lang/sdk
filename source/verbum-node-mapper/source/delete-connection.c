
#include "delete-connection.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nm_nodes;
extern pthread_mutex_t    nm_mutex_nodes;

extern pthread_mutex_t    nm_mutex_connections;
extern node_connection_t *nm_connections;

int nm_delete_connection (int sock, char *content)
{
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
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
    int core_port = 0, status = 0, bytes = 0;
    char *response = NULL;

    if (!sock || !content)
        return 0;

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
        goto error;
    
    // Search node.
    pthread_mutex_lock(&nm_mutex_nodes);
    
    for (node=nm_nodes; node!=NULL; node=node->next) {
        if (node->status != 1) 
            continue;

        if (strcmp(node->id, src_node_id) == 0) {
            core_port = node->core_port;
            status = 1;
            break;
        }
    }

    pthread_mutex_unlock(&nm_mutex_nodes);

    if (!status)
        goto error;

    // Input.
    if (connection_type == 1) {  }

    // Output.
    else if (connection_type == 0) {

        for (int a=0; a<VERBUM_CHECK_DELETION_LIMIT; a++) {
            response = process_delete_connection(
                address, src_node_id, core_port, dst_node_id, connection_id, connection_type);

            if (response) {
                if (strstr(response, VERBUM_DEFAULT_SUCCESS))
                    break;

                mem_sfree(response);
            }

            sleep(1);
        }

        // Delete connection.
        pthread_mutex_lock(&nm_mutex_connections);

        for (connection=nm_connections; connection!=NULL; connection=connection->next) {
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
                strcmp(connection->dst_node_id, dst_node_id) == 0 &&
                connection->type == connection_type                )
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

        pthread_mutex_unlock(&nm_mutex_connections);
    }

    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    // Finish.
    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    return 1;

    error:

    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    return 0;
}

int nm_delete_connection_server (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection-server:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    int bytes = 0, status = 0;

    char tmp [1024];
    char *ptr = NULL;

    char *connection_id = NULL;
    char *src_node_id   = NULL;
    char *dst_node_id   = NULL;

    node_connection_t *connection, *last_connection;

    if (!sock || !content)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr)
        goto error;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    // Request informations.
    for (int a=0,b=0,c=0; ; a++) {
        if (ptr[a] == ':' || ptr[a] == '\0') {
            
            switch (c) {
                // Connection ID (client).
                case 0:
                    mem_salloc_scopy(tmp, connection_id);
                    break;
                // Source node ID (client).
                case 1:
                    mem_salloc_scopy(tmp, src_node_id);
                    break;
                // Destination/target node ID (client).
                case 2:
                    mem_salloc_scopy(tmp, dst_node_id);
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

    if (!connection_id || !src_node_id || !dst_node_id)
        goto error;
    
    // Search and delete connection.
    pthread_mutex_lock(&nm_mutex_connections);

    for (connection=nm_connections; connection!=NULL; connection=connection->next) {
        if (connection->status != 1) {
            last_connection = connection;
            continue;
        } else if (!connection->id) {
            last_connection = connection;
            continue;
        }
        
        if (strcmp(connection->id, connection_id)        == 0 &&
            strcmp(connection->src_node_id, src_node_id) == 0 &&
            strcmp(connection->dst_node_id, dst_node_id) == 0 &&
            connection->type                             == 1  ) 
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

    pthread_mutex_unlock(&nm_mutex_connections);

    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    // Finish.
    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    return 1;

    error:
    
    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    return 0;
}


