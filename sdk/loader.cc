
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

#include "loader.h"

using namespace verbum;

VerbumLoader::VerbumLoader (int pargc, const char **pargv) {
    argc = pargc;
    argv = pargv;

    // Verificações iniciais.
    size_t size = sizeof(char) * (strlen(argv[1]) + 1);
    char *fname = (char *) malloc(size);
    char *cname = (char *) argv[1];

    if (!fname) {
        std::cout << "Error alloc memory." << std::endl;
        exit(0);
    }

    memset(fname, 0x00, size);
    memcpy(fname, cname, size);

    std::ifstream f(fname);
    if (!f.good()) {
        std::cout << "Error open file: " << std::string(fname) << std::endl;
        exit(0);
    }

    // Carrega path completo do arquivo.
    char path [1024];
    realpath(fname, path);
    filepath = std::string(path);

    free(fname);
}

std::string VerbumLoader::getFilename () {
    return filepath;
}


