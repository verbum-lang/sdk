
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "configuration.h"
#include "ast-struct.h"
#include "semantics.h"

using namespace verbum;
using namespace std;

verbum_semantics::verbum_semantics (vector <verbum_ast_node> ast) 
{
    this->block_counter = 0;
    this->verbum_recursive_ast(ast);
}

void verbum_semantics::tab ()
{
    for (int a=0; a<this->block_counter; a++)
        cout << "\t";
}

void verbum_semantics::verbum_recursive_ast (vector <verbum_ast_node> ast)
{
    int size = ast.size();

    for (int a=0; a<size; a++) {
        verbum_ast_node node = ast[a];

        /*
        ** Importações.
        */
        if (node.type == VERBUM_USE) {
            cout << "use: ";

            if (node.use_type == VERBUM_USE_MODULE)
                cout << node.use_module;
            else if (node.use_type == VERBUM_USE_PATH)
                cout << node.use_path;
            else if (node.use_type == VERBUM_USE_ARCHIVE)
                cout << node.use_elements[0];

            if (node.use_type == VERBUM_USE_MODULE || node.use_type == VERBUM_USE_PATH) {
                for (int b=0; b<node.use_elements.size(); b++) {
                    cout << " -> "<< node.use_elements[b];
                }
            }

            cout << "\n";
        }

        /*
        ** Tokens de identificação.
        */
        
        /*
        ** Variáveis: declações e inicializações.
        */
        else if (node.type == VERBUM_VARIABLE_INITIALIZATION) {
            this->tab();
            cout << "variable: ";

            // Modo.
            if (node.variable_type == VERBUM_VARIABLE_ATTRIBUTION)
                cout << "attr -> \n";
            else
                cout << "declaration -> \n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            cout << "\n";
        }

        /*
        ** Variáveis: tipagem e atribuição.
        */
        else if (node.type == VERBUM_VARIABLE_USE_TYPES) {
            this->tab();

            // Variáveis comuns.
            if (node.variable_definition_type != VERBUM_VARIABLE_ARRAY_ACCESS) {
                cout << "-> name: ";

                if (node.variable_definition_type == VERBUM_VARIABLE_SIMPLE)
                    cout << node.variable_names.simple_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_INSTANCE)
                    cout << node.variable_names.object_name << "." << node.variable_names.method_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_STATIC)
                    cout << node.variable_names.object_name << "::" << node.variable_names.method_name;
                
                // Verifica se há conversão de dados (casting).
                if (node.variable_type_conversion) 
                    cout << " (casting: " << node.variable_type_conversion_name << ")";
                cout << "\n";
            }

            // Acesso a elementos de array.
            else if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS) {
                cout << "-> array access:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
            }

            this->tab();
            cout << "-> operation: ";

            // Tipo de atribuição / operação.
            switch (node.variable_operation) {
                case VERBUM_OPERATOR_ATTR:              cout <<  "="; break;
                case VERBUM_OPERATOR_ADD_EQUAL:         cout << "+="; break;
                case VERBUM_OPERATOR_SUB_EQUAL:         cout << "-="; break;
                case VERBUM_OPERATOR_MUL_EQUAL:         cout << "*="; break;
                case VERBUM_OPERATOR_DIV_EQUAL:         cout << "/="; break;
                case VERBUM_OPERATOR_PERC_EQUAL:        cout << "%="; break;
                case VERBUM_OPERATOR_MAJOR:             cout <<  ">"; break;
                case VERBUM_OPERATOR_MINOR:             cout <<  "<"; break;
                case VERBUM_OPERATOR_MAJOR_EQUAL:       cout << ">="; break;
                case VERBUM_OPERATOR_MINOR_EQUAL:       cout << "<="; break;
                case VERBUM_OPERATOR_AND:               cout << "&&"; break;
                case VERBUM_OPERATOR_EQUAL:             cout << "=="; break;
                case VERBUM_OPERATOR_NOT_EQUAL:         cout << "!="; break;
                case VERBUM_OPERATOR_NOT:               cout <<  "!"; break;
            }

            // Verifica se há instanciamento de objeto.
            if (node.variable_mod_operation == VERBUM_MOD_OP_OBJ_INSTANCE)
                cout << " (new object) ";
            else if (node.variable_mod_operation == VERBUM_MOD_OP_AWAIT)
                cout << " (await) ";

            cout << "\n";
        }

        /*
        ** Valores gerais.
        */
        else if (node.type == VERBUM_GENERAL_VALUE) {

            // Dados simples.
            if (node.general_value_data.type == VERBUM_DATA_IDENTIFIER      ||
                     node.general_value_data.type == VERBUM_DATA_INTEGER         ||
                     node.general_value_data.type == VERBUM_DATA_STRING          ||
                     node.general_value_data.type == VERBUM_DATA_FLOAT            )
            {
                this->tab();
                cout << "-> value: ";

                if (node.general_value_data.type == VERBUM_DATA_IDENTIFIER) 
                    cout << node.general_value_data.identifier << " (s.identifier)\n";
                else if (node.general_value_data.type == VERBUM_DATA_INTEGER) 
                    cout << node.general_value_data.integer << " (s.integer)\n";
                else if (node.general_value_data.type == VERBUM_DATA_STRING) 
                    cout << node.general_value_data.vstring << " (s.string)\n";
                else if (node.general_value_data.type == VERBUM_DATA_FLOAT) 
                    cout << node.general_value_data.floating << " (s.float)\n";
            }

            /*
            ** Dados complexos.
            */

            // Operações e sub-elementos.
            else if (node.general_value_data.type == VERBUM_DATA_OPERATION_BLOCK) {
                this->tab();
                cout << "-> operation-block:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
            }

            // Array indexado.
            else if (node.general_value_data.type == VERBUM_DATA_INDEX_ARRAY_BLOCK) {
                this->tab();
                cout << "[ <---| array-index-open:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "] <---| array-index-close:\n";
            }

            // Array associativo - bloco.
            else if (node.general_value_data.type == VERBUM_DATA_ASSOC_ARRAY_BLOCK) {
                this->tab();
                cout << "{ <---| array-assoc-open:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "} <---| array-assoc-close:\n";
            }

            // Array associativo - elementos.
            else if (node.general_value_data.type == VERBUM_DATA_ASSOC_ARRAY_ELEMENT) {
                this->tab();
                cout << "-> key: " << node.general_value_data.identifier << "\n";
            }

            /*
            ** Chamada a função.
            */
            else if (node.general_value_data.type == VERBUM_DATA_FUNCTION_CALL          ||
                     node.general_value_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL   ||
                     node.general_value_data.type == VERBUM_DATA_STATIC_METHOD_CALL      )
            {
                this->tab();

                // Função simples.
                if (node.general_value_data.type == VERBUM_DATA_FUNCTION_CALL) 
                    cout << node.general_value_data.function_name << " (function-call)\n";

                // Chamada a método de objeto instanciado.
                else if (node.general_value_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL)
                    cout << node.general_value_data.object_name << " . " << 
                        node.general_value_data.method_name << " (instance-method-call)\n"; 

                // Chamada a método de objeto estático.
                else if (node.general_value_data.type == VERBUM_DATA_STATIC_METHOD_CALL)
                    cout << node.general_value_data.object_name << " :: " << 
                        node.general_value_data.method_name << " (static-method-call)\n";


                // Processamento dos nodes (filhos).
                this->tab();
                cout << "( <---| open function-block\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << ") <---| close function-block\n";
            }

            // Cascading method.
            else if (node.general_value_data.type == VERBUM_FUNCTION_CALL_CASCADING) {
                this->tab();
                cout << "-> cascading method (open)\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> cascading method (close)\n";
            }

            // Chamada a função com acesso a elemento de array.
            else if (node.general_value_data.type == VERBUM_FUNCTION_CALL_ARRAY_ACCESS) {
                this->tab();
                cout << "-> function-call array-access (open)\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> function-call array-access (close)\n";
            }

            // Verifica se há conversão de tipo.
            if (node.general_value_type_conversion) {
                this->tab();
                cout << node.general_value_type_conversion_data << " (type conversion)\n";
            }

        }

    }
}


