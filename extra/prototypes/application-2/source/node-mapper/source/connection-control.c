
#include "connection-control.h"

pthread_mutex_t    node_mapper_mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_mapper_connection_t *node_mapper_connections       = NULL;

node_mapper_connection_t *node_mapper_connection_create_item (void)
{
    node_mapper_connection_t *connection;
    mem_alloc_ret(connection, sizeof(node_mapper_connection_t), node_mapper_connection_t *, NULL);

    connection->status                  = 0;
    connection->id                      = NULL;
    connection->type                    = -1;
    connection->dst_node_id             = NULL;
    connection->dst_nm_id               = NULL;
    connection->dst_nm_address          = NULL;
    connection->dst_nm_port             = -1; 
    connection->next                    = NULL;
    connection->connection_error        = 0;
    connection->connection_error_count  = 0;
    connection->dst_node_sv_port        = 0;
    connection->dst_nm_direct           = 0;
    memset(connection->last_connect_date, 0x0, 100);

    return connection;
}

int node_mapper_connection_insert_item (node_mapper_connection_t *new_connection)
{
    if (!new_connection)
        return 0;

    pthread_mutex_lock(&node_mapper_mutex_connections);
    node_mapper_connection_t *connection = node_mapper_connections;

    while (1) {
        if (!connection->next) {
            connection->next = new_connection;
            break;
        }

        connection = connection->next;
    }

    pthread_mutex_unlock(&node_mapper_mutex_connections);
    return 1;
}





