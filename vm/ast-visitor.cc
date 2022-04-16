
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
}

vector <verbum_ast_node> verbum_ast_visitor::get_verbum_ast ()
{
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
** Live tokens: tokens especiais.
*/
antlrcpp::Any verbum_ast_visitor::visitLiveToken (TParser::LiveTokenContext *ctx) 
{
    verbum_ast_node node = this->zero_data();

    if (ctx->breakFor())
        node.type = VERBUM_TOKEN_BREAK;
    else if (ctx->nextFor())
        node.type = VERBUM_TOKEN_NEXT;

    if (!ctx->Newline())
        this->add_node(node);

    return visitChildren(ctx);
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
    else 
        node.variable_type = VERBUM_VARIABLE_DECLARATION;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Variáveis: tipo e modo de utilização.
*/
antlrcpp::Any verbum_ast_visitor::visitVariableDefinition (TParser::VariableDefinitionContext *ctx)
{
    verbum_ast_node node = this->zero_data();
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
    else if (ctx->variableDefinitionGeneral()->Await())
        node.variable_mod_operation = VERBUM_MOD_OP_AWAIT;
    else
        node.variable_mod_operation = VERBUM_MOD_OP_SIMPLE;

    this->add_node(node);

    // Quando é acesso a elemento de array, adiciona-o como node filho.
    if (ctx->arrayAccessElements()) {
        this->node_block_counter++;
        antlrcpp::Any result = visitChildren(ctx);
        this->node_block_counter--;

        return result;
    }

    return visitChildren(ctx);
}

/*
** Controle de acesso a elementos de array.
*/
antlrcpp::Any verbum_ast_visitor::visitArrayAccessElementsItems (TParser::ArrayAccessElementsItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ACCESS_ARRAY;

    // Nome do elemento de acesso.
    node.access_array_identifier = ctx->Identifier()->getText();

    // Modo do acesso.
    if (ctx->Identifier() && ctx->accessBlockAr() && ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT;
    else if (ctx->Identifier() && ctx->accessBlockAr() && !ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_BLOCK;
    else if (ctx->Identifier() && !ctx->accessBlockAr() && ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT;
    else if (ctx->Identifier() && !ctx->accessBlockAr() && !ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER;
    
    // Processa incremento/decremento.
    node.access_array_type.mod_inc_dec  = VERBUM_UNKNOWN;
    node.access_array_type.type_inc_dec = VERBUM_UNKNOWN;

    // Processa pré-incremento/decremento.
    if (ctx->firstIncDec()) {
        string item = ctx->firstIncDec()->getText();
        node.access_array_type.mod_inc_dec = VERBUM_OP_INCDEC_PRE;

        if (item.compare("++") == 0)
            node.access_array_type.type_inc_dec = VERBUM_OP_TYPE_INC;
        else if (item.compare("--") == 0)
            node.access_array_type.type_inc_dec = VERBUM_OP_TYPE_DEC;
    }

    // Processa pós-incremento/decremento.
    if (ctx->lastIncDec()) {
        string item = ctx->lastIncDec()->getText();
        node.access_array_type.mod_inc_dec = VERBUM_OP_INCDEC_POS;

        if (item.compare("++") == 0)
            node.access_array_type.type_inc_dec = VERBUM_OP_TYPE_INC;
        else if (item.compare("--") == 0)
            node.access_array_type.type_inc_dec = VERBUM_OP_TYPE_DEC;
    }
    
    this->add_node(node);

    // Caso seja bloco de acesso, torna-o node filho do membro em questão.
    if (node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT ||
        node.access_array_type.type == VERBUM_ACCESS_ARRAY_TYPE_BLOCK        )
    {
        this->node_block_counter++;
        antlrcpp::Any result = visitChildren(ctx);
        this->node_block_counter--;

        return result;
    }

    return visitChildren(ctx);
}

/*
** Controle dos blocos isolados.
*/
antlrcpp::Any verbum_ast_visitor::visitArrayIndexAccess (TParser::ArrayIndexAccessContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ACCESS_ARRAY_INDEX_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Controle dos blocos de operações.
*/
antlrcpp::Any verbum_ast_visitor::visitOperationValue (TParser::OperationValueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    antlrcpp::Any result;
    bool block = false;

    node.type = VERBUM_OPERATION_BLOCK;
    node.operation_type_conversion = false;

    if (ctx->TypeSpec()) {
        node.operation_type_conversion = true;
        node.operation_type_conversion_data = ctx->TypeSpec()->getText();
    }

    // Bloco de operações.
    if (ctx->operationBlock()) {
        node.operation_type = VERBUM_OPERATION_TYPE_BLOCK;
        block = true;

        // Operador aritmético relacionado à operação.
        if (ctx->ArithmeticOperator()) {
            string op = ctx->ArithmeticOperator()->getText();
            node.operation_op = this->check_block_arithmeic_operator(op);
        }

        // Adiciona no array de controle.
        this->add_node(node);

        // Entra em nodes (filhos).
        this->node_block_counter++;
        result = visitChildren(ctx);
        this->node_block_counter--;
    }
    
    // Expressões simples.
    else {
        node.operation_type = VERBUM_OPERATION_TYPE_SIMPLE;

        // Identificadores.
        if (ctx->Identifier()) {
            string currentData = ctx->Identifier()->getText();
            node.operation_data.type = VERBUM_DATA_IDENTIFIER;
            node.operation_data.identifier = currentData;

            node.operation_data.mod_inc_dec  = VERBUM_UNKNOWN;
            node.operation_data.type_inc_dec = VERBUM_UNKNOWN;

            // Processa pré-incremento/decremento.
            if (ctx->firstIncDec()) {
                string item = ctx->firstIncDec()->getText();
                node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_PRE;

                if (item.compare("++") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_INC;
                else if (item.compare("--") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_DEC;
            }

            // Processa pós-incremento/decremento.
            if (ctx->lastIncDec()) {
                string item = ctx->lastIncDec()->getText();
                node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_POS;

                if (item.compare("++") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_INC;
                else if (item.compare("--") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_DEC;
            }
        }
    
        // Números inteiros.
        else if (ctx->Integer()) {
            string currentData = ctx->Integer()->getText();
            node.operation_data.type = VERBUM_DATA_INTEGER;
            node.operation_data.integer = currentData;
        }
    
        // Números de ponto flutuante.
        else if (ctx->Float()) {
            string currentData = ctx->Float()->getText();
            node.operation_data.type = VERBUM_DATA_FLOAT;
            node.operation_data.floating = currentData;
        }

        // Chamadas a funções e méthod.
        else if (ctx->functionCall()) {
            node.operation_type = VERBUM_OPERATION_FUNC_BLOCK;

            // Método de objeto instanciado.
            if (ctx->functionCall()->Point()) {
                node.operation_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
                node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
                node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
            }

            // Método static.
            else if (ctx->functionCall()->TwoTwoPoint()) {
                node.operation_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
                node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
                node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
            }

            // Função comum.
            else {
                node.operation_data.type = VERBUM_DATA_FUNCTION_CALL;
                node.operation_data.function_name = ctx->functionCall()->Identifier()->getText();
            }


            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            // Adiciona no array de controle.
            this->add_node(node);

            // Entra em nodes (filhos).
            this->node_block_counter++;
            result = visitChildren(ctx);
            this->node_block_counter--;
            
            return result;
        }

        // Acesso a elemento de array.
        else if (ctx->arrayAccessElements()) {
            node.operation_type = VERBUM_ACCESS_ARRAY_OP_ELEMENT;

            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            this->add_node(node);

            this->node_block_counter++;
            result = visitChildren(ctx);
            this->node_block_counter--;
            
            return result;
        }

        // Operador aritmético relacionado à operação.
        if (ctx->ArithmeticOperator()) {
            string op = ctx->ArithmeticOperator()->getText();
            node.operation_op = this->check_block_arithmeic_operator(op);
        }

        // Adiciona no array de controle.
        this->add_node(node);
    }

    if (!block)
        result = visitChildren(ctx);

    return result;
}

/*
** Verifica operador aritmético utilizado no bloco de operações.
*/
int verbum_ast_visitor::check_block_arithmeic_operator (string op)
{
    int result = VERBUM_UNKNOWN;

    if (op.compare("+") == 0)
        result = VERBUM_OPERATOR_ADD;
    else if (op.compare("-") == 0)
        result = VERBUM_OPERATOR_SUB;
    else if (op.compare("*") == 0)
        result = VERBUM_OPERATOR_MUL;
    else if (op.compare("/") == 0)
        result = VERBUM_OPERATOR_DIV;
    else if (op.compare("%") == 0)
        result = VERBUM_OPERATOR_PERC;

    return result;
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
    if (ctx->Identifier()) {
        node.general_value_data.type = VERBUM_DATA_IDENTIFIER;
        node.general_value_data.identifier = ctx->Identifier()->getText();
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
    else if (ctx->operationElements()) {
        node.general_value_data.type = VERBUM_DATA_OPERATION_BLOCK;
        block = true;
    }

    // Chamadas a funções.
    else if (ctx->functionCall()) {
        block = true;

        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
            node.general_value_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->Identifier()->getText();
            node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
            node.general_value_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->Identifier()->getText();
            node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Cascading method.
        else if (ctx->functionCall()->methodCascadingModes()) {
            node.general_value_data.type = VERBUM_FUNCTION_CALL_CASCADING;
            node.general_value_data.function_name = 
                ctx->functionCall()->methodCascadingModes()->Identifier()->getText();
        }
        
        // Chamada a função, a partir de acesso a elementos de array.
        else if (ctx->functionCall()->arrayAccessElements()) {
            node.general_value_data.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS;
        }

        // Função comum.
        else {
            node.general_value_data.type = VERBUM_DATA_FUNCTION_CALL;
            node.general_value_data.function_name = ctx->functionCall()->Identifier()->getText();
        }
    }

    // Array indexado.
    else if (ctx->indexArray()) {
        node.general_value_data.type = VERBUM_DATA_INDEX_ARRAY_BLOCK;
        block = true;
    }
    
    // Array associativo.
    else if (ctx->associativeArray()) {
        node.general_value_data.type = VERBUM_DATA_ASSOC_ARRAY_BLOCK;
        block = true;
    }
    
    this->add_node(node);

    if (block) {
      this->node_block_counter++;
      result = visitChildren(ctx);
      this->node_block_counter--;
    } else
      result = visitChildren(ctx);

    return result;
}

/*
** Array associativo.
*/
antlrcpp::Any verbum_ast_visitor::visitAssociativeArrayElements (TParser::AssociativeArrayElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type = VERBUM_GENERAL_VALUE;
    node.general_value_type_conversion = false;
    node.general_value_data.type = VERBUM_DATA_ASSOC_ARRAY_ELEMENT;
    node.general_value_data.identifier = ctx->Identifier()->getText();
    
    this->add_node(node);

    return visitChildren(ctx);
}

/*
** Chamad a função.
*/

// Uso geral.
antlrcpp::Any verbum_ast_visitor::visitCallingFunction (TParser::CallingFunctionContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_CALL;

    // Método de objeto instanciado.
    if (ctx->functionCall()->Point()) {
        node.function_call.type = VERBUM_FUNCTION_CALL_INSTANCE;
        node.function_call.object_name = ctx->functionCall()->Identifier()->getText();
        node.function_call.method_name = ctx->functionCall()->identifierB()->getText();
    }

    // Método static.
    else if (ctx->functionCall()->TwoTwoPoint()) {
        node.function_call.type = VERBUM_FUNCTION_CALL_STATIC;
        node.function_call.object_name = ctx->functionCall()->Identifier()->getText();
        node.function_call.method_name = ctx->functionCall()->identifierB()->getText();
    }

    // Cascading method.
    else if (ctx->functionCall()->methodCascadingModes()) {
        node.function_call.type = VERBUM_FUNCTION_CALL_CASCADING;
        node.function_call.function_name = 
            ctx->functionCall()->methodCascadingModes()->Identifier()->getText();
    }

    // Chamada a função, a partir de acesso a elementos de array.
    else if (ctx->functionCall()->arrayAccessElements()) {
        node.function_call.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS;
    }

    // Função comum.
    else {
        node.function_call.type = VERBUM_FUNCTION_CALL_SIMPLE;
        node.function_call.function_name = ctx->functionCall()->Identifier()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Chamda a funções a partir de acesso a elemento de array.
antlrcpp::Any verbum_ast_visitor::visitFunctionCallParamAC (TParser::FunctionCallParamACContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result; 
}

// Funções do cascading method.
antlrcpp::Any verbum_ast_visitor::visitFunctionCallCascadingItem (TParser::FunctionCallCascadingItemContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_CALL_CASCADING_METHOD;

    // Chamada a função/método.
    if (ctx->identifierB())
        node.function_call.function_name = ctx->identifierB()->Identifier()->getText();
    else if (ctx->Identifier())
        node.function_call.method_name = ctx->Identifier()->getText();

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result; 
}

/*
** Condicionais.
*/

// Bloco completo do condicional.
antlrcpp::Any verbum_ast_visitor::visitConditionalExpressionStructBlock (TParser::ConditionalExpressionStructBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_STRUCT_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco da expressão condicional.
antlrcpp::Any verbum_ast_visitor::visitConditionalExpressionItems (TParser::ConditionalExpressionItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_EXPRESSION_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código do condicional.
antlrcpp::Any verbum_ast_visitor::visitConditionalBlockElements (TParser::ConditionalBlockElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_CODE_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// If.
antlrcpp::Any verbum_ast_visitor::visitIfElementUnique (TParser::IfElementUniqueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_IF;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Elif.
antlrcpp::Any verbum_ast_visitor::visitElifElementUnique (TParser::ElifElementUniqueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_ELIF;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Else.
antlrcpp::Any verbum_ast_visitor::visitElseElementUnique (TParser::ElseElementUniqueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_ELSE;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Controle dos valores utilizado nas expressões.
*/

// Uso do 'not' no bloco de expressão.
antlrcpp::Any verbum_ast_visitor::visitConditionExpBlock (TParser::ConditionExpBlockContext *ctx)
{
    if (ctx->Not()) {
        verbum_ast_node node = this->zero_data();
        
        node.type = VERBUM_CONDITIONAL_EXPR_NOT;
        this->add_node(node);

        antlrcpp::Any result = visitChildren(ctx);

        return result;
    }

    return visitChildren(ctx);
}

// Uso do 'not' em valor comum (identifier, inteiros, etc).
antlrcpp::Any verbum_ast_visitor::visitConditionExpValue (TParser::ConditionExpValueContext *ctx)
{
    if (ctx->Not()) {
        verbum_ast_node node = this->zero_data();
        
        node.type = VERBUM_CONDITIONAL_EXPR_NOT;
        this->add_node(node);

        antlrcpp::Any result = visitChildren(ctx);

        return result;
    }

    return visitChildren(ctx);
}

// Detecta blocos condicionais (trata os blocos isoladamente).
antlrcpp::Any verbum_ast_visitor::visitConditionExpBlockItemValue (TParser::ConditionExpBlockItemValueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_CONDITIONAL_EXPR_BLOCK_OPEN;

    // Verifica se há conversão de tipo.
    node.conditional_type_conversion = false;
    if (ctx->TypeSpec()) {
        node.conditional_type_conversion = true;
        node.conditional_type_conversion_data = ctx->TypeSpec()->getText();
    }

    // Verifica se há operador utilizado com o bloco da expressão.
    if (ctx->AssignmentOperator()) {
        string op = ctx->AssignmentOperator()->getText();

        if (op.compare("+=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_ADD_EQUAL;
        else if (op.compare("-=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_SUB_EQUAL;
        else if (op.compare("*=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_MUL_EQUAL;
        else if (op.compare("/=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_DIV_EQUAL;
        else if (op.compare("%=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_PERC_EQUAL;
        else if (op.compare(">")  == 0)
            node.conditional_operator = VERBUM_OPERATOR_MAJOR;
        else if (op.compare("<")  == 0)
            node.conditional_operator = VERBUM_OPERATOR_MINOR;
        else if (op.compare(">=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_MAJOR_EQUAL;
        else if (op.compare("<=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_MINOR_EQUAL;
        else if (op.compare("&&") == 0)
            node.conditional_operator = VERBUM_OPERATOR_AND;
        else if (op.compare("==") == 0)
            node.conditional_operator = VERBUM_OPERATOR_EQUAL;
        else if (op.compare("!=") == 0)
            node.conditional_operator = VERBUM_OPERATOR_NOT_EQUAL;
        else if (op.compare("!")  == 0)
            node.conditional_operator = VERBUM_OPERATOR_NOT;
    }
    
    this->add_node(node);
    
    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Atribuição com chamada a função.
*/

// Bloco inicial.
antlrcpp::Any verbum_ast_visitor::visitFunctionCallAndAttr (TParser::FunctionCallAndAttrContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_EXPRESSION_ATTR_FUNC_CALL;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco do destinatário (quem vai receber a atribuição).
antlrcpp::Any verbum_ast_visitor::visitIdentifierAttrFn (TParser::IdentifierAttrFnContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_EXPRESSION_ATTR_FUNC_CALL_DESTINATION;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco da chamada da função.
antlrcpp::Any verbum_ast_visitor::visitFunctionCallAttrFn (TParser::FunctionCallAttrFnContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type = VERBUM_EXPRESSION_ATTR_FUNC_CALL_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Chamda de função propriamente dita.
antlrcpp::Any verbum_ast_visitor::visitFunctionCallAttrFnItem (TParser::FunctionCallAttrFnItemContext *ctx)
{
    if (ctx->functionCall()) {
        verbum_ast_node node = this->zero_data();
        node.type = VERBUM_OPERATION_BLOCK;
        node.operation_type = VERBUM_OPERATION_FUNC_BLOCK;

        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
            node.operation_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
            node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
            node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
            node.operation_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
            node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
            node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Função comum.
        else {
            node.operation_data.type = VERBUM_DATA_FUNCTION_CALL;
            node.operation_data.function_name = ctx->functionCall()->Identifier()->getText();
        }


        // Operador aritmético relacionado à operação.
        if (ctx->ArithmeticOperator()) {
            string op = ctx->ArithmeticOperator()->getText();
            node.operation_op = this->check_block_arithmeic_operator(op);
        }

        // Operador relacional.
        if (ctx->AssignmentOperator()) {
            string op = ctx->AssignmentOperator()->getText();

            if (op.compare("+=") == 0)
                node.operation_op = VERBUM_OPERATOR_ADD_EQUAL;
            else if (op.compare("-=") == 0)
                node.operation_op = VERBUM_OPERATOR_SUB_EQUAL;
            else if (op.compare("*=") == 0)
                node.operation_op = VERBUM_OPERATOR_MUL_EQUAL;
            else if (op.compare("/=") == 0)
                node.operation_op = VERBUM_OPERATOR_DIV_EQUAL;
            else if (op.compare("%=") == 0)
                node.operation_op = VERBUM_OPERATOR_PERC_EQUAL;
            else if (op.compare(">")  == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR;
            else if (op.compare("<")  == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR;
            else if (op.compare(">=") == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR_EQUAL;
            else if (op.compare("<=") == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR_EQUAL;
            else if (op.compare("&&") == 0)
                node.operation_op = VERBUM_OPERATOR_AND;
            else if (op.compare("==") == 0)
                node.operation_op = VERBUM_OPERATOR_EQUAL;
            else if (op.compare("!=") == 0)
                node.operation_op = VERBUM_OPERATOR_NOT_EQUAL;
            else if (op.compare("!")  == 0)
                node.operation_op = VERBUM_OPERATOR_NOT;
        }

        // Adiciona no array de controle.
        this->add_node(node);

        // Entra em nodes (filhos).
        this->node_block_counter++;
        antlrcpp::Any result = visitChildren(ctx);
        this->node_block_counter--;
        
        return result;
    }

    return visitChildren(ctx);
}

/*
** Valores padrões da expressão condicional.
*/
antlrcpp::Any verbum_ast_visitor::visitConditionalExpValue (TParser::ConditionalExpValueContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    antlrcpp::Any result;
    bool block = false;

    node.type = VERBUM_OPERATION_BLOCK;
    node.operation_type_conversion = false;

    if (ctx->TypeSpec()) {
        node.operation_type_conversion = true;
        node.operation_type_conversion_data = ctx->TypeSpec()->getText();
    }

    // Bloco de operações.
    if (ctx->operationBlock()) {
        node.operation_type = VERBUM_OPERATION_TYPE_BLOCK;
        block = true;

        // Operador aritmético relacionado à operação.
        if (ctx->ArithmeticOperator()) {
            string op = ctx->ArithmeticOperator()->getText();
            node.operation_op = this->check_block_arithmeic_operator(op);
        }
        
        // Operador relacional.
        if (ctx->AssignmentOperator()) {
            string op = ctx->AssignmentOperator()->getText();

            if (op.compare("+=") == 0)
                node.operation_op = VERBUM_OPERATOR_ADD_EQUAL;
            else if (op.compare("-=") == 0)
                node.operation_op = VERBUM_OPERATOR_SUB_EQUAL;
            else if (op.compare("*=") == 0)
                node.operation_op = VERBUM_OPERATOR_MUL_EQUAL;
            else if (op.compare("/=") == 0)
                node.operation_op = VERBUM_OPERATOR_DIV_EQUAL;
            else if (op.compare("%=") == 0)
                node.operation_op = VERBUM_OPERATOR_PERC_EQUAL;
            else if (op.compare(">")  == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR;
            else if (op.compare("<")  == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR;
            else if (op.compare(">=") == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR_EQUAL;
            else if (op.compare("<=") == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR_EQUAL;
            else if (op.compare("&&") == 0)
                node.operation_op = VERBUM_OPERATOR_AND;
            else if (op.compare("==") == 0)
                node.operation_op = VERBUM_OPERATOR_EQUAL;
            else if (op.compare("!=") == 0)
                node.operation_op = VERBUM_OPERATOR_NOT_EQUAL;
            else if (op.compare("!")  == 0)
                node.operation_op = VERBUM_OPERATOR_NOT;
        }

        // Adiciona no array de controle.
        this->add_node(node);

        // Entra em nodes (filhos).
        this->node_block_counter++;
        result = visitChildren(ctx);
        this->node_block_counter--;
    }

    // Expressões simples.
    else {
        node.operation_type = VERBUM_OPERATION_TYPE_SIMPLE;

        // Identificadores.
        if (ctx->Identifier())
        {
            string currentData = ctx->Identifier()->getText();
            node.operation_data.type = VERBUM_DATA_IDENTIFIER;
            node.operation_data.identifier = currentData;

            node.operation_data.mod_inc_dec  = VERBUM_UNKNOWN;
            node.operation_data.type_inc_dec = VERBUM_UNKNOWN;

            // Processa pré-incremento/decremento.
            if (ctx->firstIncDec()) {
                string item = ctx->firstIncDec()->getText();
                node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_PRE;

                if (item.compare("++") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_INC;
                else if (item.compare("--") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_DEC;
            }

            // Processa pós-incremento/decremento.
            if (ctx->lastIncDec()) {
                string item = ctx->lastIncDec()->getText();
                node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_POS;

                if (item.compare("++") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_INC;
                else if (item.compare("--") == 0)
                    node.operation_data.type_inc_dec = VERBUM_OP_TYPE_DEC;
            }
        }
    
        // Números inteiros.
        else if (ctx->Integer()) {
            string currentData = ctx->Integer()->getText();
            node.operation_data.type = VERBUM_DATA_INTEGER;
            node.operation_data.integer = currentData;
        }
    
        // Números de ponto flutuante.
        else if (ctx->Float()) {
            string currentData = ctx->Float()->getText();
            node.operation_data.type = VERBUM_DATA_FLOAT;
            node.operation_data.floating = currentData;
        }

        // Chamadas a funções e méthod.
        else if (ctx->functionCall()) {
            node.operation_type = VERBUM_OPERATION_FUNC_BLOCK;

            // Método de objeto instanciado.
            if (ctx->functionCall()->Point()) {
                node.operation_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
                node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
                node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
            }

            // Método static.
            else if (ctx->functionCall()->TwoTwoPoint()) {
                node.operation_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
                node.operation_data.object_name = ctx->functionCall()->Identifier()->getText();
                node.operation_data.method_name = ctx->functionCall()->identifierB()->getText();
            }

            // Função comum.
            else {
                node.operation_data.type = VERBUM_DATA_FUNCTION_CALL;
                node.operation_data.function_name = ctx->functionCall()->Identifier()->getText();
            }


            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            // Operador relacional.
            if (ctx->AssignmentOperator()) {
                string op = ctx->AssignmentOperator()->getText();

                if (op.compare("+=") == 0)
                    node.operation_op = VERBUM_OPERATOR_ADD_EQUAL;
                else if (op.compare("-=") == 0)
                    node.operation_op = VERBUM_OPERATOR_SUB_EQUAL;
                else if (op.compare("*=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MUL_EQUAL;
                else if (op.compare("/=") == 0)
                    node.operation_op = VERBUM_OPERATOR_DIV_EQUAL;
                else if (op.compare("%=") == 0)
                    node.operation_op = VERBUM_OPERATOR_PERC_EQUAL;
                else if (op.compare(">")  == 0)
                    node.operation_op = VERBUM_OPERATOR_MAJOR;
                else if (op.compare("<")  == 0)
                    node.operation_op = VERBUM_OPERATOR_MINOR;
                else if (op.compare(">=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MAJOR_EQUAL;
                else if (op.compare("<=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MINOR_EQUAL;
                else if (op.compare("&&") == 0)
                    node.operation_op = VERBUM_OPERATOR_AND;
                else if (op.compare("==") == 0)
                    node.operation_op = VERBUM_OPERATOR_EQUAL;
                else if (op.compare("!=") == 0)
                    node.operation_op = VERBUM_OPERATOR_NOT_EQUAL;
                else if (op.compare("!")  == 0)
                    node.operation_op = VERBUM_OPERATOR_NOT;
            }

            // Adiciona no array de controle.
            this->add_node(node);

            // Entra em nodes (filhos).
            this->node_block_counter++;
            result = visitChildren(ctx);
            this->node_block_counter--;
            
            return result;
        }

        // Acesso a elemento de array.
        else if (ctx->arrayAccessElements()) {
            node.operation_type = VERBUM_ACCESS_ARRAY_OP_ELEMENT;

            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            // Operador relacional.
            if (ctx->AssignmentOperator()) {
                string op = ctx->AssignmentOperator()->getText();

                if (op.compare("+=") == 0)
                    node.operation_op = VERBUM_OPERATOR_ADD_EQUAL;
                else if (op.compare("-=") == 0)
                    node.operation_op = VERBUM_OPERATOR_SUB_EQUAL;
                else if (op.compare("*=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MUL_EQUAL;
                else if (op.compare("/=") == 0)
                    node.operation_op = VERBUM_OPERATOR_DIV_EQUAL;
                else if (op.compare("%=") == 0)
                    node.operation_op = VERBUM_OPERATOR_PERC_EQUAL;
                else if (op.compare(">")  == 0)
                    node.operation_op = VERBUM_OPERATOR_MAJOR;
                else if (op.compare("<")  == 0)
                    node.operation_op = VERBUM_OPERATOR_MINOR;
                else if (op.compare(">=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MAJOR_EQUAL;
                else if (op.compare("<=") == 0)
                    node.operation_op = VERBUM_OPERATOR_MINOR_EQUAL;
                else if (op.compare("&&") == 0)
                    node.operation_op = VERBUM_OPERATOR_AND;
                else if (op.compare("==") == 0)
                    node.operation_op = VERBUM_OPERATOR_EQUAL;
                else if (op.compare("!=") == 0)
                    node.operation_op = VERBUM_OPERATOR_NOT_EQUAL;
                else if (op.compare("!")  == 0)
                    node.operation_op = VERBUM_OPERATOR_NOT;
            }

            this->add_node(node);

            this->node_block_counter++;
            result = visitChildren(ctx);
            this->node_block_counter--;
            
            return result;
        }

        // Operador aritmético relacionado à operação.
        if (ctx->ArithmeticOperator()) {
            string op = ctx->ArithmeticOperator()->getText();
            node.operation_op = this->check_block_arithmeic_operator(op);
        }

        // Operador relacional.
        if (ctx->AssignmentOperator()) {
            string op = ctx->AssignmentOperator()->getText();

            if (op.compare("+=") == 0)
                node.operation_op = VERBUM_OPERATOR_ADD_EQUAL;
            else if (op.compare("-=") == 0)
                node.operation_op = VERBUM_OPERATOR_SUB_EQUAL;
            else if (op.compare("*=") == 0)
                node.operation_op = VERBUM_OPERATOR_MUL_EQUAL;
            else if (op.compare("/=") == 0)
                node.operation_op = VERBUM_OPERATOR_DIV_EQUAL;
            else if (op.compare("%=") == 0)
                node.operation_op = VERBUM_OPERATOR_PERC_EQUAL;
            else if (op.compare(">")  == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR;
            else if (op.compare("<")  == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR;
            else if (op.compare(">=") == 0)
                node.operation_op = VERBUM_OPERATOR_MAJOR_EQUAL;
            else if (op.compare("<=") == 0)
                node.operation_op = VERBUM_OPERATOR_MINOR_EQUAL;
            else if (op.compare("&&") == 0)
                node.operation_op = VERBUM_OPERATOR_AND;
            else if (op.compare("==") == 0)
                node.operation_op = VERBUM_OPERATOR_EQUAL;
            else if (op.compare("!=") == 0)
                node.operation_op = VERBUM_OPERATOR_NOT_EQUAL;
            else if (op.compare("!")  == 0)
                node.operation_op = VERBUM_OPERATOR_NOT;
        }

        // Adiciona no array de controle.
        this->add_node(node);
    }

    if (!block)
        result = visitChildren(ctx);

    return result;
}

/*
** Loops.
*/

// Bloco completo do loop, e identificação do tipo do mesmo.
antlrcpp::Any verbum_ast_visitor::visitLoopExpressionItems (TParser::LoopExpressionItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP;
    node.loop_type       = VERBUM_UNKNOWN;

    // Loop completo.
    if (ctx->loopExpression()->loopComplete())
        node.loop_type = VERBUM_LOOP_COMPLETE;

    // Loop condicional.
    else if (ctx->loopExpression()->loopConditional())
        node.loop_type = VERBUM_LOOP_CONDITIONAL;

    // Loop infinito.
    else if (ctx->loopExpression()->loopInfinite())
        node.loop_type = VERBUM_LOOP_INFINITE;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Área de inicialização.
antlrcpp::Any verbum_ast_visitor::visitLoopOneMembers (TParser::LoopOneMembersContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP_BLOCK;
    node.loop_block_type = VERBUM_LOOP_INITIALIZATION;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Área de expressão.
antlrcpp::Any verbum_ast_visitor::visitLoopTwoMembers (TParser::LoopTwoMembersContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP_BLOCK;
    node.loop_block_type = VERBUM_LOOP_EXPRESSION;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Área de incremento/decremento.
antlrcpp::Any verbum_ast_visitor::visitLoopThreeMembers (TParser::LoopThreeMembersContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP_BLOCK;
    node.loop_block_type = VERBUM_LOOP_INCDEC;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Área do bloco de código.
antlrcpp::Any verbum_ast_visitor::visitLoopBlockElementsLimited (TParser::LoopBlockElementsLimitedContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP_BLOCK;
    node.loop_block_type = VERBUM_LOOP_CODE_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Comando de retorno (ret).
*/
antlrcpp::Any verbum_ast_visitor::visitRet (TParser::RetContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_RET;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Funções e métodos.
*/

// Bloco principal das funções, metodos, construtores de classes
// métodos de interfaces, e métodos de classes abstratas.
antlrcpp::Any verbum_ast_visitor::visitFunctions (TParser::FunctionsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_FUNCTION_GENERAL_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Funções comuns.
antlrcpp::Any verbum_ast_visitor::visitFunctionsModes (TParser::FunctionsModesContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type                            = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type       = VERBUM_FUNCTION_SIMPLE;
    node.function_declaration.identifier = ctx->functionGeneralModes()->Identifier()->getText();

    // Verifica se há retorno de tipo.
    node.function_declaration.ret_found  = false;
    if (ctx->functionGeneralModes()->ArrowRight()) {
        node.function_declaration.ret_found  = true;

        if (ctx->functionGeneralModes()->identifierRet()) {
            node.function_declaration.ret_data =
                ctx->functionGeneralModes()->identifierRet()->Identifier()->getText();
        } else if (ctx->functionGeneralModes()->TypeSpec()) {
            node.function_declaration.ret_data =
                ctx->functionGeneralModes()->TypeSpec()->getText();
        }
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Métodos de classes.
antlrcpp::Any verbum_ast_visitor::visitFunctionMethodsModes (TParser::FunctionMethodsModesContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    
    node.type                            = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type       = VERBUM_FUNCTION_METHOD;
    node.function_declaration.identifier = ctx->functionGeneralModes()->Identifier()->getText();

    // Verifica se há retorno de tipo.
    node.function_declaration.ret_found  = false;
    if (ctx->functionGeneralModes()->ArrowRight()) {
        node.function_declaration.ret_found  = true;

        if (ctx->functionGeneralModes()->identifierRet()) {
            node.function_declaration.ret_data =
                ctx->functionGeneralModes()->identifierRet()->Identifier()->getText();
        } else if (ctx->functionGeneralModes()->TypeSpec()) {
            node.function_declaration.ret_data =
                ctx->functionGeneralModes()->TypeSpec()->getText();
        }
    }


    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Controla visibilidade dos itens (variáveis e métodos).
antlrcpp::Any verbum_ast_visitor::visitVisibilityItems (TParser::VisibilityItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ITEMS_VISIBILITY;

    if (ctx->Pub())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_PUB;
    else if (ctx->Priv())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_PRIV;
    else if (ctx->Pro())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_PRO;
    else if (ctx->Final())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_FINAL;
    else if (ctx->Static())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_STATIC;
    else if (ctx->Async())
        node.item_visibility = VERBUM_ITEMS_VISIBILITY_ASYNC;

    this->add_node(node);

    return visitChildren(ctx);
}

// Construtores de classes.
antlrcpp::Any verbum_ast_visitor::visitConstructClassMethod (TParser::ConstructClassMethodContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type                            = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type       = VERBUM_FUNCTION_CLASS_CONSTRUCTOR;
    node.function_declaration.identifier = ctx->Identifier()->getText();

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Métodos de interfaces e classes abstratas.
antlrcpp::Any verbum_ast_visitor::visitInterfaceMethod (TParser::InterfaceMethodContext *ctx)
{
    verbum_ast_node node            = this->zero_data();
    node.type                       = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type  = VERBUM_FUNCTION_INTERFACE_ABSTRACT;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Processa parâmetros da declaração da função / método.
*/

// Bloco geral.
antlrcpp::Any verbum_ast_visitor::visitFunctionParams (TParser::FunctionParamsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_FUNCTION_PARAM_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Itens do bloco de parâmetros das funções / métodos.
antlrcpp::Any verbum_ast_visitor::visitFunctionParamElements (TParser::FunctionParamElementsContext *ctx)
{
    verbum_ast_node node     = this->zero_data();

    node.type                = VERBUM_FUNCTION_PARAM_ITEM;    
    node.function_param_item = ctx->Identifier()->getText();
    node.function_param_type = ctx->TypeSpec()->getText();

    this->add_node(node);
    return visitChildren(ctx);
}

/*
** Bloco de código da função (declaração da função).
*/
antlrcpp::Any verbum_ast_visitor::visitFunctionCodeBlock (TParser::FunctionCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_FUNCTION_CODE_BLOCK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** OOP.
*/

// Declaração das interfaces.
antlrcpp::Any verbum_ast_visitor::visitInterfaceClass (TParser::InterfaceClassContext *ctx)
{
    verbum_ast_node node        = this->zero_data();    
    node.type                   = VERBUM_OOP_INTERFACE;
    node.interface.identifier_a = ctx->interfaceClassDefinition()->Identifier()->getText();

    // Verifica se há herança.
    if (ctx->interfaceClassDefinition()->Extends()) {
        node.interface.extends      = true;
        node.interface.identifier_b = 
            ctx->interfaceClassDefinition()->identifierB()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código da interface.
antlrcpp::Any verbum_ast_visitor::visitInterfaceCodeBlock (TParser::InterfaceCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_INTERFACE_CODE_BLOCK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Declaração das abstrações.
antlrcpp::Any verbum_ast_visitor::visitAbstractClass (TParser::AbstractClassContext *ctx)
{
    verbum_ast_node node        = this->zero_data();    
    node.type                   = VERBUM_OOP_ABSTRACT;
    node.abstract.identifier_a  = ctx->abstractClassDefinition()->Identifier()->getText();

    // Verifica se há herança.
    if (ctx->abstractClassDefinition()->Extends()) {
        node.abstract.extends      = true;
        node.abstract.identifier_b = 
            ctx->abstractClassDefinition()->identifierB()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código da abstração.
antlrcpp::Any verbum_ast_visitor::visitAbstractCodeBlock (TParser::AbstractCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_ABSTRACT_CODE_BLOCK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Declaração da classe.
antlrcpp::Any verbum_ast_visitor::visitClassDefination (TParser::ClassDefinationContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_CLASS;

    // Nome da classe.
    node.vclass.identifier_a = 
        ctx->classModes()->Identifier()->getText();

    // Verifica se há herança.
    if (ctx->classModes()->Extends()) {
        node.vclass.extends = true;
        node.vclass.identifier_b = 
            ctx->classModes()->identifierB()->getText();
    }

    // Verifica se há implementação de interface.
    if (ctx->classModes()->Implements()) {
        node.vclass.implements = true;
        node.vclass.identifier_c = 
            ctx->classModes()->identifierC()->getText();
    }

    // Verifica se é uma classe 'final'.
    if (ctx->classModes()->Final()) 
        node.vclass.vfinal = true;


    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Funções anônimas.
*/

// Bloco geral.
antlrcpp::Any verbum_ast_visitor::visitAnonymousFunction (TParser::AnonymousFunctionContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ANONYMOUS_FUNCTION;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Protótipo da função.
antlrcpp::Any verbum_ast_visitor::visitFunctionsModesFn (TParser::FunctionsModesFnContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type                            = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type       = VERBUM_FUNCTION_SIMPLE;
    node.function_declaration.anonymous  = true;

    // Verifica se há retorno de tipo.
    node.function_declaration.ret_found  = false;
    if (ctx->ArrowRight()) {
        node.function_declaration.ret_found  = true;

        if (ctx->identifierRet()) {
            node.function_declaration.ret_data =
                ctx->identifierRet()->Identifier()->getText();
        } else if (ctx->TypeSpec()) {
            node.function_declaration.ret_data =
                ctx->TypeSpec()->getText();
        }
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Múltiplas atribuições.
*/

// Bloco de controle geral.
antlrcpp::Any verbum_ast_visitor::visitVariableMultipleAssignments (TParser::VariableMultipleAssignmentsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_MULTIPLE_ATTRIBUTION;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Classes anônimas.
*/

// Definição.
antlrcpp::Any verbum_ast_visitor::visitAnonymousClass (TParser::AnonymousClassContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ANONYMOUS_CLASS;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Chamada.
antlrcpp::Any verbum_ast_visitor::visitAnonymousClassCallExpr (TParser::AnonymousClassCallExprContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ANONYMOUS_CLASS_CALL;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Instanciamento anônimo.
*/

// Definição.
antlrcpp::Any verbum_ast_visitor::visitAnonymousObject (TParser::AnonymousObjectContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type = VERBUM_ANONYMOUS_OBJECT;
    node.function_call.object_name = ctx->Identifier()->getText();

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Chamada.
antlrcpp::Any verbum_ast_visitor::visitAnonymousObjectCallExpr (TParser::AnonymousObjectCallExprContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ANONYMOUS_OBJECT_CALL;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Lambda functions.
*/

// Declaração.
antlrcpp::Any verbum_ast_visitor::visitLambdaFunctions (TParser::LambdaFunctionsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_BLOCK;

    // Verifica se há retorno.
    node.operation_type_conversion = false;
    if (ctx->lambdaFnRet()->ArrowRight()) {
        node.operation_type_conversion = true;

        if (ctx->lambdaFnRet()->Identifier())
            node.operation_type_conversion_data = 
                ctx->lambdaFnRet()->Identifier()->getText();

        if (ctx->lambdaFnRet()->TypeSpec())
            node.operation_type_conversion_data = 
                ctx->lambdaFnRet()->TypeSpec()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco dos parâmetros.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnParams (TParser::LambdaFnParamsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_PARAM;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Itens dos parâmetros da função.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnParamsElements (TParser::LambdaFnParamsElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_PARAM_ITEM;
    node.function_param_item = ctx->Identifier()->getText();

    if (ctx->TypeSpec())
        node.function_param_type = ctx->TypeSpec()->getText();

    this->add_node(node);
    return visitChildren(ctx);
}

// Bloco de código - expressão simples.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnCodeBlockSimple (TParser::LambdaFnCodeBlockSimpleContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_SIMPLE;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código - chaves.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnCodeBlockKey (TParser::LambdaFnCodeBlockKeyContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_KEY;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Try, catch.
*/

// Bloco geral.
antlrcpp::Any verbum_ast_visitor::visitTryCatch (TParser::TryCatchContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_TRY_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco try.
antlrcpp::Any verbum_ast_visitor::visitTryUniqueElement (TParser::TryUniqueElementContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_TRY_TRY;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco catch.
antlrcpp::Any verbum_ast_visitor::visitCatchUniqueElement (TParser::CatchUniqueElementContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_TRY_CATCH;
    node.catch_identifier = ctx->Identifier()->getText();
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código.
antlrcpp::Any verbum_ast_visitor::visitTryCatchElementsLimited (TParser::TryCatchElementsLimitedContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_TRY_CODE_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}


