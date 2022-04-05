
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

    this->variable.nodes.clear();
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

    // Verifica se há conversão de tipo.
    if (ctx->variableDefinitionGeneral()->TypeSpec()) {
        node.variable_type_conversion = true;
        node.variable_type_conversion_name = ctx->variableDefinitionGeneral()->TypeSpec()->getText();
    }

    // Tipo da atribuição.
    if (ctx->variableDefinitionGeneral()->Attr())
        node.variable_operation = VERBUM_OPERATOR_ATTR;
    else {
        string op = ctx->variableDefinitionGeneral()->AssignmentOperator()->getText();

        if (op.compare("+=") == 0)
            node.variable_operation = VERBUM_OPERATOR_ADD_EQUAL;
        else if (op.compare("-=") == 0)
            node.variable_operation = VERBUM_OPERATOR_SUB_EQUAL;
        else if (op.compare("*=") == 0)
            node.variable_operation = VERBUM_OPERATOR_MUL_EQUAL;
        else if (op.compare("/=") == 0)
            node.variable_operation = VERBUM_OPERATOR_DIV_EQUAL;
        else if (op.compare("%=") == 0)
            node.variable_operation = VERBUM_OPERATOR_PERC_EQUAL;
        else if (op.compare(">")  == 0)
            node.variable_operation = VERBUM_OPERATOR_MAJOR;
        else if (op.compare("<")  == 0)
            node.variable_operation = VERBUM_OPERATOR_MINOR;
        else if (op.compare(">=") == 0)
            node.variable_operation = VERBUM_OPERATOR_MAJOR_EQUAL;
        else if (op.compare("<=") == 0)
            node.variable_operation = VERBUM_OPERATOR_MINOR_EQUAL;
        else if (op.compare("&&") == 0)
            node.variable_operation = VERBUM_OPERATOR_AND;
        else if (op.compare("==") == 0)
            node.variable_operation = VERBUM_OPERATOR_EQUAL;
        else if (op.compare("!=") == 0)
            node.variable_operation = VERBUM_OPERATOR_NOT_EQUAL;
        else if (op.compare("!")  == 0)
            node.variable_operation = VERBUM_OPERATOR_NOT;
    }

    // Verifica se há instanciamento de objeto.
    if (ctx->variableDefinitionGeneral()->New())
        node.variable_mod_operation = VERBUM_MOD_OP_OBJ_INSTANCE;
    else
        node.variable_mod_operation = VERBUM_MOD_OP_SIMPLE;

    // Acessa elementos filhos.
    antlrcpp::Any result = visitChildren(ctx);
    
    // Se for acesso a elementos de array, adiciona os mesmo como nodes.
    if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS)
        node.nodes.push_back(array_elements);

    this->variable.nodes.push_back(node);

    return result;
}


