
#include <stdio.h>
#include <stdlib.h>

#include "configuration.h"
#include "help.h"

using namespace verbum;

verbum_help::verbum_help (int pargc, const char **pargv) {
    this->argc = pargc;
    this->argv = pargv;

    if (pargc <= 1) {
        banner_end();
        exit(0);
    }
}

void verbum_help::banner () {
    printf(
        "\n\n The Verbum Programming Language\n\n"

        " __      __       _                     \n"
        " \\ \\    / /      | |                    \n"
        "  \\ \\  / /__ _ __| |__  _   _ _ __ ___  \n"
        "   \\ \\/ / _ \\ '__| '_ \\| | | | '_ ` _ \\ \n"
        "    \\  /  __/ |  | |_) | |_| | | | | | |\n"
        "     \\/ \\___|_|  |_.__/ \\__,_|_| |_| |_|\n\n"

        "                In principio erat Verbum \n"
        "                  et Verbum erat apud Deum \n"
        "                    et Deus erat Verbum - John 1\n\n"
    );
}

void verbum_help::banner_end () {
    this->banner();
    printf(" Use: %s source.verbum\n\n", this->argv[0]);
}


