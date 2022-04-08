
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

            // Acessa elementos de array.
            antlrcpp::Any visitArrayAccessElements (TParser::ArrayAccessElementsContext *ctx);
            antlrcpp::Any visitAccessBlockAr (TParser::AccessBlockArContext *ctx);

            // Processa blocos de operações.
            antlrcpp::Any visitOperationValue(TParser::OperationValueContext *ctx);

        private:

            // Árvore AST para uso na análise semântica (etapa posterior).
            vector <verbum_ast_node> ast;

            // Controle do comando de declaração e uso das variáveis.
            verbum_ast_node variable;

            // Controle dos elementos do array (utilizado no acesso).
            verbum_ast_node array_access_elements;

            // Operações passadas no acesso a elementos de array.
            verbum_ast_node array_access_elements_operations;

            // Flag informando que está sendo realizado o processamento das declarações das variáveis.
            // Utilizada em:
            //      + Acesso aos elementos de array.
            bool variable_declaration_process;
            bool variable_declaration_process_ops; // Voltado para filtrar as operações usadas no acesso.
            
            int operation_block_counter;
            int operation_block_counter_run;

            // Zera estrutura AST.
            verbum_ast_node zero_data ();

            // Reseta informações relacionadas as estruturas controladoras
            // utilizadas no processamento das variáveis.
            void variable_resets ();

            // Verifica operador aritmético utilizado no bloco de operações.
            int check_block_arithmeic_operator (string op);

            // Adiciona node do bloco de operação, em seu respectivo nível hierarquico.
            verbum_ast_node add_node_operations_elements (verbum_ast_node source, verbum_ast_node destination);

    };
}

#endif


