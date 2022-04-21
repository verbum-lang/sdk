
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Responsável pelo processamento personalizados dos erros sintáticos.
*/

#ifndef VERBUM_SYNTAX_ANALISYS
#define VERBUM_SYNTAX_ANALISYS

#include <iostream>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseListener.h"

using namespace antlr4;
using namespace std;

namespace verbum {

    // Estrutura de controle dos nodes com erro.
    typedef struct {

        // Texto completo.
        string text;

        // Posição da ocorrência.
        struct {
            int line;
            int ch_position;
            int start_index;
            int stop_index;
        } position;

        // Gerais.
        int token_index;
        int type;
        string next_token;
        string source_name;
        string interval;

    } verbum_error_node;

    class verbum_ast_listener : public TParserBaseListener
    {
        private:
            // Controle dos nodes com erro - para análise.
            vector <verbum_error_node> error_node_control;

            // Ponto de entrada da gramática - ao sair da mesma é realizada a verificação
            // para processar possíveis erros.
            void exitMain (TParser::MainContext *ctx);

            // Node do ANTLR invocado toda vez que ocorre um erro em alguma regra.
            // Registra informações dos nodes e realiza verificação prévia do limite de erros.
            void visitErrorNode (antlr4::tree::ErrorNode *node);

            // Processamento dos erros encontrados.
            void process_errors ();
    };
}

#endif


