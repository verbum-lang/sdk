
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle dos erros da aplicação.
*/

#ifndef VERBUM_SYNTACTIC_ERROR
#define VERBUM_SYNTACTIC_ERROR

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

using namespace antlr4;
using namespace std;

namespace verbum {
    class verbum_syntactic_error : public BaseErrorListener
    {
        public:
            // Especifica configurações.
            void set_properties (string file_path, vector<char> file_content);

            // Mensagens de erro do analisador léxico e sintático.
            void syntaxError(
                Recognizer *recognizer,
                Token *offendingSymbol,
                size_t line,
                size_t charPositionInLine,
                const string &msg,
                exception_ptr e);
                
        private:
            // Path completo do arquivo de código em questão.
            string file_path;

            // Conteúdo do arquivo de código Verbum.
            vector<char> file_content;

            // Imprime linha de código em específico.
            void print_source_line (size_t line, size_t size_ch);
    };
}

#endif


