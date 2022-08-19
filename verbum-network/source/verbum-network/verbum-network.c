
#include "global.h"
#include "help.h"

int param_argc = 0;
char **param_argv = { NULL };

void initialization (void);
void configutation_check (void);
void configutation_read (void);

int main (int argc, char *argv[]) 
{
    param_argc = argc;
    param_argv = argv;

    initialization();

    return 0;
}

void initialization (void) 
{
    configutation_check();
    configutation_read();
}

void configutation_check (void)
{
    char *configuration_file = NULL;
    int size = 0;

    for (int a=0; a<param_argc; a++) 
        if (strcmp(param_argv[a], "-c") == 0 && (a+1) < param_argc) 
            memory_scopy(param_argv[a+1], configuration_file);

    if (!configuration_file)
        show_help();

    if (!file_exists(configuration_file))
        say_exit("The file does not exist: %s", configuration_file);
}

void configutation_read (void)
{
    
}


