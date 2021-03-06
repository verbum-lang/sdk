
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

#include "ast-struct.h"

using namespace antlr4;
using namespace std;

namespace verbum {
    class verbum_ast_listener : public TParserBaseListener
    {
        private:
            // Controle dos nodes com erro - para análise.
            vector <verbum_error_node> error_node_control;

            TParser *parser;
            string file_path;
            vector<char> file_content;
            bool display_examples;

            // Ponto de entrada da gramática - ao sair da mesma é realizada a verificação
            // para processar possíveis erros.
            void exitMain (TParser::MainContext *ctx);

            // Node do ANTLR invocado toda vez que ocorre um erro em alguma regra.
            // Registra informações dos nodes e realiza verificação prévia do limite de erros.
            void visitErrorNode (antlr4::tree::ErrorNode *node);

            // Processamento dos erros encontrados.
            void process_errors ();

            // Processa erros do comando use.
            void process_use ();

            // Exibe tokens.
            void print_error_tokens ();

            // Exibe mensagem de erro.
            void display_error (int index, string spec_message, string error_message, vector <string> big_message);

        public:
            void prepare (TParser *parser, string file_path, vector<char> file_content);
    };
}

#endif


