
#include <dirent.h>
#include <sys/types.h>

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
    system_execution("verbum-node-mapper -c \"%s\" &", global.configuration.path);
    system_execution("verbum-fault-tolerance -c \"%s\" &", global.configuration.path);
}

void check_connection_interface (void)
{
    // Node Mapper.
    say("Node Mapper - checking...");
    say("Node Mapper - server port: %d", global.configuration.node_mapper.server_port);

    while(!check_connection_banner_nm_ft("Node Mapper", 
        global.configuration.node_mapper.server_port, "Verbum Node Mapper")) 
    {
        pid_t pid = proc_find("verbum-node-mapper");

        if (pid == -1)
            system_execution("verbum-node-mapper -c \"%s\" &", global.configuration.path);
    }

    say("Node Mapper online.");
    
    // Fault Tolerance.
    say("Fault Tolerance - checking...");
    say("Fault Tolerance - server port: %d", global.configuration.fault_tolerance.server_port);

    while(!check_connection_banner_nm_ft("Fault Tolerance", 
        global.configuration.fault_tolerance.server_port, "Verbum Fault Tolerance"))
    {
        pid_t pid = proc_find("verbum-fault-tolerance");

        if (pid == -1)
            system_execution("verbum-fault-tolerance -c \"%s\" &", global.configuration.path);
    }

    say("Fault Tolerance online.");
}


