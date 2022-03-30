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

/*
** Regras de uso geral.
**
** Utilizada por:
**    Variáveis - variableValue
*/
generalValue
  : Identifier
  | String
  | Integer
  | Float
  | Bool
  ;


