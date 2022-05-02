
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Entry-point da linguagem.
*/

#include <iostream>

// Verbum.
#include "configuration.h"
#include "help.h"
#include "loader.h"
#include "lexer-syntactic.h"
#include "ast-struct.h"
#include "semantic-analisys.h"
#include "semantics.h"

using namespace antlr4;
using namespace verbum;

int main (int argc, const char **argv) 
{
    #ifdef DBG_CLOCK
        auto compile_start = chrono::steady_clock::now();
    #endif

    // Inicialização.
    verbum_help help(argc, argv);

    #ifdef DBG
        verbum_help::banner();
    #endif

    // Carrega código.
    verbum_loader loader(argc, argv);

    // Realiza análise léxica e sintática.
    verbum_lexer_syntactic lexer_syntactic(loader.get_file_path(), loader.get_file_content());

    #ifdef DBG_CLOCK
        auto syntax_parsing_end = chrono::steady_clock::now();
        auto semantic_start = chrono::steady_clock::now();
    #endif

    // Realiz análise semântica.
    verbum_semantics_analisys semantics(lexer_syntactic.get_verbum_ast());

    // Exibe AST.
    // verbum_semantics ast(lexer_syntactic.get_verbum_ast());

    #ifdef DBG_CLOCK
        auto semantic_end = chrono::steady_clock::now();
    #endif

    #ifdef DBG_CLOCK
        cout << "\n";
        
        // Tempo da análise sintática.
        do {
          auto diff = syntax_parsing_end - compile_start;
          auto milisecs = chrono::duration <double, milli> (diff).count();
          auto secs = milisecs / 1000;
          cout << "Syntax parsing time....: " << milisecs << " ms | " << secs << " secs\n";
        } while (0);

        // Tempo da análise semântica.
        do {
          auto diff = semantic_end - semantic_start;
          auto milisecs = chrono::duration <double, milli> (diff).count();
          auto secs = milisecs / 1000;
          cout << "Semantic analysis time.: " << milisecs << " ms | " << secs << " secs\n";
        } while (0);

        // Tempo total de compilação.
        do {
          auto diff = semantic_end - compile_start;
          auto milisecs = chrono::duration <double, milli> (diff).count();
          auto secs = milisecs / 1000;
          cout << "Compilation time.......: " << milisecs << " ms | " << secs << " secs\n";
        } while (0);

        cout << "\n";
    #endif

    return 0;
}


