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
  : Newline // Utilizar para contagem de linhas lidas.
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

// Expressões condicionais (if, elif, else).

// Regra que vai no controlador geral.
conditionalExpression
  : ifConditions
  | elifConditions
  | elseConditions
  ;

blockElements
  : conditionalExpression
  | conditionalExpression blockElements
  | sentence
  | sentence blockElements
  ;

ifConditions
  : If conditionalExpressionElements callingFunction
  | If conditionalExpressionElements OpenBlock CloseBlock
  | If conditionalExpressionElements OpenBlock blockElements CloseBlock
  | If conditionalExpressionElements blockElementsLimited
  ;

elifConditions
  : Elif conditionalExpressionElements callingFunction
  | Elif conditionalExpressionElements OpenBlock CloseBlock
  | Elif conditionalExpressionElements OpenBlock blockElements CloseBlock
  | Elif conditionalExpressionElements blockElementsLimited
  ;

elseConditions
  : Else callingFunction
  | Else OpenBlock CloseBlock
  | Else OpenBlock blockElements CloseBlock
  | Else blockElementsLimited
  ;

blockElementsLimited
  : ifConditions
  | ifConditions blockElements
  ;

// Controle do bloco das expressões.
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


