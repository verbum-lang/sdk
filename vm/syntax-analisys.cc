
#include <iostream>
#include <stdlib.h>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseListener.h"

#include "configuration.h"
#include "global.h"
#include "syntax-analisys.h"
#include "message-error.h"

using namespace verbum;
using namespace antlr4;
using namespace std;

#define check_first_command(COMMAND) node[0].type == this->parser->COMMAND
#define check_command(COMMAND) (node[a].type == this->parser->COMMAND)
#define check_index_command(INDEX, COMMAND) (node[INDEX].type == this->parser->COMMAND)

void verbum_ast_listener::prepare (TParser *parser, string file_path, vector<char> file_content) {
    this->parser        = parser;
    this->file_path     = file_path;
    this->file_content  = file_content;
}

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

void verbum_ast_listener::display_error (
    int index, string spec_message, string error_message, vector <string> big_message) 
{
    vector <verbum_error_node> node = this->error_node_control;
    size_t line = (size_t) node[index].position.line;
    size_t char_position = (size_t) node[index].position.ch_position;

    verbum_message_error message_error(
        this->file_path, this->file_content, "syntax-analisys",
        node[index].position.start_index, node[index].position.stop_index, "");

    message_error.display_error(line, char_position, spec_message, error_message, big_message);
}

void verbum_ast_listener::print_error_tokens () {
    vector <verbum_error_node> node = this->error_node_control;

    for (int a=0; a<node.size(); a++) {
        cout << "Node..........: "<< to_string(a) << "\n";
        cout << "Text..........: "<< node[a].text << "\n";
        cout << "Token type....: "<< node[a].type << "\n";
        cout << "Token index...: "<< node[a].token_index << "\n";
        cout << "Next token....: "<< node[a].next_token << "\n";
        cout << "Source name...: "<< node[a].source_name << "\n";
        cout << "Interval......: "<< node[a].interval << "\n";
        cout << "Line / ch.....: "<< node[a].position.line << " / "<< node[a].position.ch_position << "\n";
        cout << "Start / stop..: "<< node[a].position.start_index << " / " << node[a].position.stop_index << "\n";
        cout << "---------------------------\n";
    }
}

void verbum_ast_listener::process_errors () {
    vector <verbum_error_node> node = this->error_node_control;

    if (check_first_command(Use))
        this->process_use();
}

void verbum_ast_listener::process_use () {
    vector <verbum_error_node> node = this->error_node_control;
    vector <string> big_message;

    string spec_message  = "invalid expression for 'use' command";
    string error_message = "invalid token, use a string for imports.";

    big_message.push_back("\033[1;94mExample of correct expressions:\033[0m\n");
    big_message.push_back("    use 'std';");
    big_message.push_back("    use 'std:io';");
    big_message.push_back("    use 'std:path/file';");
    big_message.push_back("    use 'std:<io, net, os>';");
    big_message.push_back("    use 'file';");
    big_message.push_back("    use 'path/file';");
    big_message.push_back("    use 'path/<file1, file2>';");
    big_message.push_back("    use 'std:<io,net>', 'path/test', 'file';");
    big_message.push_back("    use 'std:*';");
    big_message.push_back("    use 'path/*';");

    this->print_error_tokens();

    if (node.size() == 1)
        this->display_error(0, spec_message, "invalid expression.", big_message);
    else if (!check_index_command(1, String)) 
        this->display_error(1, spec_message, error_message, big_message);
    
    // Verifica expressão completa.
    else {

    }
}


