
#include "node-connection.h"

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
        
    

    /**
     * Interface control.
     */

    while (1) {


        usleep(1000);
    }

    return NULL;
}


