
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Estrutura de dados utilizada para gerar a árvore sintática.
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

#define VERBUM_IESUS_HOMINUM_SALVATOR                   333
#define VERBUM_UNKNOWN                                    0

// Importações - use.
#define VERBUM_USE_BLOCK                                  1
#define VERBUM_USE_MODULE                                 2
#define VERBUM_USE_PATH                                   3
#define VERBUM_USE_ARCHIVE                                4

// Variáveis.
#define VERBUM_VARIABLE_INITIALIZATION                    5
#define VERBUM_VARIABLE_DECLARATION                       6
#define VERBUM_VARIABLE_ATTRIBUTION                       7
#define VERBUM_VARIABLE_INFORMATION                       8
#define VERBUM_VARIABLE_SIMPLE                            9
#define VERBUM_VARIABLE_OBJ_INSTANCE                     10
#define VERBUM_VARIABLE_OBJ_STATIC                       11
#define VERBUM_VARIABLE_ARRAY_ACCESS                     12

// Array.
#define VERBUM_ACCESS_ARRAY_BLOCK                        13
#define VERBUM_ACCESS_ARRAY                              14
#define VERBUM_ACCESS_ARRAY_INDEX_BLOCK                  15
#define VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER              16
#define VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT        17
#define VERBUM_ACCESS_ARRAY_TYPE_BLOCK                   18
#define VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT             19
#define VERBUM_DATA_INDEX_ARRAY_BLOCK                    20
#define VERBUM_DATA_ASSOC_ARRAY_BLOCK                    21
#define VERBUM_DATA_ASSOC_ARRAY_ELEMENT                  21

// Valores gerais.
#define VERBUM_GENERAL_VALUE                             23
#define VERBUM_GENERAL_VALUE_BLOCK                       24

// Chamada a função.
#define VERBUM_FUNCTION_CALL                             25
#define VERBUM_FUNCTION_CALL_ARRAY_ACCESS                26

// Condicionais.
#define VERBUM_CONDITIONAL_BLOCK                         27
#define VERBUM_CONDITIONAL_EXPRESSION_BLOCK              28
#define VERBUM_CONDITIONAL_CODE_BLOCK                    29
#define VERBUM_CONDITIONAL_IF                            30
#define VERBUM_CONDITIONAL_ELIF                          31
#define VERBUM_CONDITIONAL_ELSE                          32

// Loops.
#define VERBUM_LOOP                                      33
#define VERBUM_LOOP_COMPLETE                             34
#define VERBUM_LOOP_CONDITIONAL                          35
#define VERBUM_LOOP_INFINITE                             36
#define VERBUM_LOOP_BLOCK                                37
#define VERBUM_LOOP_INITIALIZATION                       38
#define VERBUM_LOOP_EXPRESSION                           39
#define VERBUM_LOOP_INCDEC                               40
#define VERBUM_LOOP_CODE_BLOCK                           41

// Retorno.
#define VERBUM_RET_BLOCK                                 42

// Funções/métodos.
#define VERBUM_FUNCTION_DECLARATION                      43
#define VERBUM_FUNCTION_SIMPLE                           44
#define VERBUM_FUNCTION_CLASS_CONSTRUCTOR                45
#define VERBUM_FUNCTION_INTERFACE_ABSTRACT               46
#define VERBUM_FUNCTION_PARAM_ITEM                       47
#define VERBUM_FUNCTION_CODE_BLOCK                       48

// OOP (gerais).
#define VERBUM_OOP_INTERFACE                             49
#define VERBUM_OOP_INTERFACE_CODE_BLOCK                  50
#define VERBUM_OOP_ABSTRACT                              51
#define VERBUM_OOP_ABSTRACT_CODE_BLOCK                   52
#define VERBUM_OOP_CLASS                                 53
#define VERBUM_OOP_CLASS_CODE_BLOCK                      54
#define VERBUM_OOP_CLASS_ANONYMOUS                       55

// Visbilidade de elementos.
#define VERBUM_ITEMS_VISIBILITY                          56

// Comandos: break e next (for).
#define VERBUM_TOKEN_BREAK                               57
#define VERBUM_TOKEN_NEXT                                58

// Funções anônimas.
#define VERBUM_ANONYMOUS_FUNCTION                        59
#define VERBUM_ANONYMOUS_FUNCTION_PARAM                  60

// Múltipla atribuição.
#define VERBUM_MULTIPLE_ATTRIBUTION                      61

// Objeto anônimo.
#define VERBUM_ANONYMOUS_OBJECT                          62

// Funções lambda.
#define VERBUM_LAMBDA_FUNCTION_BLOCK                     63
#define VERBUM_LAMBDA_FUNCTION_PARAM                     64
#define VERBUM_LAMBDA_FUNCTION_PARAM_ITEM                65
#define VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_COMPLETE       66
#define VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_SIMPLE         67

