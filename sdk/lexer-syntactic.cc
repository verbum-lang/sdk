
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
#include "lexer-syntactic.h"
#include "error.h"
#include "ast-visitor.h"

using namespace antlr4;
using namespace verbum;

verbum_lexer_syntactic::verbum_lexer_syntactic (std::string file_path) 
{
    std::ifstream stream;
    stream.open(file_path);

    // Processa análise lexica.
    ANTLRInputStream input(stream);
    TLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    #ifdef DBG
        std::cout << "\nTokens: \n\n";
        tokens.fill();

        for (auto token : tokens.getTokens()) 
            std::cout << token->toString() << std::endl;
        std::cout << std::endl << std::endl;
    #endif

    // Processa análise sintática.
    TParser parser(&tokens);

    verbum_ast_visitor visitor;
    TParser::MainContext* tree = parser.main();
    visitor.visitMain(tree);
}


