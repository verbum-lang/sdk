
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
        ** Bloco condicional (if).
        */
        else if (node.type == VERBUM_CONDITIONAL_IF) {
            this->tab();
            cout << "conditional-if () {\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "}\n";
        }

        /*
        ** Variáveis: declações e inicializações.
        */
        else if (node.type == VERBUM_VARIABLE_INITIALIZATION) {
            this->tab();
            cout << "variable: ";

            // Modo.
            if (node.variable_type == VERBUM_VARIABLE_ATTRIBUTION)
                cout << "attr -> ";
            else
                cout << "declaration -> ";

            // Configurações de acessibilidade.
            if (node.variable_settings.vfinal)
                cout << " final ";
            if (node.variable_settings.vstatic)
                cout << " static ";

            if (node.variable_settings.pub)
                cout << " pub ";
            else if (node.variable_settings.priv)
                cout << " priv ";
            else if (node.variable_settings.pro)
                cout << " pro ";

            cout << "\n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;
        }

        /*
        ** Variáveis: tipagem e atribuição.
        */
        else if (node.type == VERBUM_VARIABLE_USE_TYPES) {
            this->tab();

            // Variáveis comuns.
            if (node.variable_definition_type != VERBUM_VARIABLE_ARRAY_ACCESS) {

                if (node.variable_definition_type == VERBUM_VARIABLE_SIMPLE)
                    cout << node.variable_names.simple_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_INSTANCE)
                    cout << node.variable_names.object_name << "." << node.variable_names.method_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_STATIC)
                    cout << node.variable_names.object_name << "::" << node.variable_names.method_name;
                
                // Verifica se há conversão de dados (casting).
                if (node.variable_type_conversion) 
                    cout << " (casting: " << node.variable_type_conversion_name << ")";
                cout << " ";

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

                cout << "\n";
            }

            // Acesso a elementos de array.
            if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS) {
                cout << "-> array access:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
            }
        }

        /*
        ** Acesso a elemento de array.
        */

        // Identificador.
        else if (node.type == VERBUM_ACCESS_ARRAY) {
            this->tab();
            cout << node.access_array_identifier;

            // Modo do acesso.
            if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT)
                cout << " .   (member access) ";
            else if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK)
                cout << " []  (block access) ";
            else if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT)
                cout << " []. (block access and member access) ";

            cout << "\n";

            // Verifica se é bloco de acesso.
            if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK       ||
                node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT  )
            {
                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
            }
        }
        
        // Blocos.
        else if (node.type == VERBUM_ACCESS_ARRAY_INDEX_BLOCK) {
            this->tab();
            cout << "(member block) \n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;
        }

        /*
        ** Bloco de operações.
        */
        else if (node.type == VERBUM_OPERATION_BLOCK) {
            
            // Bloco de operações.
            if (node.operation_type == VERBUM_OPERATION_TYPE_BLOCK) {

                // Processamento dos nodes (filhos).
                cout << "\t\t(         <---| open block\n";

                if (node.nodes.size() > 0) 
                    if (node.nodes.size() > 0) 
                        this->verbum_recursive_ast(node.nodes);

                cout << "\t\t)         <---| close block\n";

                // Verifica se há conversão de tipo.
                if (node.operation_type_conversion)
                    cout << "\t\t" << node.operation_type_conversion_data << " (type conversion)\n";

                // Operação.
                if (node.operation_op != VERBUM_UNKNOWN) {
                    switch (node.operation_op) {
                        case VERBUM_OPERATOR_ADD:  cout << "\t\t+\n"; break;
                        case VERBUM_OPERATOR_SUB:  cout << "\t\t-\n"; break;
                        case VERBUM_OPERATOR_DIV:  cout << "\t\t/\n"; break;
                        case VERBUM_OPERATOR_MUL:  cout << "\t\t*\n"; break;
                        case VERBUM_OPERATOR_PERC: cout << "\t\t%\n"; break;
                    }
                }
            }

            // Bloco de chamada a funções.
            else if (node.operation_type == VERBUM_OPERATION_FUNC_BLOCK) {
                
                // Chamada a função (simples).
                if (node.operation_data.type == VERBUM_DATA_FUNCTION_CALL) 
                    cout << "\t\t" << node.operation_data.function_name << " (function-call)\n";
                
                // Chamada a método de objeto (instanciado).
                else if (node.operation_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL)
                    cout << "\t\t" << node.operation_data.object_name << " . " << 
                        node.operation_data.method_name << " (instance-method-call)\n";

                // Chamada a método de objeto (estático).
                else if (node.operation_data.type == VERBUM_DATA_STATIC_METHOD_CALL)
                    cout << "\t\t" << node.operation_data.object_name << " :: " << 
                        node.operation_data.method_name << " (static-method-call)\n";


                // Processamento dos nodes (filhos).
                cout << "\t\t(         <---| open function-block\n";

                if (node.nodes.size() > 0) 
                    if (node.nodes.size() > 0) 
                        this->verbum_recursive_ast(node.nodes);

                cout << "\t\t)         <---| close function-block\n";


                // Verifica se há conversão de tipo.
                if (node.operation_type_conversion)
                    cout << "\t\t" << node.operation_type_conversion_data << " (type conversion)\n";

                // Operação.
                if (node.operation_op != VERBUM_UNKNOWN) {
                    switch (node.operation_op) {
                        case VERBUM_OPERATOR_ADD:  cout << "\t\t+\n"; break;
                        case VERBUM_OPERATOR_SUB:  cout << "\t\t-\n"; break;
                        case VERBUM_OPERATOR_DIV:  cout << "\t\t/\n"; break;
                        case VERBUM_OPERATOR_MUL:  cout << "\t\t*\n"; break;
                        case VERBUM_OPERATOR_PERC: cout << "\t\t%\n"; break;
                    }
                }
            }

            // Expressão simples.
            else if (node.operation_type == VERBUM_OPERATION_TYPE_SIMPLE) {
                
                // Identificador.
                if (node.operation_data.type == VERBUM_DATA_IDENTIFIER) {

                    // Pré inc/dec.
                    if (node.operation_data.mod_inc_dec == VERBUM_OP_INCDEC_PRE) {
                        this->tab();

                        switch (node.operation_data.type_inc_dec) {
                            case VERBUM_OP_TYPE_INC: cout << "++ (pre)\n"; break;
                            case VERBUM_OP_TYPE_DEC: cout << "-- (pre)\n"; break;
                        }
                    }

                    this->tab();
                    cout << node.operation_data.identifier << "\n";

                    // Pós inc/dec.
                    if (node.operation_data.mod_inc_dec == VERBUM_OP_INCDEC_POS) {
                        this->tab();

                        switch (node.operation_data.type_inc_dec) {
                            case VERBUM_OP_TYPE_INC: cout << "++ (pos)\n"; break;
                            case VERBUM_OP_TYPE_DEC: cout << "-- (pos)\n"; break;
                        }
                    }
                }

                // Inteiro.
                else if (node.operation_data.type == VERBUM_DATA_INTEGER) {
                    this->tab();
                    cout << node.operation_data.integer << "\n";
                }

                // Float.
                else if (node.operation_data.type == VERBUM_DATA_FLOAT) {
                    this->tab();
                    cout << node.operation_data.floating << "\n";
                }

                // Verifica se há conversão de tipo.
                if (node.operation_type_conversion) {
                    this->tab();
                    cout << node.operation_type_conversion_data << " (type conversion)\n";
                }

                // Operação.
                if (node.operation_op != VERBUM_UNKNOWN) { 
                    this->tab();

                    switch (node.operation_op) {
                        case VERBUM_OPERATOR_ADD:  cout << "+\n"; break;
                        case VERBUM_OPERATOR_SUB:  cout << "-\n"; break;
                        case VERBUM_OPERATOR_DIV:  cout << "/\n"; break;
                        case VERBUM_OPERATOR_MUL:  cout << "*\n"; break;
                        case VERBUM_OPERATOR_PERC: cout << "%\n"; break;
                    }
                }
            }
        }

    }
}


