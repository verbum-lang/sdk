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
  : sentence
  | sentence fileContent
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
  | anonymousClassCall
  | anonymousObjectCall
  
  // Múltiplas atribuições (a = b = c = d).
  | variableMultipleAssignments
  ;

// Tokens que podem ir soltos no código.
liveToken
  : Newline
  | breakFor
  | nextFor
  ;

// Controles do comando for.
breakFor
  : Break End
  ;

nextFor
  : Next End
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
  :                  Var variableMembers End
  | methodVisibility Var variableMembers End

  // Atribuições.
  | variableMembers End
  ;

variableModesBkp
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
  :          (Attr | AssignmentOperator)               generalValue
  | TypeSpec (Attr | AssignmentOperator)               generalValue

  // Instanciamento de objeto ou espera de chamada à funções assíncronas.
  |          (Attr | AssignmentOperator) (New | Await) generalValue
  | TypeSpec (Attr | AssignmentOperator) (New | Await) generalValue
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

// Chamdas comuns.
functionCall
  : Identifier                         functionCallParam
  | Identifier Point       identifierB functionCallParam
  | Identifier TwoTwoPoint identifierB functionCallParam
  | methodCascadingModes

  // Chamada a funções a partir de acesso a elementos de array.
  | arrayAccessElements functionCallParamAC
  ;

functionCallParamAC
  : functionCallParam
  ;

// Método concatenado.
methodCascadingModes
  : Identifier (Point | TwoTwoPoint) functionCallCascading
  ;

functionCallCascading
  : functionCallCascadingItem 
  | functionCallCascadingItem (Point | TwoTwoPoint) functionCallCascading
  ;

functionCallCascadingItem
  : identifierB functionCallParam
  | arrayAccessElements functionCallParamAC
  | Identifier
  ;

identifierB    : Identifier;
pointSeparator : Point;

// Parâmetros das funções.
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

/*
** Expressões condicionais (if, elif, else).
*/

// Controle/repetição geral do bloco de expressão.
conditionalExpression
  : conditionalExpressionStructBlock
  | conditionalExpressionStructBlock conditionalExpression
  ;

// Bloco de expressão.
conditionalExpressionStructBlock
  : ifElementUnique
  | ifElementUnique elifElements
  | ifElementUnique              elseElementUnique
  | ifElementUnique elifElements elseElementUnique
  ;

// If.
ifElementUnique
  : If conditionalExpressionItems conditionalBlockElements
  ;

// Elif.
elifElements
  : elifElementUnique
  | elifElementUnique elifElements
  ;

elifElementUnique
  : Elif conditionalExpressionItems conditionalBlockElements
  ;

// Else.
elseElementUnique
  : Else conditionalBlockElements
  ;

// Bloco da expressão condicional.
conditionalExpressionItems
  : conditionalExpressionElements
  ;

// Bloco de comandos.
conditionalBlockElements
  : OpenBlock CloseBlock
  | OpenBlock conditionalBlockElsItems CloseBlock
  | conditionalExpression
  | callingFunction
  | loop
  | ret
  ;

// Código dentro dos blocos.
conditionalBlockElsItems
  : sentence
  | sentence conditionalBlockElsItems
  ;

/*
** Controle do bloco das expressões.
*/
conditionalExpressionElements
  : conditionExpValue
  | conditionExpValue conditionalExpressionElements

  | conditionExpBlock
  | conditionExpBlock conditionalExpressionElements
  ;

// Valores.
conditionExpValue
  : Not conditionalExpValue
  | conditionalExpValue
  ;

// Blocos.
conditionExpBlock
  : conditionExpBlockItemValue
  | Not conditionExpBlockItemValue
  ;

conditionExpBlockItemValue
  : conditionExpBlockItem
  | conditionExpBlockItem          (ArithmeticOperator | AssignmentOperator)
  | conditionExpBlockItem TypeSpec (ArithmeticOperator | AssignmentOperator)
  ;

conditionExpBlockItem
  : OpenOp conditionalExpressionElements CloseOp
  ;

