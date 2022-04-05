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
  | loop
  | functions
  | ret
  | oopGeneral
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
  : variableModes
  ;

variableModes
  // Declarações.
  :                         Var variableMembers End
  |       methodPerm        Var variableMembers End
  |                  Static Var variableMembers End
  |       methodPerm Static Var variableMembers End
  | Final methodPerm Static Var variableMembers End
  | Final methodPerm        Var variableMembers End 
  | Final                   Var variableMembers End 
  | Final            Static Var variableMembers End 
  
  // Atribuições.
  | variableMembers End
  ;

variableMembers
  : variableDefinition
  | variableDefinition Separator variableMembers
  ;

variableDefinition
  // Uso geral.
  : Identifier variableDefinitionGeneral

  // Acesso a componentes de objeto.
  | objIdentifierA Point       objIdentifierB variableDefinitionGeneral
  | objIdentifierA TwoTwoPoint objIdentifierB variableDefinitionGeneral

  // Acesso a elementos de variavel/array.
  | arrayAccessElements variableDefinitionGeneral
  ;

variableDefinitionGeneral
  // Uso geral.
  :          (Attr | AssignmentOperator)     generalValue
  | TypeSpec (Attr | AssignmentOperator)     generalValue

  // Instanciamento de objeto.
  |          (Attr | AssignmentOperator) New generalValue
  | TypeSpec (Attr | AssignmentOperator) New generalValue
  ;

// Array indexado.
indexArray
  : OpenArIndex                    CloseArIndex
  | OpenArIndex indexArrayElements CloseArIndex
  ;

indexArrayElements
  : generalValue
  | generalValue Separator indexArrayElements
  ;

// Array associativo.
associativeArray
  : OpenBlock                          CloseBlock
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
  : functionCall
  | functionCall          ArithmeticOperator
  | functionCall TypeSpec
  | functionCall TypeSpec ArithmeticOperator

  | Identifier 
  | Identifier          ArithmeticOperator
  | Identifier TypeSpec
  | Identifier TypeSpec ArithmeticOperator

  | firstIncDec Identifier
  | firstIncDec Identifier          ArithmeticOperator
  | firstIncDec Identifier TypeSpec
  | firstIncDec Identifier TypeSpec ArithmeticOperator

  | Identifier lastIncDec
  | Identifier lastIncDec          ArithmeticOperator 
  | Identifier lastIncDec TypeSpec 
  | Identifier lastIncDec TypeSpec ArithmeticOperator 

  | Integer 
  | Integer          ArithmeticOperator
  | Integer TypeSpec
  | Integer TypeSpec ArithmeticOperator

  | Float 
  | Float          ArithmeticOperator
  | Float TypeSpec
  | Float TypeSpec ArithmeticOperator

  | operationBlock
  | operationBlock          ArithmeticOperator
  | operationBlock TypeSpec
  | operationBlock TypeSpec ArithmeticOperator

  | arrayAccessElements 
  | arrayAccessElements          ArithmeticOperator
  | arrayAccessElements TypeSpec
  | arrayAccessElements TypeSpec ArithmeticOperator
  ;

firstIncDec : IncDecOperators ;
lastIncDec  : IncDecOperators ;

// Chamada a função, e métodos de objetos static e instanciados.
callingFunction
  : functionCall End
  ;

functionCall
  : Identifier                         functionCallParam
  | Identifier Point       identifierB functionCallParam
  | Identifier TwoTwoPoint identifierB functionCallParam

  // Acesso a método concatenado (de objeto instanciado).
  | Identifier Point identifierB functionCallParam pointSeparator functionCall
  ;

identifierB : Identifier;
pointSeparator : Point;

functionCallParam
  : OpenOp CloseOp
  | OpenOp functionCallParamElements CloseOp
  ;

functionCallParamElements
  : generalValue
  | generalValue      Separator functionCallParamElements
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

conditionalBlockElements
  : conditionalExpression
  | conditionalExpression conditionalBlockElements
  | sentence
  | sentence conditionalBlockElements
  ;

ifConditions
  : If conditionalExpressionElements callingFunction
  | If conditionalExpressionElements OpenBlock CloseBlock
  | If conditionalExpressionElements OpenBlock conditionalBlockElements CloseBlock
  | If conditionalExpressionElements condBlockElementsLimited
  ;

