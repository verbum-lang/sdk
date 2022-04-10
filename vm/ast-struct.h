
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

#define VERBUM_UNKNOWN                                  0

// Lista de tipos de elementos da AST.
#define VERBUM_USE                                      1
#define VERBUM_VARIABLE_INITIALIZATION                  2
#define VERBUM_VARIABLE_USE_TYPES                       3

#define VERBUM_ACCESS_ARRAY                             4
#define VERBUM_ACCESS_ARRAY_INDEX_BLOCK                 5
#define VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER             6
#define VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT       7
#define VERBUM_ACCESS_ARRAY_TYPE_BLOCK                  8
#define VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT            9
#define VERBUM_ACCESS_ARRAY_OP_ELEMENT                  27

#define VERBUM_OPERATION_BLOCK                          10
#define VERBUM_GENERAL_VALUE                            11
#define VERBUM_DATA_INDEX_ARRAY_BLOCK                   12
#define VERBUM_DATA_ASSOC_ARRAY_BLOCK                   13
#define VERBUM_DATA_ASSOC_ARRAY_ELEMENT                 14

#define VERBUM_FUNCTION_CALL                            15

#define VERBUM_CONDITIONAL_STRUCT_BLOCK                 16
#define VERBUM_CONDITIONAL_EXPRESSION_BLOCK             17
#define VERBUM_CONDITIONAL_CODE_BLOCK                   18
#define VERBUM_CONDITIONAL_IF                           19
#define VERBUM_CONDITIONAL_ELIF                         20
#define VERBUM_CONDITIONAL_ELSE                         21

#define VERBUM_CONDITIONAL_EXPR_NOT                     22
#define VERBUM_CONDITIONAL_EXPR_BLOCK_OPEN              23

#define VERBUM_EXPRESSION_ATTR_FUNC_CALL                24
#define VERBUM_EXPRESSION_ATTR_FUNC_CALL_DESTINATION    25
#define VERBUM_EXPRESSION_ATTR_FUNC_CALL_BLOCK          26

// Modalidades do comando 'use'.
#define VERBUM_USE_UNKNOWN                              0
#define VERBUM_USE_MODULE                               1
#define VERBUM_USE_PATH                                 2
#define VERBUM_USE_ARCHIVE                              3

// Tipos de variáveis (setor 'mode').
#define VERBUM_VARIABLE_DECLARATION                     1
#define VERBUM_VARIABLE_ATTRIBUTION                     2

#define VERBUM_VARIABLE_SIMPLE                          1
#define VERBUM_VARIABLE_OBJ_INSTANCE                    2
#define VERBUM_VARIABLE_OBJ_STATIC                      3
#define VERBUM_VARIABLE_ARRAY_ACCESS                    4

// Acesso aos elementos de array.
#define VERBUM_ACCESS_ARRAY_TINDEX_INTEGER              1
#define VERBUM_ACCESS_ARRAY_TINDEX_IDENTIFIER           2
#define VERBUM_ACCESS_ARRAY_TINDEX_OPERATION            3

// Aritméticos.
#define VERBUM_OPERATOR_ADD                             1
#define VERBUM_OPERATOR_SUB                             2
#define VERBUM_OPERATOR_DIV                             3
#define VERBUM_OPERATOR_PERC                            4
#define VERBUM_OPERATOR_MUL                             5

// Operadores.
#define VERBUM_OPERATOR_ATTR                            6
#define VERBUM_OPERATOR_ADD_EQUAL                       7
#define VERBUM_OPERATOR_SUB_EQUAL                       8
#define VERBUM_OPERATOR_MUL_EQUAL                       9
#define VERBUM_OPERATOR_DIV_EQUAL                      10
#define VERBUM_OPERATOR_PERC_EQUAL                     11
#define VERBUM_OPERATOR_MAJOR                          12
#define VERBUM_OPERATOR_MINOR                          13
#define VERBUM_OPERATOR_MAJOR_EQUAL                    14
#define VERBUM_OPERATOR_MINOR_EQUAL                    15
#define VERBUM_OPERATOR_AND                            16
#define VERBUM_OPERATOR_OR                             17
#define VERBUM_OPERATOR_EQUAL                          18
#define VERBUM_OPERATOR_NOT_EQUAL                      19
#define VERBUM_OPERATOR_NOT                            20

#define VERBUM_MOD_OP_SIMPLE                            1
#define VERBUM_MOD_OP_OBJ_INSTANCE                      2

// Tipos de dados.
#define VERBUM_DATA_IDENTIFIER                          1
#define VERBUM_DATA_INTEGER                             2
#define VERBUM_DATA_FLOAT                               3
#define VERBUM_DATA_FUNCTION_CALL                       4
#define VERBUM_DATA_INSTANCE_METHOD_CALL                5
#define VERBUM_DATA_STATIC_METHOD_CALL                  6
#define VERBUM_DATA_STRING                              7
#define VERBUM_DATA_OPERATION_BLOCK                     8

