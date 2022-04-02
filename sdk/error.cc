
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** Controle dos erros da aplicação.
**
** Erros controlados:
**      + Parser
*/

#include <iostream>
#include <stdlib.h>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

#include "configuration.h"
#include "error.h"

using namespace verbum;
using namespace antlr4;

//
// Erros de sintaxe (ANTLR parser).
//
class MyParserErrorListener: public BaseErrorListener {
    
std::vector<char> buffer;
std::string currentFileName;

    void setProperties (std::string souceFilename)

    void syntaxError(
        Recognizer *recognizer,
        Token *offendingSymbol,
        size_t line,
        size_t charPositionInLine,
        const std::string &msg,
        std::exception_ptr e)
    {
    // Verifica se é erro do ANTLR4 ou se é de origem da gramática.
    std::string message = msg;
    std::string search  = "internal:";
    std::size_t found   = message.find(search);

    if (found != std::string::npos) {
        message = "Custom error message.";
    }

    // Informações gerais.
    std::cout << " " << std::endl << std::endl;
    std::cout << " Filename: " << currentFileName << std::endl;
    std::cout << " Syntax error [" << line << "," << 
        charPositionInLine << "] -> " << message << std::endl << std::endl;

    // Imprime linhas do erro.
    size_t errorLineLimit = 10;
    size_t startErrorLines = 1;

    if (line > errorLineLimit)
        startErrorLines = line - errorLineLimit;

    std::string lineSize = std::to_string((int) startErrorLines);

    for (size_t a=startErrorLines; a<=line; a++)
        printSourceLine(a, lineSize.length());

    // Imprime apontador para caractere onde está o erro.
    std::string lnSz = std::to_string((int) line);
    size_t lastLineSize = ((lineSize.length() == lnSz.length()) ? 2 : 1) + lnSz.length() + 4;
    size_t size = charPositionInLine + lastLineSize;

    for (size_t a=0; a<size; a++)
        std::cout << ' ';
    std::cout << '^' << std::endl;

    for (size_t a=0; a<size; a++)
        std::cout << ' ';
    std::cout << '|' << std::endl;

    for (size_t a=0; a<size; a++)
        std::cout << ' ';
    std::cout << "`--> Syntax error: " << message << std::endl << std::endl;

    exit(0);
  }

  // Imprime linha do erro.
  void printSourceLine (size_t line, size_t sizeCh) {
    size_t counter = 1;
    std::string lineSize = std::to_string((int) line);

    std::cout << ((sizeCh == lineSize.length()) ? "  " : " ") << line << "  | ";

    for (auto i: buffer) {
      if (counter != line && i == '\n')
        counter++;
      else if (counter == line && i == '\n')
        break;
      else {
        if (counter == line) {
          if (i == '\v' || i == '\t')
            std::cout << ' ';
          else
            std::cout << i;
        }
      }
    }

    std::cout << std::endl;
  }
};


