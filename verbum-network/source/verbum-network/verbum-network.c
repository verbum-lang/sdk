
#include "global.h"
#include "help.h"

void configutation_check (void);
void configutation_read (void);

int initialization (int argc, char *argv[]) 
{
    global.instance.argc = argc;
    global.instance.argv = argv;

    configutation_check();
    configutation_read();

    return 0;
}

void configutation_check (void)
{
    int size = 0;

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
    say("config file: %s", global.configuration.path);
}


