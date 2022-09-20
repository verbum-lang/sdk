
#include "node.h"
#include "monitor-processes.h"
#include "node-core.h"
#include "node-client.h"
#include "node-server.h"

pthread_mutex_t    node_mutex_gconfig     = PTHREAD_MUTEX_INITIALIZER;
node_config_t     *node_gconfig;

pthread_mutex_t    node_mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t *node_connections;

int initialize_node (void)
{
    say_debug("Verbum Node started!");

    if (!ignore_sigpipe())
        say_ret(0, "ignore_sigpipe() error.");

    // Prepare global configurations.
    mem_alloc_ret(node_gconfig, sizeof(node_config_t), node_config_t *, 0);

    node_gconfig->path             = NULL;
    node_gconfig->max_connections  = SERVERS_MAX_CONNECTION;
    node_gconfig->node_mapper_port = global.configuration.node_mapper.server_port;



    // Get Node Mapper ID...
    mem_scopy_ret(global.configuration.node_mapper.id, node_gconfig->node_mapper_id, 0);



    // Prepare mutex.
    if (pthread_mutex_init(&node_mutex_gconfig, NULL) != 0) 
        say_ret(0, "mutex initialization failed - global configuration.");

    if (pthread_mutex_init(&node_mutex_connections, NULL) != 0) 
        say_ret(0, "mutex initialization failed - connections.");
    
    if (!monitor_processes())
        return 0; 
    
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


