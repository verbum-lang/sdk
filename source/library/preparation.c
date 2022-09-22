
#include "preparation.h"

#include "../verbum-node/node-global.h"
#include "../verbum-node/node-client.h"

extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern pthread_mutex_t    node_mutex_connections;
extern node_connection_t *node_connections;



int general_preparation (void)
{

    return 1;
}


