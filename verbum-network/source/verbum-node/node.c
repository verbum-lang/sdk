
#include "node.h"
#include "monitor-processes.h"
#include "node-core.h"
#include "node-server.h"
#include "node-client.h"

int verbum_node (void)
{
    // Start Node Mapper monitor.
    if (!monitor_processes())
        return 0; 
    
    /**
     * Node API interface.
     */
    create_thread_controller(node_core);

    /**
     * Node server connections control.
     */
    create_thread_controller(node_server);

    /**
     * Node client connections control.
     */
    create_thread_controller(node_client);

    return 1;
}


