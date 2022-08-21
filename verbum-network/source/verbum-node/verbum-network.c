
#include "global.h"
#include "configuration.h"
#include "verbum-node.h"

int initialization (int argc, char *argv[]) 
{
    say("Verbum Network - started!");

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    configutation_check();
    configutation_read();

    verbum_node();

    return 0;
}


