
#include "node.h"
#include "monitor-nm-ft.h"

void verbum_node (void)
{
    // Start Node Mapper and Fault Tolerance connection monitor.
    // And it advances only if there is connection to the interfaces.
    monitor_nm_and_ft();
    check_nm_ft();

    say ("Jesus <3");
}


