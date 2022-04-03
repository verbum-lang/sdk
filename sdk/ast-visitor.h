
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle do processamento da AST gerada pelo parser (ANTLR4).
** E geração de nova AST contendo os elementos melhor organizados.
*/

#ifndef VERBUM_AST_VISITOR
#define VERBUM_AST_VISITOR

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

#include "ast-struct.h"

using namespace antlr4;

namespace verbum {
    class verbum_ast_visitor : public TParserBaseVisitor
    {
        public:

            // Retorna AST pronta para análise semântica.
            verbum_ast_control_t * get_verbum_ast ();
        
            // Processa importações (use).
            antlrcpp::Any visitUseString (TParser::UseStringContext *ctx);

        private:

            // Árvore AST para uso na análise semântica (etapa posterior).
            verbum_ast_control_t * ast;
    };
}

#endif


