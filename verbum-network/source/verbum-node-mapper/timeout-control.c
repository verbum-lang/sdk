
#include "timeout-control.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

void *timeout_control (void *tparam)
{
    node_control_t *node, *last_node;
    node_connection_t *connection, *last_connection;

    while (1) {

        // Nodes.
        pthread_mutex_lock(&mutex_nodes);

        for (node=nodes; node!=NULL; node=node->next) {
            if (node->status != 1) {
                last_node = node;
                continue;
            }

            // say("node -> id: %s - date: %s", node->id, node->last_connect_date);

            last_node = node;
        }

        pthread_mutex_unlock(&mutex_nodes);

        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1) {
                last_connection = connection;
                continue;
            } else if (!connection->id) {
                last_connection = connection;
                continue;
            }

            /**
             * Check input connections timeout.
             */

            // if (date_difference_now(connection->last_connect_date) >= VERBUM_CONNECTION_SEC_TIMEOUT_ERROR) {
                // char *date = make_datetime();
                // say("> %s -> %f", connection->last_connect_date, date_difference_now(connection->last_connect_date));
                // say("> %s, %s -> %f", connection->last_connect_date, date, date_difference(connection->last_connect_date, date));
                // say("+++");

                // connection->connection_error = 1;
                // connection->connection_error_count++;
            // } else {
            //     connection->connection_error = 0;
            //     connection->connection_error_count = 0;
            // }

            last_connection = connection;
        }

        pthread_mutex_unlock(&mutex_connections);
        sleep(1);
    }

    return NULL;
}


