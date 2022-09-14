
#include "global.h"
#include "configuration.h"
#include "node-mapper.h"

int initialization (int argc, char *argv[]) 
{
    say("started!");

    /**
     * Prepare configuration.
     */

    global.instance.argc = argc;
    global.instance.argv = argv;
    global.instance.path = get_relative_path();

    if (!global.instance.path)
        say_ret(0, "Invalid configuration file path.");

    if (!configutation_check() || !configutation_read())
        say_ret(0, "Invalid configuration.");

    /**
     * Initializations.
     */
    if (!ignore_sigpipe())
        say_ret(0, "sigaction() error.");

    /**
     * Start Verbum Node Mapper.
     */
    if (!node_mapper())
        say_ret(0, "Error initializing Verbum Node Mapper.");
    
    infinite_loop();

    return 0;
}


