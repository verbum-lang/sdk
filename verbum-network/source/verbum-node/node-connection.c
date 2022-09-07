
#include "node-connection.h"
#include "generate-connection-id.h"

node_connection_t *connections;
pthread_mutex_t    mutex_connections = PTHREAD_MUTEX_INITIALIZER;

void *node_connection (void *tparam)
{
    node_connection_t * connection;

    say("Node connection started!");

    /**
     * Initialization.
     */

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_connections, NULL) != 0) 
        say_ret(NULL, "mutex init failed - connections.");
    
    // Initialize connections struct.
    connections = connection_create_item();

    /**
     * Interface control.
     */

    while (1) {
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {
            if (connection->status == 1) {
                connection->status = 2;

                // ...

                connection-> connection_status = 1;
            }
        }

        pthread_mutex_unlock(&mutex_connections);
        usleep(1000);
    }

    return NULL;
}

node_connection_t *connection_create_item (void)
{
    node_connection_t * connection;
    mem_alloc_ret(connection, sizeof(node_connection_t), node_connection_t *, NULL);

    connection->id                  = generate_connection_id();
    connection->status              = 0;
    connection->connection_status   = 0;
    connection->type                = -1;

    connection->dst_node_id         = NULL;
    connection->dst_nm_id           = NULL;
    connection->dst_nm_address      = NULL;
    connection->dst_nm_port         = 0;

    connection->next                = NULL;

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
