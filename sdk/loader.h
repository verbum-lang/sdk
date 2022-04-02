
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle do arquivo de código Verbum carregado.
*/

#ifndef VERBUM_LOADER
#define VERBUM_LOADER

#include <vector>

namespace verbum {
    class VerbumLoader {
        public:
            VerbumLoader (int pargc, const char **pargv);

            // Retorna path do diretório onde encontra-se o arquivo de código Verbum.
            std::string getFilePath ();

            // Retorno dados do arquivo de código lido.
            std::vector<char> GetFileContent ();
        
        private:
            int argc;                       // Entrada argc.
            const char **argv;              // Entrada argv.
            std::string filePath;           // Path completo do diretório onde encontra-se o código Verbum.
            std::vector<char> fileContent;  // Bytes do arquivo de código Verbum.            
    };
}

#endif


