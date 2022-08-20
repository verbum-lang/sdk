
#include "help.h"

void show_help (void)
{
    printf(
        "\n"
        "Verbum Programming Language - Verbum Network\n"
        "\n"
        "   Use:     verbum-network OPTION PARAM\n"
        "   Example: verbum-network -c filename.ini\n"
        "\n"
        "Options:\n"
        "   -c CONFIGURATION-FILE   - Specify configuration file.\n"
        "                             The configuration file uses the INI format.\n"
        "\n"
    );

    exit(0);
}


