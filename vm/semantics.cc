
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
    int size = ast.size();

    for (int a=0; a<size; a++) {
        
        // Use.
        if (ast[a].type == VERBUM_USE) {
            cout << "use: ";

            if (ast[a].use_type == VERBUM_USE_MODULE)
                cout << ast[a].use_module;
            else if (ast[a].use_type == VERBUM_USE_PATH)
                cout << ast[a].use_path;
            else if (ast[a].use_type == VERBUM_USE_ARCHIVE)
                cout << ast[a].use_elements[0];

            if (ast[a].use_type == VERBUM_USE_MODULE || ast[a].use_type == VERBUM_USE_PATH) {
                for (int b=0; b<ast[a].use_elements.size(); b++) {
                    cout << " -> "<< ast[a].use_elements[b];
                }
            }

            cout << "\n";
        }

    }
}


