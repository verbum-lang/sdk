
#include "node-connection.h"
#include "generate-connection-id.h"

node_connection_t *connections;
pthread_mutex_t    mutex_connections = PTHREAD_MUTEX_INITIALIZER;

void *node_connection (void *tparam)
{
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

    connection->src_node_id         = NULL;
    connection->dst_node_id         = NULL;
    connection->dst_nm_id           = NULL;
    connection->dst_nm_address      = NULL;
    connection->dst_nm_port         = NULL;

    connection->next                = NULL;

    return connection;
}


