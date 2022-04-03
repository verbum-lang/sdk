
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
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
  
  // Process syntax.
  //VerbumLexer verbumLexer();
  //verbumLexer.

  /*
  // Verificações iniciais.
  char *filename = (char *) malloc(strlen(argv[1]) + 1);

  if (!filename) {
    std::cout << "Error alloc memory." << std::endl;
    exit(0);
  }

  memset(filename, 0x00, strlen(argv[1]) + 1);
  memcpy(filename, argv[1], strlen(argv[1]));

  std::ifstream f(filename);
  if (!f.good()) {
    std::cout << "Error open file" << std::endl;
    exit(0);
  }

  // Carrega path completo do arquivo. 
  char actualpath [PATH_MAX+1];
  realpath(filename, actualpath);
  currentFileName = std::string(actualpath);
  */




 
 /*
  const char *filename = argv[1];
  std::vector<char> buffer;

  // Processa arquivo da syntax.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  std::ifstream infile(filename);

  infile.seekg(0, infile.end);
  size_t length = infile.tellg();
  infile.seekg(0, infile.beg);

  if (length > 0) {
    buffer.resize(length);    
    infile.read(&buffer[0], length);
  }

  for (auto i: buffer)
    std::cout << i;
  std::cout << std::endl;


  // Processa tokens.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  std::ifstream stream;
  stream.open(filename);
  
  //MyParserErrorListener errorListner;
  ANTLRInputStream input(stream);
  TLexer lexer(&input);

  // Configura controle dos erros.
  //lexer.removeErrorListeners();
  //lexer.addErrorListener(&errorListner);
  
  CommonTokenStream tokens(&lexer);

  //tokens.fill();
  //for (auto token : tokens.getTokens()) {
  //  std::cout << token->toString() << std::endl;
  //}


  TParser parser(&tokens);
  tree::ParseTree* tree = parser.main();
  std::cout << tree->toStringTree(&parser) << std::endl << std::endl;


  // Configura controle dos erros.
  //parser.removeErrorListeners();
  //parser.addErrorListener(&errorListner);

  // Acessa árvore sintática através de visitor.
//  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
/*
  MyTParserBaseVisitor visitor;
  TParser::MainContext* treeVisit = parser.main();
  visitor.visitMain(treeVisit);
*/
  //free(filename);

  return 0;
}


