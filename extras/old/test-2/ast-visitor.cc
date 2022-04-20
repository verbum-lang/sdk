
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
    ast.general_value_not                   = false;
    
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

    // VERBUM_ATTRIBUTE_OBJECT
    ast.attribute_object_type               = VERBUM_UNKNOWN;

    // Outros.
    ast.anonymous_class                     = false;
    ast.anonymous_class_method              = "";

    // Limpa estruturas de controle.
    ast.nodes.clear();

    return ast;
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

// Variáveis: declaração.
antlrcpp::Any verbum_ast_visitor::visitBlockVariable (TParser::BlockVariableContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_INITIALIZATION;
    node.variable_type = VERBUM_VARIABLE_DECLARATION;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Variáveis declaradas e suas respectivas informações.
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
** Ret (return).
*/
antlrcpp::Any verbum_ast_visitor::visitBlockRet (TParser::BlockRetContext *ctx) 
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
** Condicionais.
*/

// Bloco completo do condicional.
antlrcpp::Any verbum_ast_visitor::visitBlockConditional (TParser::BlockConditionalContext *ctx)
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
antlrcpp::Any verbum_ast_visitor::visitConditionalBlockExpression (TParser::ConditionalBlockExpressionContext *ctx)
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
** Controle dos valores gerais.
*/
antlrcpp::Any verbum_ast_visitor::visitGeneralValue (TParser::GeneralValueContext *ctx) 
{
    antlrcpp::Any result;
    bool block = false;
    verbum_ast_node node = this->zero_data();

    node.type = VERBUM_GENERAL_VALUE;
    node.general_value_type_conversion = false;

    // Verifica se há conversão de tipo.
    if (ctx->TypeSpec()) {
        node.general_value_type_conversion = true;
        node.general_value_type_conversion_data = ctx->TypeSpec()->getText();
    }

    // Verifica se há incremento prefixado.
    string incDecStr = "";

    if (ctx->incDecOperatorsA()) {
        node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_PRE;
        incDecStr = ctx->incDecOperatorsA()->getText();
    } else if (ctx->incDecOperatorsB()) {
        node.operation_data.mod_inc_dec = VERBUM_OP_INCDEC_POS;
        incDecStr = ctx->incDecOperatorsB()->getText();
    }

    if (ctx->incDecOperatorsA() || ctx->incDecOperatorsB()) {        
        if (incDecStr.compare("++") == 0)
            node.operation_data.type_inc_dec = VERBUM_OP_TYPE_INC;
        else if (incDecStr.compare("--") == 0)
            node.operation_data.type_inc_dec = VERBUM_OP_TYPE_DEC;
    }

    // Captura operador aritmético.
    if (ctx->ArithmeticOperator()) {
        string op = ctx->ArithmeticOperator()->getText();
        node.operation_op = this->check_block_arithmeic_operator(op);
    }

    // Verifica se há operador utilizado com o bloco da expressão.
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

    // Verifica se há uso do 'not'.
    if (ctx->Not())
        node.general_value_not = true;

    //
    // Processa valores.
    //

    // Chamada a atributo de objeto - simples (a.b).
    else if (ctx->identifier() && ctx->identifierB()   &&
            (ctx->Point() || ctx->TwoTwoPoint())        )
    {
        // Identifica tipo do acesso.
        node.general_value_data.type = VERBUM_ATTRIBUTE_OBJECT;

        if (ctx->Point())
            node.attribute_object_type = VERBUM_ATTRIBUTE_OBJECT_INSTANCE;
        else if (ctx->TwoTwoPoint())
            node.attribute_object_type = VERBUM_ATTRIBUTE_OBJECT_STATIC;

        // Nome dos elementos.
        node.general_value_data.object_name = ctx->identifier()->getText();
        node.general_value_data.method_name = ctx->identifierB()->getText();
    }

    //
    // Dados simples.
    //
    else if (ctx->identifier()) {
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
    else if (ctx->generalValueBlock()) {
        block = true;
        node.general_value_data.type = VERBUM_DATA_OPERATION_BLOCK;
    }

    // Chamadas a funções.
    else if (ctx->functionCall()) {
        block = true;

        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
            node.general_value_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->identifier()->getText();

            if (ctx->functionCall()->identifierB())
                node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
            node.general_value_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->identifier()->getText();
            
            if (ctx->functionCall()->identifierB())
                node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Cascading method.
        // else if (ctx->functionCall()->methodCascadingModes()) {
        //     node.general_value_data.type = VERBUM_FUNCTION_CALL_CASCADING;
        //     node.general_value_data.function_name = 
        //         ctx->functionCall()->methodCascadingModes()->Identifier()->getText();
        // }
        
        // Chamada a função, a partir de acesso a elementos de array.
        // else if (ctx->functionCall()->blockAccessArrayElements()) {
        //     node.general_value_data.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS;
        // }

        // Função comum.
        else {
            node.general_value_data.type = VERBUM_DATA_FUNCTION_CALL;
            node.general_value_data.function_name = 
                ctx->functionCall()->identifier()->getText();
        }
    }

    //
    // Array - sem valores.
    //

    // Indexado.
    else if (ctx->OpenArIndex() && ctx->CloseArIndex()) {
        node.general_value_data.type = VERBUM_DATA_INDEX_ARRAY_BLOCK;
        block = true;
    }

    // Associativo.
    else if (ctx->OpenBlock() && ctx->CloseBlock()) {
        node.general_value_data.type = VERBUM_DATA_ASSOC_ARRAY_BLOCK;
        block = true;
    }

    // Array - com valores.
    else if (ctx->blockArray()) {

        // Array indexado.
        if (ctx->blockArray()->indexArray()) {
            node.general_value_data.type = VERBUM_DATA_INDEX_ARRAY_BLOCK;
            block = true;
        }
        
        // Array associativo.
        else if (ctx->blockArray()->associativeArray()) {
            node.general_value_data.type = VERBUM_DATA_ASSOC_ARRAY_BLOCK;
            block = true;
        }
    }

    // Declaração de função - atribuição da mesma à variável.
    else if (ctx->blockFunctionDeclarationAttr()) {
        // block = true;
    }

    // Declaração de classe - atribuição da mesma à variável.
    else if (ctx->blockClassDeclarationAttr()) {
        // block = true;
    }

    // Funções lambdas.
    else if (ctx->blockLambdaFunctions()) {
        // block = true;
    }

    // Instanciamento de objetos anonimamente.
    else if (ctx->blockAnonymousObject()) {
        node.general_value_data.type = VERBUM_ANONYMOUS_OBJECT;
        block = true;
    }

    // Acesso a elementos de array.
    else if (ctx->blockAccessArrayElements()) {
        // block = true;
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
    node.general_value_data.identifier = ctx->identifier()->getText();
    
    this->add_node(node);

    return visitChildren(ctx);
}

/*
** Bloco de código dos comandos condicionais e loops.
*/
antlrcpp::Any verbum_ast_visitor::visitCodeBlockFlowControlElements (TParser::CodeBlockFlowControlElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_GENERAL_VALUE;

    // Chamada a função.
    if (ctx->functionCall()) {

        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
            node.general_value_data.type = VERBUM_DATA_INSTANCE_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->identifier()->getText();

            if (ctx->functionCall()->identifierB())
                node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
            node.general_value_data.type = VERBUM_DATA_STATIC_METHOD_CALL;
            node.general_value_data.object_name = ctx->functionCall()->identifier()->getText();
            
            if (ctx->functionCall()->identifierB())
                node.general_value_data.method_name = ctx->functionCall()->identifierB()->getText();
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
                ctx->functionCall()->identifier()->getText();
        }

        this->add_node(node);
    
        this->node_block_counter++;
        antlrcpp::Any result = visitChildren(ctx);
        this->node_block_counter--;

        return result;
    }

    return visitChildren(ctx);
}

/*
** Loops.
*/

// Bloco completo do loop, e identificação do tipo do mesmo.
antlrcpp::Any verbum_ast_visitor::visitBlockLoop (TParser::BlockLoopContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_LOOP;
    node.loop_type       = VERBUM_UNKNOWN;

    // Loop completo.
    if (ctx->loopComplete())
        node.loop_type = VERBUM_LOOP_COMPLETE;

    // Loop condicional.
    else if (ctx->loopConditional())
        node.loop_type = VERBUM_LOOP_CONDITIONAL;

    // Loop infinito.
    else if (ctx->loopInfinite())
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
antlrcpp::Any verbum_ast_visitor::visitLoopBlockElements (TParser::LoopBlockElementsContext *ctx)
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
** Try, catch.
*/

// Bloco geral.
antlrcpp::Any verbum_ast_visitor::visitBlockTryCatch (TParser::BlockTryCatchContext *ctx)
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
    node.catch_identifier = ctx->identifier()->getText();
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código.
antlrcpp::Any verbum_ast_visitor::visitTryCatchElements (TParser::TryCatchElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_TRY_CODE_BLOCK;
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Declaração das funções.
*/

// Declaração
antlrcpp::Any verbum_ast_visitor::visitBlockFunction (TParser::BlockFunctionContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_DECLARATION;

    //
    // Funções comuns e anônimas.
    //
    node.function_declaration.type = VERBUM_FUNCTION_SIMPLE;

    // Função anônima.
    if (!ctx->identifier())
        node.function_declaration.anonymous = true;

    // Verifica se é função comum.
    if (ctx->identifier())
        node.function_declaration.identifier = ctx->identifier()->getText();

    // Verifica se é método de interfaces ou classes abstratas.
    if (ctx->End())
        node.function_declaration.type = VERBUM_FUNCTION_INTERFACE_ABSTRACT;

    // Verifica se há retorno de tipo.
    node.function_declaration.ret_found = false;
    if (ctx->ArrowRight()) {
        node.function_declaration.ret_found = true;
        
        if (ctx->identifierB()) 
            node.function_declaration.ret_data = ctx->identifierB()->getText();
        else if (ctx->TypeSpec()) 
            node.function_declaration.ret_data = ctx->TypeSpec()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Parâmetros.
antlrcpp::Any verbum_ast_visitor::visitFunctionParam (TParser::FunctionParamContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_PARAM_ITEM;

    node.function_param_item = ctx->Identifier()->getText();
    node.function_param_type = ctx->TypeSpec()->getText();

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;

}

// Bloco de código.
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
** Parâmetros da função anônima.
*/
antlrcpp::Any verbum_ast_visitor::visitFunctionAnonymousParam (TParser::FunctionAnonymousParamContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_ANONYMOUS_FUNCTION_PARAM;
    
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
antlrcpp::Any verbum_ast_visitor::visitBlockInterface (TParser::BlockInterfaceContext *ctx)
{
    verbum_ast_node node        = this->zero_data();    
    node.type                   = VERBUM_OOP_INTERFACE;
    node.interface.identifier_a = ctx->identifier()->getText();

    // Verifica se há herança.
    if (ctx->Extends()) {
        node.interface.extends      = true;
        node.interface.identifier_b = ctx->identifierB()->getText();
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
antlrcpp::Any verbum_ast_visitor::visitBlockAbstraction (TParser::BlockAbstractionContext *ctx)
{
    verbum_ast_node node        = this->zero_data();    
    node.type                   = VERBUM_OOP_ABSTRACT;
    node.abstract.identifier_a  = ctx->identifier()->getText();

    // Verifica se há herança.
    if (ctx->Extends()) {
        node.abstract.extends      = true;
        node.abstract.identifier_b = ctx->identifierB()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código da abstração.
antlrcpp::Any verbum_ast_visitor::visitAbstractionCodeBlock (TParser::AbstractionCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_ABSTRACT_CODE_BLOCK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Classes.
*/

// Expressão utilizada solta no código.
antlrcpp::Any verbum_ast_visitor::visitBlockClass (TParser::BlockClassContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_CLASS;

    // Nome da classe.
    if (ctx->identifier())
        node.vclass.identifier_a = ctx->identifier()->getText();

    // Verifica se há herança.
    if (ctx->Extends()) {
        node.vclass.extends = true;
        node.vclass.identifier_b = ctx->identifierB()->getText();
    }

    // Verifica se há implementação de interface.
    if (ctx->Implements()) {
        node.vclass.implements = true;
        node.vclass.identifier_c = ctx->identifierC()->getText();
    }

    // Verifica se é definição de classe anônima.
    if (ctx->openOpA() && ctx->closeOpA()) {
        node.anonymous_class = true;

        // Verifica se há método chamado.
        if (ctx->identifierD()) 
            node.anonymous_class_method = ctx->identifierD()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Expressão utilizada na atribuição de valor à variáveis.
antlrcpp::Any verbum_ast_visitor::visitBlockClassDeclarationAttr (TParser::BlockClassDeclarationAttrContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_CLASS;

    // Nome da classe.
    if (ctx->identifier())
        node.vclass.identifier_a = ctx->identifier()->getText();

    // Verifica se há herança.
    if (ctx->Extends()) {
        node.vclass.extends = true;
        node.vclass.identifier_b = ctx->identifierB()->getText();
    }

    // Verifica se há implementação de interface.
    if (ctx->Implements()) {
        node.vclass.implements = true;
        node.vclass.identifier_c = ctx->identifierC()->getText();
    }

    // Verifica se é definição de classe anônima.
    if (ctx->openOpA() && ctx->closeOpA()) {
        node.anonymous_class = true;

        // Verifica se há método chamado.
        if (ctx->identifierD()) 
            node.anonymous_class_method = ctx->identifierD()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Bloco de código.
antlrcpp::Any verbum_ast_visitor::visitClassCodeBlock (TParser::ClassCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_OOP_CLASS_CODE_BLOCK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Instanciamento anonimo de objeto.
*/
antlrcpp::Any verbum_ast_visitor::visitBlockAnonymousObject (TParser::BlockAnonymousObjectContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_ANONYMOUS_OBJECT;

    // Nome do objeto.
    if (ctx->identifier())
        node.function_call.object_name = ctx->identifier()->getText();

    // Verifica se há método chamado.
    if (ctx->identifierB()) 
        node.anonymous_class_method = ctx->identifierB()->getText();

    // Tipo do acesso ao método.
    node.attribute_object_type = VERBUM_UNKNOWN;
    if (ctx->Point())
        node.attribute_object_type = VERBUM_ATTRIBUTE_OBJECT_INSTANCE;
    else if (ctx->TwoTwoPoint())
        node.attribute_object_type = VERBUM_ATTRIBUTE_OBJECT_STATIC;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Comandos break e next.
*/

// Break.
antlrcpp::Any verbum_ast_visitor::visitBlockBreak (TParser::BlockBreakContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_TOKEN_BREAK;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Next.
antlrcpp::Any verbum_ast_visitor::visitBlockNext (TParser::BlockNextContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type            = VERBUM_TOKEN_NEXT;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Lambda functions.
*/

// Bloco principal.
antlrcpp::Any verbum_ast_visitor::visitBlockLambdaFunctions (TParser::BlockLambdaFunctionsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_BLOCK;

    // Verifica se há retorno.
    node.operation_type_conversion = false;
    if (ctx->ArrowRight()) {
        node.operation_type_conversion = true;

        if (ctx->identifier())
            node.operation_type_conversion_data = ctx->identifier()->getText();
        else if (ctx->TypeSpec())
            node.operation_type_conversion_data = ctx->TypeSpec()->getText();
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Parâmetros.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnParams (TParser::LambdaFnParamsContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type = VERBUM_LAMBDA_FUNCTION_PARAM_ITEM;
    
    if (ctx->identifier())
        node.function_param_item = ctx->identifier()->getText();
    if (ctx->TypeSpec())
        node.function_param_type = ctx->TypeSpec()->getText();

    this->add_node(node);
    return visitChildren(ctx);
}

// Bloco de código.
antlrcpp::Any verbum_ast_visitor::visitLambdaFnCodeBlock (TParser::LambdaFnCodeBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_SIMPLE;

    if (ctx->codeBlockControl())
        node.type = VERBUM_LAMBDA_FUNCTION_CODE_BLOCK_KEY;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Chamada a função e métodos.
*/

// Bloco principal.
antlrcpp::Any verbum_ast_visitor::visitBlockFunctionCall (TParser::BlockFunctionCallContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_FUNCTION_CALL;

    // Chamada a função, a partir de acesso a elementos de array.
    if (ctx->blockAccessArrayElements()) {
        node.function_call.type = VERBUM_FUNCTION_CALL_ARRAY_ACCESS;
    }

    else {
        // Método de objeto instanciado.
        if (ctx->Point()) {
            node.function_call.type = VERBUM_FUNCTION_CALL_INSTANCE;
            node.function_call.object_name = ctx->identifier()->getText();
            node.function_call.method_name = ctx->identifierB()->getText();
        }

        // Método static.
        else if (ctx->TwoTwoPoint()) {
            node.function_call.type = VERBUM_FUNCTION_CALL_STATIC;
            node.function_call.object_name = ctx->identifier()->getText();
            node.function_call.method_name = ctx->identifierB()->getText();
        }

        // Cascading method.
        // else if (ctx->methodCascadingModes()) {
        //     node.function_call.type = VERBUM_FUNCTION_CALL_CASCADING;
        //     node.function_call.function_name = 
        //         ctx->functionCall()->methodCascadingModes()->Identifier()->getText();
        // }

        // Função comum.
        else {
            node.function_call.type = VERBUM_FUNCTION_CALL_SIMPLE;
            node.function_call.function_name = ctx->identifier()->getText();
        }
    }

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Atribuição de valores à variáveis.
*/

// Declaração da atribuição.
antlrcpp::Any verbum_ast_visitor::visitBlockAttribution (TParser::BlockAttributionContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_INITIALIZATION;
    node.variable_type = VERBUM_VARIABLE_ATTRIBUTION;
    
    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

// Elementos da atribuição (única ou múltipla).
antlrcpp::Any verbum_ast_visitor::visitAttributionElements (TParser::AttributionElementsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_VARIABLE_USE_TYPES;

    // Chamda a método de objeto.
    if (ctx->identifierB()) {

        // Objeto instanciado.
        if (ctx->Point()) 
            node.variable_definition_type = VERBUM_VARIABLE_OBJ_INSTANCE;

        // Método estático.
        else if (ctx->TwoTwoPoint())
            node.variable_definition_type = VERBUM_VARIABLE_OBJ_STATIC;

        node.variable_names.object_name = ctx->identifier()->getText();
        node.variable_names.method_name = ctx->identifierB()->getText();
    }

    // Nome da variável (tipo simples).
    else {
        node.variable_definition_type = VERBUM_VARIABLE_SIMPLE;
        node.variable_names.simple_name = ctx->identifier()->getText();
    }

    // Verifica se há instanciamento de objeto (new), ou aguardo de função async.
    if (ctx->New()) 
        node.variable_mod_operation = VERBUM_MOD_OP_OBJ_INSTANCE;
    else if (ctx->Await())
        node.variable_mod_operation = VERBUM_MOD_OP_AWAIT;
    else
        node.variable_mod_operation = VERBUM_MOD_OP_SIMPLE;

    // Analisa operador (atribuição, atribuição com valor, etc).
    if (ctx->Attr())
        node.variable_operation = VERBUM_OPERATOR_ATTR;
    else {
        string op = ctx->AssignmentOperator()->getText();

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
** Tokens de visibilidade das variáveis, métodos e configurações de classes (final).
*/

// Bloco do token
antlrcpp::Any verbum_ast_visitor::visitBlockPermissionTokens (TParser::BlockPermissionTokensContext *ctx)
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

/*
** Atribuição múltipla (a = b = c = d).
*/

// Bloco principal.
antlrcpp::Any verbum_ast_visitor::visitBlockMultipleAssignments (TParser::BlockMultipleAssignmentsContext *ctx)
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
** Construtor de classe.
*/
antlrcpp::Any verbum_ast_visitor::visitBlockClassConstructor (TParser::BlockClassConstructorContext *ctx)
{
    verbum_ast_node node = this->zero_data();

    node.type                            = VERBUM_FUNCTION_DECLARATION;
    node.function_declaration.type       = VERBUM_FUNCTION_CLASS_CONSTRUCTOR;
    node.function_declaration.identifier = ctx->identifier()->getText();

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}

/*
** Controle de acesso a elementos de array.
*/
antlrcpp::Any verbum_ast_visitor::visitArrayAccessElementsItems (TParser::ArrayAccessElementsItemsContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_ACCESS_ARRAY;

    // Nome do elemento de acesso.
    node.access_array_identifier = ctx->identifier()->getText();

    // Modo do acesso.
    if (ctx->identifier() && ctx->accessBlockAr() && ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_BLOCK_POINT;
    else if (ctx->identifier() && ctx->accessBlockAr() && !ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_BLOCK;
    else if (ctx->identifier() && !ctx->accessBlockAr() && ctx->Point()) 
        node.access_array_type.type = VERBUM_ACCESS_ARRAY_TYPE_IDENTIFIER_POINT;
    else if (ctx->identifier() && !ctx->accessBlockAr() && !ctx->Point()) 
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
** Bloco de valores
*/
antlrcpp::Any verbum_ast_visitor::visitGeneralValueBlock (TParser::GeneralValueBlockContext *ctx)
{
    verbum_ast_node node = this->zero_data();
    node.type = VERBUM_GENERAL_VALUE_BLOCK;

    this->add_node(node);

    this->node_block_counter++;
    antlrcpp::Any result = visitChildren(ctx);
    this->node_block_counter--;

    return result;
}