// Try, catch.
#define VERBUM_TRY_BLOCK                                 68
#define VERBUM_TRY_TRY                                   69
#define VERBUM_TRY_CATCH                                 70
#define VERBUM_TRY_CODE_BLOCK                            71

// Acesso a atributo de objeto.
#define VERBUM_ATTRIBUTE_OBJECT                          72

// Aritméticos.
#define VERBUM_OPERATOR_ADD                              73
#define VERBUM_OPERATOR_SUB                              74
#define VERBUM_OPERATOR_DIV                              75
#define VERBUM_OPERATOR_PERC                             76
#define VERBUM_OPERATOR_MUL                              77

// Operadores de atribuição.
#define VERBUM_OPERATOR_ATTR                             78
#define VERBUM_OPERATOR_ADD_EQUAL                        79
#define VERBUM_OPERATOR_SUB_EQUAL                        80
#define VERBUM_OPERATOR_MUL_EQUAL                        81
#define VERBUM_OPERATOR_DIV_EQUAL                        82
#define VERBUM_OPERATOR_PERC_EQUAL                       83
#define VERBUM_OPERATOR_MAJOR                            84
#define VERBUM_OPERATOR_MINOR                            85
#define VERBUM_OPERATOR_MAJOR_EQUAL                      86
#define VERBUM_OPERATOR_MINOR_EQUAL                      87
#define VERBUM_OPERATOR_AND                              88
#define VERBUM_OPERATOR_OR                               89
#define VERBUM_OPERATOR_EQUAL                            90
#define VERBUM_OPERATOR_NOT_EQUAL                        91
#define VERBUM_OPERATOR_NOT                              92

// Ações de atribuição.
#define VERBUM_MOD_OP_SIMPLE                             93
#define VERBUM_MOD_OP_OBJ_INSTANCE                       94
#define VERBUM_MOD_OP_AWAIT                              95

// Tipos de dados.
#define VERBUM_DATA_IDENTIFIER                           96
#define VERBUM_DATA_INTEGER                              97
#define VERBUM_DATA_FLOAT                                98
#define VERBUM_DATA_FUNCTION_CALL                        99
#define VERBUM_DATA_INSTANCE_METHOD_CALL                100
#define VERBUM_DATA_STATIC_METHOD_CALL                  101
#define VERBUM_DATA_STRING                              102
#define VERBUM_DATA_OPERATION_BLOCK                     103

// Operações de inc/dec.
#define VERBUM_OP_TYPE_INC                              104
#define VERBUM_OP_TYPE_DEC                              105

#define VERBUM_OP_INCDEC_PRE                            106
#define VERBUM_OP_INCDEC_POS                            107

// Tipos de chamada a função.
#define VERBUM_FUNCTION_CALL_SIMPLE                     108
#define VERBUM_FUNCTION_CALL_INSTANCE                   109 
#define VERBUM_FUNCTION_CALL_STATIC                     110

// Tipos de itens (visibilidade).
#define VERBUM_ITEMS_VISIBILITY_PUB                     111
#define VERBUM_ITEMS_VISIBILITY_PRIV                    112  
#define VERBUM_ITEMS_VISIBILITY_PRO                     113
#define VERBUM_ITEMS_VISIBILITY_FINAL                   114  
#define VERBUM_ITEMS_VISIBILITY_STATIC                  115 
#define VERBUM_ITEMS_VISIBILITY_ASYNC                   116

#define VERBUM_ATTRIBUTE_OBJECT_STATIC                  117
#define VERBUM_ATTRIBUTE_OBJECT_INSTANCE                118 

// Estrutura de controle dos nodes com erro.
typedef struct {

    // Texto completo.
    string text;

    // Posição da ocorrência.
    struct {
        int line;
        int ch_position;
        int start_index;
        int stop_index;
    } position;

    // Gerais.
    int token_index;
    int type;
    string next_token;
    string source_name;
    string interval;

} verbum_error_node;

