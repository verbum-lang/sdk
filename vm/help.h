
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Banner de ajuda e inicialização da linguagem.
*/

#ifndef VERBUM_HELP
#define VERBUM_HELP

namespace verbum {
    class verbum_help {
        public:
            verbum_help (int pargc, const char **pargv);
            static void banner ();
        
        private:
            int argc;
            const char **argv;

            void banner_end ();
    };
}

#endif


