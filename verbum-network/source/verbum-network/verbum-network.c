
#include "global.h"

void initialization (int argc, char *argv[]);

int main (int argc, char *argv[]) 
{
    initialization(argc, argv);

    return 0;
}

void initialization (int argc, char *argv[]) 
{
    char *configuration_file = NULL;
    int size = 0;

    for (int a=0; a<argc; a++) 
    {
        if (strcmp(argv[a], "-c") == 0 && (a+1) < argc) {
            memory_scopy(argv[a+1], configuration_file);
        }
    }

    printf("config file: %s\n", configuration_file);
}


