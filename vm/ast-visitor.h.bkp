
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
            antlrcpp::Any visitOperationValue (TParser::OperationValueContext *ctx);

            // Valores gerais.
            antlrcpp::Any visitGeneralValue (TParser::GeneralValueContext *ctx);

            // Array associativo.
            antlrcpp::Any visitAssociativeArrayElements (TParser::AssociativeArrayElementsContext *ctx);

            // Chamada a função.
            antlrcpp::Any visitCallingFunction (TParser::CallingFunctionContext *ctx);
            antlrcpp::Any visitFunctionCallCascadingItem (TParser::FunctionCallCascadingItemContext *ctx);

            // Condicionais.
            antlrcpp::Any visitConditionalExpressionStructBlock (TParser::ConditionalExpressionStructBlockContext *ctx);
            antlrcpp::Any visitConditionalExpressionItems (TParser::ConditionalExpressionItemsContext *ctx);
            antlrcpp::Any visitConditionalBlockElements (TParser::ConditionalBlockElementsContext *ctx);
            antlrcpp::Any visitIfElementUnique (TParser::IfElementUniqueContext *ctx);
            antlrcpp::Any visitElifElementUnique (TParser::ElifElementUniqueContext *ctx);
            antlrcpp::Any visitElseElementUnique (TParser::ElseElementUniqueContext *ctx);

            antlrcpp::Any visitConditionExpBlock (TParser::ConditionExpBlockContext *ctx);
            antlrcpp::Any visitConditionExpValue (TParser::ConditionExpValueContext *ctx);
            antlrcpp::Any visitConditionExpBlockItemValue (TParser::ConditionExpBlockItemValueContext *ctx);

            // Atribuição com chamada a função
            antlrcpp::Any visitFunctionCallAndAttr (TParser::FunctionCallAndAttrContext *ctx);
            antlrcpp::Any visitIdentifierAttrFn (TParser::IdentifierAttrFnContext *ctx);
            antlrcpp::Any visitFunctionCallAttrFn (TParser::FunctionCallAttrFnContext *ctx);
            antlrcpp::Any visitFunctionCallAttrFnItem (TParser::FunctionCallAttrFnItemContext *ctx);

            // Atribuição múltipla (a = b = c= d).
            antlrcpp::Any visitVariableMultipleAssignments (TParser::VariableMultipleAssignmentsContext *ctx);

            // Valores das expressões condicionais.            
            antlrcpp::Any visitConditionalExpValue (TParser::ConditionalExpValueContext *ctx);

            // Loop.
            antlrcpp::Any visitLoopExpressionItems (TParser::LoopExpressionItemsContext *ctx);
            antlrcpp::Any visitLoopOneMembers (TParser::LoopOneMembersContext *ctx);
            antlrcpp::Any visitLoopTwoMembers (TParser::LoopTwoMembersContext *ctx);
            antlrcpp::Any visitLoopThreeMembers (TParser::LoopThreeMembersContext *ctx);
            antlrcpp::Any visitLoopBlockElementsLimited (TParser::LoopBlockElementsLimitedContext *ctx);

            // Ret.
            antlrcpp::Any visitRet (TParser::RetContext *ctx);

            // Funções e métodos em geral.
            antlrcpp::Any visitFunctions (TParser::FunctionsContext *ctx);
            antlrcpp::Any visitFunctionsModes (TParser::FunctionsModesContext *ctx);
            antlrcpp::Any visitFunctionMethodsModes (TParser::FunctionMethodsModesContext *ctx);
            antlrcpp::Any visitConstructClassMethod (TParser::ConstructClassMethodContext *ctx);
            antlrcpp::Any visitInterfaceMethod (TParser::InterfaceMethodContext *ctx);
            antlrcpp::Any visitFunctionParams (TParser::FunctionParamsContext *ctx);
            antlrcpp::Any visitFunctionParamElements (TParser::FunctionParamElementsContext *ctx);
            antlrcpp::Any visitFunctionCodeBlock (TParser::FunctionCodeBlockContext *ctx);
            antlrcpp::Any visitFunctionCallParamAC (TParser::FunctionCallParamACContext *ctx);

            // OOP.
            antlrcpp::Any visitInterfaceClass (TParser::InterfaceClassContext *ctx);
            antlrcpp::Any visitInterfaceCodeBlock (TParser::InterfaceCodeBlockContext *ctx);
            antlrcpp::Any visitAbstractClass (TParser::AbstractClassContext *ctx);
            antlrcpp::Any visitAbstractCodeBlock (TParser::AbstractCodeBlockContext *ctx);
            antlrcpp::Any visitClassDefination (TParser::ClassDefinationContext *ctx);

            // Funções anônimas.
            antlrcpp::Any visitAnonymousFunction (TParser::AnonymousFunctionContext *ctx);
            antlrcpp::Any visitFunctionsModesFn (TParser::FunctionsModesFnContext *ctx);

            // Classes anônimas.
            antlrcpp::Any visitAnonymousClass (TParser::AnonymousClassContext *ctx);
            antlrcpp::Any visitAnonymousClassCallExpr (TParser::AnonymousClassCallExprContext *ctx);

            // Objetos anônimos.
            antlrcpp::Any visitAnonymousObjectCallExpr (TParser::AnonymousObjectCallExprContext *ctx);
            antlrcpp::Any visitAnonymousObject (TParser::AnonymousObjectContext *ctx);

            // Lambda functions.
            antlrcpp::Any visitLambdaFunctions (TParser::LambdaFunctionsContext *ctx);
            antlrcpp::Any visitLambdaFnParams (TParser::LambdaFnParamsContext *ctx);
            antlrcpp::Any visitLambdaFnParamsElements (TParser::LambdaFnParamsElementsContext *ctx);
            antlrcpp::Any visitLambdaFnCodeBlockKey (TParser::LambdaFnCodeBlockKeyContext *ctx);
            antlrcpp::Any visitLambdaFnCodeBlockSimple (TParser::LambdaFnCodeBlockSimpleContext *ctx);

            // Try, catch.
            antlrcpp::Any visitTryCatch (TParser::TryCatchContext *ctx);
            antlrcpp::Any visitTryUniqueElement (TParser::TryUniqueElementContext *ctx);
            antlrcpp::Any visitCatchUniqueElement (TParser::CatchUniqueElementContext *ctx);
            antlrcpp::Any visitTryCatchElementsLimited (TParser::TryCatchElementsLimitedContext *ctx);

            // Gerais.
            antlrcpp::Any visitLiveToken (TParser::LiveTokenContext *ctx);
            antlrcpp::Any visitVisibilityItems (TParser::VisibilityItemsContext *ctx);

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

            // Verifica se trata-se de operador...
            int check_block_arithmeic_operator (string op);
    };
}

#endif


