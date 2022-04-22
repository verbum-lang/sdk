
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

using namespace verbum;
using namespace antlr4;
using namespace std;

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

#define check_first_command(COMMAND) node[0].type == this->parser->COMMAND
#define check_command(COMMAND) (node[a].type == this->parser->COMMAND)
#define check_index_command(INDEX, COMMAND) (node[INDEX].type == this->parser->COMMAND)

void verbum_ast_listener::process_errors () {
    vector <verbum_error_node> node = this->error_node_control;

    if (check_first_command(Use))
        this->process_use();
}

void verbum_ast_listener::process_use () {
    vector <verbum_error_node> node = this->error_node_control;
    vector <string> big_message;
    
    string spec_message  = "Invalid expression for 'use' command.";
    string error_message = "Invalid token, use a string for imports.";

    big_message.push_back("Example of correct expressions:\n");
    big_message.push_back("    use 'std';");
    big_message.push_back("    use 'std:io';");
    big_message.push_back("    use 'std:path/file';");
    big_message.push_back("    use 'file';");
    big_message.push_back("    use 'path/file';");

    this->print_error_tokens();

    if (node.size() == 1)
        this->display_error(0, spec_message, error_message, big_message);
    else if (!check_index_command(1, String)) 
        this->display_error(1, spec_message, error_message, big_message);
}

void verbum_ast_listener::display_error (
    int index, string spec_message, string error_message, vector <string> big_message) 
{
    vector <verbum_error_node> node = this->error_node_control;
    size_t line = (size_t) node[index].position.line;
    size_t char_position = (size_t) node[index].position.ch_position;

    // Informações gerais.
    cout << "\n Verbum Programming Language - v" LANGUAGE_VERSION "\n\n";
    cout << " Error: " << spec_message << "\n";
    cout << " File: " << this->file_path << "\n";

    // Imprime linhas do erro.
    size_t error_line_limit = VERBUM_MAX_ERROR_PRINT_LINES;
    size_t start_error_lines = 1;

    if (line > error_line_limit)
        start_error_lines = line - error_line_limit;

    string line_size = to_string((int) start_error_lines);

    for (size_t a=start_error_lines; a<=line; a++)
        this->print_source_line(a, line_size.length());

    // Imprime apontador para caractere onde está o erro.
    string lnsz = to_string((int) line);
    size_t last_line_size = ((line_size.length() == lnsz.length()) ? 2 : 1) + lnsz.length() + 4;
    size_t size = char_position + last_line_size;

    for (size_t a=0; a<size; a++)
        cout << ' ';

    size_t limit = node[index].position.stop_index - node[index].position.start_index;
    for (size_t a=0; a<=limit; a++)
        cout << '^';
    cout << "\n";

    for (size_t a=0; a<size; a++)
        cout << ' ';
    cout << '|' << endl;

    for (size_t a=0; a<size; a++)
        cout << ' ';

    cout << "`--> Error: ";
    cout << message;
    cout << "\n\n";
    
    exit(0);
}

// Imprime linha do erro.
void verbum_ast_listener::print_source_line (size_t line, size_t size_ch)
{
    size_t counter = 1;
    string line_size = to_string((int) line);

    cout << ((size_ch == line_size.length()) ? "  " : " ") << line << "  | ";

    for (auto i: this->file_content) 
      if (counter != line && i == '\n')
        counter++;
      else if (counter == line && i == '\n')
        break;
      else {
        if (counter == line) {
          if (i == '\v' || i == '\t')
            cout << ' ';
          else
            cout << i;
        }
      }
    

    cout << "\n";
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


