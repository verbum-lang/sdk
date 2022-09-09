
#include "configuration.h"
#include "help.h"

int configutation_check (void)
{
    for (int a=0; a<global.instance.argc; a++) 
        if (strcmp(global.instance.argv[a], "-c") == 0 && (a+1) < global.instance.argc)
            mem_scopy_ret(global.instance.argv[a+1], global.configuration.path, 0);

    if (!global.configuration.path)
        show_help();

    if (!file_exists(global.configuration.path))
        say_ret(0, "The file does not exist: %s", global.configuration.path);

    return 1;
}

int configutation_read (void)
{
    global.configuration.content = file_read(global.configuration.path);
    if (!global.configuration.content || strlen(global.configuration.content) <= 0)
        say_ret(0, "Error reading configuration file.");

    // Node Mapper configuration.
    global.configuration.node_mapper.server_port = ini_read_number(
        global.configuration.content, "VERBUM-NODE-MAPPER", "server_port"
    );

    global.configuration.node_mapper.id = ini_read_string(
        global.configuration.content, "VERBUM-NODE-MAPPER", "id"
    );

    if (!global.configuration.node_mapper.server_port)
        say_ret(0, "Error read server port.");
    else if (!global.configuration.node_mapper.id)
        say_ret(0, "Error read Node Mapper ID.");

    return 1;
}


