
#include "node.h"
#include "monitor-nm-ft.h"

void verbum_node (void)
{
    // Start Node Mapper and Fault Tolerance monitor.
    monitor_nm_and_ft(); 
    
    create_node();
}

void create_node (void)
{
    node_param_t param;
    int status = 0;
    pthread_t tid;
    
    param.node_mapper_port = global.configuration.node_mapper.server_port;
    param.fault_tolerance_port = global.configuration.fault_tolerance.server_port;
    memory_scopy(global.configuration.path, param.path);
    
    if ((status = pthread_create(&tid, NULL, node_interface, &param)) !=0)
        debug_exit("error while creating thread - Verbum Node.");
}

void * node_interface (void *tparam)
{
    node_param_t param = *( (node_param_t *) (tparam) );


}

void * node_server_controller (void *tparam)
{
    node_param_t param = *( (node_param_t *) (tparam) );


}

void * node_client_controller (void *tparam)
{
    node_param_t param = *( (node_param_t *) (tparam) );


}


