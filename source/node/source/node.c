
#include "node.h"
#include "node-core.h"
#include "node-client.h"
#include "node-server.h"

pthread_mutex_t    mutex_gconfig = PTHREAD_MUTEX_INITIALIZER;
node_config_t     *gconfig = NULL;

pthread_mutex_t    node_mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t *node_connections = NULL;

extern global_t global;

int verbum_node (void)
{
    if (!ignore_sigpipe())
        say_ret(0, "sigaction() error.");

    // Prepare global configurations.
    mem_alloc_ret(gconfig, sizeof(node_config_t), node_config_t *, 0);

    gconfig->path             = NULL;
    gconfig->max_connections  = SERVERS_MAX_CONNECTIONS;
    gconfig->node_mapper_port = global.configuration.node_mapper.server_port;

    mem_scopy_ret(global.configuration.node_mapper.id, gconfig->node_mapper_id, 0);
    
    if (global.configuration.node.id)
        mem_salloc_scopy(global.configuration.node.id, gconfig->information.id);

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_gconfig, NULL) != 0) 
        say_ret(0, "mutex init failed - global configuration.");

    // Prepare mutex.
    if (pthread_mutex_init(&node_mutex_connections, NULL) != 0) 
        say_ret(0, "mutex init failed - connections.");
    
    /**
     * Node Core interface.
     */
    create_thread_controller(node_core);

    /**
     * Node client connections control.
     */
    create_thread_controller(node_client);

    /**
     * Node Server interface.
     */
    create_thread_controller(node_server);

    return 1;
}


