
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
    class verbum_loader {
        public:
            verbum_loader (int pargc, const char **pargv);

            // Retorna path do diretório onde encontra-se o arquivo de código Verbum.
            std::string get_file_path ();

            // Retorna dados do arquivo de código lido.
            std::vector<char> get_file_content ();

            // Retorna total de bytes do arquivo de código.
            int get_file_size();

            // Retorna total de linhas encontradas (ocorrências de nova-linha).
            int get_total_lines();
        
        private:
            int argc;                       // Entrada argc.
            const char **argv;              // Entrada argv.
            std::string file_path;          // Path completo do diretório onde encontra-se o código Verbum.
            std::vector<char> file_content; // Bytes do arquivo de código Verbum.
            int total_bytes;                // Total de bytes existentes no código.
            int total_lines;                // Total de linhas encontradas (contando por ocorrências de nova-linha).
            
            // Realiza leitura/carregamento do conteúdo do arquivo de código Verbum.
            void read_source_code ();

            // Prepara informações gerais a respeito do arquivo de código.
            void prepare_file_informations ();
    };
}

#endif


