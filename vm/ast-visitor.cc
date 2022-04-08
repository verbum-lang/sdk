
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

void verbum_ast_visitor::prepare_data ()
{
    this->ast = this->zero_data();
    this->ast.type = VERBUM_UNKNOWN;
    this->node_block_counter = 0;
    this->node_run_counter = 0;
}

vector <verbum_ast_node> verbum_ast_visitor::get_verbum_ast ()
{
    return this->ast.nodes;
}

/*
** Importações: use.
*/
antlrcpp::Any verbum_ast_visitor::visitUseString (TParser::UseStringContext *ctx) 
{
    string content = ctx->getText().substr(1, ctx->getText().length() - 2);
    verbum_use_import verbum_use(content);
    verbum_ast_node ast_node = verbum_use.get_ast_node();
    ast.nodes.push_back(verbum_use.get_ast_node());

    return visitChildren(ctx);
}

/*
** Zera estrutura de controle.
*/
verbum_ast_node verbum_ast_visitor::zero_data ()
{
    verbum_ast_node ast;

    // VERBUM_USE
    ast.use_type                            = VERBUM_UNKNOWN;
    ast.use_module                          = "";
    ast.use_path                            = "";
    ast.use_elements.clear();
    
    // VERBUM_VARIABLE_INITIALIZATION
    ast.variable_type                       = VERBUM_UNKNOWN;
    ast.variable_settings.vfinal            = false;
    ast.variable_settings.priv              = false;
    ast.variable_settings.pro               = false;
    ast.variable_settings.pub               = false;
    ast.variable_settings.vstatic           = false;
    ast.variable_settings.simple            = false;

    // VERBUM_VARIABLE_USE_TYPES
    ast.variable_definition_type            = VERBUM_UNKNOWN;
    ast.variable_names.simple_name          = "";     
    ast.variable_names.object_name          = ""; 
    ast.variable_names.method_name          = ""; 
    ast.variable_type_conversion            = false;
    ast.variable_type_conversion_name       = "";
    ast.variable_operation                  = VERBUM_UNKNOWN;
    ast.variable_mod_operation              = VERBUM_UNKNOWN;

    // VERBUM_ACCESS_ARRAY
    ast.access_array_identifier             = "";
    ast.access_array_type.type              = VERBUM_UNKNOWN;
    
    // VERBUM_OPERATION_BLOCK
    ast.operation_type                      = VERBUM_UNKNOWN;
    ast.operation_data.type                 = VERBUM_UNKNOWN;
    ast.operation_data.type_inc_dec         = VERBUM_UNKNOWN;
    ast.operation_data.mod_inc_dec          = VERBUM_UNKNOWN;
    ast.operation_data.identifier           = "";
    ast.operation_data.integer              = "";
    ast.operation_data.floating             = "";
    ast.operation_data.function_name        = "";
    ast.operation_data.object_name          = "";
    ast.operation_data.method_name          = "";
    ast.operation_op                        = VERBUM_UNKNOWN;
    ast.operation_type_conversion           = false;
    ast.operation_type_conversion_data      = "";

    // Limpa estruturas de controle.
    ast.nodes.clear();

    return ast;
}

/*
** Variáveis: identifica se é declaração ou atribuição (uso).
*/
antlrcpp::Any verbum_ast_visitor::visitVariableModes (TParser::VariableModesContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_INITIALIZATION;

    // Atribuição.
    if (!ctx->Var())
        node.variable_type = VERBUM_VARIABLE_ATTRIBUTION;

    // Declaração.
    else {
        node.variable_type = VERBUM_VARIABLE_DECLARATION;

        if (ctx->Final())
            node.variable_settings.vfinal   = true;
        if (ctx->Static())
            node.variable_settings.vstatic  = true;

        if (ctx->methodPerm()) {
            if (ctx->methodPerm()->Pub())
                node.variable_settings.pub  = true;
            else if (ctx->methodPerm()->Priv())
                node.variable_settings.priv = true;
            else if (ctx->methodPerm()->Pro())
                node.variable_settings.pro  = true;
        }
    }
    
    this->ast = this->add_node(VERBUM_VARIABLE_INITIALIZATION, node, this->ast);

    return visitChildren(ctx);
}

/*
** Variáveis: tipo e modo de utilização.
*/
antlrcpp::Any verbum_ast_visitor::visitVariableDefinition (TParser::VariableDefinitionContext *ctx)
{
    verbum_ast_node node = zero_data();
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
    node.variable_type_conversion = false;
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

    this->ast = this->add_node(VERBUM_VARIABLE_USE_TYPES, node, this->ast);

    return visitChildren(ctx);
}

antlrcpp::Any verbum_ast_visitor::visitIfConditions(TParser::IfConditionsContext *ctx)
{
    verbum_ast_node node;

    node.type = VERBUM_CONDITIONAL_IF;
    this->ast = this->add_node(VERBUM_CONDITIONAL_IF, node, this->ast);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Adiciona node no respectivo nível de hierarquia.
*/
verbum_ast_node verbum_ast_visitor::add_node (int type, verbum_ast_node source, verbum_ast_node destination)
{
    this->node_run_counter = 0;
    return this->add_node_internal(type, source, destination);
}

verbum_ast_node verbum_ast_visitor::add_node_internal (int type, verbum_ast_node source, verbum_ast_node destination)
{
    int last = destination.nodes.size() - 1;
    if (last < 0)
        last = 0;
        
    // Nodes de declaração de inicialização de variáveis.
    if (type == VERBUM_VARIABLE_INITIALIZATION ||
        type == VERBUM_CONDITIONAL_IF           )
    {
        if (this->node_run_counter == this->node_block_counter) 
            destination.nodes.push_back(source);
        else {
            this->node_run_counter++;

            if (destination.nodes.size() > 0) {
                verbum_ast_node node = this->add_node_internal(type, source, 
                    destination.nodes[ last ]
                );

                destination.nodes[ last ] = node;
            }
        }
    }

    // Nodes dos tipos e modos de utilização das variáveis.
    else if (type == VERBUM_VARIABLE_USE_TYPES) {
        if (this->node_run_counter == this->node_block_counter) 
            destination.nodes[ destination.nodes.size()-1 ].nodes.push_back(source);
        else {
            this->node_run_counter++;

            if (destination.nodes.size() > 0) {
                verbum_ast_node node = this->add_node_internal(type, source, 
                    destination.nodes[ last ]
                );

                destination.nodes[ last ] = node;
            }
        }
    }

    return destination;
}