// Valores padrões.
conditionalExpValue
  : firstIncDec Identifier
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

  | functionCallAndAttr

  | functionCall
  | functionCall          (ArithmeticOperator | AssignmentOperator)
  | functionCall TypeSpec
  | functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)

  | operationBlock
  | operationBlock          (ArithmeticOperator | AssignmentOperator)
  | operationBlock TypeSpec
  | operationBlock TypeSpec (ArithmeticOperator | AssignmentOperator)
  
  | Identifier 
  | Identifier          (ArithmeticOperator | AssignmentOperator)
  | Identifier TypeSpec
  | Identifier TypeSpec (ArithmeticOperator | AssignmentOperator)

  | arrayAccessElements 
  | arrayAccessElements          (ArithmeticOperator | AssignmentOperator)
  | arrayAccessElements TypeSpec
  | arrayAccessElements TypeSpec (ArithmeticOperator | AssignmentOperator)
  ;

// Atribuição com chamada de função.
// Utilizada nos blocos de expressão condicionais.
functionCallAndAttr
  : identifierAttrFn Attr functionCallAttrFn
  ;

identifierAttrFn
  : arrayAccessElements   
  | Identifier
  ;

functionCallAttrFn
  : functionCallAttrFnItem
  ;

functionCallAttrFnItem
  : functionCall
  | functionCall          (ArithmeticOperator | AssignmentOperator)
  | functionCall TypeSpec
  | functionCall TypeSpec (ArithmeticOperator | AssignmentOperator)
  ;

/*
** Loops.
*/

// Controle geral.
loop
  : loopExpressionItems
  | loopExpressionItems loop
  ;

loopExpressionItems
  : For loopExpression loopBlockElementsLimited
  ;

// Tipos de expressões.
loopExpression
  : loopInfinite
  | loopComplete
  | loopConditional
  ;

// Tipos de loop.
loopInfinite
  : OpenOp CloseOp
  | 
  ;

loopComplete
  : OpenOp loopOneMembers endOne loopTwoMembers endTwo loopThreeMembers CloseOp
  |        loopOneMembers endOne loopTwoMembers endTwo loopThreeMembers
  ;

loopConditional
  : loopTwoMembers
  ;

endOne : End;
endTwo : End;

loopOneMembers
  : variableMembers
  | Var variableMembers
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
  | operationElements Separator loopThreeMembersValues
  ;

// Bloco de código.
loopBlockElements
  : sentence
  | sentence loopBlockElements
  ;

// Bloco de código - modalidades.
loopBlockElementsLimited
  : OpenBlock CloseBlock
  | OpenBlock loopBlockElements CloseBlock
  | conditionalExpression
  | callingFunction
  | loop
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

// Funções.
functionsModes
  : functionGeneralModes
  ;

functionGeneralModes
  : Function Identifier OpenOp                CloseOp
  | Function Identifier OpenOp                CloseOp ArrowRight (identifierRet | TypeSpec)
  | Function Identifier OpenOp functionParams CloseOp
  | Function Identifier OpenOp functionParams CloseOp ArrowRight (identifierRet | TypeSpec)
  ;

identifierRet
  : Identifier
  ;

// Métodos.
functionMethodsModes
  : methodVisibility functionGeneralModes
  ;

functionMethodsModesBkp
  :       methodPerm        functionGeneralModes
  |                  Static functionGeneralModes
  |       methodPerm Static functionGeneralModes
  | Final methodPerm Static functionGeneralModes
  | Final methodPerm        functionGeneralModes 
  | Final                   functionGeneralModes 
  | Final            Static functionGeneralModes 
  ;

// Visibilidade.
methodPerm
  : Pub | Pro | Priv
  ;

visibilityItems
  : Pub | Pro | Priv | Final | Static | Async
  ;

methodVisibility
  : visibilityItems
  | visibilityItems methodVisibility
  ;

// Método construtor da classe.
constructClassMethod
  : Identifier OpenOp                CloseOp
  | Identifier OpenOp functionParams CloseOp
  ;

