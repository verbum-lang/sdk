
#include "global.h"
#include "configuration.h"

void open_verbum_node_mapper     (void);
void open_verbum_fault_tolerance (void);

int initialization (int argc, char *argv[]) 
{
    global.instance.argc = argc;
    global.instance.argv = argv;

    configutation_check();
    configutation_read();

    open_verbum_node_mapper();
    open_verbum_fault_tolerance();

    return 0;
}

void open_verbum_node_mapper (void)
{
    system_execution("verbum-node-mapper -c \"%s\" &", global.configuration.path);
}

void open_verbum_fault_tolerance (void)
{
    system_execution("verbum-fault-tolerance -c \"%s\" &", global.configuration.path);
}


