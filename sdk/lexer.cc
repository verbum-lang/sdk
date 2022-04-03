
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

#include "configuration.h"
#include "lexer.h"

using namespace antlr4;
using namespace verbum;

verbum_lexer::verbum_lexer (std::string file_path) 
{
    std::ifstream stream;
    stream.open(file_path);

    //MyParserErrorListener errorListner;
    this->input = new ANTLRInputStream(stream);
    this->lexer = new TLexer(this->input);

    // Configura controle dos erros.
    //lexer.removeErrorListeners();
    //lexer.addErrorListener(&errorListner);

    this->tokens = new CommonTokenStream(this->lexer);

    #ifdef DBG
        this->tokens->fill();
        for (auto token : this->tokens->getTokens())
            std::cout << token->toString() << std::endl;
    #endif    
}


