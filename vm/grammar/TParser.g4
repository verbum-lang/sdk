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
  | Function Identifier OpenOp                CloseOp ArrowRight (Identifier | TypeSpec)
  | Function Identifier OpenOp functionParams CloseOp
  | Function Identifier OpenOp functionParams CloseOp ArrowRight (Identifier | TypeSpec)
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

// Métodos de interfaces, e métodos de classes abstratas.
// Os mesmos são finalizados com ponto-e-vírgula.
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


