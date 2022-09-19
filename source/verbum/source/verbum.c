
#include "verbum.h"
#include "prepare-settings.h"

static int preparations      (int argc, char *argv[]);
static int start_node_mapper (void);
static int start_node        (void);

int initialization (int argc, char *argv[]) 
{
    say_debug("Verbum started.");

    if (preparations(argc, argv)) 
        say_debug("Preparations carried out successfully.");
    else
        say_ret(0, "Error performing initial preparations.");
    
    start_node_mapper();
    // start_node();
    infinite_loop();

    return 0;
}

static int preparations (int argc, char *argv[])
{
    prepare_settings(argc, argv);

    if (!ignore_sigpipe())
        say_ret(0, "Error ignoring SIGPIPE.");

    return 1;
}

static int start_node_mapper (void)
{
    if (global.configuration.node_mapper.id          &&
        global.configuration.node_mapper.server_port  )
    {
        open_node_mapper_process();
        return 1;
    }
    
    say_debug("Insufficient settings for Node Mapper startup.");
    return 0;
}

static int start_node (void)
{
    if (global.configuration.node.id                 &&
        global.configuration.node_mapper.server_port  )
    {
        if (verbum_node())
            say_debug("Verbum node successfully started!");
        else
            say_ret(0, "Error start Verbum Node.");

        return 1;
    }

    say_debug("Insufficient settings for Node startup.");
    return 0;
}


