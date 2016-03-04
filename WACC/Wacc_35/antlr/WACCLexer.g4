lexer grammar WACCLexer;

BEGIN: 'begin';
END: 'end';

OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';
OPEN_SQUAREBRACKET: '[';
CLOSE_SQUAREBRACKET: ']';

IS: 'is';

COMMA: ',';
SEMICOLON: ';';
HASH: '#';

NULL: 'null';
SKIP: 'skip';
READ: 'read';
FREE: 'free';
RETURN: 'return';
EXIT: 'exit';
PRINT: 'print';
PRINTLN: 'println';
IF: 'if';
THEN: 'then';
ELSE: 'else';
FI: 'fi';
WHILE: 'while';
DO: 'do';
DONE: 'done';
NEWPAIR: 'newpair';
CALL: 'call';
FST: 'fst';
SND: 'snd';
INT: 'int';
BOOL: 'bool';
CHAR: 'char';
STRING: 'string';
PAIR: 'pair';


LOGICAL_OR: '||';
LOGICAL_AND: '&&';
NOT: '!';
MINUS: '-';
LEN: 'len';
ORD: 'ord';
CHR: 'chr';
MULTIPLY: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
TRUE: 'true';
FALSE: 'false';
GREATER_THAN: '>';
GREATER_THAN_EQUALS: '>=';
LESS_THAN: '<';
LESS_THAN_EQUALS: '<=';
EQUALS: '=';
DOUBLE_EQUALS: '==';
NOT_EQUALS: '!=';

fragment BACKWARD_SLASH: '\\';
fragment UNDERSCORE: '_';
fragment SINGLE_QUOTE: '\'';
fragment DOUBLE_QUOTE: '"';
fragment DIGIT: '0' .. '9';
fragment LOWER_CASE: 'a' .. 'z';
fragment UPPER_CASE: 'A' .. 'Z';
fragment ESCAPED_CHAR: '0' | 'b' | 't' | 'n' | 'f' | 'r' | '\'' | '"' | '\\';
fragment CHARACTER: (~('\\'|'\''|'"') | BACKWARD_SLASH  ESCAPED_CHAR);
fragment INT_SIGN: '+' | '-'; 

IDENT : (UNDERSCORE|LOWER_CASE|UPPER_CASE)
          (UNDERSCORE|LOWER_CASE|UPPER_CASE|DIGIT)*;
INT_LITERAL: (INT_SIGN)? DIGIT+;
CHAR_LITERAL: SINGLE_QUOTE CHARACTER SINGLE_QUOTE;
STRING_LITERAL: DOUBLE_QUOTE CHARACTER* DOUBLE_QUOTE;


WS: (' ' | '\r' | '\n' | '\t')+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
