
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
  : blockComments
  | blockUse
  | blockVariable
  | blockRet
  | blockConditional
  | blockLoop
  | blockTryCatch

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
** Comentários.
*/
blockComments
  : ( BlockComment | LineComment )
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
  : variablePrefixModes (New | Await)? generalValueElements (Separator variableItem)*
  ;

variablePrefixModes
  : (methodVisibility)? (identifier | identifier TypeSpec) (Attr | AssignmentOperator)
  ; 

visibilityItems
  : Pub | Pro | Priv | Final | Static | Async
  ;

methodVisibility
  : visibilityItems (methodVisibility)*
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
** Bloco de código das expressões condicionais e loops.
*/
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
  : (
      (Not)? (incDecOperatorsA)? identifier (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Integer (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? Float (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      (Not)? String (ArithmeticOperator)? (AssignmentOperator)?
    )
  | (Not)? functionCall (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
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
identifier : Identifier;
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
      Function |
      Pub |
      Pro |
      Priv |
      Static |
      Final |
      Interface |
      Abstract |
      Extends |
      Class |
      Implements |
      New |
      Break |
      Next |
      Async |
      //Await |
      // Try |
      // Catch |
      ArrowRight |
      ARightLB |
      End |
      Attr |
      Point |
      TwoPoint |
      TwoTwoPoint |
      Separator |
      OpenArIndex |
      CloseArIndex |
      // OpenBlock |
      // CloseBlock |
      OpenOp |
      CloseOp |
      ArithmeticOperator |
      AssignmentOperator |
      Not |
      IncDecOperators |
      Identifier |
      IDPrefix |
      TypeSpec |
      Words |
      Integer |
      Float |
      String
    )
  ;


