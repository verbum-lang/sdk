
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

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "ast-struct.h"
#include "semantics.h"

using namespace std;

namespace verbum {
    class verbum_semantics_analisys : public verbum_semantics
    {
        public:
            void custom_method ();
    };
}

#endif


