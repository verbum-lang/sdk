
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

#include "configuration.h"
#include "ast-struct.h"
#include "use.h"

using namespace verbum;

verbum_use_import::verbum_use_import (std::string raw)
{
    // Verifica se é módulo, path ou arquivo específico.
    // E formata os respectivos valores com suas distinções.
    int type = VERBUM_USE_UNKNOWN, flag = 0;
    std::string part1 = "", part2 = "";

    for (auto i : raw) {
        if (i == ':' && !flag) {
            type = VERBUM_USE_MODULE;
            flag = 1;
        } else if (i == '/' && !flag) {
            type = VERBUM_USE_PATH;
            flag = 1;
        }

        if (flag == 1)
            flag = 2;   
        else if (flag == 2)   
            part2 += i;
        else
            part1 += i;
    }

    if (type == VERBUM_USE_UNKNOWN && part1.length() > 0 && part1.length() == raw.length()) 
        type = VERBUM_USE_ARCHIVE;
    
    std::cout << "type: " << type << "\nstr 1: " << part1 << "\nstr 2: " << part2 << "\n\n";
}


