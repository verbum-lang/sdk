
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Estrutura para realização da análise semântica, e processamento da AST.
*/

#ifndef VERBUM_SEMANTICS
#define VERBUM_SEMANTICS

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "ast-struct.h"

using namespace std;

namespace verbum {
    class verbum_semantics
    {
        public:
            verbum_semantics (vector <verbum_ast_node> ast);

        private:
            int block_counter;

            void tab ();
            void verbum_recursive_ast (vector <verbum_ast_node> ast);
            string print_operation (int operation);
    };
}

#endif


