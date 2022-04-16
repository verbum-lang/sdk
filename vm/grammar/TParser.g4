
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
  | blockLiveTokens
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
  : variablePrefixModes (New | Await)? generalValue (Separator variableItem)*
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
** Valores de uso geral.
*/
generalValue
  : (
      identifier (TypeSpec)? |
      Integer (TypeSpec)? |
      Float (TypeSpec)? |
      String 
    )
  | functionCall
  ;

/*
** Controladores gerais.
*/
identifier : Identifier;

/*
** Live tokens...
*/
blockLiveTokens
  : (
      //Var |
      If |
      Elif |
      Else |
      For |
      Ret |
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
      OpenBlock |
      CloseBlock |
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