elifConditions
  : Elif conditionalExpressionElements callingFunction
  | Elif conditionalExpressionElements OpenBlock CloseBlock
  | Elif conditionalExpressionElements OpenBlock conditionalBlockElements CloseBlock
  | Elif conditionalExpressionElements condBlockElementsLimited
  ;

elseConditions
  : Else callingFunction
  | Else OpenBlock CloseBlock
  | Else OpenBlock conditionalBlockElements CloseBlock
  | Else condBlockElementsLimited
  ;

condBlockElementsLimited
  : ifConditions
  | ifConditions conditionalBlockElements
  | loop
  | loop condBlockElementsLimited
  | ret
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
  | Identifier          (ArithmeticOperator | AssignmentOperator)
  | Identifier TypeSpec
  | Identifier TypeSpec (ArithmeticOperator | AssignmentOperator)

  | firstIncDec Identifier
  | firstIncDec Identifier          (ArithmeticOperator | AssignmentOperator)
  | firstIncDec Identifier TypeSpec
  | firstIncDec Identifier TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Identifier lastIncDec
  | Identifier lastIncDec          (ArithmeticOperator | AssignmentOperator) 
  | Identifier lastIncDec TypeSpec 
  | Identifier lastIncDec TypeSpec (ArithmeticOperator | AssignmentOperator) 

  | Integer 
  | Integer          (ArithmeticOperator | AssignmentOperator)
  | Integer TypeSpec
  | Integer TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Float 
  | Float          (ArithmeticOperator | AssignmentOperator)
  | Float TypeSpec
  | Float TypeSpec (ArithmeticOperator | AssignmentOperator)

  | functionCall
  | functionCall          (ArithmeticOperator | AssignmentOperator)
  | functionCall TypeSpec
  | functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)

  | Identifier Attr functionCall
  | Identifier Attr functionCall          (ArithmeticOperator | AssignmentOperator)
  | Identifier Attr functionCall TypeSpec
  | Identifier Attr functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)

  | operationBlock
  | operationBlock          (ArithmeticOperator | AssignmentOperator)
  | operationBlock TypeSpec
  | operationBlock TypeSpec (ArithmeticOperator | AssignmentOperator)

  | arrayAccessElements 
  | arrayAccessElements          (ArithmeticOperator | AssignmentOperator)
  | arrayAccessElements TypeSpec
  | arrayAccessElements TypeSpec (ArithmeticOperator | AssignmentOperator)
  ;

// Loops.
loop
  : For loopExpression OpenBlock                   CloseBlock
  | For loopExpression OpenBlock loopBlockElements CloseBlock
  | For loopExpression callingFunction
  | For loopExpression loopBlockElementsLimited
  ;

loopExpression
  : OpenOp loopOneMembers End loopTwoMembers End loopThreeMembers CloseOp
  |        loopOneMembers End loopTwoMembers End loopThreeMembers
  | conditionalExpressionElements
  | OpenOp                                                        CloseOp
  |
  ;

loopOneMembers
  : variableMembers
  |
  ;

loopTwoMembers
  : conditionalExpressionElements
  |
  ;

loopThreeMembers
  : loopThreeMembersValues
  |
  ;

loopThreeMembersValues
  : operationElements
  | operationBlock
  | operationElements Separator loopThreeMembersValues
  | operationBlock    Separator loopThreeMembersValues
  ;

loopBlockElements
  : sentence
  | sentence loopBlockElements
  ;

loopBlockElementsLimited
  : ifConditions
  | ifConditions loopBlockElementsLimited
  | loop
  | loop loopBlockElementsLimited
  | ret
  ;

/*
** Comando de retorno (ret).
*/

ret
  : Ret retValues End
  ;

retValues
  : generalValue
  | operationElements
  | operationBlock
  ;

/*
** Funções e métodos.
*/
functions
  : functionsModes       OpenBlock                   CloseBlock
  | functionsModes       OpenBlock functionCodeBlock CloseBlock
  | functionMethodsModes OpenBlock                   CloseBlock
  | functionMethodsModes OpenBlock functionCodeBlock CloseBlock
  | constructClassMethod OpenBlock                   CloseBlock
  | constructClassMethod OpenBlock functionCodeBlock CloseBlock
  | interfaceMethod End
  ;

