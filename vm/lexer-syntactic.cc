
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
#include "default-ls-erros.h"
#include "syntax-analisys.h"
#include "ast-visitor.h"

using namespace verbum;
using namespace antlr4;
using namespace std;

verbum_lexer_syntactic::verbum_lexer_syntactic (std::string file_path, std::vector<char> file_content) 
{   
    /*
    ** Processa análise léxica (ANTLR) e sintática (personalizada).
    */
    ifstream custom_stream;
    custom_stream.open(file_path);

    ANTLRInputStream custom_input(custom_stream);
    TLexer custom_lexer(&custom_input);

    // Configura controle dos erros (léxical) - ANTLR.
    verbum_lexical_syntactic_error lexical_error;
    lexical_error.set_properties(file_path, file_content, "Lexical");
    custom_lexer.removeErrorListeners();
    custom_lexer.addErrorListener(&lexical_error);

    CommonTokenStream custom_tokens(&custom_lexer);

    #ifdef DBG_TOKENS
        std::cout << "\nTokens: \n\n";
        custom_tokens.fill();

        for (auto token : custom_tokens.getTokens()) 
            std::cout << token->toString() << "\n";
        std::cout << "\n\n";
    #endif

    // Análise sintática (personalizada).
    TParser custom_parser(&custom_tokens);
    custom_parser.removeErrorListeners();

    verbum_ast_listener listener;
    tree::ParseTreeWalker walker;
    ParserRuleContext* file_main = custom_parser.main();
    walker.walk(&listener, file_main);

    /*
    ** Realiza re-leitura lexica.
    */
    ifstream stream;
    stream.open(file_path);

    ANTLRInputStream input(stream);
    TLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    /*
    ** Processa análise sintática (ANTLR).
    */
    TParser parser(&tokens);
    parser.removeErrorListeners();

    verbum_lexical_syntactic_error syntactic_error;
    syntactic_error.set_properties(file_path, file_content, "Syntax");
    
    parser.removeErrorListeners();
    parser.addErrorListener(&syntactic_error);

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


