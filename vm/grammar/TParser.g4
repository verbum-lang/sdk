
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Gramática da linguagem.
*/

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
  : sentences EOF
  ;

// Sentenças permitidas.
sentences
  : statements
  | statements sentences
  | 
  ;

statements
  : blockUse
  | blockVariable
  | blockRet
  | blockConditional
  | blockLoop
  | blockBreak
  | blockNext
  | blockTryCatch
  | blockFunction
  | blockInterface
  | blockAbstraction
  | blockClass
  | blockFunctionCall
  | blockClassConstructor
  | blockAttribution
  | blockMultipleAssignments
  | blockCode
  | blockPermissionTokens
  ;

/*
** Bloco de código - { ... }
*/
blockCode
  : ( OpenBlock CloseBlock |
      OpenBlock sentences CloseBlock )
  ;

/*
** Importações.
*/ 
blockUse
  : Use useValue End
  ;

useValue
  : useString
  | useString Separator useValue
  ;

useString
  : String
  ;

/*
** Variáveis.
*/
blockVariable
  : Var variableItem End
  ;

// Declaração.
variableItem

  // Inicialização com valor geral.
  : variablePrefixModes (New | Await)? generalValueElements (Separator variableItem)*
  ;

// Expressões.
variablePrefixModes

  // Comum.
  : (identifier | identifier TypeSpec) (Attr | AssignmentOperator)
  ; 

/*
** Chamadas a funções.
*/

// Atribuição de valor.
functionCall
  : functionCallPrefix (identifier)? functionCallParam
  ;

functionCallPrefix
  : identifier
  | identifier Point
  | identifier TwoTwoPoint
  ;

functionCallParam
  : OpenOp CloseOp
  | OpenOp functionCallParamElements CloseOp
  ;

functionCallParamElements
  : generalValue (Separator functionCallParamElements)*
  ;

/*
** Ret (return).
*/
blockRet
  : Ret generalValueElements End
  ;

/*
** Condicionais.
*/
blockConditional
  : ifElementUnique (elifElements)? (elseElementUnique)?
  ;

// If.
ifElementUnique
  : If conditionalBlockExpression conditionalBlockElements
  ;

// Elif.
elifElements
  : elifElementUnique (elifElements)*
  ;

elifElementUnique
  : Elif conditionalBlockExpression conditionalBlockElements
  ;

// Else.
elseElementUnique
  : Else conditionalBlockElements
  ;

// Bloco da expressão condicional.
conditionalBlockExpression
  : generalValueElements
  ;

conditionalBlockElements
  : codeBlockFlowControl
  ;

/*
** Loop.
*/
blockLoop
  : For (loopInfinite | loopConditional | loopComplete ) loopBlockElements
  ;

loopBlockElements
  : codeBlockFlowControl
  ;

// Tipos de loop.
loopComplete
  : (OpenOp)? loopOneMembers endOne loopTwoMembers endTwo loopThreeMembers (CloseOp)?
  ;

loopConditional
  : loopTwoMembers
  ;

loopInfinite
  : OpenOp CloseOp
  | 
  ;

endOne : End;
endTwo : End;

loopOneMembers
  : Var variableItem
  |
  ;

loopTwoMembers
  : generalValueElements
  |
  ;

loopThreeMembers
  : loopThreeMembersValues
  |
  ;

loopThreeMembersValues
  : generalValueElements (Separator generalValueElements)*
  ;

// Comandos complementares.
blockBreak
  : Break End
  ;

blockNext
  : Next End
  ;

/*
** Try, catch.
*/
blockTryCatch
  : tryUniqueElement (catchUniqueElement)?
  ;

tryUniqueElement
  : Try tryCatchElements
  ;

catchUniqueElement
  : Catch (OpenOp)? identifier (CloseOp)? tryCatchElements
  ;

tryCatchElements
  : codeBlockFlowControl
  ;

