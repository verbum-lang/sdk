
#include "initialization.h"

static void prepare_global_data (void);

global_t global;

int initializations (void)
{
    prepare_global_data();

    if (!ignore_sigpipe())
        say_ret(0, "Error ignoring SIGPIPE.");

    return 1;
}

static void prepare_global_data (void)
{
    global.configuration.node.id = NULL;
	global.configuration.node_mapper.id = NULL;
	global.configuration.node_mapper.server_port = 0;
}


