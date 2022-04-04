
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "configuration.h"
#include "ast-struct.h"
#include "global.h"
#include "use.h"

using namespace verbum;
using namespace std;

verbum_use_import::verbum_use_import (string raw)
{
    // Verifica se é módulo, path ou arquivo específico.
    // E formata os respectivos valores com suas distinções.
    int type = VERBUM_USE_UNKNOWN, flag = 0;
    string part1 = "", part2 = "";

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

    // Prepara strings.
    part1 = verbum_global::trim(part1);
    part2 = verbum_global::trim(part2);

    if (type != VERBUM_USE_ARCHIVE) {

        // Verifica se é carregado múltiplos módulos do pacote.
        if (part2[0] == '<' && part2[part2.length()-1] == '>') {
            string part3 = part2.substr(1, part2.length()-2);
            string current = "";
            flag = 0;

            for (auto a : part3) {
                if (a == ',') {
                    this->ast_node.use_elements.push_back( verbum_global::trim(current) );
                    current = "";
                    flag = 1;
                }

                if (!flag)
                    current += a;
                else
                    flag = 0;
            }

            if (current.length() > 0) {
                this->ast_node.use_elements.push_back( verbum_global::trim(current) );
                current = "";
            }
        } else 
            this->ast_node.use_elements.push_back( part2 );

    } else 
        this->ast_node.use_elements.push_back( part1 );

    // Salva valores.
    this->ast_node.type             = VERBUM_USE;
    this->ast_node.use_type         = type;

    if (type == VERBUM_USE_MODULE)
        this->ast_node.use_module   = part1;
    else if (type == VERBUM_USE_PATH)
        this->ast_node.use_path     = part1;
}

verbum_ast_node verbum_use_import::get_ast_node ()
{
    return this->ast_node;
}


