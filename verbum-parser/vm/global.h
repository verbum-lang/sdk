
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Recursos de uso geral, manipulação de strings e coisas relacionadas.
*/

#ifndef VERBUM_GLOBAL
#define VERBUM_GLOBAL

using namespace std;

namespace verbum {
    class verbum_global 
    {
        public:
            static string trim (string str);
            static string remove_newlines (string str);
    };
}

#endif


