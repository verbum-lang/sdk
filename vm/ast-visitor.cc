
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
** Adiciona node no respectivo nível hierárquico.
*/
verbum_ast_node verbum_ast_visitor::add_node (verbum_ast_node source, verbum_ast_node destination)
{
    this->node_run_counter = 0;
    return this->add_node_internal(source, destination);
}

verbum_ast_node verbum_ast_visitor::add_node_internal (verbum_ast_node source, verbum_ast_node destination)
{
    int last = destination.nodes.size() - 1;
    if (last < 0)
        last = 0;
    
    if (this->node_run_counter == this->node_block_counter) 
        destination.nodes.push_back(source);
    else {
        this->node_run_counter++;

        if (destination.nodes.size() > 0) {
            verbum_ast_node node = this->add_node_internal(source, 
                destination.nodes[ last ]
            );

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
    
    this->ast = this->add_node(node, this->ast);

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
    else
        node.variable_mod_operation = VERBUM_MOD_OP_SIMPLE;

    this->ast = this->add_node(node, this->ast);

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
    
    this->ast = this->add_node(node, this->ast);

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

    this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);

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
            this->ast = this->add_node(node, this->ast);

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

            this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);
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
    
    this->ast = this->add_node(node, this->ast);

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
    
    this->ast = this->add_node(node, this->ast);

    return visitChildren(ctx);
}

/*
** Chamad a função.
*/
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

    // Função comum.
    else {
        node.function_call.type = VERBUM_FUNCTION_CALL_SIMPLE;
        node.function_call.function_name = ctx->functionCall()->Identifier()->getText();
    }

    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);

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
    
    this->ast = this->add_node(node, this->ast);
    
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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
    this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);

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
            this->ast = this->add_node(node, this->ast);

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

            this->ast = this->add_node(node, this->ast);

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
        this->ast = this->add_node(node, this->ast);
    }

    if (!block)
        result = visitChildren(ctx);

    return result;
}

// Bloco completo do loop.
antlrcpp::Any verbum_ast_visitor::visitLoopExpressionItems (TParser::LoopExpressionItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP;
    node.loop_type       = VERBUM_UNKNOWN;

    /*
    ** Identifica tipo do loop.
    */

    // Loop completo.
    if (ctx->loopExpression()->loopComplete())
        node.loop_type = VERBUM_LOOP_COMPLETE;

    // Loop condicional.
    else if (ctx->loopExpression()->loopConditional())
        node.loop_type = VERBUM_LOOP_CONDITIONAL;

    // Loop infinito.
    else if (ctx->loopExpression()->loopInfinite())
        node.loop_type = VERBUM_LOOP_INFINITE;

    this->ast = this->add_node(node, this->ast);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

antlrcpp::Any verbum_ast_visitor::visitLoopExpression (TParser::LoopExpressionContext *ctx)
{
    return visitChildren(ctx);
}


