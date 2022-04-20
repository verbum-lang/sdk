
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle do comando de importação: use.
*/

#ifndef VERBUM_USE_IMPORT
#define VERBUM_USE_IMPORT

#include "ast-struct.h"

using namespace std;

namespace verbum {
    class verbum_use_import 
    {
        public:
            verbum_use_import (string raw);
            verbum_ast_node get_ast_node ();

        private:
            verbum_ast_node ast_node;
    };
}

#endif


