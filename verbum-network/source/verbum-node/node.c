
#include "node.h"
#include "monitor-processes.h"
#include "node-interface.h"
#include "node-server.h"
#include "node-client.h"

void verbum_node (void)
{
    // Start Node Mapper monitor.
    monitor_processes(); 
    
    // Create node controllers.
    create_thread_controller(node_interface);
    create_thread_controller(node_server);
    create_thread_controller(node_client);
}


