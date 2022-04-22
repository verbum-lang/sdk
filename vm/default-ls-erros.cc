
#include <iostream>
#include <stdlib.h>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

#include "configuration.h"
#include "message-error.h"
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
    vector <string> big_message;
    string spec_message = "a syntax error has occurred";
    string error_message = "syntax error.";
    int start_index = 0, stop_index = 0;

    if (offendingSymbol) {
        if (offendingSymbol->getStartIndex() > 0)
            start_index = offendingSymbol->getStartIndex();
        if (offendingSymbol->getStopIndex() > 0)
            stop_index = offendingSymbol->getStopIndex();
    }

    verbum_message_error message_error(
        this->file_path, this->file_content, "default-ls-erros",
        start_index, stop_index, this->section);

    if (this->section.compare("Lexical") == 0) {
        spec_message = "an error occurred in the lexical parsing";
        error_message = "lexical error.";
    }

    // error_message = this->prepare_large_message(msg);

    message_error.display_error((int) line, (int) charPositionInLine, 
        spec_message, error_message, big_message);
}

// Formata mensagem com quedra de linha.
string verbum_lexical_syntactic_error::prepare_large_message (string message) {
    int count1 = 0, count2 = 0, count3 = 0;
    bool first_line = false;
    string fmsg = "";

    for (auto i : message) {
        fmsg += i;

        count1++;
        count3++;

        if (first_line)
            count2++;

        if (count1 >= VERBUM_MAX_CHARS_ERROR_ANTLR) {
            fmsg += "...";
            break;
        }

        if (count3 >= VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_A && first_line == false) {
            fmsg += "\n ";
            first_line = true;
        } else if (count2 >= VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_B && first_line == true) {
            fmsg += "\n ";
            count2 = 0;
        }
    }

    return fmsg;
}