// Métodos de interfaces, e métodos de classes abstratas.
// Os mesmos são finalizados com ponto-e-vírgula.
interfaceMethod
  : functionsModes
  | functionMethodsModes
  ;

//
// Controles gerais.
//

// Bloco de código da declaração da função.
functionCodeBlock
  : functionCodeBlockElements
  ;

functionCodeBlockElements
  : sentence
  | sentence functionCodeBlockElements
  ;

// Parâmetros da declaração da função.
functionParams
  : functionParamsControl
  ;

functionParamsControl
  : functionParamElements
  | functionParamElements Separator functionParamsControl
  ;

functionParamElements
  : Identifier TypeSpec
  ;

/*
** Questões gerais da orientação à objetos.
*/

// Regras que vão no controlador geral.
oopGeneral

  // Modos de uso gerais.
  : interfaceClass
  | abstractClass
  | classDefination
  
  // Classe anônima.
  | anonymousClass
  ;

// Interface.
interfaceClass
  : interfaceClassDefinition
  ;

interfaceClassDefinition
  : Interface Identifier                     OpenBlock                    CloseBlock
  | Interface Identifier                     OpenBlock interfaceCodeBlock CloseBlock
  | Interface Identifier Extends identifierB OpenBlock                    CloseBlock
  | Interface Identifier Extends identifierB OpenBlock interfaceCodeBlock CloseBlock
  ;

interfaceCodeBlock
  : functionCodeBlockElements
  ;

// Classe abstrata.
abstractClass
  : abstractClassDefinition
  ;

abstractClassDefinition
  : Abstract Identifier                     OpenBlock                   CloseBlock
  | Abstract Identifier                     OpenBlock abstractCodeBlock CloseBlock
  | Abstract Identifier Extends identifierB OpenBlock                   CloseBlock
  | Abstract Identifier Extends identifierB OpenBlock abstractCodeBlock CloseBlock
  ;

abstractCodeBlock
  : functionCodeBlockElements
  ;

// Definição de classe.
classDefination
  : classModes OpenBlock                CloseBlock
  | classModes OpenBlock classCodeBlock CloseBlock
  ;

classCodeBlock
  : functionCodeBlockElements
  ;

classModes
  :       Class Identifier
  |       Class Identifier Extends    identifierB
  |       Class Identifier Implements identifierB
  |       Class Identifier Extends    identifierB Implements identifierC

  | Final Class Identifier
  | Final Class Identifier Extends    identifierB
  | Final Class Identifier Implements identifierB
  | Final Class Identifier Extends    identifierB Implements identifierC
  ;

identifierC
  : Identifier
  ;

/*
** Classes anônimas.
*/
anonymousClassCall
  : anonymousClassCallExpr End
  ;

anonymousClassCallExpr
  : OpenOp anonymousClass CloseOp (Point | TwoTwoPoint) functionCallCascading
  | OpenOp anonymousClass CloseOp
  ;

anonymousClass
  : New Class OpenBlock CloseBlock
  | New Class OpenBlock anonymousClassElements CloseBlock
  ;

anonymousClassElements
  : sentence
  | sentence anonymousClassElements
  ;

/*
** Controle do acesso a elementos de array.
*/
arrayAccessElements
  : arrayAccessElementsItems
  | arrayAccessElementsItems arrayAccessElements
  ;

arrayAccessElementsItems
  : Identifier  
  | Identifier               Point
  | Identifier accessBlockAr
  | Identifier accessBlockAr Point

  | firstIncDec Identifier  
  |             Identifier               Point
  | firstIncDec Identifier accessBlockAr
  |             Identifier accessBlockAr Point

  | Identifier               lastIncDec
  | Identifier                          Point
  | Identifier accessBlockAr lastIncDec
  | Identifier accessBlockAr            Point
  ;

accessBlockAr
  : OpenArIndex arrayIndexAccess CloseArIndex 
  | OpenArIndex arrayIndexAccess CloseArIndex accessBlockAr
  ;

