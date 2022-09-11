
#include "connection-timeout.h"
#include "connection-control.h"

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

void *connection_timeout_control (void *tparam)
{
    node_connection_t *connection, *last;

    while (1) {
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1) {
                last = connection;
                continue;
            } else if (!connection->id) {
                last = connection;
                continue;
            }

            say("id: %s - date: %s", connection->id, connection->last_connect_date);

            last = connection;
        }

        pthread_mutex_unlock(&mutex_connections);
        sleep(1);
    }

    return NULL;
}


