
#include <dirent.h>
#include <sys/types.h>

#include "node.h"

void verbum_node (void)
{
    prepare_node_mapper_fault_tolerance();

    // Continue if all ok!
}

void prepare_node_mapper_fault_tolerance (void)
{
    prepare_param_t prepare_param;
    int status = 0;
    pthread_t tid;
    
    prepare_param.node_mapper_port = global.configuration.node_mapper.server_port;
    prepare_param.fault_tolerance_port = global.configuration.fault_tolerance.server_port;
    memory_scopy(global.configuration.path, prepare_param.path);
    
    if ((status = pthread_create(&tid, NULL, prepara_nm_ft_handler, &prepare_param)) !=0)
        debug_exit("error while creating thread - control of Node Mapper and Fault Tolerance.");
}

void * prepara_nm_ft_handler (void *param)
{
    prepare_param_t prepare_param = *( (prepare_param_t *) (param) );
    open_nm_ft_process(prepare_param.path);

    while (1) {
        check_connection_interface(prepare_param.path, 
            prepare_param.node_mapper_port, prepare_param.fault_tolerance_port);
        sleep(1);
    }
}

void open_nm_ft_process (char *path)
{
    // system_execution("verbum-node-mapper -c \"%s\" &", path);
    system_execution("verbum-fault-tolerance -c \"%s\" &", path);
}

void check_connection_interface (char *path, int node_mapper_port, int fault_tolerance_port)
{
    // Node Mapper.
    say("Node Mapper - checking...");
    say("Node Mapper - server port: %d", node_mapper_port);

    while(!check_connection_banner_nm_ft(
        "Node Mapper", node_mapper_port, "Verbum Node Mapper")) 
    {
        pid_t pid = check_process_running("verbum-node-mapper");
        if (pid == -1)
            system_execution("verbum-node-mapper -c \"%s\" &", path);
    }

    say("Node Mapper online.");
    
    // Fault Tolerance.
    say("Fault Tolerance - checking...");
    say("Fault Tolerance - server port: %d", fault_tolerance_port);

    while(!check_connection_banner_nm_ft(
        "Fault Tolerance", fault_tolerance_port, "Verbum Fault Tolerance"))
    {
        pid_t pid = check_process_running("verbum-fault-tolerance");
        if (pid == -1)
            system_execution("verbum-fault-tolerance -c \"%s\" &", path);
    }

    say("Fault Tolerance online.");
}


