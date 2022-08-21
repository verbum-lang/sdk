
#include "node.h"

void verbum_node (void)
{
    prepare_node_mapper();
    prepare_fault_tolerance();
}

void prepare_node_mapper (void)
{
    check_connection_banner_nm_ft("Node Mapper", 
        global.configuration.node_mapper.server_port, "Verbum Node Mapper");
}

void prepare_fault_tolerance (void) 
{
    check_connection_banner_nm_ft("Fault Tolerance", 
        global.configuration.fault_tolerance.server_port, "Verbum Fault Tolerance");
}


