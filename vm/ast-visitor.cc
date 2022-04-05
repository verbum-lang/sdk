
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
    ast.access_array_index_mod              = false;
    ast.access_array_index_type             = VERBUM_UNKNOWN;
    ast.access_array_i_integer              = "";
    ast.access_array_i_identifier           = "";

    // Limpa estruturas de controle.
    ast.nodes.clear();

    return ast;
}

/*
** Variáveis: reseta estruturas de controle.
*/ 
void verbum_ast_visitor::variable_resets ()
{
    // Estruturas de controle.
    this->variable                          = zero_data();
    this->array_access_elements             = zero_data();
    this->array_access_elements_operations  = zero_data();

    // Flag de controle.
    this->variable_declaration_process      = false;
    this->variable_declaration_process_ops  = false;
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

    // Ativa informando uso de processamento das declarações das variáveis.
    this->variable_declaration_process = true;

    // Acessa elementos filhos.
    antlrcpp::Any result = visitChildren(ctx);
    
    this->variable_declaration_process = false;

    // Se for acesso a elementos de array, adiciona os mesmo como nodes.
    if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS) 
        node.nodes.push_back(this->array_access_elements);

    // Adiciona expressão de declaração/uso de variável a lista de nodes, segundo
    // o comando completo de declaração da(s) variável(is).
    this->variable.nodes.push_back(node);

    return result;
}

/*
** Controle de acesso a elementos de array.
*/
antlrcpp::Any verbum_ast_visitor::visitArrayAccessElements (TParser::ArrayAccessElementsContext *ctx)
{
    verbum_ast_node node = zero_data();
    antlrcpp::Any result;
    bool result_ok = false;

    node.type = VERBUM_ACCESS_ARRAY;
    node.access_array_identifier = ctx->Identifier()->getText();

    // Verifica se há acesso por indexação no elemento em questão.
    node.access_array_index_mod = false;
    if (ctx->accessBlockAr()) {
        node.access_array_index_mod = true;

        // Verifica se o acesso é feito por um número inteiro.
        if (ctx->accessBlockAr()->arrayIndexAccess()->Integer()) {
            node.access_array_index_type    = VERBUM_ACCESS_ARRAY_TINDEX_INTEGER;
            node.access_array_i_integer     = ctx->accessBlockAr()->arrayIndexAccess()->Integer()->getText();
        }

        // Por um identificador.
        else if (ctx->accessBlockAr()->arrayIndexAccess()->Identifier()) {
            node.access_array_index_type    = VERBUM_ACCESS_ARRAY_TINDEX_IDENTIFIER;
            node.access_array_i_identifier  = ctx->accessBlockAr()->arrayIndexAccess()->Identifier()->getText();
        }

        // Por operação.
        else if (ctx->accessBlockAr()->arrayIndexAccess()->operationElements()) {
            node.access_array_index_type           = VERBUM_ACCESS_ARRAY_TINDEX_OPERATION;
            this->variable_declaration_process_ops = true;
            this->array_access_elements_operations = zero_data();
            this->operation_block_counter = 0;

            // Processa nodes (filhos). Para processar as operações no acesso ao elemento do array.
            result = visitChildren(ctx);
            result_ok = true;

            // Adiciona elementos da operação, no node em questão.
            node.nodes.push_back(this->array_access_elements_operations);

            this->variable_declaration_process_ops = false;
        }
    }
    
    // Uso atrelado à variáveis.
    if (this->variable_declaration_process)
        this->array_access_elements.nodes.push_back(node);

    if (!result_ok)
        result = visitChildren(ctx);

    return result;
}

/*
** Controle dos blocos de operaões.
*/

antlrcpp::Any verbum_ast_visitor::visitOperationValue(TParser::OperationValueContext *ctx) {
    antlrcpp::Any result;
    
    // Processamento relacionado ao uso de operadores em declaração de variáveis.
    //  + Acesso a elementos de array.
    if (this->variable_declaration_process_ops) {
        bool block = false;
        verbum_ast_node node = zero_data();
        node.type = VERBUM_OPERATION_BLOCK;

        node.operation_type_conversion = false;
        if (ctx->TypeSpec()) {
            node.operation_type_conversion = true;
            node.operation_type_conversion_data = ctx->TypeSpec()->getText();
        }

        if (ctx->operationBlock()) {
            node.operation_type = VERBUM_OPERATION_TYPE_BLOCK;
            block = true;

            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            // Adiciona no array de controle.
            this->operation_block_counter_run = 0;
            this->array_access_elements_operations =
                this->add_node_operations_elements(node, this->array_access_elements_operations);
            
            // Entra em nodes (filhos).
            this->operation_block_counter++;
            result = visitChildren(ctx);
            this->operation_block_counter--;

        } else {
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
            }

            // Acesso a elementos de array.
            else if (ctx->arrayAccessElements()) {
                //ptab();
                std::cout << "variable [" << 
                ctx->arrayAccessElements()->getText() << "] ";
            }

            // Operador aritmético relacionado à operação.
            if (ctx->ArithmeticOperator()) {
                string op = ctx->ArithmeticOperator()->getText();
                node.operation_op = this->check_block_arithmeic_operator(op);
            }

            // Adiciona no array de controle.
            this->operation_block_counter_run = 0;
            this->array_access_elements_operations =
                this->add_node_operations_elements(node, this->array_access_elements_operations);
        }

        if (!block)
            result = visitChildren(ctx);
    }

    // Outros...
    else
        result = visitChildren(ctx);

    return result;
}

/*
** Adiciona node temporário no respectivo nível de hierarquia a qual ele percente.
** Utilizado para processamento da hierarquia dos blocos das operações.
*/
verbum_ast_node verbum_ast_visitor::add_node_operations_elements (verbum_ast_node source, verbum_ast_node destination) {

    if (this->operation_block_counter_run == this->operation_block_counter) 
        destination.nodes.push_back(source);
    else {
        this->operation_block_counter_run++;

        if (destination.nodes.size() > 0) {
            verbum_ast_node node = this->add_node_operations_elements(source, destination.nodes[
                destination.nodes.size() - 1
            ]);

            destination.nodes[ destination.nodes.size() - 1 ] = node;
        }
    }

    return destination;
}

/*
** Verifica operador aritmético utilizado no bloco de operações.
*/
int verbum_ast_visitor::check_block_arithmeic_operator (string op) {
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


