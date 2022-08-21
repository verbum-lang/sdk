
#include "node.h"

void verbum_node (void)
{
    prepare_node_mapper_fault_tolerance();
}

void prepare_node_mapper_fault_tolerance (void)
{
    open_nm_ft_process();
    check_connection_interface();
}

void open_nm_ft_process (void)
{
    system_execution("verbum-node-mapper \"%s\" &", global.configuration.path);
    system_execution("verbum-fault-tolerance \"%s\" &", global.configuration.path);
}

void check_connection_interface (void)
{
    // Node Mapper.
    say("Node Mapper - checking...");
    say("Node Mapper - server port: %d", global.configuration.node_mapper.server_port);

    while(!check_connection_banner_nm_ft("Node Mapper", 
        global.configuration.node_mapper.server_port, "Verbum Node Mapper")) 
    {
        open_nm_ft_process();
        sleep(1);
    }

    say("Node Mapper online.");
    
    // Fault Tolerance.
    say("Fault Tolerance - checking...");
    say("Fault Tolerance - server port: %d", global.configuration.fault_tolerance.server_port);

    while(!check_connection_banner_nm_ft("Fault Tolerance", 
        global.configuration.fault_tolerance.server_port, "Verbum Fault Tolerance"))
    {
        open_nm_ft_process();
        sleep(1);
    }

    say("Fault Tolerance online.");
}


