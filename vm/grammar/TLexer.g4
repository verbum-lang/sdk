
lexer grammar TLexer;

@lexer::postinclude {
  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif
}

// Comandos e palavras reservadas.
Use          : 'use' ;
Var          : 'var' ;
If           : 'if';
Elif         : 'elif';
Else         : 'else';
For          : 'for';
Ret          : 'ret';
Function     : 'fn';
Pub          : 'pub';
Pro          : 'pro';
Priv         : 'priv';
Static       : 'static';
Final        : 'final';
Interface    : 'interface';
Abstract     : 'abstract';
Extends      : 'extends';
Class        : 'class';
Implements   : 'implements';
New          : 'new';
Break        : 'break';
Next         : 'next';
Async        : 'async';
Await        : 'await';
Try          : 'try';
Catch        : 'catch';

// Operadores.
ArrowRight   : '->';
ARightLB     : '=>';
End          : ';' ;
Attr         : '=' ;
Point        : '.';
TwoPoint     : ':';
TwoTwoPoint  : '::';
Separator    : ',' ;
OpenArIndex  : '[' ;
CloseArIndex : ']' ;
OpenBlock    : '{' ;
CloseBlock   : '}' ;
OpenOp       : '(';
CloseOp      :')';

// Operações aritméticas.
ArithmeticOperator
  : '+'  | '-'  | '*'  | '/'  | '%' 
  ;

AssignmentOperator
  : '+=' | '-=' | '*=' | '/=' | '%='
  | '>'  | '<'  | '>=' | '<=' 
  | '&&' | '||'
  | '==' | '!='
  ;

Not : '!';

// Incremento e decremento.
IncDecOperators
  : ( '++' | '--' )
  ;

Identifier
  : IDPrefix
  | IDPrefix ( Words | [0-9]+ | [_] )*
  ;

IDPrefix
  : ( [_] | Words )
  ;

TypeSpec
  : [:] ( Identifier )
  ;

Words
  : [a-zA-Z\u0080-\u{10FFFF}]+
  ;

Integer
  : [0-9]+ | [-][0-9]+
  ; 

Float
  : FloatLiteral | [-] FloatLiteral
  ;

String
  : '"'  ( ~('"')  | ('\\' '"') )*  '"'
  | '\'' ( ~('\'') | ('\\' '\'') )* '\''
  ;

// Comentários.
BlockComment
    : '/*' .*? '*/'
    -> skip
    ;

LineComment
    : '//' ~[\r\n]*
    -> skip
    ;

// Espaço em branco e nova-linha.
Whitespace
    : [ \t]+
    -> skip
    ;

Newline
    : (   '\r' '\n'?
      |   '\n'
      )
      -> skip
    ;

/*
** use (importações).
*/

// Fragments... (uso futuro)
fragment DecimalExponent : 'e' | 'E' | 'e+' | 'E+' | 'e-' | 'E-' DecimalDigits;
fragment DecimalDigits   : ('0'..'9'|'_')+ ;
fragment FloatLiteral    : FloatFrag ImaginarySuffix?;
fragment IntegerLiteral  : IntegerFrag IntSuffix?;
fragment FloatTypeSuffix : 'f' | 'F' | 'L';
fragment ImaginarySuffix : 'i';
fragment IntSuffix       : 'L'|'u'|'U'|'Lu'|'LU'|'uL'|'UL' ;
fragment IntegerFrag     : Decimal| Binary| Octal| Hexadecimal ;
fragment Decimal         : '0' | '1'..'9' (DecimalDigit | '_')* ;
fragment Binary          : ('0b' | '0B') ('0' | '1' | '_')+ ;
fragment Octal           : '0' (OctalDigit | '_')+ ;
fragment Hexadecimal     : ('0x' | '0X') (HexDigit | '_')+;  
fragment DecimalDigit    : '0'..'9' ;
fragment OctalDigit      : '0'..'7' ;
fragment HexDigit        : ('0'..'9'|'a'..'f'|'A'..'F') ;
fragment FloatFrag
 : DecimalDigits (  FloatTypeSuffix 
                   | '.' DecimalDigits DecimalExponent?
                   )
 | '.' DecimalDigits DecimalExponent?
 ;
 
fragment NUMBER: DIGITS | OCTAL_DIGITS | HEX_DIGITS;
fragment DIGITS: '1'..'9' '0'..'9'*;
fragment OCTAL_DIGITS: '0' '0'..'7'+;
fragment HEX_DIGITS: '0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;

/* Tokens desconhecidos. */
//Unknown : . ;


