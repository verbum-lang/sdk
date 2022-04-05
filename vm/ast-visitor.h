
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

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

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
    class verbum_ast_visitor : public TParserBaseVisitor
    {
        public:
        
            // Retorna AST pronta para análise semântica.
            vector <verbum_ast_node> get_verbum_ast ();
        
            // Processa importações (use).
            antlrcpp::Any visitUseString (TParser::UseStringContext *ctx);

            // Processa variáveis.
            antlrcpp::Any visitVariableModes (TParser::VariableModesContext *ctx);
            antlrcpp::Any visitVariableDefinition (TParser::VariableDefinitionContext *ctx);

        private:

            // Árvore AST para uso na análise semântica (etapa posterior).
            vector <verbum_ast_node> ast;

            // Controle temporário para formatação das variáveis.
            verbum_ast_node variable;

            // Reseta informações de 'variable'.
            // Onde a mesma é utilizada para armazenar os dados da variável enquanto se adentro na árvore.
            void variable_resets ();
    };
}

#endif


