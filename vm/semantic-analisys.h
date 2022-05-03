
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Realização da análise semântica.
*/

#ifndef VERBUM_SEMANTICS_ANALISYS
#define VERBUM_SEMANTICS_ANALISYS

// Flags de controle da verificação.
#define VERBUM_SEMANTIC_ANALISYS_VARIABLE 1

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "ast-struct.h"

using namespace std;

namespace verbum {
    class verbum_semantics_analisys
    {
        public:
            verbum_semantics_analisys (vector <verbum_ast_node> ast);

        private:
    
            // Flag de controle da checagem/verificação semântica.
            int step_check;
    
            int block_counter;

            void tab ();
            void verbum_recursive_ast (vector <verbum_ast_node> ast);
            string print_operation (int operation);
    };
}

#endif


