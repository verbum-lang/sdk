
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

    // Processa análise lexica.
    ANTLRInputStream input(stream);
    TLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    #ifdef DBG
        std::cout << "\nTokens: \n\n";

        tokens.fill();
        for (auto token : tokens.getTokens()) {
            std::cout << token->toString() << std::endl;
        }
    #endif

    // Processa análise sintática.
    TParser parser(&tokens);
    tree::ParseTree* tree = parser.main();
    std::cout << tree->toStringTree(&parser) << std::endl << std::endl;
}


