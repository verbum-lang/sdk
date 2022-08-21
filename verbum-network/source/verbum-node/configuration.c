
#include "configuration.h"
#include "help.h"

void configutation_check (void)
{
    for (int a=0; a<global.instance.argc; a++) 
        if (strcmp(global.instance.argv[a], "-c") == 0 && (a+1) < global.instance.argc) 
            memory_scopy(global.instance.argv[a+1], global.configuration.path);
    
    if (!global.configuration.path)
        show_help();

    if (!file_exists(global.configuration.path))
        say_exit("The file does not exist: %s", global.configuration.path);
}

void configutation_read (void)
{
    global.configuration.content = file_read(global.configuration.path);
    if (!global.configuration.content || strlen(global.configuration.content) <= 0)
        say_exit("Error reading configuration file.");
}


