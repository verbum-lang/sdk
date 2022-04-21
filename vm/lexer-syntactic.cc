
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

#define VERBUM_ERROR_INDEX_COUNT_LIMIT 10
typedef struct {

    // Texto completo.
    string text;

    // Posição da ocorrência.
    struct {
        int line;
        int ch_position;
        int start_index;
        int stop_index;
    } position;

    // Gerais.
    int token_index;
    int type;
    string next_token;
    string source_name;
    string interval;

} verbum_error_node;

class verbum_ast_listener : public TParserBaseListener
{
    private:
        vector <verbum_error_node> error_node_control;
        int verbum_error_node_count;

        void exitMain(TParser::MainContext *ctx) {
            if (error_node_control.size() > 0)
                this->process_errors();
        }

        void visitErrorNode(antlr4::tree::ErrorNode *node) {
            verbum_error_node error_node;

            error_node.text = node->getText();
            error_node.position.line = node->getSymbol()->getLine();
            error_node.position.ch_position = node->getSymbol()->getCharPositionInLine();
            error_node.position.start_index = node->getSymbol()->getStartIndex();
            error_node.position.stop_index = node->getSymbol()->getStopIndex();
            error_node.token_index = node->getSymbol()->getTokenIndex();
            error_node.type = node->getSymbol()->getType();
            error_node.next_token = node->getSymbol()->getTokenSource()->nextToken()->getText();
            error_node.source_name = node->getSymbol()->getTokenSource()->getSourceName();
            error_node.interval = node->getSourceInterval().toString();

            error_node_control.push_back(error_node);
            
            if (error_node_control.size() >= VERBUM_ERROR_INDEX_COUNT_LIMIT)
                this->process_errors();
        }

        void process_errors () {
            cout << "Process errors\n";
            vector <verbum_error_node> node = this->error_node_control;

            for (int a=0; a<node.size(); a++) {
                cout << "text: "<< node[a].text << "\n";
                
                cout << "p.line: "<< node[a].position.line << "\n";
                cout << "p.ch_position: "<< node[a].position.ch_position << "\n";
                cout << "p.start_index: "<< node[a].position.start_index << "\n";
                cout << "p.stop_index: "<< node[a].position.stop_index << "\n";

                cout << "token_index: "<< node[a].token_index << "\n";
                cout << "type: "<< node[a].type << "\n";
                cout << "next_token: "<< node[a].next_token << "\n";
                cout << "source_name: "<< node[a].source_name << "\n";
                cout << "interval: "<< node[a].interval << "\n";

                cout << "---------------------------\n";
            }

            exit(0);
        }

    public:
        void prepare () {
            this->verbum_error_node_count = 0;
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
    parser.removeErrorListeners();

    // Adiciona listener.
    verbum_ast_listener listener;
    listener.prepare();
    tree::ParseTreeWalker walker;
    ParserRuleContext* fileMain = parser.main();
    walker.walk(&listener, fileMain);

    // Configura controle dos erros.
    // verbum_syntactic_error syntactic_error;
    // syntactic_error.set_properties(file_path, file_content);
    // parser.removeErrorListeners();
    // parser.addErrorListener(&syntactic_error);

    // Percorre árvore gerada pelo parser (analisador sintático).
    verbum_ast_visitor visitor;
    visitor.prepare_data(); 

    // Prepara árvore que será analisada semanticamente.
    // TParser::MainContext* tree = parser.main();
    // visitor.visitMain(tree);
    this->ast = visitor.get_verbum_ast();
}

vector <verbum_ast_node> verbum_lexer_syntactic::get_verbum_ast ()
{
    return this->ast;
}


