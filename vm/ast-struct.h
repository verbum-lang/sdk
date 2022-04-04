
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle da estrutura AST.
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
                                                    //      VERBUM_USE
                                                    //      VERBUM_VARIABLE_INITIALIZATION
                                                    //      VERBUM_VARIABLE_USE_TYPES
                                                    //      VERBUM_VARIABLE_ACCESS_ARRAY

    /*
    ** Comando use (importações).
    ** type: VERBUM_USE
    */
    int use_type;                                   // Tipo do comando use:
                                                    //      VERBUM_USE_MODULE
                                                    //      VERBUM_USE_PATH
                                                    //      VERBUM_USE_ARCHIVE

    string use_module;                              // Nome do módulo.
    string use_path;                                // Caminho de diretório / path.
    vector <string> use_elements;                   // Múltiplas importações.

    /*
    ** Especificações de inicialização e uso das variáveis.
    ** type: VERBUM_VARIABLE_INITIALIZATION
    */
    int variable_type;                              // Tipo do uso da variável:
                                                    //      VERBUM_DECLARATION
                                                    //      VERBUM_ATTRIBUTION

    struct variable_settings {                      // Configurações de acessibilidade.
        bool vfinal;                                // final.
        bool priv;                                  // private.
        bool pro;                                   // protected.
        bool pub;                                   // public.
        bool vstatic;                               // static.
        bool simple;                                // Identifica se é uma declaração simples, sem a prefixação de atributos especiais.
    };

    /*
    ** Tipo das variáveis utilizadas.
    ** type: VERBUM_VARIABLE_USE_TYPES
    */
    int variable_definition_type;                   // Tipo da definição/uso da variável:
                                                    //      VERBUM_VARIABLE_SIMPLE
                                                    //      VERBUM_VARIABLE_OBJ_INSTANCE
                                                    //      VERBUM_VARIABLE_OBJ_STATIC
                                                    //      VERBUM_VARIABLE_ARRAY_ACCESS

    struct variable_names {                         // Nomes...
        string simple_name;                         // Nome da variável (uso simples).
        string object_name;                         // Nome do objeto chamado (acesso a objeto).
        string method_name;                         // Nome do método chamado (acesso a objeto).
    };

    bool variable_type_conversion;                  // Especifica se há conversão de tipo.
    string variable_type_conversion_name;           // Nome do tipo a ser convertido (quando há).

    int variable_operation;                         // Operação da variável:
                                                    //      VERBUM_VARIABLE_ATTR
                                                    //      VERBUM_VARIABLE_... (Todos os Assignment Operators).

    int variable_mod_operation;                     // Modo da operação:
                                                    //      VERBUM_MOD_OP_SIMPLE            - atribuição simples.
                                                    //      VERBUM_MOD_OP_OBJ_INSTANCE      - instanciamento de objeto (new).

    /*
    ** Itens do acesso a elementos de array.
    ** type: VERBUM_VARIABLE_ACCESS_ARRAY
    */
    int array_access_variable_type;                 // Tipo da variável utilizada no acesso a elemento de array:
                                                    //      VERBUM_ARRAY_ACCESS_SIMPLE
                                                    //      VERBUM_ARRAY_ACCESS_OBJ_INSTANCE
                                                    //      VERBUM_ARRAY_ACCESS_OBJ_STATIC

    int array_access_mode;                          // Modo do acesso ao elemento do array:
                                                    //      VERBUM_ARRAY_ACCESS_INDEX
                                                    //      VERBUM_ARRAY_ACCESS_ASSOCIATIVE
    
    /*
    ** Nodes internos (árvore) do elemento em questão.
    */
    vector <struct verbum_ast_node> nodes;

}  verbum_ast_node;

#endif


