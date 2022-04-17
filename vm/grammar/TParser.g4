
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

// Bloco de código.
conditionalBlockElements
  : OpenBlock CloseBlock
  | OpenBlock sentences CloseBlock
  | blockConditional
  | blockRet
  | functionCall End
  ;

/*
** Valores de uso geral.
** Utilizado para:
**    Valores comuns (atribuições)
**    Operações aritméticas
**    Operações relacionais
*/
generalValue
  : (
      (incDecOperatorsA)? identifier (incDecOperatorsB)? (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      Integer (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      Float (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)? |
      String (ArithmeticOperator)? (AssignmentOperator)?
    )
  | functionCall (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  | generalValueBlock (TypeSpec)? (ArithmeticOperator)? (AssignmentOperator)?
  ;

generalValueBlock
  : (Not)? OpenOp generalValueItems CloseOp
  ;

generalValueItems
  : (Not)? generalValue (generalValueItems)*
  ;

// Utiliza valores gerais N vezes.
generalValueElements
  : (Not)? generalValue (generalValueElements)*
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
      //Var |
      // If |
      // Elif |
      // Else |
      For |
      //Ret |
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
      Await |
      Try |
      Catch |
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


