
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

using namespace antlr4;
using namespace verbum;

int main (int argc, const char **argv) 
{
  // Inicialização.
  verbum_help help(argc, argv);
  help.check();

  // Carrega código.
  verbum_loader loader(argc, argv);

  // Realiza análise léxica e sintática.
  verbum_lexer_syntactic lexer_syntactic(loader.get_file_path(), loader.get_file_content());
  
  return 0;
}


