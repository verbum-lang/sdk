
#include "prepare-settings.h"

#include "../../verbum-node/include/node.h"
#include "../../verbum-node-mapper/include/node-mapper.h"

int initialization (int argc, char *argv[]) 
{
    #ifdef VERBUM_DEBUG
        say("Verbum started");
    #endif

    /**
     * Initialize.
     */

    if (prepare_settings(argc, argv)) {
        #ifdef VERBUM_DEBUG
            say("Settings prepared successfully!");
        #endif
    }

    if (ignore_sigpipe()) {
        #ifdef VERBUM_DEBUG
            say("SIGPIPE ignored.");
        #endif
    } else
        say_ret(0, "Error ignoring SIGPIPE."); 


    /**
     * Start Verbum Node Mapper.
     */

    verbum_node_mapper();
    

    /**
     * Start Verbum Node.
     */

    if (verbum_node()) {
        #ifdef VERBUM_DEBUG
            say("Verbum node successfully started!");
        #endif
    } else
        say_ret(0, "Error start Verbum Node.");
    
    infinite_loop();
    return 0;
}


