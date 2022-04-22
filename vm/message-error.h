
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Responsável pela exibição final dos erros encontrados nas análises léxicas, sintáticas e semânticas.
*/

#ifndef VERBUM_MESSAGE_ERROR
#define VERBUM_MESSAGE_ERROR

#include <iostream>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseListener.h"

using namespace antlr4;
using namespace std;

namespace verbum {
    class verbum_message_error
    {
        public:
            verbum_message_error (
                string file_path, vector<char> file_content, 
                string origin, int start_index, int stop_index, string section);

            void display_error (
                int line, int char_position, string spec_message, 
                string error_message, vector <string> big_message);

        private:
            string origin;
            string file_path;
            vector<char> file_content;
            int start_index;
            int stop_index;
            string section;

            void print_source_line (
                size_t line, size_t size_ch, bool last_line, int char_position);
    };
}

#endif


