
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
#include "ast-struct.h"

using namespace verbum;
using namespace antlr4;
using namespace std;

#define check_first_command(COMMAND) node[0].type == this->parser->COMMAND
#define check_command(COMMAND) (node[a].type == this->parser->COMMAND)
#define check_index_command(INDEX, COMMAND) (node[INDEX].type == this->parser->COMMAND)

void verbum_ast_listener::prepare (TParser *parser, string file_path, vector<char> file_content) {
    this->parser            = parser;
    this->file_path         = file_path;
    this->file_content      = file_content;
    this->display_examples  = VERBUM_DISPLAY_ERROR_EXAMPLES;
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
    
    // if (error_node_control.size() >= VERBUM_ERROR_INDEX_COUNT_LIMIT)
    //     this->process_errors();
}

void verbum_ast_listener::display_error (
    int index, string spec_message, string error_message, vector <string> big_message) 
{
    vector <verbum_error_node> node = this->error_node_control;
    size_t line = (size_t) node[index].position.line;
    size_t char_position = (size_t) node[index].position.ch_position;
    int start_index = node[index].position.start_index;
    int stop_index = node[index].position.stop_index;

    // Verifica se há quebra de linha na ocorrência.
    for (int a=0; a<node[index].text.length(); a++) {
        if (node[index].text[a] == '\n') {
            stop_index = start_index + a;
            break;
        }
    }

    verbum_message_error message_error(
        this->file_path, this->file_content, "syntax-analisys", start_index, stop_index, "");

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
    // this->print_error_tokens();

    if (check_first_command(Use))
        this->process_use();
}

void verbum_ast_listener::process_use () {
    vector <verbum_error_node> node = this->error_node_control;
    vector <string> big_message;

    string spec_message  = "invalid expression for 'use' command";
    string error_message = "invalid token, use a string for imports.";

    if (this->display_examples) {
        big_message.push_back("\033[1;94mExample of correct expressions:\033[0m\n");
        big_message.push_back("    \033[1;35muse\033[0m 'std:io';                    \033[1;90m// Import module (io) from package (std).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'std:path/file';             \033[1;90m// Import module (path/file) from package (std).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'std:<io, net, os>';         \033[1;90m// Import modules (io, net, os) from package (std).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'library';                   \033[1;90m// Import file (library).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'path/file';                 \033[1;90m// Import file (path/file).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'directory/<file1, file2>';  \033[1;90m// Import files (file1, file2) from path (directory).\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'std:<io,net>', 'path/test'; \033[1;90m// Multiple imports.\033[0m");
        big_message.push_back("    \033[1;35muse\033[0m 'std:*', 'path/*';           \033[1;90m// Imports all files within a package or directory.\033[0m");
    }

    if (node.size() == 1)
        this->display_error(0, spec_message, "invalid expression.", big_message);
    
    else if (!check_index_command(1, String)) {
        error_message  = "invalid token";

        if (node[1].text.length() > 0)
            error_message += " ("+ node[1].text +")";
        error_message += ", use a string for imports.";

        this->display_error(1, spec_message, error_message, big_message);
    }
    
    // Verifica expressão completa.
    else {
        int flag = 0, last_index = 1;
        bool end_found = false;

        for (int a=1; a<node.size(); a++, last_index++) {
            if (flag == 0 && check_index_command(a, String))
                flag = 1;
            else if (flag == 1 && check_index_command(a, Separator))
                flag = 0;
            else {
                error_message  = "invalid token";
                if (node[a].text.length() > 0)
                    error_message += " (\033[1;31m"+ verbum_global::remove_newlines(node[a].text) +"\033[0m)";

                if (!check_index_command(a, String))
                    error_message += ". Use a string for imports, and\nremember to put a semicolon at the end of the expression.";
                else if (check_index_command(a, String))
                    error_message += ", a comma is missing before the token.";
                
                this->display_error(a, spec_message, error_message, big_message);
            }

            if (check_index_command(a, End))
                end_found = true;
        }

        // Não encontrou 'end'.
        if (!end_found) {
            error_message  = "No semicolon found. Insert it after the end of the 'use' command expression.";
            this->display_error(last_index - 1, spec_message, error_message, big_message);
        }
    }
}


