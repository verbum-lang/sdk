
#include "verbum.h"
#include "prepare-settings.h"
#include "fork-controller.h"
#include "node-creation.h"

int initialization (int argc, char *argv[]) 
{
    say("Verbum started.");

    prepare_settings(argc, argv);

    print("Node ID.........: %s", global.configuration.node.id);
    print("Node Mapper ID..: %s", global.configuration.node_mapper.id);
    print("Node Mapper port: %d", global.configuration.node_mapper.server_port);

    if (!ignore_sigpipe())
        say_ret(0, "sigaction() error.");

    initialize_fork_controller();
    initialize_node_creation();

	infinite_loop();
    return 0;
}


