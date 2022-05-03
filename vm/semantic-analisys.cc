
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

#define default_recursive_block() do { \
        this->block_counter++; \
        this->verbum_recursive_ast(node.nodes); \
        this->block_counter--; \
    } while (0)

void verbum_semantics_analisys::verbum_recursive_ast (vector <verbum_ast_node> ast)
{
    int size = ast.size();

    for (int a=0; a<size; a++) {
        verbum_ast_node node = ast[a];

        if (node.type == VERBUM_VARIABLE_INITIALIZATION)
            default_recursive_block();

        // Informações da expressão.
        else if (node.type == VERBUM_VARIABLE_INFORMATION) {
            this->block_counter++;
            if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS)
                default_recursive_block();

            // Variáveis comuns.
            else {  }

            this->block_counter--;
        }

        else if (node.type == VERBUM_MULTIPLE_ATTRIBUTION)
            default_recursive_block();
        else if (node.type == VERBUM_RET_BLOCK) 
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_BLOCK) 
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_EXPRESSION_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_CODE_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_IF) 
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_ELIF) 
            default_recursive_block();
        else if (node.type == VERBUM_CONDITIONAL_ELSE) 
            default_recursive_block();
        else if (node.type == VERBUM_LOOP) 
            default_recursive_block();
        else if (node.type == VERBUM_LOOP_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_TRY_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_TRY_TRY) 
            default_recursive_block();
        else if (node.type == VERBUM_TRY_CATCH) 
            default_recursive_block();
        else if (node.type == VERBUM_TRY_CODE_BLOCK) 
            default_recursive_block();

        else if (node.type == VERBUM_FUNCTION_DECLARATION) {
            if (node.function_declaration.type == VERBUM_FUNCTION_SIMPLE &&
                node.function_declaration.anonymous == true)
                default_recursive_block();
            else if (node.function_declaration.type == VERBUM_FUNCTION_SIMPLE &&
                     node.function_declaration.anonymous == false)
                default_recursive_block();
            else if (node.function_declaration.type == VERBUM_FUNCTION_CLASS_CONSTRUCTOR) 
                default_recursive_block();
            else if (node.function_declaration.type == VERBUM_FUNCTION_INTERFACE_ABSTRACT) 
                default_recursive_block();
        }

        else if (node.type == VERBUM_FUNCTION_CODE_BLOCK) 
            default_recursive_block();
        else if (node.type == VERBUM_ANONYMOUS_FUNCTION_PARAM)
            default_recursive_block();
        else if (node.type == VERBUM_OOP_INTERFACE) 
            default_recursive_block();
        else if (node.type == VERBUM_OOP_INTERFACE_CODE_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_OOP_ABSTRACT) 
            default_recursive_block();
        else if (node.type == VERBUM_OOP_ABSTRACT_CODE_BLOCK) 
            default_recursive_block();
        else if (node.type == VERBUM_OOP_CLASS)
            default_recursive_block();
        else if (node.type == VERBUM_OOP_CLASS_ANONYMOUS) 
            default_recursive_block();
        else if (node.type == VERBUM_OOP_CLASS_CODE_BLOCK)
            default_recursive_block();
        else if (node.type == VERBUM_LAMBDA_FUNCTION_BLOCK) 
            default_recursive_block();
        else if (node.type == VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_SIMPLE) 
            default_recursive_block();
        else if (node.type == VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_COMPLETE) 
            default_recursive_block();
        else if (node.type == VERBUM_ANONYMOUS_OBJECT) 
            default_recursive_block();
        else if (node.type == VERBUM_FUNCTION_CALL) 
            default_recursive_block();
        else if (node.type == VERBUM_ACCESS_ARRAY_BLOCK) 
            default_recursive_block();

        else if (node.type == VERBUM_ACCESS_ARRAY) {
            if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK       ||
                node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT  )
                default_recursive_block();
        }
        
        else if (node.type == VERBUM_ACCESS_ARRAY_INDEX_BLOCK) 
            default_recursive_block();

        else if (node.type == VERBUM_GENERAL_VALUE) {
            if (node.general_value_data.type == VERBUM_DATA_OPERATION_BLOCK) 
                default_recursive_block();
            else if (node.general_value_data.type == VERBUM_DATA_INDEX_ARRAY_BLOCK) 
                default_recursive_block();
            else if (node.general_value_data.type == VERBUM_DATA_ASSOC_ARRAY_BLOCK)
                default_recursive_block();
            else if (node.general_value_data.type == VERBUM_DATA_FUNCTION_CALL          ||
                     node.general_value_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL   ||
                     node.general_value_data.type == VERBUM_DATA_STATIC_METHOD_CALL      )
                default_recursive_block();
            else if (node.general_value_data.type == VERBUM_FUNCTION_CALL_ARRAY_ACCESS)
                default_recursive_block();
            else if (node.general_value_data.type == VERBUM_ANONYMOUS_OBJECT) 
                default_recursive_block();
        }

        else if (node.type == VERBUM_GENERAL_VALUE_BLOCK) 
            this->verbum_recursive_ast(node.nodes);

    }
}


