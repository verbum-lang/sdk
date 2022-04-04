
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
#include "use.h"

using namespace antlr4;
using namespace verbum;
using namespace std;

vector <verbum_ast_node> verbum_ast_visitor::get_verbum_ast ()
{
    return this->ast;
}

/*
** Importações: use.
*/
antlrcpp::Any verbum_ast_visitor::visitUseString (TParser::UseStringContext *ctx) 
{
    string content = ctx->getText().substr(1, ctx->getText().length() - 2);
    verbum_use_import verbum_use(content);
    verbum_ast_node ast_node = verbum_use.get_ast_node();
    ast.push_back(verbum_use.get_ast_node());

    return visitChildren(ctx);
}

/*
** Variáveis: identifica se é declaração ou atribuição (uso).
*/
antlrcpp::Any verbum_ast_visitor::visitVariableModes (TParser::VariableDefinitionContext *ctx)
{
    bool vfinal = false;





  variableModes
  // Declarações.
  :                         Var variableMembers End
  |       methodPerm        Var variableMembers End
  |                  Static Var variableMembers End
  |       methodPerm Static Var variableMembers End
  | Final methodPerm Static Var variableMembers End
  | Final methodPerm        Var variableMembers End 
  | Final                   Var variableMembers End 
  | Final            Static Var variableMembers End 
  
  // Atribuições.
  | variableMembers End
  ;
    antlrcpp::Any result = visitChildren(ctx);


    return result;
}


