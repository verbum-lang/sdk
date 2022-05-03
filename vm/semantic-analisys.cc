
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "configuration.h"
#include "ast-struct.h"
#include "semantic-analisys.h"

using namespace verbum;
using namespace std;

#define process_semantic_analisys(ANALISYS_STEP) do { \
        this->block_counter = 0; \
        this->step_check = ANALISYS_STEP; \
        this->verbum_recursive_ast(ast); \
    } while (0)

verbum_semantics_analisys::verbum_semantics_analisys (vector <verbum_ast_node> ast) 
{
    /*
    ** Realiza verificações.
    */

    process_semantic_analisys(VERBUM_SEMANTIC_ANALISYS_VARIABLE);
}

void verbum_semantics_analisys::tab ()
{
    for (int a=0; a<this->block_counter; a++)
        cout << "    ";
}

string verbum_semantics_analisys::print_operation (int operation) {
    string opstr = "";

    switch (operation) {

        // Operadores aritméticos.
        case VERBUM_OPERATOR_ADD:         opstr =  "+"; break;
        case VERBUM_OPERATOR_SUB:         opstr =  "-"; break;
        case VERBUM_OPERATOR_DIV:         opstr =  "/"; break;
        case VERBUM_OPERATOR_MUL:         opstr =  "*"; break;
        case VERBUM_OPERATOR_PERC:        opstr =  "%"; break;

        // Operadores de atribuição (e outros).
        case VERBUM_OPERATOR_ATTR:        opstr =  "="; break;
        case VERBUM_OPERATOR_ADD_EQUAL:   opstr = "+="; break;
        case VERBUM_OPERATOR_SUB_EQUAL:   opstr = "-="; break;
        case VERBUM_OPERATOR_MUL_EQUAL:   opstr = "*="; break;
        case VERBUM_OPERATOR_DIV_EQUAL:   opstr = "/="; break;
        case VERBUM_OPERATOR_PERC_EQUAL:  opstr = "%="; break;
        case VERBUM_OPERATOR_MAJOR:       opstr =  ">"; break;
        case VERBUM_OPERATOR_MINOR:       opstr =  "<"; break;
        case VERBUM_OPERATOR_MAJOR_EQUAL: opstr = ">="; break;
        case VERBUM_OPERATOR_MINOR_EQUAL: opstr = "<="; break;
        case VERBUM_OPERATOR_AND:         opstr = "&&"; break;
        case VERBUM_OPERATOR_OR:          opstr = "||"; break;
        case VERBUM_OPERATOR_EQUAL:       opstr = "=="; break;
        case VERBUM_OPERATOR_NOT_EQUAL:   opstr = "!="; break;
        case VERBUM_OPERATOR_NOT:         opstr =  "!"; break;
    }

    return opstr;
}

void verbum_semantics_analisys::verbum_recursive_ast (vector <verbum_ast_node> ast)
{
    int size = ast.size();

    for (int a=0; a<size; a++) {
        verbum_ast_node node = ast[a];

        
    }
}