// Controle dos nodes/hierarquização da própria estrutura AST.
typedef struct verbum_ast_node 
{
    /*
    ** Controle das ocorrências.
    */
    verbum_error_node error_node;

    /*
    ** Controle da sintaxe.
    */
    int type;                                       // Tipo do elemento.
                                                    //      VERBUM_USE
                                                    //      VERBUM_VARIABLE_INITIALIZATION
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

    /*
    ** Tipo das variáveis utilizadas.
    */
    int variable_definition_type;                   // Tipo da definição/uso da variável:
                                                    //      VERBUM_VARIABLE_SIMPLE
                                                    //      VERBUM_VARIABLE_OBJ_INSTANCE
                                                    //      VERBUM_VARIABLE_OBJ_STATIC

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
    struct {
        int type_inc_dec;                           // Tipo de incremento/decremento:
                                                    //      VERBUM_OP_TYPE_INC
                                                    //      VERBUM_OP_TYPE_DEC
                                                    //
        int mod_inc_dec;                            // Modo da operação de incremento/decremento:
                                                    //      VERBUM_OP_INCDEC_PRE    - Anterior a variável.
                                                    //      VERBUM_OP_INCDEC_POS    - Após a variável.
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
    bool general_value_not;                         // Verifica se há uso do 'not'.

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
    ** Atribuição com chamada a função (usado em expressões condicionais).
    */
    bool attr_operator;                             // Operador utilizado na atribuição.

    /*
    ** Loops.
    ** VERBUM_LOOP
    */
    int loop_type;                                  // Tipo do loop (identificado de acordo com a expressão).
                                                    //      VERBUM_LOOP_COMPLETE
                                                    //      VERBUM_LOOP_CONDITIONAL
                                                    //      VERBUM_LOOP_INFINITE

    // Tipo do bloco interno do loop.
    // VERBUM_LOOP_BLOCK
    int loop_block_type;                            //      VERBUM_LOOP_INITIALIZATION
                                                    //      VERBUM_LOOP_EXPRESSION
                                                    //      VERBUM_LOOP_INCDEC
                                                    //      VERBUM_LOOP_CODE_BLOCK

    /*
    ** Funções.
    ** VERBUM_FUNCTION_*
    */

    // Informações da declaração da função / método.
    struct {                                        
        int type;                                   // Tipo:
                                                    //      VERBUM_FUNCTION_SIMPLE
                                                    //      VERBUM_FUNCTION_METHOD
                                                    //      VERBUM_FUNCTION_CLASS_CONSTRUCTOR
                                                    //      VERBUM_FUNCTION_INTERFACE_ABSTRACT

        bool anonymous;                             // Identifica se é uma função anônima.
        string identifier;                          // Nome da função.
        
        bool ret_found;                             // Verifica se existe retorno (ret).
        string ret_data;                            // Tipo a ser retornado (dados).
    } function_declaration;

    string function_param_item;                     // Nome da variável passada como parâmetro.
    string function_param_type;                     // Especificação do tipo da variável.

    /*
    ** OOP.
    */

    //
    // Interface.
    // VERBUM_OOP_INTERFACE
    struct {
        string identifier_a;                        // Nome da interface (identificador).
        string identifier_b;                        // Nome do identificador (em caso de herança).
        bool extends;                               // Verifica se há herança.
    } interface;

    // VERBUM_OOP_ABSTRACT
    struct {
        string identifier_a;                        // Nome da classe abstrata (identificador).
        string identifier_b;                        // Nome do identificador (em caso de herança).
        bool extends;                               // Verifica se há herança.
    } abstract;

    // VERBUM_OOP_CLASS
    struct {
        string identifier_a;                        // Nome da classe (identificador).
        string identifier_b;                        // Nome do identificador (herança).
        string identifier_c;                        // Nome do identificador (implementação de interface).
        bool extends;                               // Verifica se há herança.
        bool implements;                            // Verifica se há implementação de interface.
    } vclass;

    /*
    ** Visibilidade.
    ** VERBUM_ITEMS_VISIBILITY
    */
    int item_visibility;                            // Tipo do item (pub, priv, etc).
                                                    //      VERBUM_ITEMS_VISIBILITY_PUB
                                                    //      VERBUM_ITEMS_VISIBILITY_PRIV
                                                    //      VERBUM_ITEMS_VISIBILITY_PRO
                                                    //      VERBUM_ITEMS_VISIBILITY_FINAL
                                                    //      VERBUM_ITEMS_VISIBILITY_STATIC

    /*
    ** Try, catch.
    ** VERBUM_TRY_*
    */
    string catch_identifier;                        // Nome do parâmetro no bloco catch.

    /*
    ** Atributo de objeto.
    ** VERBUM_ATTRIBUTE_OBJECT
    */
    int attribute_object_type;                      // Tipo do atributo acesso:
                                                    //      VERBUM_ATTRIBUTE_OBJECT_STATIC  
                                                    //      VERBUM_ATTRIBUTE_OBJECT_INSTANCE

    /*
    ** Lida com chamada de classe anônima.
    */
    bool anonymous_method_found;                    // Identifica se há chamada a método.
    string anonymous_method_data;                   // Nome do método invocado.

    /*
    ** Nodes internos (árvore) do elemento em questão.
    */
    vector <struct verbum_ast_node> nodes;

}  verbum_ast_node;

#endif