/*
** Declaração das funções.
*/
blockFunction
  // Chamada com passagem de parâmetros.
  : OpenOp
      Function (identifier)? OpenOp (functionParam)? CloseOp 
      (ArrowRight (identifierB | TypeSpec) )? functionCodeBlock
    CloseOp
    OpenOp
      (functionAnonymousParam)?
    CloseOp
    End

  // Funções comuns e anônimas (incluindo definição para interfaces e classes abstratas).
  | Function (identifier)? OpenOp (functionParam)? CloseOp 
      (ArrowRight (identifierB | TypeSpec) )? (functionCodeBlock | End)
  ;

// Utilizado na atribuição de valores a variáveis.
blockFunctionDeclarationAttr

  // Chamada com passagem de parâmetros.
  : OpenOp
      Function (identifier)? OpenOp (functionParam)? CloseOp 
      (ArrowRight (identifierB | TypeSpec) )? functionCodeBlock
    CloseOp
    OpenOp
      (functionAnonymousParam)?
    CloseOp

  // Chamada comum.
  | Function (identifier)? OpenOp (functionParam)? CloseOp 
      (ArrowRight (identifierB | TypeSpec) )? functionCodeBlock
  ;

functionParam
  : Identifier TypeSpec (Separator functionParam)?
  ;

functionAnonymousParam
  : generalValueElements
  ;

functionCodeBlock
  : codeBlockControl
  ;

/*
** Declaração das interfaces, abstrações.
*/

// Interface.
blockInterface
  : Interface identifier (Extends identifierB)? interfaceCodeBlock
  ;

interfaceCodeBlock
  : codeBlockControl
  ;

// Abstrações.
blockAbstraction
  : Abstract identifier (Extends identifierB)? abstractionCodeBlock
  ;

abstractionCodeBlock
  : codeBlockControl
  ;

/*
** Declaração das classes.
*/
blockClass

  // Classe anônima.
  : openOpA
      New Class (identifier)? (Extends identifierB)? (Implements identifierC)? classCodeBlock
    closeOpA
    (
      ( Point | TwoTwoPoint )
      identifierD
      OpenOp
      (generalValueElements)?
      CloseOp
    )?
    End

  // Definição comum.
  | Class (identifier)? (Extends identifierB)? (Implements identifierC)? classCodeBlock
  ;

blockClassDeclarationAttr

  // Classe anônima.
  : openOpA
      New Class (identifier)? (Extends identifierB)? (Implements identifierC)? classCodeBlock
    closeOpA
    (
      ( Point | TwoTwoPoint )
      identifierD
      OpenOp
      (generalValueElements)?
      CloseOp
    )?

  // Definição comum.
  | Class (identifier)? (Extends identifierB)? (Implements identifierC)? classCodeBlock
  ;

classAnonymousParam
  : generalValueElements
  ;

classCodeBlock
  : codeBlockControl
  ;

/*
** Array indexado e associativo.
*/
blockArray
  : ( indexArray | associativeArray )
  ;

// Array indexado.
indexArray
  : OpenArIndex indexArrayElements CloseArIndex
  ;

indexArrayElements
  : generalValueElements (Separator indexArrayElements)*
  ;

// Array associativo.
associativeArray
  : OpenBlock associativeArrayElements CloseBlock
  ;

associativeArrayElements
  : identifier TwoPoint generalValueElements (Separator associativeArrayElements)*
  ;

/*
** Funções lambda
*/
blockLambdaFunctions
  : OpenOp (lambdaFnParams)? CloseOp (ArrowRight (identifier | TypeSpec))? ARightLB lambdaFnCodeBlock
  ;

lambdaFnParams
  : identifier (TypeSpec)? (Separator lambdaFnParams)*
  ;

lambdaFnCodeBlock
  : codeBlockControl
  | generalValueElements
  ;

/*
** Método contrutor de classe.
*/
blockClassConstructor
  : identifier OpenOp (functionParam)? CloseOp codeBlockControl
  ;

/*
** Chamadas a funções e métodos de objetos instanciados.
*/
blockFunctionCall
  : identifier ( (Point | TwoTwoPoint) identifierB )? OpenOp (functionCallElements)? CloseOp End
  | blockAccessArrayElements OpenOp (functionCallElements)? CloseOp End
  ;

functionCallElements
  : generalValueElements (Separator functionCallElements)*
  ;

