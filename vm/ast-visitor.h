
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

            // Variáveis.
            antlrcpp::Any visitBlockVariable (TParser::BlockVariableContext *ctx);
            antlrcpp::Any visitVariableItem (TParser::VariableItemContext *ctx);

            // Ret (return).
            antlrcpp::Any visitBlockRet (TParser::BlockRetContext *ctx) ;

            // Condicionais.
            antlrcpp::Any visitBlockConditional (TParser::BlockConditionalContext *ctx);
            antlrcpp::Any visitConditionalBlockExpression (TParser::ConditionalBlockExpressionContext *ctx);
            antlrcpp::Any visitConditionalBlockElements (TParser::ConditionalBlockElementsContext *ctx);
            antlrcpp::Any visitIfElementUnique (TParser::IfElementUniqueContext *ctx);
            antlrcpp::Any visitElifElementUnique (TParser::ElifElementUniqueContext *ctx);
            antlrcpp::Any visitElseElementUnique (TParser::ElseElementUniqueContext *ctx);

            // Loop.
            antlrcpp::Any visitBlockLoop (TParser::BlockLoopContext *ctx);
            antlrcpp::Any visitLoopOneMembers (TParser::LoopOneMembersContext *ctx);
            antlrcpp::Any visitLoopTwoMembers (TParser::LoopTwoMembersContext *ctx);
            antlrcpp::Any visitLoopThreeMembers (TParser::LoopThreeMembersContext *ctx);
            antlrcpp::Any visitLoopBlockElements (TParser::LoopBlockElementsContext *ctx);

            // Break, next.
            antlrcpp::Any visitBlockBreak (TParser::BlockBreakContext *ctx);
            antlrcpp::Any visitBlockNext (TParser::BlockNextContext *ctx);

            // Try, catch.
            antlrcpp::Any visitBlockTryCatch (TParser::BlockTryCatchContext *ctx);
            antlrcpp::Any visitTryUniqueElement (TParser::TryUniqueElementContext *ctx);
            antlrcpp::Any visitCatchUniqueElement (TParser::CatchUniqueElementContext *ctx);
            antlrcpp::Any visitTryCatchElements (TParser::TryCatchElementsContext *ctx);

            // Funções.
            antlrcpp::Any visitBlockFunction (TParser::BlockFunctionContext *ctx);
            antlrcpp::Any visitFunctionParam (TParser::FunctionParamContext *ctx);
            antlrcpp::Any visitFunctionCodeBlock (TParser::FunctionCodeBlockContext *ctx);

            // Funções anônimas.
            antlrcpp::Any visitFunctionAnonymousParam (TParser::FunctionAnonymousParamContext *ctx);

            // OOP.
            antlrcpp::Any visitBlockInterface (TParser::BlockInterfaceContext *ctx);
            antlrcpp::Any visitInterfaceCodeBlock (TParser::InterfaceCodeBlockContext *ctx);
            antlrcpp::Any visitBlockAbstraction (TParser::BlockAbstractionContext *ctx);
            antlrcpp::Any visitAbstractionCodeBlock (TParser::AbstractionCodeBlockContext *ctx);

            // Class.
            antlrcpp::Any visitBlockClass (TParser::BlockClassContext *ctx);
            antlrcpp::Any visitBlockClassDeclarationAttr (TParser::BlockClassDeclarationAttrContext *ctx);
            antlrcpp::Any visitClassCodeBlock (TParser::ClassCodeBlockContext *ctx);

            // Valores gerais.
            antlrcpp::Any visitGeneralValue (TParser::GeneralValueContext *ctx);

            // Array associativo.
            antlrcpp::Any visitAssociativeArrayElements (TParser::AssociativeArrayElementsContext *ctx);

            // Lambda functions.
            antlrcpp::Any visitBlockLambdaFunctions (TParser::BlockLambdaFunctionsContext *ctx);
            antlrcpp::Any visitLambdaFnParams (TParser::LambdaFnParamsContext *ctx);
            antlrcpp::Any visitLambdaFnCodeBlock (TParser::LambdaFnCodeBlockContext *ctx);

            // Chamada a funções e métodos.
            antlrcpp::Any visitBlockFunctionCall (TParser::BlockFunctionCallContext *ctx);

            // Atribuição de valores à variáveis.
            antlrcpp::Any visitBlockAttribution (TParser::BlockAttributionContext *ctx);
            antlrcpp::Any visitAttributionElements (TParser::AttributionElementsContext *ctx);

            // Visibilidade das variáveis, métodos e configurações das classes.
            antlrcpp::Any visitBlockPermissionTokens (TParser::BlockPermissionTokensContext *ctx);

            // Atribuição múltipla (a = b = c = d).
            antlrcpp::Any visitBlockMultipleAssignments (TParser::BlockMultipleAssignmentsContext *ctx);

            // Construtor de classe.
            antlrcpp::Any visitBlockClassConstructor (TParser::BlockClassConstructorContext *ctx);

            // Array.
            antlrcpp::Any visitArrayAccessElementsItems (TParser::ArrayAccessElementsItemsContext *ctx);
            antlrcpp::Any visitArrayIndexAccess (TParser::ArrayIndexAccessContext *ctx);

            // Instanciamento anônimo de objeto.
            antlrcpp::Any visitBlockAnonymousObject (TParser::BlockAnonymousObjectContext *ctx);

            // Gerais.
            antlrcpp::Any visitCodeBlockFlowControlElements (TParser::CodeBlockFlowControlElementsContext *ctx);

        private:
        
            // Contadores e flags de controle da adição dos nodes.
            int node_block_counter;
            int node_run_counter;

            // Árvore AST para uso na análise semântica (etapa posterior).
            verbum_ast_node ast;

            // Retorna node AST zerado.
            verbum_ast_node zero_data ();

            // Realiza controle de adição de node em node central.
            void add_node (verbum_ast_node source);
            void add_node_internal_ptr (verbum_ast_node source, verbum_ast_node *ast);
            verbum_ast_node add_node_internal_copy (verbum_ast_node source, verbum_ast_node destination);

            // Processa operador aritmético.
            int check_block_arithmeic_operator (string op);
    };
}

#endif