functionGeneralModes
  : Function Identifier OpenOp                CloseOp
  | Function Identifier OpenOp                CloseOp ArrowRight Identifier
  | Function Identifier OpenOp functionParams CloseOp
  | Function Identifier OpenOp functionParams CloseOp ArrowRight Identifier
  ;

// Funções.
functionsModes
  : functionGeneralModes
  ;

// Métodos.
functionMethodsModes
  :       methodPerm        functionGeneralModes
  |                  Static functionGeneralModes
  |       methodPerm Static functionGeneralModes
  | Final methodPerm Static functionGeneralModes
  | Final methodPerm        functionGeneralModes 
  | Final                   functionGeneralModes 
  | Final            Static functionGeneralModes 
  ;

methodPerm
  : Pub | Pro | Priv
  ;

// Método construtor da classe.
constructClassMethod
  : Identifier OpenOp                CloseOp
  | Identifier OpenOp functionParams CloseOp
  ;

// Métodos de interfaces e classes abstratas.
interfaceMethod
  : functionsModes
  | functionMethodsModes
  ;

// Controles gerais.
functionCodeBlock
  : sentence
  | sentence functionCodeBlock
  ;

functionParams
  : functionParamElements
  | functionParamElements Separator functionParams
  ;

functionParamElements
  : Identifier TypeSpec
  ;

/*
** Questões gerais da orientação à objetos.
*/

// Regras que vão no controlador geral.
oopGeneral
  : interfaceClass
  | abstractClass
  | classDefination
  ;

// Interface e classe abstrata.
interfaceClass
  : interfaceClassDefinition
  ;

interfaceClassDefinition
  : Interface Identifier                    OpenBlock                   CloseBlock
  | Interface Identifier                    OpenBlock functionCodeBlock CloseBlock
  | Interface Identifier Extends Identifier OpenBlock                   CloseBlock
  | Interface Identifier Extends Identifier OpenBlock functionCodeBlock CloseBlock
  ;

abstractClass
  : abstractClassDefinition
  ;

abstractClassDefinition
  : Abstract Identifier                    OpenBlock                   CloseBlock
  | Abstract Identifier                    OpenBlock functionCodeBlock CloseBlock
  | Abstract Identifier Extends Identifier OpenBlock                   CloseBlock
  | Abstract Identifier Extends Identifier OpenBlock functionCodeBlock CloseBlock
  ;

// Definição de classe.
classDefination
  : classModesGeneral OpenBlock                   CloseBlock
  | classModesGeneral OpenBlock functionCodeBlock CloseBlock
  ;

classModesGeneral
  : classModes
  | Final classModes
  ;

classModes
  : Class Identifier
  | Class Identifier Extends    Identifier
  | Class Identifier Implements Identifier
  | Class Identifier Extends    Identifier Implements Identifier
  ;

/*
** Controle do acesso a elementos de array.
*/
arrayAccessElements
  : Identifier  
  | Identifier               Point arrayAccessElements
  | Identifier accessBlockAr
  | Identifier accessBlockAr Point arrayAccessElements
  ;

accessBlockAr
  : OpenArIndex arrayIndexAccess CloseArIndex 
  | OpenArIndex arrayIndexAccess CloseArIndex accessBlockAr
  ;

arrayIndexAccess
  : (Integer | Identifier)
  | operationElements
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
  | Identifier  TypeSpec
  | Integer                 // Números inteiros.
  | Integer     TypeSpec
  | Float                   // Número de ponto flutuante, incluindo, por exemplo: 0.123.
  | Float       TypeSpec
  | String                  // Strings com aspas simples e duplas.
  
  | indexArray              // Array indexado.
  | associativeArray        // Array associativo.
  | operationElements       // Elementos de operações (suportando blocos de operações).
  | functionCall            // Chamada de função.

  // Acesso a componentes de objeto.
  | objIdentifierA Point       objIdentifierB
  | objIdentifierA TwoTwoPoint objIdentifierB

  // Acesso a elementos de arrays.
  | arrayAccessElements
  ;

objIdentifierA : Identifier;
objIdentifierB : Identifier;


