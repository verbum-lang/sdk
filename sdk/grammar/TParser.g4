parser grammar TParser;

options {
	tokenVocab = TLexer;
}

@parser::postinclude {
  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif
}

// Entrada inicial.
main
  : fileContent EOF
  ;

fileContent
  : fileContent sentence
  |
  ;

// Sentenças permitidas.
sentence
  : liveTokens
  | comment 
  | use
  | variable
  ;

// Tokens que podem ir soltos no código.
liveTokens
  : Newline
  ;

// Comentários.
comment
  : BlockComment
  | LineComment
  ;

// Importações.
use
  : Use useValue End
  ;

useValue
  : useString
  | useString Separator useValue
  ;

useString
  : String
  ;

// Variáveis.
variable
  : Var variableMembers End
  ;

variableMembers
  : variableDefinition
  | variableDefinition Separator variableMembers
  ;

variableDefinition
  : Identifier Attr variableValue
  | Identifier TypeSpec Attr variableValue
  ;

variableValue
  : generalValue
  ;

// Array indexado.
indexArray
  : OpenArIndex CloseArIndex
  | OpenArIndex arrayElements CloseArIndex
  ;

arrayElements
  : generalValue
  | generalValue TypeSpec
  | generalValue Separator arrayElements
  | generalValue TypeSpec Separator arrayElements
  ;

/*
** Regras de uso geral.
**
** Utilizada por:
**    Variáveis - variableValue
*/
generalValue
  : Identifier              // Identificadores: nome de tipos de variáveis, nome de variáveis, funções e métodos, classes / objetos, interface, abstração.
  | String                  // Strings com aspas simples e duplas.
  | Integer                 // Números inteiros.
  | Float                   // Número de ponto flutuante, incluindo, por exemplo: 0.123.
  | Bool                    // Valor bool (true, false).
  | indexArray              // Array indexado.
  ;


