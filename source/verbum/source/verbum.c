
#include "global.h"
#include "../../verbum-node/include/node.h"
#include "../../verbum-node-mapper/include/node-mapper.h"

int initialization (int argc, char *argv[]) 
{
    say("Verbum started");

    // Default configuration.
    char node_mapper_id [] = "IHS-333111333";
    global.configuration.node_mapper.server_port = 3333;
    mem_scopy_ret(node_mapper_id, global.configuration.node_mapper.id, 0);

    /**
     * Initialize.
     */

    if (!ignore_sigpipe())
        say_ret(0, "sigaction() error.");

    verbum_node_mapper();
    
    if (!verbum_node())
        say_ret(0, "Error start Verbum Node.");
        
    infinite_loop();
    
    return 0;
}


