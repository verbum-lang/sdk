
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

  | blockCode
  | blockLiveTokens
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
  : Class (identifier)? (Extends identifierB)? (Implements identifierC)? classCodeBlock
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
** Utilizado para:
**    Valores comuns (atribuições)
**    Operações aritméticas
**    Operações relacionais/condicionais
**    Operações de incremento/decremento
*/
generalValue

  // Valores simples.
  : (
      (Not)? (incDecOperatorsA)? identifier (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Integer (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Float (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? String (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
    )

  // Valores complexos.
  | (Not)? functionCall (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | (Not)? OpenOp blockFunction CloseOp (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | (Not)? (incDecOperatorsA)? blockArray (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | blockFunctionDeclarationAttr
  | blockClass

  // Inicialização de array vazio (indexado e associativo).
  | (OpenBlock CloseBlock | OpenArIndex CloseArIndex)

  // Chamada simples a atributos de objetos - simples.
  | (Not)? identifier (Point | TwoTwoPoint) identifierB (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
    
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
identifier : Identifier;
identifierB : Identifier;
identifierC : Identifier;
incDecOperatorsA : IncDecOperators;
incDecOperatorsB : IncDecOperators;

/*
** Live tokens...
*/
blockLiveTokens
  : (
      // Var |
      // If |
      // Elif |
      // Else |
      // For |
      // Ret |
      // Function |
      // Interface |
      // Abstract |
      // Class |
      // Implements |
      // Extends |
      // Break |
      // Next |
      // Await |
      // Try |
      // Catch |
      // OpenBlock |
      // CloseBlock |
      // ArrowRight |
      // Not |
      New |
      ARightLB |
      End |
      Attr |
      Point |
      TwoPoint |
      TwoTwoPoint |
      Separator |
      OpenArIndex |
      CloseArIndex |
      Pub |
      Pro |
      Priv |
      Static |
      Final |
      Async |
      OpenOp |
      CloseOp |
      ArithmeticOperator |
      AssignmentOperator |
      IncDecOperators |
      Identifier |
      TypeSpec |
      Integer |
      Float |
      String
    )
  ;