arrayIndexAccess
  : operationElements
  ;

/*
** Funções anônimas.
*/
anonymousFunction
  : OpenOp anFnItems CloseOp
  | OpenOp anFnItems CloseOp OpenOp CloseOp
  | OpenOp anFnItems CloseOp OpenOp operationElements CloseOp
  ;

// O mesmo que 'function'.
anFnItems
  : functionsModesFn OpenBlock                   CloseBlock
  | functionsModesFn OpenBlock functionCodeBlock CloseBlock
  ;

// Funções.
functionsModesFn
  : Function OpenOp                CloseOp
  | Function OpenOp                CloseOp ArrowRight (identifierRet | TypeSpec)
  | Function OpenOp functionParams CloseOp
  | Function OpenOp functionParams CloseOp ArrowRight (identifierRet | TypeSpec)
  ;

/*
** Instanciamento anônimo de objetos.
*/
anonymousObjectCall
  : anonymousObjectCallExpr End
  ;

anonymousObjectCallExpr
  : OpenOp anonymousObject CloseOp (Point | TwoTwoPoint) functionCallCascading
  | OpenOp anonymousObject CloseOp
  ;

anonymousObject
  : New Identifier functionCallParam
  | New Identifier functionCallParam (Point | TwoTwoPoint) functionCallCascading
  ;

/*
** Atribuições múltiplas (a = b = c = d).
*/
variableMultipleAssignments
  : variableMultipleAssignmentsModes Attr generalValue End
  ;

variableMultipleAssignmentsModes
  : variableMultipleAItems  
  | variableMultipleAItems Attr variableMultipleAssignmentsModes
  ;

variableMultipleAItems
  : Identifier              // Identificadores: nome de tipos de variáveis, nome de variáveis, funções e métodos, classes / objetos, interface, abstração.
  | Identifier  TypeSpec
  
  | functionCall            // Chamada de função.
                            // Especificado para fazer uso do cascading method. 

  // Acesso a elementos de arrays.
  | arrayAccessElements
  ;

/*
** Funções lambda
*/
lambdaFunctions
  : OpenOp lambdaFnParams CloseOp lambdaFnRet lambdaFnCodeBlock
  ;

lambdaFnParams
  : lambdaFnParamsItems
  |
  ;

lambdaFnRet
  : ArrowRight (Identifier | TypeSpec)
  |
  ;

lambdaFnCodeBlock
  : ARightLB lambdaFnCodeBlockSimple
  | ARightLB lambdaFnCodeBlockKey 
  ;

lambdaFnCodeBlockSimple
  : operationElements
  ;

lambdaFnCodeBlockKey
  : OpenBlock CloseBlock
  | OpenBlock lambdaFnCodeBlockItemsControl CloseBlock
  ;

lambdaFnCodeBlockItemsControl
  : lambdaFnCodeBlockItems
  ;

lambdaFnCodeBlockItems
  : sentence
  | sentence lambdaFnCodeBlockItems
  ;

// Parâmetros.
lambdaFnParamsItems
  : lambdaFnParamsControl
  ;

lambdaFnParamsControl
  : lambdaFnParamsElements
  | lambdaFnParamsElements Separator lambdaFnParamsControl
  ;

lambdaFnParamsElements
  : Identifier TypeSpec
  | Identifier
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
  | functionCall            // Chamada de função.

  // Acesso a componentes de objeto.
  | objIdentifierA Point       objIdentifierB
  | objIdentifierA TwoTwoPoint objIdentifierB

  // Acesso a elementos de arrays.
  | arrayAccessElements

  // Funções anônimas.
  | anonymousFunction

  // Classes anônimas.
  | anonymousClassCallExpr
  | anonymousClass

  // Instanciamento anônimo de objetos.
  | anonymousObjectCallExpr

  // Elementos de operações (suportando blocos de operações).
  | operationElements

  // Funções lambdas.
  | lambdaFunctions
  ;

objIdentifierA : Identifier;
objIdentifierB : Identifier;


