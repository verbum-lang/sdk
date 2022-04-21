
#include <iostream>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseListener.h"

#include "configuration.h"
#include "global.h"
#include "syntax-analisys.h"

using namespace verbum;
using namespace antlr4;
using namespace std;

void verbum_ast_listener::exitMain (TParser::MainContext *ctx) {
    if (error_node_control.size() > 0)
        this->process_errors();
}

void verbum_ast_listener::visitErrorNode (antlr4::tree::ErrorNode *node) {
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

void verbum_ast_listener::process_errors () {
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

    // exit(0);
}


