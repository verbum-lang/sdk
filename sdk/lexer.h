
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle do lexer/tokenização.
*/

#ifndef VERBUM_LEXER
#define VERBUM_LEXER

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

using namespace antlr4;

namespace verbum {
    class verbum_lexer {
        public:
            verbum_lexer (std::string file_path);
    };
}

#endif


