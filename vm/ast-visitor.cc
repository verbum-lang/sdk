
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
    this->ast.type = VERBUM_IESUS_HOMINUM_SALVATOR;
    this->node_block_counter = 0;
    this->node_run_counter = 0;

    #ifdef DBG
        cout << "ast-visitor.cc :: prepare_data() -> OK\n";
    #endif
}

vector <verbum_ast_node> verbum_ast_visitor::get_verbum_ast ()
{
    #ifdef DBG
        cout << "ast-visitor.cc :: get_verbum_ast() -> call\n";
    #endif

    return this->ast.nodes;
}

/*
** Adiciona node no respectivo nível hierárquico.
*/
void verbum_ast_visitor::add_node (verbum_ast_node source)
{
    this->node_run_counter = 0;
    
    this->add_node_internal_ptr(source, &this->ast);
    //this->ast = this->add_node_internal_copy(source, this->ast);
}

void verbum_ast_visitor::add_node_internal_ptr (verbum_ast_node source, verbum_ast_node *destination)
{
    int last = destination->nodes.size() - 1;
    if (last < 0)
        last = 0;

    if (this->node_run_counter == this->node_block_counter) 
        destination->nodes.push_back(source);
    else {
        this->node_run_counter++;

        if (destination->nodes.size() > 0) {
            this->add_node_internal_ptr(source, &destination->nodes[ last ] );
        }
    }
}

