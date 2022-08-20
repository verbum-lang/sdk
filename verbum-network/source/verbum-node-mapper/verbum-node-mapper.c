
#include "global.h"
#include "configuration.h"

int initialization (int argc, char *argv[]) 
{
    say("Verbum Node Mapper - started!");

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    configutation_check();
    configutation_read();

    while (1);
    return 0;
}


