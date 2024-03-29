
#include "delete-connection.h"
#include "node-client.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

extern pthread_mutex_t    node_mutex_connections;
extern node_connection_t *node_connections;

int node_delete_connection (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    int bytes = 0, status = 0;

    char tmp [1024];
    char *ptr = NULL;

    char *connection_id     = NULL;
    char *src_node_id       = NULL;
    char *dst_node_id       = NULL;
    int   connection_type   = -1; // 0 = Input, 1 = Output.

    node_connection_t *connection, *last;
    char *response = NULL;
    char *nm_address = NULL;
    int node_server_port = 0;

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
        return 0;
    
    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    if (strcmp(gconfig->information.id, src_node_id) == 0)
        status = 1;

    pthread_mutex_unlock(&mutex_gconfig);

    if (!status)
        goto error;

    // Get connection information.
    status = 0;
    pthread_mutex_lock(&node_mutex_connections);

    for (connection=node_connections; connection != NULL; connection=connection->next) {
        if (!connection->id) 
            continue;
        else if (!connection->dst_node_id) 
            continue;

        if (strcmp(connection->id, connection_id) == 0          &&
            strcmp(connection->dst_node_id, dst_node_id) == 0   &&
            connection->type == connection_type                  )
        {
            mem_salloc_scopy(connection->dst_nm_address, nm_address);
            node_server_port = connection->dst_node_sv_port;
            status = 1;
            break;
        }
    }

    pthread_mutex_unlock(&node_mutex_connections);

    if (!status)
        goto error;

    // Search connection, and delete.
    status = 0;
    pthread_mutex_lock(&node_mutex_connections);

    for (connection=node_connections; connection != NULL; connection=connection->next) {
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
            if (connection->tr_ping_controller_enabled == 1) 
                connection->delete_enabled = 1;
            
            status = 1;
            break;
        }

        last = connection;
    }

    pthread_mutex_unlock(&node_mutex_connections);

    if (!status)
        goto error;

    // Output connection: send request do server.
    // Connects to the server port, as the core port may 
    // only be available locally (for design reasons).
    if (connection_type == 0) {
        status = 0;

        for (int a=0; a<CHECK_DELETION_LIMIT; a++) {
            response = process_delete_connection_sv(nm_address, node_server_port, 
                            src_node_id, dst_node_id, connection_id);

            if (response) {
                if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                    mem_sfree(response);
                    status = 1;
                    break;
                }

                mem_sfree(response);
            }

            sleep(1);
        }
    }

    if (!status)
        goto error;

    // Finish.
    success:
    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);

    mem_sfree(nm_address);
    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    return 1;

    error:
    mem_sfree(nm_address);
    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);
    
    return 0;
}

int node_delete_connection_server (int sock, char *content)
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

    node_connection_t *connection, *last;
    char *current_connection_id = NULL;
    char *response = NULL;
    char address [] = LOCALHOST;
    int node_mapper_port = 0;

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
    
    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    if (strcmp(gconfig->information.id, dst_node_id) == 0)
        status = 1;

    node_mapper_port = gconfig->node_mapper_port;

    pthread_mutex_unlock(&mutex_gconfig);

    if (!status)
        goto error;

    // Search and delete connection.
    status = 0;
    pthread_mutex_lock(&node_mutex_connections);

    for (connection=node_connections; connection != NULL; connection=connection->next) {
        if (!connection->id) {
            last = connection;
            continue;
        } else if (!connection->remote_id) {
            last = connection;
            continue;
        } else if (!connection->dst_node_id) {
            last = connection;
            continue;
        } 

        if (strcmp(connection->remote_id, connection_id) == 0 &&
            strcmp(connection->dst_node_id, src_node_id) == 0  )
        {   
            // Save current connection ID.
            mem_salloc_scopy(connection->id, current_connection_id);

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

    pthread_mutex_unlock(&node_mutex_connections);

    // Delete connection from Node Mapper.
    status = 0;

    for (int a=0; a<CHECK_DELETION_LIMIT; a++) {
        response = process_delete_connection_sv(address, node_mapper_port, 
                        dst_node_id, src_node_id, current_connection_id);

        if (response) {
            if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                mem_sfree(response);
                status = 1;
                break;
            }

            mem_sfree(response);
        }

        sleep(1);
    }

    if (!status)
        goto error;

    // Finish.
    success:
    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);

    mem_sfree(current_connection_id);
    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    return 1;

    error:
    mem_sfree(current_connection_id);
    mem_sfree(connection_id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);

    return 0;
}


