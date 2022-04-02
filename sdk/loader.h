
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle do arquivo de código Verbum carregado.
*/

namespace verbum {
    class VerbumLoader {
        public:
            VerbumLoader (int pargc, const char **pargv);
            std::string getFilename ();
        
        private:
            int argc;
            const char **argv;
            std::string filename;
    };
}