/*
** Instanciamento anônimo de objetos.
*/
blockAnonymousObject
  : OpenOp 
      New identifier OpenOp (generalValueElements)? CloseOp
    CloseOp 
    ( (Point | TwoTwoPoint) identifierB OpenOp (generalValueElements)? CloseOp )?
  ;

/*
** Atribuição de valores à variáveis.
*/
blockAttribution
  : attributionElements End
  ;

attributionElements
  : identifier ( (Point | TwoTwoPoint) identifierB )? (Attr | AssignmentOperator) (New | Await)? generalValueElements (Separator attributionElements)*
  ; 

/*
** Atribuições múltiplas (a = b = c = d).
*/
blockMultipleAssignments
  : variableMultipleAssignmentsModes Attr generalValueElements End
  ;

variableMultipleAssignmentsModes
  : generalValue (Attr variableMultipleAssignmentsModes)*
  ;

/*
** Acessa elementos de array.
*/
blockAccessArrayElements
  : arrayAccessElements
  ;

arrayAccessElements
  : arrayAccessElementsItems (arrayAccessElements)*
  ;

arrayAccessElementsItems
  : identifier (accessBlockAr)? (Point)?
  | (firstIncDec)? identifier (accessBlockAr)?  (Point)?
  | identifier (accessBlockAr)? (lastIncDec)? (Point)?
  ;

accessBlockAr
  : OpenArIndex arrayIndexAccess CloseArIndex (accessBlockAr)*
  ;

arrayIndexAccess
  : generalValueElements
  ;

firstIncDec : IncDecOperators ;
lastIncDec  : IncDecOperators ;

/*
** Tokens de visibilidade das variáveis, métodos e configurações de classes (final).
*/
blockPermissionTokens
  : (
      Pub |
      Pro |
      Priv |
      Static |
      Final |
      Async 
    )
  ;

/*
** Controles de blocos de código.
*/

// Bloco de código das expressões condicionais e loops.
codeBlockFlowControl
  : OpenBlock CloseBlock
  | OpenBlock sentences CloseBlock
  | codeBlockFlowControlElements
  ;

codeBlockFlowControlElements
  : functionCall End
  | blockRet
  | blockConditional
  | blockLoop
  | blockTryCatch
  | blockBreak
  | blockNext
  ;

// Funções, classes, etc.
codeBlockControl
  : OpenBlock CloseBlock
  | OpenBlock sentences CloseBlock
  ;

/*
** Valores de uso geral.
** 
** Utilizado para:
**    Valores comuns (atribuições em seus variados modos).
**    Operações aritméticas.
**    Operações relacionais/condicionais.
**    Operações de incremento/decremento.
**    Parâmetros de funções / métodos.
**    Expressões em geral.
*/
generalValue

  // Chamada simples a atributos de objetos - simples.
  : (Not)? identifier (Point | TwoTwoPoint) identifierB (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  
  // Valores simples.
  | (
      (Not)? (incDecOperatorsA)? identifier (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Integer (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Float (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? String (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
    )

  // Valores complexos.
  | (Not)? functionCall (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | (Not)? OpenOp blockFunctionDeclarationAttr CloseOp (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | (Not)? (incDecOperatorsA)? blockArray (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  
  | blockFunctionDeclarationAttr
  | blockClassDeclarationAttr
  | blockLambdaFunctions
  | blockAccessArrayElements
  | blockAnonymousObject

  // Inicialização de array vazio (indexado e associativo).
  | (OpenBlock CloseBlock | OpenArIndex CloseArIndex)

  // Bloco de valores gerais.
  | (Not)? generalValueBlock (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  ;

generalValueBlock
  : OpenOp generalValueItems CloseOp
  ;

generalValueItems
  : generalValue (generalValueItems)*
  ;

// Utiliza valores gerais N vezes.
generalValueElements
  : generalValue (generalValueElements)*
  ;

/*
** Controladores gerais.
*/

// Uso geral.
identifier       : Identifier;
identifierB      : Identifier;
identifierC      : Identifier;
identifierD      : Identifier;
incDecOperatorsA : IncDecOperators;
incDecOperatorsB : IncDecOperators;
openOpA          : OpenOp;
closeOpA         : CloseOp;


