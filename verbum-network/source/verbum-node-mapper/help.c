
#include "help.h"

void show_help (void)
{
    printf(
        "\n"
        "Verbum Programming Language - Verbum Node Mapper\n"
        "\n"
        "   Use:     verbum-node-mapper OPTION PARAM\n"
        "   Example: verbum-node-mapper -c filename.ini\n"
        "\n"
        "Options:\n"
        "   -c CONFIGURATION-FILE   - Specify configuration file.\n"
        "                             The configuration file uses the INI format.\n"
        "\n"
    );

    exit(0);
}


