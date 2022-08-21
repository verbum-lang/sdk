
#include "node.h"
#include "monitor-nm-ft.h"

void verbum_node (void)
{
    create_node();

    // Start Node Mapper and Fault Tolerance monitor.
    monitor_nm_and_ft();    
}

void create_node (void)
{
    
}


