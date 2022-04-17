
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>
#include <vector>

#include "configuration.h"
#include "ast-struct.h"
#include "semantics.h"

using namespace verbum;
using namespace std;

verbum_semantics::verbum_semantics (vector <verbum_ast_node> ast) 
{
    this->block_counter = 0;
    this->verbum_recursive_ast(ast);
}

void verbum_semantics::tab ()
{
    for (int a=0; a<this->block_counter; a++)
        cout << "\t";
}

void verbum_semantics::verbum_recursive_ast (vector <verbum_ast_node> ast)
{
    int size = ast.size();

    for (int a=0; a<size; a++) {
        verbum_ast_node node = ast[a];

        /*
        ** Importações.
        */
        if (node.type == VERBUM_USE) {
            cout << "use: ";

            if (node.use_type == VERBUM_USE_MODULE)
                cout << node.use_module;
            else if (node.use_type == VERBUM_USE_PATH)
                cout << node.use_path;
            else if (node.use_type == VERBUM_USE_ARCHIVE)
                cout << node.use_elements[0];

            if (node.use_type == VERBUM_USE_MODULE || node.use_type == VERBUM_USE_PATH) {
                for (int b=0; b<node.use_elements.size(); b++) {
                    cout << " -> "<< node.use_elements[b];
                }
            }

            cout << "\n";
        }

        /*
        ** Tokens de identificação.
        */
        
        /*
        ** Variáveis: declações e inicializações.
        */
        else if (node.type == VERBUM_VARIABLE_INITIALIZATION) {
            this->tab();
            cout << "variable: ";

            // Modo.
            if (node.variable_type == VERBUM_VARIABLE_ATTRIBUTION)
                cout << "attr -> \n";
            else
                cout << "declaration -> \n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            cout << "\n";
        }

        /*
        ** Variáveis: tipagem e atribuição.
        */
        else if (node.type == VERBUM_VARIABLE_USE_TYPES) {
            this->tab();

            // Variáveis comuns.
            if (node.variable_definition_type != VERBUM_VARIABLE_ARRAY_ACCESS) {
                cout << "-> name: ";

                if (node.variable_definition_type == VERBUM_VARIABLE_SIMPLE)
                    cout << node.variable_names.simple_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_INSTANCE)
                    cout << node.variable_names.object_name << "." << node.variable_names.method_name;
                else if (node.variable_definition_type == VERBUM_VARIABLE_OBJ_STATIC)
                    cout << node.variable_names.object_name << "::" << node.variable_names.method_name;
                
                // Verifica se há conversão de dados (casting).
                if (node.variable_type_conversion) 
                    cout << " (casting: " << node.variable_type_conversion_name << ")";
                cout << "\n";
            }

            // Acesso a elementos de array.
            else if (node.variable_definition_type == VERBUM_VARIABLE_ARRAY_ACCESS) {
                cout << "-> array access:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
            }

            this->tab();
            cout << "-> operation: ";

            // Tipo de atribuição / operação.
            switch (node.variable_operation) {
                case VERBUM_OPERATOR_ATTR:              cout <<  "="; break;
                case VERBUM_OPERATOR_ADD_EQUAL:         cout << "+="; break;
                case VERBUM_OPERATOR_SUB_EQUAL:         cout << "-="; break;
                case VERBUM_OPERATOR_MUL_EQUAL:         cout << "*="; break;
                case VERBUM_OPERATOR_DIV_EQUAL:         cout << "/="; break;
                case VERBUM_OPERATOR_PERC_EQUAL:        cout << "%="; break;
                case VERBUM_OPERATOR_MAJOR:             cout <<  ">"; break;
                case VERBUM_OPERATOR_MINOR:             cout <<  "<"; break;
                case VERBUM_OPERATOR_MAJOR_EQUAL:       cout << ">="; break;
                case VERBUM_OPERATOR_MINOR_EQUAL:       cout << "<="; break;
                case VERBUM_OPERATOR_AND:               cout << "&&"; break;
                case VERBUM_OPERATOR_EQUAL:             cout << "=="; break;
                case VERBUM_OPERATOR_NOT_EQUAL:         cout << "!="; break;
                case VERBUM_OPERATOR_NOT:               cout <<  "!"; break;
            }

            // Verifica se há instanciamento de objeto.
            if (node.variable_mod_operation == VERBUM_MOD_OP_OBJ_INSTANCE)
                cout << " (new object) ";
            else if (node.variable_mod_operation == VERBUM_MOD_OP_AWAIT)
                cout << " (await) ";

            cout << "\n";
        }

        /*
        ** Ret.
        */
        else if (node.type == VERBUM_RET) {
            this->tab();
            cout << "-> ret block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> ret block (close)\n";
        }

        /*
        ** Condicionais.
        */

        // Bloco completo do condicional (unificação do bloco).
        else if (node.type == VERBUM_CONDITIONAL_STRUCT_BLOCK) {
            this->tab();
            cout << "-> conditional-block-open\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> conditional-block-close\n";
        }

        // Bloco de operações do condicional (unificação do bloco).
        else if (node.type == VERBUM_CONDITIONAL_EXPRESSION_BLOCK) {
            this->tab();
            cout << "-> c.expression-block-open\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> c.expression-block-close\n";
        }

        // Bloco de código do condicional (unificação do bloco).
        else if (node.type == VERBUM_CONDITIONAL_CODE_BLOCK) {
            this->tab();
            cout << "-> c.code-block-open\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> c.code-block-close\n";
        }

        // If.
        else if (node.type == VERBUM_CONDITIONAL_IF) {
            this->tab();
            cout << "conditional-if {\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "}\n";
        }

        // Elif.
        else if (node.type == VERBUM_CONDITIONAL_ELIF) {
            this->tab();
            cout << "conditional-elif {\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "}\n";
        }

        // Else.
        else if (node.type == VERBUM_CONDITIONAL_ELSE) {
            this->tab();
            cout << "conditional-else {\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "}\n";
        }

        /*
        ** Loops.
        */

        // Bloco completo.
        else if (node.type == VERBUM_LOOP) {
            this->tab();
            cout << "-> loop-block open\n";
            
            // Tipo do loop.
            this->tab();

            if (node.loop_type == VERBUM_LOOP_COMPLETE)
                cout << "-> loop-type: complete\n";
            else if (node.loop_type == VERBUM_LOOP_CONDITIONAL)
                cout << "-> loop-type: conditional\n";
            else if (node.loop_type == VERBUM_LOOP_INFINITE)
                cout << "-> loop-type: infinite\n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> loop-block close\n";
        }

        // Blocos internos do loop.
        else if (node.type == VERBUM_LOOP_BLOCK) {
            this->tab();

            // Inicialização.
            if (node.loop_block_type == VERBUM_LOOP_INITIALIZATION)
                cout << "-> loop-block: initialization (open)\n";
            // Expressão.
            else if (node.loop_block_type == VERBUM_LOOP_EXPRESSION)
                cout << "-> loop-block: expression (open)\n";
            // Incremento/decremento.
            else if (node.loop_block_type == VERBUM_LOOP_INCDEC)
                cout << "-> loop-block: inc/dec area (open)\n";
            // Bloco de código.
            else if (node.loop_block_type == VERBUM_LOOP_CODE_BLOCK)
                cout << "-> loop-block: code block (open)\n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();

            // Inicialização.
            if (node.loop_block_type == VERBUM_LOOP_INITIALIZATION)
                cout << "-> loop-block: initialization (close)\n";
            // Expressão.
            else if (node.loop_block_type == VERBUM_LOOP_EXPRESSION)
                cout << "-> loop-block: expression (close)\n";
            // Incremento/decremento.
            else if (node.loop_block_type == VERBUM_LOOP_INCDEC)
                cout << "-> loop-block: inc/dec area (close)\n";
            // Bloco de código.
            else if (node.loop_block_type == VERBUM_LOOP_CODE_BLOCK)
                cout << "-> loop-block: code block (close)\n";
        }

        /*
        ** Try, catch.
        */

        // Bloco geral.
        else if (node.type == VERBUM_TRY_BLOCK) {
            this->tab();
            cout << "-> try-catch (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> try-catch (close)\n";
        }

        // Bloco try.
        else if (node.type == VERBUM_TRY_TRY) {
            this->tab();
            cout << "-> try-catch try (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> try-catch try (close)\n";
        }

        // Bloco catch.
        else if (node.type == VERBUM_TRY_CATCH) {
            this->tab();
            cout << "-> try-catch catch (open)\n";
            
            this->tab();
            cout << "-> identifier-name: " << node.catch_identifier << "\n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> try-catch catch (close)\n";
        }

        // Bloco de código.
        else if (node.type == VERBUM_TRY_CODE_BLOCK) {
            this->tab();
            cout << "-> try-catch code-block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> try-catch code-block (close)\n";
        }

        /*
        ** Declaração das funções.
        */
        else if (node.type == VERBUM_FUNCTION_DECLARATION) {

            // Funções anônimas.
            if (node.function_declaration.type == VERBUM_FUNCTION_SIMPLE &&
                node.function_declaration.anonymous == true)
            {
                this->tab();
                cout << "-> anonymous-function (simple block) - (open)\n";
                
                // Informações da função.
                if (node.function_declaration.ret_found) {
                    this->tab();
                    cout << "-> ret type: " << node.function_declaration.ret_data << "\n";
                }


                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> anonymous-function (simple block) - (close)\n";
            }

            // Funções simples.
            else if (node.function_declaration.type == VERBUM_FUNCTION_SIMPLE &&
                node.function_declaration.anonymous == false)
            {
                this->tab();
                cout << "-> function (simple block) - (open)\n";
                
                // Informações da função.
                this->tab();
                cout << "-> function name: " << node.function_declaration.identifier << "\n";
                
                if (node.function_declaration.ret_found) {
                    this->tab();
                    cout << "-> ret type: " << node.function_declaration.ret_data << "\n";
                }


                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> function (simple block) - (close)\n";
            }

            // Métodos de classes.
            else if (node.function_declaration.type == VERBUM_FUNCTION_METHOD) {
                this->tab();
                cout << "-> function (method block) - (open)\n";
                
                // Informações da função.
                this->tab();
                cout << "-> function name: " << node.function_declaration.identifier << "\n";
                
                if (node.function_declaration.ret_found) {
                    this->tab();
                    cout << "-> ret type: " << node.function_declaration.ret_data << "\n";
                }

                // Configurações de acessibilidade.
                this->tab();
                cout << "-> visibility: \n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
                
                this->tab();
                cout << "-> function (method block) - (close)\n";
            }

            // Construtores de classes.
            else if (node.function_declaration.type == VERBUM_FUNCTION_CLASS_CONSTRUCTOR) {
                this->tab();
                cout << "-> function (class constructor) - (open)\n";
                
                // Informações da função.
                this->tab();
                cout << "-> function name: " << node.function_declaration.identifier << "\n";
                
                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
                
                this->tab();
                cout << "-> function (class constructor) - (close)\n";
            }

            // Métodos de interface e classes abstratas.
            else if (node.function_declaration.type == VERBUM_FUNCTION_INTERFACE_ABSTRACT) {
                this->tab();
                cout << "-> function (interface-abstract method) - (open)\n";
                
                // Informações da função.
                this->tab();
                cout << "-> function name: " << node.function_declaration.identifier << "\n";
                
                if (node.function_declaration.ret_found) {
                    this->tab();
                    cout << "-> ret type: " << node.function_declaration.ret_data << "\n";
                }

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;
                
                this->tab();
                cout << "-> function (interface-abstract method) - (close)\n";
            }
        }

        //
        // Parâmetros da declaração da função / método.
        //
        else if (node.type == VERBUM_FUNCTION_PARAM_ITEM) {
            this->tab();
            cout << "-> function-param item: ";
            cout << node.function_param_item << " -> " << node.function_param_type << "\n";
            
        }

        //
        // Bloco de código da declaração da função.
        //
        else if (node.type == VERBUM_FUNCTION_CODE_BLOCK) {
            this->tab();
            cout << "-> function code block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> function code block (close)\n";
        }

        /*
        ** Parâmetros da função anônima.
        */
        else if (node.type == VERBUM_ANONYMOUS_FUNCTION_PARAM) {
            this->tab();
            cout << "-> anonymous-function-param - open\n";

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> anonymous-function-param - close\n";
        }

        /*
        ** OOP.
        */

        //
        // Interfaces.
        //
        else if (node.type == VERBUM_OOP_INTERFACE) {
            this->tab();
            cout << "-> interface (open)\n";
            this->tab();
            cout << "-> name: " << node.interface.identifier_a << "\n";

            // Verifica se há herança.
            if (node.interface.extends) {
                this->tab();
                cout << "-> inheritance: " << node.interface.identifier_b << "\n";
            }

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> interface (close)\n";
        }

        else if (node.type == VERBUM_OOP_INTERFACE_CODE_BLOCK) {
            this->tab();
            cout << "-> interface code block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> interface code block (close)\n";
        }

        //
        // Abstrações.
        //
        else if (node.type == VERBUM_OOP_ABSTRACT) {
            this->tab();
            cout << "-> abstract (open)\n";
            this->tab();
            cout << "-> name: " << node.abstract.identifier_a << "\n";

            // Verifica se há herança.
            if (node.abstract.extends) {
                this->tab();
                cout << "-> inheritance: " << node.abstract.identifier_b << "\n";
            }

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> abstract (close)\n";
        }

        else if (node.type == VERBUM_OOP_ABSTRACT_CODE_BLOCK) {
            this->tab();
            cout << "-> abstract code block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> abstract code block (close)\n";
        }

        /*
        ** Classe.
        */
        else if (node.type == VERBUM_OOP_CLASS) {
            this->tab();
            cout << "-> class (open)\n";
            
            // Nome da classe.
            this->tab();
            cout << "-> name: " << node.vclass.identifier_a << "\n";

            // Verifica se é classe anônima.
            if (node.anonymous_class) {
                this->tab();
                cout << "-> anonymous class\n";

                // Verifica se há chamada de método.
                this->tab();
                cout << "-> anonymous-method-call: " << node.anonymous_class_method << "\n";
            }
            
            // Verifica se há herança.
            if (node.vclass.extends) {
                this->tab();
                cout << "-> inheritance: " << node.vclass.identifier_b << "\n";
            }

            // Verifica se há implementação de interface.
            if (node.vclass.implements) {
                this->tab();
                cout << "-> implements: " << node.vclass.identifier_c << "\n";
            }

            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> class (close)\n";
        }

        // Bloco de código.
        else if (node.type == VERBUM_OOP_CLASS_CODE_BLOCK) {
            this->tab();
            cout << "-> class code block (open)\n";
            
            this->block_counter++;
            this->verbum_recursive_ast(node.nodes);
            this->block_counter--;

            this->tab();
            cout << "-> class code block (close)\n";
        }

        /*
        ** Tokens: break e next (for).
        */
        else if (node.type == VERBUM_TOKEN_BREAK) {
            this->tab();
            cout << "break (for)\n";
        }

        else if (node.type == VERBUM_TOKEN_NEXT) {
            this->tab();
            cout << "next (for)\n";
        }

        /*
        ** Valores gerais.
        */
        else if (node.type == VERBUM_GENERAL_VALUE) {

            // Verifica se há 'not'.
            if (node.general_value_not) {
                this->tab();
                cout << "(not)\n";
            }
            
            // Dados simples.
            if (node.general_value_data.type == VERBUM_DATA_IDENTIFIER      ||
                node.general_value_data.type == VERBUM_DATA_INTEGER         ||
                node.general_value_data.type == VERBUM_DATA_STRING          ||
                node.general_value_data.type == VERBUM_DATA_FLOAT            )
            {
                if (node.general_value_data.type == VERBUM_DATA_IDENTIFIER) {

                    // Pré inc/dec.
                    if (node.operation_data.mod_inc_dec == VERBUM_OP_INCDEC_PRE) {
                        this->tab();

                        switch (node.operation_data.type_inc_dec) {
                            case VERBUM_OP_TYPE_INC: cout << "++ (pre)\n"; break;
                            case VERBUM_OP_TYPE_DEC: cout << "-- (pre)\n"; break;
                        }
                    }

                    this->tab();
                    cout << node.general_value_data.identifier << " (s.identifier)\n";

                    // Pós inc/dec.
                    if (node.operation_data.mod_inc_dec == VERBUM_OP_INCDEC_POS) {
                        this->tab();

                        switch (node.operation_data.type_inc_dec) {
                            case VERBUM_OP_TYPE_INC: cout << "++ (pos)\n"; break;
                            case VERBUM_OP_TYPE_DEC: cout << "-- (pos)\n"; break;
                        }
                    }
                } 

                else {
                    this->tab();
                    cout << "-> value: ";

                    if (node.general_value_data.type == VERBUM_DATA_INTEGER) 
                        cout << node.general_value_data.integer << " (s.integer)\n";
                    else if (node.general_value_data.type == VERBUM_DATA_STRING) 
                        cout << node.general_value_data.vstring << " (s.string)\n";
                    else if (node.general_value_data.type == VERBUM_DATA_FLOAT) 
                        cout << node.general_value_data.floating << " (s.float)\n";
                }
            }

            /*
            ** Dados complexos.
            */

            // Bloco de operações / sub-elementos.
            else if (node.general_value_data.type == VERBUM_DATA_OPERATION_BLOCK) {
                this->tab();
                cout << "-> operation-block (open)\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> operation-block (close)\n";
            }

            // Array indexado.
            else if (node.general_value_data.type == VERBUM_DATA_INDEX_ARRAY_BLOCK) {
                this->tab();
                cout << "[ <---| array-index-open:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "] <---| array-index-close:\n";
            }

            // Array associativo - bloco.
            else if (node.general_value_data.type == VERBUM_DATA_ASSOC_ARRAY_BLOCK) {
                this->tab();
                cout << "{ <---| array-assoc-open:\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "} <---| array-assoc-close:\n";
            }

            // Array associativo - elementos.
            else if (node.general_value_data.type == VERBUM_DATA_ASSOC_ARRAY_ELEMENT) {
                this->tab();
                cout << "-> key: " << node.general_value_data.identifier << "\n";
            }

            /*
            ** Chamada a função.
            */
            else if (node.general_value_data.type == VERBUM_DATA_FUNCTION_CALL          ||
                     node.general_value_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL   ||
                     node.general_value_data.type == VERBUM_DATA_STATIC_METHOD_CALL      )
            {
                this->tab();

                // Função simples.
                if (node.general_value_data.type == VERBUM_DATA_FUNCTION_CALL) 
                    cout << node.general_value_data.function_name << " (function-call)\n";

                // Chamada a método de objeto instanciado.
                else if (node.general_value_data.type == VERBUM_DATA_INSTANCE_METHOD_CALL)
                    cout << node.general_value_data.object_name << " . " << 
                        node.general_value_data.method_name << " (instance-method-call)\n"; 

                // Chamada a método de objeto estático.
                else if (node.general_value_data.type == VERBUM_DATA_STATIC_METHOD_CALL)
                    cout << node.general_value_data.object_name << " :: " << 
                        node.general_value_data.method_name << " (static-method-call)\n";


                // Processamento dos nodes (filhos).
                this->tab();
                cout << "( <---| open function-block\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << ") <---| close function-block\n";
            }

            // Acesso a atributo de objeto.
            else if (node.general_value_data.type == VERBUM_ATTRIBUTE_OBJECT) {
                this->tab();
                cout << "-> attribute-object-access: ";
                
                cout << "[obj]: " << node.general_value_data.object_name;

                // Tipo do acesso.
                if (node.attribute_object_type == VERBUM_ATTRIBUTE_OBJECT_INSTANCE)
                    cout << " . ";
                else if (node.attribute_object_type == VERBUM_ATTRIBUTE_OBJECT_STATIC)
                    cout << " :: ";
                else 
                    cout << " ?(unknown access) ";

                cout << "[attr]: "<< node.general_value_data.method_name << "\n";
            }

            // Cascading method.
            else if (node.general_value_data.type == VERBUM_FUNCTION_CALL_CASCADING) {
                this->tab();
                cout << "-> cascading method (open)\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> cascading method (close)\n";
            }

            // Chamada a função com acesso a elemento de array.
            else if (node.general_value_data.type == VERBUM_FUNCTION_CALL_ARRAY_ACCESS) {
                this->tab();
                cout << "-> function-call array-access (open)\n";

                this->block_counter++;
                this->verbum_recursive_ast(node.nodes);
                this->block_counter--;

                this->tab();
                cout << "-> function-call array-access (close)\n";
            }

            // Verifica se há conversão de tipo.
            if (node.general_value_type_conversion) {
                this->tab();
                cout << node.general_value_type_conversion_data << " (type conversion)\n";
            }

            // Operação.
            if (node.operation_op != VERBUM_UNKNOWN) {
                this->tab();

                switch (node.operation_op) {

                    // Operadores aritméticos.
                    case VERBUM_OPERATOR_ADD:         cout <<  "+\n"; break;
                    case VERBUM_OPERATOR_SUB:         cout <<  "-\n"; break;
                    case VERBUM_OPERATOR_DIV:         cout <<  "/\n"; break;
                    case VERBUM_OPERATOR_MUL:         cout <<  "*\n"; break;
                    case VERBUM_OPERATOR_PERC:        cout <<  "%\n"; break;

                    // Operadores de atribuição (e outros).
                    case VERBUM_OPERATOR_ATTR:        cout <<  "=\n"; break;
                    case VERBUM_OPERATOR_ADD_EQUAL:   cout << "+=\n"; break;
                    case VERBUM_OPERATOR_SUB_EQUAL:   cout << "-=\n"; break;
                    case VERBUM_OPERATOR_MUL_EQUAL:   cout << "*=\n"; break;
                    case VERBUM_OPERATOR_DIV_EQUAL:   cout << "/=\n"; break;
                    case VERBUM_OPERATOR_PERC_EQUAL:  cout << "%=\n"; break;
                    case VERBUM_OPERATOR_MAJOR:       cout <<  ">\n"; break;
                    case VERBUM_OPERATOR_MINOR:       cout <<  "<\n"; break;
                    case VERBUM_OPERATOR_MAJOR_EQUAL: cout << ">=\n"; break;
                    case VERBUM_OPERATOR_MINOR_EQUAL: cout << "<=\n"; break;
                    case VERBUM_OPERATOR_AND:         cout << "&&\n"; break;
                    case VERBUM_OPERATOR_EQUAL:       cout << "==\n"; break;
                    case VERBUM_OPERATOR_NOT_EQUAL:   cout << "!=\n"; break;
                    case VERBUM_OPERATOR_NOT:         cout <<  "!\n"; break;
                }
            }

        }

    }
}


