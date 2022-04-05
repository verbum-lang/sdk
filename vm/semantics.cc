
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
        ** Variáveis.
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

            if (node.nodes.size() > 0) {
                this->verbum_recursive_ast(node.nodes);
            }
        }

        else if (node.type == VERBUM_VARIABLE_USE_TYPES) {

            if (node.variable_definition_type == VERBUM_VARIABLE_SIMPLE)
                cout << node.variable_names.simple_name << "\n";

        }

    }
}


