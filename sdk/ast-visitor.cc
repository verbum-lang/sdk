
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

// ANTLR4.
#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include "TParserBaseVisitor.h"

#include "configuration.h"
#include "ast-struct.h"
#include "ast-visitor.h"

using namespace antlr4;
using namespace verbum;

/*
** Prepara estrutura AST para uso. 
*/
void verbum_ast_visitor::prepare_ast ()
{

}

/*
** Importações: use.
*/
antlrcpp::Any verbum_ast_visitor::visitUseString (TParser::UseStringContext *ctx) 
{
    std::cout << "import [use]: " << ctx->getText() << std::endl;

    std::string content = ctx->getText();

    // Verifica se é módulo, path ou arquivo específico.
    int type = VERBUM_USE_UNKNOWN;
    std::string part1 = "";

    for (auto i : content) {
        if (i == ':') {
            type = VERBUM_USE_MODULE;
            break;
        } else if (i == '/') {
            type = VERBUM_USE_PATH;
            break;
        }

        part1 += i;
    }

    if (type == VERBUM_USE_UNKNOWN && part1.length() > 0 && part1.length() == content.length()) 
        type = VERBUM_USE_ARCHIVE;
    
    std::cout << "type: " << type << std::endl;

    return visitChildren(ctx);
}

verbum_ast_control_t * verbum_ast_visitor::get_verbum_ast ()
{
    return this->ast;
}


