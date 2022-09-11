
#include "timeout-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

void *timeout_control (void *tparam)
{
    node_control_t *node, last_node;
    node_connection_t *connection, *last_connection;

    while (1) {

        // Nodes.


        // Connections.
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1) {
                last_connection = connection;
                continue;
            } else if (!connection->id) {
                last_connection = connection;
                continue;
            }

            say("id: %s - date: %s", connection->id, connection->last_connect_date);

            last_connection = connection;
        }

        pthread_mutex_unlock(&mutex_connections);
        sleep(1);
    }

    return NULL;
}


