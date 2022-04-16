
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
  | blockOop
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
** Orientação à objetos.
*/

// Regras que vão no controlador geral.
blockOop

  // Modos de uso gerais.
  : interfaceClass
  //| abstractClass
  //| classDefination
  
  // Classe anônima.
  //| anonymousClass
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
  | functionCodeBlockElements interfaceCodeBlock
  ;

functionCodeBlockElements
  : blockComments
  | blockUse
  | blockLiveTokens
  ;

/*
** Controles gerais.
*/

identifierB
  : Identifier
  ;

/*
** Live tokens...
*/
blockLiveTokens
  : (
      Var |
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
      //Interface |
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


