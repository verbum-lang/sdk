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
  : liveToken
  | use
  | variable
  | callingFunction
  | conditionalExpression
  ;

// Tokens que podem ir soltos no código.
liveToken
  : Newline
//  | OpenBlock
//  | CloseBlock
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
  | Identifier lastIncDec ArithmeticOperator 
  | Identifier lastIncDec TypeSpec 
  | Identifier lastIncDec TypeSpec ArithmeticOperator 

  | Integer 
  | Integer ArithmeticOperator
  | Integer TypeSpec
  | Integer TypeSpec ArithmeticOperator

  | Float 
  | Float ArithmeticOperator
  | Float TypeSpec
  | Float TypeSpec ArithmeticOperator

  | functionCall
  | functionCall ArithmeticOperator
  | functionCall TypeSpec
  | functionCall TypeSpec ArithmeticOperator

  | operationBlock
  | operationBlock ArithmeticOperator
  | operationBlock TypeSpec
  | operationBlock TypeSpec ArithmeticOperator
  ;

firstIncDec : IncDecOperators ;
lastIncDec  : IncDecOperators ;

// Chamada a função, e métodos de objetos static e instanciados.
callingFunction
  : functionCall End
  ;

functionCall
  : Identifier functionCallParam
  | Identifier Point identifierB functionCallParam
  | Identifier TwoTwoPoint identifierB functionCallParam
  ;

identifierB : Identifier;

functionCallParam
  : OpenOp CloseOp
  | OpenOp functionCallParamElements CloseOp
  ;

functionCallParamElements
  : generalValue
  | generalValue Separator functionCallParamElements
  | operationElements
  | operationElements Separator functionCallParamElements
  ;

// Expressões condicionais (if, elif).
conditionalExpression
  : ifConditions
  | elifConditions
  | elseConditions
  ;

ifConditions
  : If conditionalExpressionElements callingFunction
  | If conditionalExpressionElements OpenBlock blockElements CloseBlock
  | If conditionalExpressionElements ifConditions conditionalExpression
  ;

elifConditions
  : Elif conditionalExpressionElements callingFunction
  | Elif conditionalExpressionElements OpenBlock blockElements CloseBlock
  | Elif conditionalExpressionElements ifConditions conditionalExpression
  ;

elseConditions
  : Else callingFunction
  | Else OpenBlock blockElements CloseBlock
  | Else ifConditions conditionalExpression
  ;

conditionalExpressionElements
  : conditionalExpElementsValue
  | conditionalExpElementsValue conditionalExpressionElements
  | conditionExpBlock
  | conditionExpBlock conditionalExpressionElements
  | Not conditionalExpressionElements
  ;

conditionalExpElementsValue // operationElements equivalent
  : conditionalExpValue
  | conditionalExpValue conditionalExpElementsValue
  ;

conditionExpBlock
  : OpenOp conditionalExpressionElements CloseOp
  | conditionExpBlock AssignmentOperator
  ;

conditionalExpValue
  : Identifier 
  | Identifier (ArithmeticOperator | AssignmentOperator)
  | Identifier TypeSpec
  | Identifier TypeSpec (ArithmeticOperator | AssignmentOperator)

  | firstIncDec Identifier
  | firstIncDec Identifier (ArithmeticOperator | AssignmentOperator)
  | firstIncDec Identifier TypeSpec
  | firstIncDec Identifier TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Identifier lastIncDec
  | Identifier lastIncDec (ArithmeticOperator | AssignmentOperator) 
  | Identifier lastIncDec TypeSpec 
  | Identifier lastIncDec TypeSpec (ArithmeticOperator | AssignmentOperator) 

  | Integer 
  | Integer (ArithmeticOperator | AssignmentOperator)
  | Integer TypeSpec
  | Integer TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Float 
  | Float (ArithmeticOperator | AssignmentOperator)
  | Float TypeSpec
  | Float TypeSpec (ArithmeticOperator | AssignmentOperator)

  | functionCall
  | functionCall (ArithmeticOperator | AssignmentOperator)
  | functionCall TypeSpec
  | functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Identifier Attr functionCall
  | Identifier Attr functionCall (ArithmeticOperator | AssignmentOperator)
  | Identifier Attr functionCall TypeSpec
  | Identifier Attr functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)

  | operationBlock
  | operationBlock (ArithmeticOperator | AssignmentOperator)
  | operationBlock TypeSpec
  | operationBlock TypeSpec (ArithmeticOperator | AssignmentOperator)
  ;

blockElements
  : conditionalExpression
  | conditionalExpression blockElements
  | sentence
  | sentence blockElements
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
  | Integer                 // Números inteiros.
  | Integer TypeSpec
  | Float                   // Número de ponto flutuante, incluindo, por exemplo: 0.123.
  | Float TypeSpec
  | Bool                    // Valor bool (true, false).  
  | String                  // Strings com aspas simples e duplas.
  | indexArray              // Array indexado.
  | associativeArray        // Array associativo.
  | operationBlock          // Bloco de operações.
  | functionCall
  ;


