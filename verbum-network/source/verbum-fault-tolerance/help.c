
#include "help.h"

void show_help (void)
{
    printf(
        "\n"
        "Verbum Programming Language - Verbum Fault Tolerance\n"
        "\n"
        "   Use:     verbum-fault-tolerance OPTION PARAM\n"
        "   Example: verbum-fault-tolerance -c filename.ini\n"
        "\n"
        "Options:\n"
        "   -c CONFIGURATION-FILE   - Specify configuration file.\n"
        "                             The configuration file uses the INI format.\n"
        "\n"
    );

    exit(0);
}


