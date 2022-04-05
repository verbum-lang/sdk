
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
    this->verbum_recursive_ast(ast);
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
        ** Variáveis: declações e inicializações.
        */
        else if (node.type == VERBUM_VARIABLE_INITIALIZATION) {
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

            // Acessa nodes (filhos) da expressão (comando) de declaração da variável.
            if (node.nodes.size() > 0) 
                this->verbum_recursive_ast(node.nodes);
        }

        /*
        ** Variáveis: tipagem e atribuição.
        */
        else if (node.type == VERBUM_VARIABLE_USE_TYPES) {
            
            // Nome da variável.
            if (node.variable_definition_type == VERBUM_VARIABLE_SIMPLE)
                cout << "\t" << node.variable_names.simple_name;
            else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_INSTANCE)
                cout << "\t" << node.variable_names.object_name << "." << node.variable_names.method_name;
            else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_STATIC)
                cout << "\t" << node.variable_names.object_name << "::" << node.variable_names.method_name;
            else if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS) {
                if (node.nodes.size() > 0) 
                    if (node.nodes[0].nodes.size() > 0) 
                        this->verbum_recursive_ast(node.nodes[0].nodes);
            }

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

        /*
        ** Acesso a elemento de array.
        */
        else if (node.type == VERBUM_VARIABLE_ACCESS_ARRAY) {
            cout << "\t" << node.variable_access_array_identifier;

            if (node.variable_access_array_index_mod)
                cout << " [] \n";
            else 
                cout << "\n";
        }

    }
}


