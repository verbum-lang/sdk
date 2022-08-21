
#include "global.h"
#include "configuration.h"

int initialization (int argc, char *argv[]) 
{
    say("started!");

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    configutation_check();
    configutation_read();

    

    return 0;
}


