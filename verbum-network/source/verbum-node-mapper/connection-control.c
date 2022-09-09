
#include "connection-control.h"

pthread_mutex_t    mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t *connections       = NULL;

node_connection_t *connection_create_item (void)
{
    node_connection_t *connection;
    mem_alloc_ret(connection, sizeof(node_connection_t), node_connection_t *, NULL);

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

int connection_insert_item (node_connection_t *new_connection)
{
    if (!new_connection)
        return 0;

    pthread_mutex_lock(&mutex_connections);
    node_connection_t *connection = connections;

    while (1) {
        if (!connection->next) {
            connection->next = new_connection;
            break;
        }

        connection = connection->next;
    }

    pthread_mutex_unlock(&mutex_connections);
    return 1;
}





