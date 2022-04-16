
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

verbum_lexer_syntactic::verbum_lexer_syntactic (std::string file_path, std::vector<char> file_content) 
{
    #ifdef DBG
        cout << "Start Verbum Programming Language!\n";
    #endif

    std::ifstream stream;
    stream.open(file_path);

    #ifdef DBG
        cout << "File open: " << file_path << "\n";
    #endif
    
    // Controle dos erros.
    verbum_error_listener error_listener;
    error_listener.set_properties(file_path, file_content);

    #ifdef DBG
        cout << "Error listener OK!\n";
    #endif
    
    // Processa análise lexica.
    ANTLRInputStream input(stream);
    TLexer lexer(&input);

    #ifdef DBG
        cout << "TLexer process OK!\n";
    #endif
    
    // Configura controle dos erros.
    lexer.removeErrorListeners();
    lexer.addErrorListener(&error_listener);

    #ifdef DBG
        cout << "Generate tokens...\n";
    #endif
    
    CommonTokenStream tokens(&lexer);

    #ifdef DBG_TOKENS
        std::cout << "\nTokens: \n\n";
        tokens.fill();

        for (auto token : tokens.getTokens()) 
            std::cout << token->toString() << std::endl;
        std::cout << std::endl << std::endl;
    #endif

    #ifdef DBG
        cout << "Process parser...\n";
    #endif
    
    // Processa análise sintática.
    TParser parser(&tokens);

    // Configura controle dos erros.
    parser.removeErrorListeners();
    parser.addErrorListener(&error_listener);

    #ifdef DBG
        cout << "Process visitor...\n";
    #endif
    
    // Percorre AST gerada pelo parser (analisador sintático).
    verbum_ast_visitor visitor;
    visitor.prepare_data();

    #ifdef DBG
        cout << "TParser tree data...\n";
    #endif

    TParser::MainContext* tree = parser.main();

    #ifdef DBG
        cout << "Make AST!\n";
    #endif
    
    visitor.visitMain(tree);

    // Realiza análise semântica.
    this->ast = visitor.get_verbum_ast();

    #ifdef DBG
        cout << "AST process finished.\n";
    #endif
}

vector <verbum_ast_node> verbum_lexer_syntactic::get_verbum_ast ()
{
    return this->ast;
}


