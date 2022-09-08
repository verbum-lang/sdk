
#include "generate-connection-id.h"
#include "node-connection.h"

extern node_connection_t *connections;
extern pthread_mutex_t    mutex_connections;

char *generate_connection_id (void)
{
    char *id = NULL;
    char tmp [1024];
    int limit = 24, found = 0, size = 0;
    node_connection_t *connection;

    memset(tmp, 0x0, 1024);
    sprintf(tmp, "verbum-connection-%d%d%d", 
        random_number(100, 999),
        random_number(100, 999),
        random_number(100, 999)
    );

    if (strlen(tmp) > limit)
        tmp[limit] = '\0';

    pthread_mutex_lock(&mutex_connections);

    for (connection=connections; connection!=NULL; connection=connection->next) {
        if (connection->status == 0)
            continue;
        if (!connection->id) 
            continue;

        if (strcmp(connection->id, tmp) == 0) {
            found = 1;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_connections);

    if (found == 1)
        return generate_connection_id();

    mem_scopy_ret(tmp, id, NULL);
    memset(tmp, 0x0, 1024);

    return id;    
}


