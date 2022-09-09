
#include "node.h"
#include "monitor-processes.h"
#include "node-connection.h"
#include "node-core.h"
#include "node-server.h"
#include "node-client.h"

pthread_mutex_t    mutex_gconfig = PTHREAD_MUTEX_INITIALIZER;
node_config_t     *gconfig;

pthread_mutex_t    mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t *connections;

int verbum_node (void)
{
    // Prepare global configurations.
    mem_alloc_ret(gconfig, sizeof(node_config_t), node_config_t *, 0);

    gconfig->path             = NULL;
    gconfig->max_connections  = SERVERS_MAX_CONNECTION;
    gconfig->node_mapper_port = global.configuration.node_mapper.server_port;
    mem_scopy_ret(global.configuration.path, gconfig->path, 0); 
    mem_scopy_ret(global.configuration.node_mapper.id, gconfig->node_mapper_id, 0);

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_gconfig, NULL) != 0) 
        say_ret(0, "mutex init failed - global configuration.");

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_connections, NULL) != 0) 
        say_ret(0, "mutex init failed - connections.");
    
    // Start Node Mapper monitor.
    if (!monitor_processes())
        return 0; 
    
    /**
     * Node connections controller.
     */

    create_thread_controller(node_connection);

    /**
     * Node Core interface.
     */
    create_thread_controller(node_core);

    /**
     * Node Server interface.
     */
    create_thread_controller(node_server);

    /**
     * Node client connections control.
     */
    create_thread_controller(node_client);

    return 1;
}


