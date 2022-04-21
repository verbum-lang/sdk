
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
#include "TParserBaseListener.h"

#include "configuration.h"
#include "lexer-syntactic.h"
#include "lexical-error.h"
#include "syntactic-error.h"
#include "ast-visitor.h"

using namespace antlr4;
using namespace verbum;

class verbum_ast_listener : public TParserBaseListener
{
    void exitMain(TParser::MainContext *ctx) {
        cout << "listener: exit main\n";
    }
};

verbum_lexer_syntactic::verbum_lexer_syntactic (std::string file_path, std::vector<char> file_content) 
{
    std::ifstream stream;
    stream.open(file_path);

    // Processa análise lexica.
    ANTLRInputStream input(stream);
    TLexer lexer(&input);

    // Configura controle dos erros.
    verbum_lexical_error lexical_error;
    lexical_error.set_properties(file_path, file_content);

    lexer.removeErrorListeners();
    lexer.addErrorListener(&lexical_error);

    CommonTokenStream tokens(&lexer);

    #ifdef DBG_TOKENS
        std::cout << "\nTokens: \n\n";
        tokens.fill();

        for (auto token : tokens.getTokens()) 
            std::cout << token->toString() << std::endl;
        std::cout << std::endl << std::endl;
    #endif
    
    // Processa análise sintática.
    TParser parser(&tokens);

    // Configura controle dos erros.
    verbum_syntactic_error syntactic_error;
    syntactic_error.set_properties(file_path, file_content);

    parser.removeErrorListeners();
    parser.addErrorListener(&syntactic_error);

    // Adiciona listener.
    verbum_ast_listener *listener = new verbum_ast_listener();
    antlr4::tree::ParseTreeWalker walker;
    antlr4::ParserRuleContext* fileMain = parser.main();
    walker.walk(listener, fileMain);

    // Percorre árvore gerada pelo parser (analisador sintático).
    verbum_ast_visitor visitor;
    visitor.prepare_data(); 

    // Prepara árvore que será analisada semanticamente.
    TParser::MainContext* tree = parser.main();
    visitor.visitMain(tree);
    this->ast = visitor.get_verbum_ast();
}

vector <verbum_ast_node> verbum_lexer_syntactic::get_verbum_ast ()
{
    return this->ast;
}


