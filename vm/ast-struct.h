
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Realização da análise semântica.
*/

#ifndef VERBUM_STRUCT
#define VERBUM_STRUCT

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

using namespace std;

// Modalidades do comando 'use'.
#define VERBUM_USE_UNKNOWN                  0
#define VERBUM_USE_MODULE                   1
#define VERBUM_USE_PATH                     2
#define VERBUM_USE_ARCHIVE                  3

// Lista de tipos de elementos.
#define VERBUM_USE                          0

// Controle dos nodes/hierarquização da própria estrutura AST.
typedef struct verbum_ast_node 
{
    int type;                                       // Tipo do elemento.
                                                    // Ex.: VERBUM_USE

    // Parâmetros do comando use.
    int use_type;                                   // Tipo do comando use. Ex.: VERBUM_USE_MODULE.
    string use_module;                              // Nome do módulo.
    string use_path;                                // Caminho de diretório / path.
    vector <string> use_elements;                   // Múltiplas importações.
}  verbum_ast_node;

#endif


