
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
#include <stdlib.h>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

// Verbum.
#include "configuration.h"
#include "help.h"
#include "loader.h"
#include "lexer-syntactic.h"
#include "ast-struct.h"
#include "semantics.h"

using namespace antlr4;
using namespace verbum;

int main (int argc, const char **argv) 
{
  #ifdef DBG_CLOCK
    auto start = chrono::steady_clock::now();
  #endif

  // Inicialização.
  verbum_help help(argc, argv);
  help.check();

  // Carrega código.
  verbum_loader loader(argc, argv);

  // Realiza análise léxica e sintática.
  verbum_lexer_syntactic lexer_syntactic(loader.get_file_path(), loader.get_file_content());
  
  // Realiz análise semântica.
  verbum_semantics semantics(lexer_syntactic.get_verbum_ast());

  #ifdef DBG_CLOCK
    auto end = chrono::steady_clock::now();
    auto diff = end - start;
    auto milisecs = chrono::duration <double, milli> (diff).count();
    auto secs = milisecs / 1000;

    cout << "\nExecution time: " << milisecs << " ms | " << secs << " secs\n";
  #endif
  
  return 0;
}


