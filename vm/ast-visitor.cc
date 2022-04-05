
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
** Variáveis: reseta estrutura de controle.
*/ 
void verbum_ast_visitor::variable_resets ()
{
    // VERBUM_VARIABLE_INITIALIZATION
    this->variable.variable_type                    = VERBUM_UNKNOWN;
    this->variable.variable_settings.vfinal         = false;
    this->variable.variable_settings.priv           = false;
    this->variable.variable_settings.pro            = false;
    this->variable.variable_settings.pub            = false;
    this->variable.variable_settings.vstatic        = false;
    this->variable.variable_settings.simple         = false;

    // VERBUM_VARIABLE_USE_TYPES
    this->variable.variable_definition_type         = VERBUM_UNKNOWN;
    this->variable.variable_names.simple_name       = "";     
    this->variable.variable_names.object_name       = ""; 
    this->variable.variable_names.method_name       = ""; 
    this->variable.variable_type_conversion         = false;
    this->variable.variable_type_conversion_name    = "";
    this->variable.variable_operation               = VERBUM_UNKNOWN;
    this->variable.variable_mod_operation           = VERBUM_UNKNOWN;
}

/*
** Variáveis: identifica se é declaração ou atribuição (uso).
*/
antlrcpp::Any verbum_ast_visitor::visitVariableModes (TParser::VariableModesContext *ctx)
{
    this->variable_resets();
    this->variable.type = VERBUM_VARIABLE_INITIALIZATION;

    // Atribuição.
    if (!ctx->Var())
        this->variable.variable_type = VERBUM_VARIABLE_ATTRIBUTION;

    // Declaração.
    else {
        this->variable.variable_type = VERBUM_VARIABLE_DECLARATION;

        if (ctx->Final())
            this->variable.variable_settings.vfinal   = true;
        if (ctx->Static())
            this->variable.variable_settings.vstatic  = true;

        if (ctx->methodPerm()) {
            if (ctx->methodPerm()->Pub())
                this->variable.variable_settings.pub  = true;
            else if (ctx->methodPerm()->Priv())
                this->variable.variable_settings.priv = true;
            else if (ctx->methodPerm()->Pro())
                this->variable.variable_settings.pro  = true;
        }
    }
    
    antlrcpp::Any result = visitChildren(ctx);
    this->ast.push_back(this->variable);
    
    return result;
}

/*
** Variáveis: tipo e modo de utilização.
*/
antlrcpp::Any verbum_ast_visitor::visitVariableDefinition (TParser::VariableDefinitionContext *ctx)
{
    verbum_ast_node node; 
    node.type = VERBUM_VARIABLE_USE_TYPES;

    // Acesso a elemento de array.
    if (ctx->arrayAccessElements()) 
        node.variable_definition_type = VERBUM_VARIABLE_ARRAY_ACCESS;

    // Acesso a membro de objeto instanciado ou estático.
    else if (ctx->objIdentifierA() && ctx->objIdentifierB()) {

        // Instanciado.
        if (ctx->Point())
            node.variable_definition_type = VERBUM_VARIABLE_OBJ_INSTANCE;
        // Estático.
        else if (ctx->TwoTwoPoint())
            node.variable_definition_type = VERBUM_VARIABLE_OBJ_STATIC;

        node.variable_names.object_name = ctx->objIdentifierA()->getText();        
        node.variable_names.method_name = ctx->objIdentifierB()->getText();        
    } 
    
    // Uso geral.
    else {
        node.variable_definition_type = VERBUM_VARIABLE_SIMPLE;
        node.variable_names.simple_name = ctx->Identifier()->getText();
    }

    this->variable.nodes.push_back(node);

    /*
    this->variable.type = VERBUM_VARIABLE_USE_TYPES;

    // Acesso a elemento de array.
    if (ctx->arrayAccessElements()) 
        this->variable.variable_definition_type = VERBUM_VARIABLE_ARRAY_ACCESS;

    // Acesso a membro de objeto instanciado ou estático.
    else if (ctx->objIdentifierA() && ctx->objIdentifierB()) {

        // Instanciado.
        if (ctx->Point())
            this->variable.variable_definition_type = VERBUM_VARIABLE_OBJ_INSTANCE;
        // Estático.
        else if (ctx->TwoTwoPoint())
            this->variable.variable_definition_type = VERBUM_VARIABLE_OBJ_STATIC;

        this->variable.variable_names.object_name = ctx->objIdentifierA()->getText();        
        this->variable.variable_names.method_name = ctx->objIdentifierB()->getText();        
    } 
    
    // Uso geral.
    else {
        this->variable.variable_definition_type = VERBUM_VARIABLE_SIMPLE;
        this->variable.variable_names.simple_name = ctx->Identifier()->getText();
    }
*/

/*

variableDefinition
  // Uso geral.
  : Identifier variableDefinitionGeneral

  // Acesso a componentes de objeto.
  | objIdentifierA Point       objIdentifierB variableDefinitionGeneral
  | objIdentifierA TwoTwoPoint objIdentifierB variableDefinitionGeneral

  // Acesso a elementos de variavel/array.
  | arrayAccessElements variableDefinitionGeneral
  ;

  +++++++++++++++++++++++++++++++++++++++++++++

int variable_definition_type;                   // Tipo da definição/uso da variável:
                                                //      VERBUM_VARIABLE_SIMPLE
                                                //      VERBUM_VARIABLE_OBJ_INSTANCE
                                                //      VERBUM_VARIABLE_OBJ_STATIC
                                                //      VERBUM_VARIABLE_ARRAY_ACCESS

struct {                                        // Nomes...
    string simple_name;                         // Nome da variável (uso simples).
    string object_name;                         // Nome do objeto chamado (acesso a objeto).
    string method_name;                         // Nome do método chamado (acesso a objeto).
} variable_names;

bool variable_type_conversion;                  // Especifica se há conversão de tipo.
string variable_type_conversion_name;           // Nome do tipo a ser convertido (quando há).

int variable_operation;                         // Operação da variável:
                                                //      VERBUM_VARIABLE_ATTR
                                                //      VERBUM_VARIABLE_... (Todos os Assignment Operators).

int variable_mod_operation;                     // Modo da operação:
                                                //      VERBUM_MOD_OP_SIMPLE            - atribuição simples.
                                                //      VERBUM_MOD_OP_OBJ_INSTANCE      - instanciamento de objeto (new).


*/

    return visitChildren(ctx);
}


