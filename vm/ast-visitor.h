
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

            // Realiza inicializações.
            void prepare_data ();

            // Retorna AST pronta para análise semântica.
            vector <verbum_ast_node> get_verbum_ast ();
        
            // Processa importações (use).
            antlrcpp::Any visitUseString (TParser::UseStringContext *ctx);

            // Processa variáveis.
            antlrcpp::Any visitVariableModes (TParser::VariableModesContext *ctx);
            antlrcpp::Any visitVariableDefinition (TParser::VariableDefinitionContext *ctx);
            
            // Acesso a elementos de array.
            antlrcpp::Any visitArrayAccessElementsItems (TParser::ArrayAccessElementsItemsContext *ctx);
            antlrcpp::Any visitArrayIndexAccess (TParser::ArrayIndexAccessContext *ctx);

            // Operações.
            antlrcpp::Any visitOperationValue(TParser::OperationValueContext *ctx);

            // Valores gerais.
            antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx);

            // Array associativo.
            antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *ctx);

            // Condicionais.
            antlrcpp::Any visitIfConditions(TParser::IfConditionsContext *ctx);

        private:
            // Contadores e flags de controle da adição dos nodes.
            int node_block_counter;
            int node_run_counter;

            // Árvore AST para uso na análise semântica (etapa posterior).
            verbum_ast_node ast;

            // Retorna node AST zerado.
            verbum_ast_node zero_data ();

            // Realiza controle de adição de node em node central.
            verbum_ast_node add_node (int type, verbum_ast_node source, verbum_ast_node destination);
            verbum_ast_node add_node_internal (int type, verbum_ast_node source, verbum_ast_node destination);

            // Verifica se trata-se de operador...
            int check_block_arithmeic_operator (string op);
    };
}

#endif


