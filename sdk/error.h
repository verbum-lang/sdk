
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Controle dos erros da aplicação.
*/

#ifndef VERBUM_ERROR_CONTROL
#define VERBUM_ERROR_CONTROL

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

using namespace antlr4;

namespace verbum {
    class verbum_error_visitor : public TParserBaseVisitor
    {
        public:

            
    };
}

#endif