verbum_ast_node verbum_ast_visitor::add_node_internal_copy (verbum_ast_node source, verbum_ast_node destination)
{
    int last = destination.nodes.size() - 1;
    if (last < 0)
        last = 0;
    
    if (this->node_run_counter == this->node_block_counter) 
        destination.nodes.push_back(source);
    else {
        this->node_run_counter++;

        if (destination.nodes.size() > 0) {
            verbum_ast_node node = this->add_node_internal_copy(source, destination.nodes[ last ] );
            destination.nodes[ last ] = node;
        }
    }

    return destination;
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
    ast.access_array_type.type_inc_dec      = VERBUM_UNKNOWN;
    ast.access_array_type.mod_inc_dec       = VERBUM_UNKNOWN;

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

    // VERBUM_GENERAL_VALUE
    ast.general_value_data.type             = VERBUM_UNKNOWN;
    ast.general_value_data.identifier       = "";
    ast.general_value_data.vstring          = "";
    ast.general_value_data.integer          = "";
    ast.general_value_data.floating         = "";
    ast.general_value_data.function_name    = "";
    ast.general_value_data.object_name      = "";
    ast.general_value_data.method_name      = "";
    ast.general_value_type_conversion       = false;
    ast.general_value_type_conversion_data  = "";
    
    // VERBUM_FUNCTION_CALL
    ast.function_call.type                  = false;
    ast.function_call.function_name         = "";
    ast.function_call.object_name           = "";
    ast.function_call.method_name           = "";
    
    // VERBUM_CONDITIONAL_*
    ast.conditional_type_conversion         = false;
    ast.conditional_type_conversion_data    = "";
    ast.conditional_operator                = VERBUM_UNKNOWN;

    // VERBUM_EXPRESSION_ATTR_FUNC_CALL
    ast.attr_function_call_operator         = VERBUM_UNKNOWN;

    // VERBUM_LOOP
    ast.loop_type                           = VERBUM_UNKNOWN;
    ast.loop_block_type                     = VERBUM_UNKNOWN;

    // VERBUM_FUNCTION_*
    ast.function_declaration.type           = VERBUM_UNKNOWN; 
    ast.function_declaration.identifier     = ""; 
    ast.function_declaration.ret_found      = false; 
    ast.function_declaration.ret_data       = "";
    ast.function_declaration.anonymous      = false;
    ast.function_param_item                 = "";
    ast.function_param_type                 = "";

    // VERBUM_OOP_*
    ast.interface.identifier_a              = "";
    ast.interface.identifier_b              = "";
    ast.interface.extends                   = false;
    ast.abstract.identifier_a               = "";
    ast.abstract.identifier_b               = "";
    ast.abstract.extends                    = false;
    ast.vclass.identifier_a                 = "";
    ast.vclass.identifier_b                 = "";
    ast.vclass.identifier_c                 = "";
    ast.vclass.extends                      = false;
    ast.vclass.implements                   = false;
    ast.vclass.vfinal                       = false;

    // VERBUM_ITEMS_VISIBILITY
    ast.item_visibility                     = VERBUM_UNKNOWN;

    // VERBUM_TRY_*
    ast.catch_identifier                    = "";

    // Limpa estruturas de controle.
    ast.nodes.clear();

    return ast;
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
** Variáveis.
*/

// Variáveis: identifica se é declaração ou atribuição (uso).
antlrcpp::Any verbum_ast_visitor::visitBlockVariable (TParser::BlockVariableContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_INITIALIZATION;

    // Atribuição.
    if (!ctx->Var())
        node.variable_type = VERBUM_VARIABLE_ATTRIBUTION;

    // Declaração.
    else 
        node.variable_type = VERBUM_VARIABLE_DECLARATION;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

antlrcpp::Any verbum_ast_visitor::visitVariableItem (TParser::VariableItemContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_USE_TYPES;

    // Nome da variável (tipo simples).
    node.variable_definition_type = VERBUM_VARIABLE_SIMPLE;
    node.variable_names.simple_name = 
        ctx->variablePrefixModes()->identifier()->getText();

    // Verifica se há conversão de tipo.
    if (ctx->variablePrefixModes()->TypeSpec()) {
        node.variable_type_conversion = true;
        node.variable_type_conversion_name = 
            ctx->variablePrefixModes()->TypeSpec()->getText();
    }

    // Verifica se há instanciamento de objeto (new), ou aguardo de função async.
    if (ctx->New()) 
        node.variable_mod_operation = VERBUM_MOD_OP_OBJ_INSTANCE;
    else if (ctx->Await())
        node.variable_mod_operation = VERBUM_MOD_OP_AWAIT;
    else
        node.variable_mod_operation = VERBUM_MOD_OP_SIMPLE;

    // Analisa operador (atribuição, atribuição com valor, etc).
    if (ctx->variablePrefixModes()->Attr())
        node.variable_operation = VERBUM_OPERATOR_ATTR;
    else {
        string op = ctx->variablePrefixModes()->AssignmentOperator()->getText();

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

    this->add_node(node);
    return visitChildren(ctx);
}

/*
** Controle dos valores gerais.
*/
antlrcpp::Any verbum_ast_visitor::visitGeneralValue (TParser::GeneralValueContext *ctx) 
{
    antlrcpp::Any result;
    bool block = false;
    verbum_ast_node node = this->zero_data();

    node.type = VERBUM_GENERAL_VALUE;
    node.general_value_type_conversion = false;

    if (ctx->TypeSpec()) {
        node.general_value_type_conversion = true;
        node.general_value_type_conversion_data = ctx->TypeSpec()->getText();
    }

    // Dados simples.
    if (ctx->identifier()) {
        node.general_value_data.type = VERBUM_DATA_IDENTIFIER;
        node.general_value_data.identifier = ctx->identifier()->getText();
    } else if (ctx->String()) {
        node.general_value_data.type = VERBUM_DATA_STRING;
        node.general_value_data.vstring = ctx->String()->getText();
    } else if (ctx->Integer()) {
        node.general_value_data.type = VERBUM_DATA_INTEGER;
        node.general_value_data.integer = ctx->Integer()->getText();
    } else if (ctx->Float()) {
        node.general_value_data.type = VERBUM_DATA_FLOAT;
        node.general_value_data.floating = ctx->Float()->getText();
    }

    /*
    ** Dados complexos.
    */

    // Bloco de operações.
    // else if (ctx->operationElements()) {
    //     node.general_value_data.type = VERBUM_DATA_OPERATION_BLOCK;
    //     block = true;
    // }

    // Chamadas a funções.
    else if (ctx->functionCall()) {
        block = true;

        // Método de objeto instanciado.
        if (ctx->functionCall()->functionCallPrefix()->Point()) {
            node.general_value_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->functionCallPrefix()->identifier()->getText();

            if (ctx->functionCall()->identifier())
                node.general_value_data.method_name = ctx->functionCall()->identifier()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->functionCallPrefix()->TwoTwoPoint()) {
            node.general_value_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->functionCallPrefix()->identifier()->getText();
            
            if (ctx->functionCall()->identifier())
                node.general_value_data.method_name = ctx->functionCall()->identifier()->getText();
        }

        // Cascading method.
        // else if (ctx->functionCall()->methodCascadingModes()) {
        //     node.general_value_data.type = VERBUM_FUNCTION_CALL_CASCADING;
        //     node.general_value_data.function_name = 
        //         ctx->functionCall()->methodCascadingModes()->Identifier()->getText();
        // }
        
        // Chamada a função, a partir de acesso a elementos de array.
        // else if (ctx->functionCall()->arrayAccessElements()) {
        //     node.general_value_data.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS;
        // }

        // Função comum.
        else {
            node.general_value_data.type = VERBUM_DATA_FUNCTION_CALL;
            node.general_value_data.function_name = 
                ctx->functionCall()->functionCallPrefix()->identifier()->getText();
        }
    }

    // Array indexado.
    // else if (ctx->indexArray()) {
    //     node.general_value_data.type = VERBUM_DATA_INDEX_ARRAY_BLOCK;
    //     block = true;
    // }
    
    // // Array associativo.
    // else if (ctx->associativeArray()) {
    //     node.general_value_data.type = VERBUM_DATA_ASSOC_ARRAY_BLOCK;
    //     block = true;
    // }

    this->add_node(node);

    if (block) {
      this->node_block_counter++;
      result = visitChildren(ctx);
      this->node_block_counter--;
    } else
      result = visitChildren(ctx);

    return result;
}


