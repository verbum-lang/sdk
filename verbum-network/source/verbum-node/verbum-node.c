
#include "global.h"
#include "configuration.h"
#include "node.h"

int initialization (int argc, char *argv[]) 
{
    say("started!");

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    configutation_check();
    configutation_read();

    verbum_node();
    
    while (1) { sleep(3); }
    return 0;
}


