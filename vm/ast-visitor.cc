
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
** Adiciona node no respectivo nível de hierarquia.
*/
verbum_ast_node verbum_ast_visitor::add_node (int type, verbum_ast_node source, verbum_ast_node destination)
{
    this->node_run_counter = 0;
    return this->add_node_internal(type, source, destination);
}

verbum_ast_node verbum_ast_visitor::add_node_internal (int type, verbum_ast_node source, verbum_ast_node destination)
{
    // Nodes de declaração de inicialização de variáveis.
    if (type == VERBUM_VARIABLE_INITIALIZATION) { 
        if (this->node_run_counter == this->node_block_counter) 
            destination.nodes.push_back(source);
        else {
            this->node_run_counter++;

            if (destination.nodes.size() > 0) {
                verbum_ast_node node = this->add_node_internal(type, source, destination.nodes[
                    destination.nodes.size() - 1
                ]);

                destination.nodes[ destination.nodes.size() - 1 ] = node;
            }
        }
    }

    return destination;
}


