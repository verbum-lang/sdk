
#include <stdio.h>
#include <stdlib.h>

#include "help.h"

using namespace verbum;

VerbumLoader::VerbumLoader (int pargc, const char **pargv) {
    argc = pargc;
    argv = pargv;
}

std::string VerbumLoader::getFilename () {
    return filename;
}


