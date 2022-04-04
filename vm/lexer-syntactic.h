
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle da análise léxica e sintática.
*/

#ifndef VERBUM_LEXER_SYNTACTIC
#define VERBUM_LEXER_SYNTACTIC

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

#include "ast-struct.h"

using namespace antlr4;
using namespace std;

namespace verbum {
    class verbum_lexer_syntactic {
        public:
            verbum_lexer_syntactic (string file_path, vector<char> file_content);

            // Retorna AST pronta para análise semântica.
            vector <verbum_ast_node> get_verbum_ast ();

        private:

            // Árvore AST para uso na análise semântica (etapa posterior).
            vector <verbum_ast_node> ast;
    };
}

#endif


