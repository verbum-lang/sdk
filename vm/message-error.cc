
#include <iostream>
#include <stdlib.h>

#include "configuration.h"
#include "global.h"
#include "message-error.h"
#include "help.h"

using namespace verbum;
using namespace std;

verbum_message_error::verbum_message_error (
    string file_path, vector<char> file_content, string origin, 
    int start_index, int stop_index, string section)
{
    this->origin = origin;
    this->file_path = file_path;
    this->file_content = file_content;
    this->start_index = start_index;
    this->stop_index = stop_index;
    this->section = section;
}

void verbum_message_error::display_error (
    int line, int char_position, string spec_message, 
    string error_message, vector <string> big_message) 
{
    // Informações gerais.
    cout << "\n \033[1;36mThe Verbum Programming Language\033[0m - v" LANGUAGE_VERSION " 💜\n\n\n";
    cout << " \033[1;31;40m error \033[0m";
    cout << " \033[1;31m" << spec_message << " (line " << 
                line << ", position " << char_position << ")." << "\033[0m\n";
    cout << " \033[1;97;100m file  \033[0m";
    cout << " "<< this->file_path << "\n\n";

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

    cout << "\033[1;35m";
    if (this->stop_index > 0 && (this->stop_index >= this->start_index)) {
        size_t limit = this->stop_index - this->start_index;

        for (size_t a=0; a<=limit; a++)
            cout << '^';
        cout << "\n";
    } else 
        cout << '^' << endl;

    for (size_t a=0; a<size; a++)
        cout << ' ';
    cout << '|' << endl;

    for (size_t a=0; a<size; a++)
        cout << ' ';

    cout << "`--> \033[0m";
    cout << " \033[1;31;40m error \033[0m";
    cout << " "<< error_message;
    cout << "\033[0m\n\n\n";

    // Mensagem adicional.
    for (auto item: big_message)
        cout << "  " << item << "\n";
    cout << "\n";

    exit(0);
}

// Imprime linha do erro.
void verbum_message_error::print_source_line (size_t line, size_t size_ch)
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


