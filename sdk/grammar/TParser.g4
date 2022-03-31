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
  | use
  | variable
  ;

// Tokens que podem ir soltos no código.
liveTokens
  : Newline
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
  : Identifier Attr generalValue
  | Identifier TypeSpec Attr generalValue
  ;

// Array indexado.
indexArray
  : OpenArIndex CloseArIndex
  | OpenArIndex indexArrayElements CloseArIndex
  ;

indexArrayElements
  : generalValue
  | generalValue Separator indexArrayElements
  ;

// Array associativo.
associativeArray
  : OpenBlock CloseBlock
  | OpenBlock associativeArrayElements CloseBlock
  ;

associativeArrayElements
  : Identifier TwoPoint generalValue
  | Identifier TwoPoint generalValue Separator associativeArrayElements
  ;

// Bloco de operações (em conjunto com elementos aritméticos).
operationBlock
  : OpenOp operationElements CloseOp
  ;

operationElements
  : operationValue
  | operationValue operationElements
  ;

operationValue
  : Identifier 
  | Identifier ArithmeticOperator
  | Identifier TypeSpec
  | Identifier TypeSpec ArithmeticOperator

  | firstIncDec Identifier
  | firstIncDec Identifier ArithmeticOperator
  | firstIncDec Identifier TypeSpec
  | firstIncDec Identifier TypeSpec ArithmeticOperator

  | Identifier lastIncDec
  | Identifier ArithmeticOperator lastIncDec
  | Identifier TypeSpec lastIncDec
  | Identifier TypeSpec ArithmeticOperator lastIncDec

  | Integer 
  | Integer ArithmeticOperator
  | Integer TypeSpec
  | Integer TypeSpec ArithmeticOperator

  | Float 
  | Float ArithmeticOperator
  | Float TypeSpec
  | Float TypeSpec ArithmeticOperator

  | functionCall

  | operationBlock
  | operationBlock ArithmeticOperator
  | operationBlock TypeSpec
  | operationBlock TypeSpec ArithmeticOperator
  ;

firstIncDec : IncDecOperators ;
lastIncDec  : IncDecOperators ;

// Chamada a função, e métodos de objetos static e instanciados.
functionCall
  : Identifier functionCallParam
  | Identifier Point identifierB functionCallParam
  | Identifier TwoTwoPoint identifierB functionCallParam
  ;

identifierB : Identifier;

functionCallParam
  : OpenOp functionCallParamElements CloseOp
  ;

functionCallParamElements
  : generalValue
  | generalValue Separator functionCallParamElements
  ;

/*
** Regras de uso geral.
**
** Utilizada por:
**    Variáveis             - variableValue
**    Array indexado        - indexArrayElements
**    Array associativo     - associativeArrayElements
*/
generalValue
  : Identifier              // Identificadores: nome de tipos de variáveis, nome de variáveis, funções e métodos, classes / objetos, interface, abstração.
  | Identifier TypeSpec
  | String                  // Strings com aspas simples e duplas.
  | Integer                 // Números inteiros.
  | Integer TypeSpec
  | Float                   // Número de ponto flutuante, incluindo, por exemplo: 0.123.
  | Float TypeSpec
  | Bool                    // Valor bool (true, false).  
  | indexArray              // Array indexado.
  | associativeArray        // Array associativo.
  | operationBlock          // Bloco de operações.
  | functionCall
  ;


