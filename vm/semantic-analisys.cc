
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "configuration.h"
#include "ast-struct.h"
#include "semantic-analisys.h"
#include "message-error.h"
#include "ast-struct.h"

using namespace verbum;
using namespace std;

#define process_semantic_analisys(ANALISYS_STEP) do {                           \
        this->block_counter = 0;                                                \
        this->step_check = ANALISYS_STEP;                                       \
        this->verbum_recursive_ast(ast, 0);                                     \
    } while (0)

#define default_recursive_block() do {                                          \
        this->block_counter++;                                                  \
        this->parent = node;                                                    \
        this->verbum_recursive_ast(node.nodes, index + 1);                      \
        this->block_counter--;                                                  \
    } while (0)

#define check_step(STEP_ID) this->step_check==STEP_ID

#define show_display_error() do {                                               \
        int e_line = node.error_node.position.line;                             \
        int e_ch_position = node.error_node.position.ch_position;               \
        int e_start_index = node.error_node.position.start_index;               \
        int e_stop_index = node.error_node.position.stop_index;                 \
                                                                                \
        /* Verifica se há quebra de linha na ocorrência. */                     \
        for (int n=0; n<node.error_node.text.length(); n++) {                   \
            if (node.error_node.text[n] == '\n') {                              \
                e_stop_index = e_start_index + n;                               \
                break;                                                          \
            }                                                                   \
        }                                                                       \
                                                                                \
        this->display_error(                                                    \
            e_line, e_ch_position, e_start_index, e_stop_index,                 \
            spec_message, error_message, big_message);                          \
    } while (0)

verbum_semantics_analisys::verbum_semantics_analisys (
    string file_path, vector<char> file_content, vector <verbum_ast_node> ast) 
{
    this->file_path = file_path;
    this->file_content = file_content;

    /*
    ** Realiza verificações.
    */

    process_semantic_analisys(VERBUM_SEMANTIC_ANALISYS_VARIABLE);
}

void verbum_semantics_analisys::display_error(
    int line, int ch_position, int start_index, int stop_index, 
    string spec_message, string error_message, vector <string> big_message) 
{
    verbum_message_error message_error(
        this->file_path, this->file_content, "semantic-analisys", start_index, stop_index, "");

    message_error.display_error(line, ch_position, spec_message, error_message, big_message);
}

string verbum_semantics_analisys::get_str_operator (int operation) {
    string opstr = "unknown";

    switch (operation) 
    {
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

void verbum_semantics_analisys::verbum_recursive_ast (vector <verbum_ast_node> ast, int index)
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
            else { }

            /*
            ** Verificação do operador.
            */
            if (check_step(VERBUM_SEMANTIC_ANALISYS_VARIABLE)) {
                if (this->parent.type == VERBUM_VARIABLE_INITIALIZATION) 
                {
                    // Verifica se a variável foi identificada corretamente.
                    switch (node.variable_definition_type) {
                        case VERBUM_VARIABLE_SIMPLE:
                        case VERBUM_VARIABLE_OBJ_INSTANCE:
                        case VERBUM_VARIABLE_OBJ_STATIC: break;
                        default:
                            string spec_message = "invalid expression.";
                            string error_message = "invalid expression for using variables.";
                            
                            vector <string> big_message;

                            if (VERBUM_DISPLAY_ERROR_EXAMPLES) {
                                big_message.push_back("\033[1;94mExample of correct expressions:\033[0m\n");
                                big_message.push_back("    \033[1;35mvar\033[0m a = 10;                    \033[1;90m// Simple variable declaration. \033[0m");
                                big_message.push_back("    \033[1;35mvar\033[0m b = 'Verbum';              \033[1;90m// Simple string declaration. \033[0m");
                                big_message.push_back("    \033[1;35mvar\033[0m c = example();             \033[1;90m// Simple declaration with function call. \033[0m");
                                big_message.push_back("    \033[1;35m   \033[0m d = 10;                    \033[1;90m// Simple assignment. \033[0m");
                                big_message.push_back("    \033[1;35m   \033[0m e += 20;                   \033[1;90m// Attribution with value. \033[0m");
                                big_message.push_back("    \033[1;35m   \033[0m f = 'Verbum';              \033[1;90m// Simple string assignment. \033[0m");
                                big_message.push_back("    \033[1;35m   \033[0m g = example();             \033[1;90m// Simple assignment with function call. \033[0m");
                            }

                            show_display_error();
                    }
                    
                    // Verificações para a declaração de variáveis.
                    if (this->parent.variable_type == VERBUM_VARIABLE_DECLARATION) {
                        if (node.variable_operation != VERBUM_OPERATOR_ATTR) {

                            string spec_message = "invalid operator.";
                            string error_message = "incorrect variable declaration, invalid operator: "+
                                this->get_str_operator(node.variable_operation);
                            
                            vector <string> big_message;

                            if (VERBUM_DISPLAY_ERROR_EXAMPLES) {
                                big_message.push_back("\033[1;94mExample of correct expressions:\033[0m\n");
                                big_message.push_back("    \033[1;35mvar\033[0m a = 10;                    \033[1;90m// Simple variable declaration. \033[0m");
                                big_message.push_back("    \033[1;35mvar\033[0m b = 'Verbum';              \033[1;90m// Simple string declaration. \033[0m");
                                big_message.push_back("    \033[1;35mvar\033[0m c = example();             \033[1;90m// Simple declaration with function call. \033[0m");
                            }

                            show_display_error();
                        }
                    }

                    // Verificações para as atribuições.
                    else if (this->parent.variable_type == VERBUM_VARIABLE_ATTRIBUTION) {
                        switch (node.variable_operation) {
                            case VERBUM_OPERATOR_ATTR:      
                            case VERBUM_OPERATOR_ADD_EQUAL: 
                            case VERBUM_OPERATOR_SUB_EQUAL: 
                            case VERBUM_OPERATOR_MUL_EQUAL: 
                            case VERBUM_OPERATOR_DIV_EQUAL: 
                            case VERBUM_OPERATOR_PERC_EQUAL: break;
                            default:

                                string spec_message = "invalid operator.";
                                string error_message = "incorrect assignment expression, invalid operator: "+
                                    this->get_str_operator(node.variable_operation);
                                
                                vector <string> big_message;

                                if (VERBUM_DISPLAY_ERROR_EXAMPLES) {
                                    big_message.push_back("\033[1;94mExample of correct expressions:\033[0m\n");
                                    big_message.push_back("    \033[1;35m a \033[0m = 10;                    \033[1;90m// Simple assignment. \033[0m");
                                    big_message.push_back("    \033[1;35m b \033[0m += 20;                   \033[1;90m// Attribution with value. \033[0m");
                                    big_message.push_back("    \033[1;35m c \033[0m = 'Verbum';              \033[1;90m// Simple string assignment. \033[0m");
                                    big_message.push_back("    \033[1;35m d \033[0m = example();             \033[1;90m// Simple assignment with function call. \033[0m");
                                }

                                show_display_error();
                        }
                    }
                }
            }

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
            this->verbum_recursive_ast(node.nodes, index + 1);

    }
}