// Operações de inc/dec.
#define VERBUM_OP_TYPE_INC                              1
#define VERBUM_OP_TYPE_DEC                              2

#define VERBUM_OP_INCDEC_PRE                            1
#define VERBUM_OP_INCDEC_POS                            2

// Tipos de operações (em relação a sua organização).
#define VERBUM_OPERATION_TYPE_SIMPLE                    1
#define VERBUM_OPERATION_TYPE_BLOCK                     2 
#define VERBUM_OPERATION_FUNC_BLOCK                     3

// Tipos de chamada a função.
#define VERBUM_FUNCTION_CALL_SIMPLE                     1
#define VERBUM_FUNCTION_CALL_INSTANCE                   2   
#define VERBUM_FUNCTION_CALL_STATIC                     3

// Controle dos nodes/hierarquização da própria estrutura AST.
typedef struct verbum_ast_node 
{
    int type;                                       // Tipo do elemento.
                                                    //      VERBUM_USE
                                                    //      VERBUM_VARIABLE_INITIALIZATION
                                                    //      VERBUM_VARIABLE_USE_TYPES
                                                    //      VERBUM_ACCESS_ARRAY
                                                    //      VERBUM_OPERATION_BLOCK
                                                    //      ...

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

    struct {                                        // Configurações de acessibilidade.
        bool vfinal;                                // final.
        bool priv;                                  // private.
        bool pro;                                   // protected.
        bool pub;                                   // public.
        bool vstatic;                               // static.
        bool simple;                                // Identifica se é uma declaração simples, sem a prefixação de atributos especiais.
    } variable_settings;

    /*
    ** Tipo das variáveis utilizadas.
    ** type: VERBUM_VARIABLE_USE_TYPES
    */
    int variable_definition_type;                   // Tipo da definição/uso da variável:
                                                    //      VERBUM_VARIABLE_SIMPLE
                                                    //      VERBUM_VARIABLE_OBJ_INSTANCE
                                                    //      VERBUM_VARIABLE_OBJ_STATIC
                                                    //      VERBUM_VARIABLE_ARRAY_ACCESS

    struct {                                        // Nomes...
        string simple_name;                         // Nome da variável (uso simples).
        string object_name;                         // Nome do objeto chamado (acesso a objeto).
        string method_name;                         // Nome do método chamado (acesso a objeto).
    } variable_names;

    bool variable_type_conversion;                  // Especifica se há conversão de tipo.
    string variable_type_conversion_name;           // Nome do tipo a ser convertido (quando há).

    int variable_operation;                         // Operação da variável:
                                                    //      VERBUM_OPERATOR_ATTR                    =
                                                    //      VERBUM_OPERATOR_ADD_EQUAL              +=
                                                    //      VERBUM_OPERATOR_SUB_EQUAL              -=
                                                    //      VERBUM_OPERATOR_MUL_EQUAL              *=
                                                    //      VERBUM_OPERATOR_DIV_EQUAL              /=
                                                    //      VERBUM_OPERATOR_PERC_EQUAL             %=
                                                    //      VERBUM_OPERATOR_MAJOR                   >
                                                    //      VERBUM_OPERATOR_MINOR                   <
                                                    //      VERBUM_OPERATOR_MAJOR_EQUAL            >=
                                                    //      VERBUM_OPERATOR_MINOR_EQUAL            <=
                                                    //      VERBUM_OPERATOR_AND                    &&
                                                    //      VERBUM_OPERATOR_OR                     ||
                                                    //      VERBUM_OPERATOR_EQUAL                  ==
                                                    //      VERBUM_OPERATOR_NOT_EQUAL              !=
                                                    //      VERBUM_OPERATOR_NOT                     !

    int variable_mod_operation;                     // Modo da operação:
                                                    //      VERBUM_MOD_OP_SIMPLE            - atribuição simples.
                                                    //      VERBUM_MOD_OP_OBJ_INSTANCE      - instanciamento de objeto (new).

    /*
    ** Itens do acesso a elementos de array.
    ** type: VERBUM_ACCESS_ARRAY
    */
    string access_array_identifier;                 // Nome identificador do membro de acesso aos elementos de array.

    struct {                                        // Tipo de acesso ao elemento do array.
        int type;                                   // Tipo:
                                                    //      VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER
                                                    //      VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT
                                                    //      VERBUM_ACCESS_ARRAY_TYPE_BLOCK
                                                    //      VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT

        int type_inc_dec;                           // Tipo de incremento/decremento:
                                                    //      VERBUM_OP_TYPE_INC
                                                    //      VERBUM_OP_TYPE_DEC
                                                    //
        int mod_inc_dec;                            // Modo da operação de incremento/decremento:
                                                    //      VERBUM_OP_INCDEC_PRE    - Anterior a variável.
                                                    //      VERBUM_OP_INCDEC_POS    - Após a variável.
    } access_array_type;

    /*
    ** Bloco de operações.
    ** VERBUM_OPERATION_BLOCK
    */
    int operation_type;                             // Tipo do operação:
                                                    //      VERBUM_OPERATION_TYPE_SIMPLE    - Operação simples.
                                                    //      VERBUM_OPERATION_TYPE_BLOCK     - Bloco de operações.
                                                    //      VERBUM_OPERATION_TYPE_FUNC_CALL - Chamadas a funções.

    struct {
        int type;                                   // Tipo do dado da operação:
                                                    //      VERBUM_DATA_IDENTIFIER
                                                    //      VERBUM_DATA_INTEGER
                                                    //      VERBUM_DATA_FLOAT
                                                    //      VERBUM_DATA_FUNCTION_CALL
                                                    //      VERBUM_DATA_INSTANCE_METHOD_CALL
                                                    //      VERBUM_DATA_STATIC_METHOD_CALL

        int type_inc_dec;                           // Tipo de incremento/decremento:
                                                    //      VERBUM_OP_TYPE_INC
                                                    //      VERBUM_OP_TYPE_DEC
                                                    //
        int mod_inc_dec;                            // Modo da operação de incremento/decremento:
                                                    //      VERBUM_OP_INCDEC_PRE    - Anterior a variável.
                                                    //      VERBUM_OP_INCDEC_POS    - Após a variável.

        string identifier;                          // Identificador.
        string integer;                             // Inteiro.
        string floating;                            // Float.
        
        string function_name;                       // Nome da função chamada.
        string object_name;                         // Nome do objeto.
        string method_name;                         // Nome do método.
    } operation_data;

    int operation_op;                               // Operador relacionado à operação:
                                                    //      VERBUM_OPERATOR_ADD 
                                                    //      VERBUM_OPERATOR_SUB 
                                                    //      VERBUM_OPERATOR_DIV 
                                                    //      VERBUM_OPERATOR_PERC
                                                    //      VERBUM_OPERATOR_MUL 

    bool operation_type_conversion;                 // Verifica se há conversão de tipo no elemento em questão.
    string operation_type_conversion_data;          // Nome do tipo a ser convertido.

    /*
    ** Valores gerais.
    ** VERBUM_GENERAL_VALUE
    */
    struct {                                        // Controle dos dados.
        int type;                                   // Tipo:
                                                    //      VERBUM_DATA_IDENTIFIER
                                                    //      VERBUM_DATA_STRING
                                                    //      VERBUM_DATA_INTEGER
                                                    //      VERBUM_DATA_FLOAT
                                                    //      VERBUM_DATA_OPERATION_BLOCK
                                                    //      VERBUM_DATA_FUNCTION_CALL
                                                    //      VERBUM_DATA_INSTANCE_METHOD_CALL
                                                    //      VERBUM_DATA_STATIC_METHOD_CALL
        
        string identifier;                          // Identificador.
        string vstring;                             // String.
        string integer;                             // Inteiro.
        string floating;                            // Float.

        string function_name;                       // Nome da função chamada.
        string object_name;                         // Nome do objeto.
        string method_name;                         // Nome do método.
    } general_value_data;

    bool general_value_type_conversion;             // Verifica se há conversão de tipo no elemento em questão.
    string general_value_type_conversion_data;      // Nome do tipo a ser convertido.

    /*
    ** Chamada a função.
    ** VERBUM_FUNCTION_CALL
    */
    struct {                                        // Tipo da chamada.
        int type;                                   // Tipo:
                                                    //      VERBUM_FUNCTION_CALL_SIMPLE
                                                    //      VERBUM_FUNCTION_CALL_INSTANCE
                                                    //      VERBUM_FUNCTION_CALL_STATIC
        
        string function_name;                       // Nome da função chamada.
        string object_name;                         // Nome do objeto.
        string method_name;                         // Nome do método.
    } function_call;

    /*
    ** Condicionais.
    ** VERBUM_CONDITIONAL_*
    */
    bool conditional_type_conversion;               // Verifica se há conversão de tipo no elemento em questão.
    string conditional_type_conversion_data;        // Nome do tipo a ser convertido.

    int conditional_operator;                       // Verifica se há uso de operadores.
                                                    // Utilizado para o tratamento dos blocos de operações.
                                                    // Valor padrão: VERBUM_UNKNOWN.
    
    /*
    ** Atribuição com chamada a função (usado em expressões condicionais).
    */
    int attr_function_call_operator;                // Operador utilizado na atribuição.

    /*
    ** Nodes internos (árvore) do elemento em questão.
    */
    vector <struct verbum_ast_node> nodes;

}  verbum_ast_node;

#endif


