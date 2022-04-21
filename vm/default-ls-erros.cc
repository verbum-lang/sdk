
#include <iostream>
#include <stdlib.h>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

#include "configuration.h"
#include "default-ls-erros.h"

using namespace verbum;
using namespace antlr4;
using namespace std;

void verbum_lexical_syntactic_error::set_properties (
  string file_path, vector<char> file_content, string section)
{
    this->file_path    = file_path;
    this->file_content = file_content;
    this->section      = section;
}

void verbum_lexical_syntactic_error::syntaxError(
    Recognizer *recognizer,
    Token *offendingSymbol,
    size_t line,
    size_t charPositionInLine,
    const string &msg,
    exception_ptr e)
{
    string message = msg;

    // Informações gerais.
    cout << "\n Verbum Programming Language\n\n";
    cout << " Filename: " << this->file_path << "\n";
    cout << " "<< this->section <<" error [" << line << "," << 
        charPositionInLine << "] -> ";
    this->print_large_message(message);
    cout << "\n\n";

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
    size_t size = charPositionInLine + last_line_size;

    for (size_t a=0; a<size; a++)
        cout << ' ';
    cout << '^' << endl;

    for (size_t a=0; a<size; a++)
        cout << ' ';
    cout << '|' << endl;

    for (size_t a=0; a<size; a++)
        cout << ' ';
    cout << "`--> "<< this->section <<" error: ";
    this->print_large_message(message);
    cout << "\n\n";
    
    exit(0);
}

// Imprime linha do erro.
void verbum_lexical_syntactic_error::print_source_line (size_t line, size_t size_ch) 
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

// Imprime mensagem com quedra de linha.
void verbum_lexical_syntactic_error::print_large_message (string message) {
    int count1 = 0, count2 = 0, count3 = 0;
    bool first_line = false;

    for (auto i : message) {
      cout << i;

      count1++;
      count3++;

      if (first_line)
        count2++;

      if (count1 >= VERBUM_MAX_CHARS_ERROR_ANTLR) {
        cout << "...";
        break;
      }

      if (count3 >= VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_A && first_line == false) {
        cout << "\n ";
        first_line = true;
      } else if (count2 >= VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_B && first_line == true) {
        cout << "\n ";
        count2 = 0;
      }
    }
}


