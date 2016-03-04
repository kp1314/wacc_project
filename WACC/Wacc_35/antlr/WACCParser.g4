parser grammar WACCParser;

options {
    tokenVocab=WACCLexer;
}

program: BEGIN func* stat END EOF;

func: type func_ident OPEN_PARENTHESIS param_list? CLOSE_PARENTHESIS IS stat END;

param_list: param (COMMA param)*;

param: type define_ident;

stat: 
  SKIP
| type define_ident EQUALS assign_rhs
| assign_lhs EQUALS assign_rhs
| READ assign_lhs
| FREE expr
| RETURN expr
| EXIT expr
| PRINT expr
| PRINTLN expr
| IF expr THEN stat ELSE stat FI
| WHILE expr DO stat DONE 
| BEGIN stat END 
| stat SEMICOLON stat
;

assign_lhs: 
  ident 
| array_elem
| pair_elem
;

assign_rhs:
  expr
| array_liter
| NEWPAIR OPEN_PARENTHESIS expr COMMA expr CLOSE_PARENTHESIS
| pair_elem
| CALL func_ident OPEN_PARENTHESIS arg_list? CLOSE_PARENTHESIS
;

arg_list: expr (COMMA expr)*;

pair_elem:
  FST expr
| SND expr
;

type:
  base_type
| array_type
| pair_type
;

base_type:
  INT
| BOOL
| CHAR
| STRING
;

array_type: (base_type|pair_type) (OPEN_SQUAREBRACKET CLOSE_SQUAREBRACKET)+;

pair_type: PAIR OPEN_PARENTHESIS pair_elem_type 
            COMMA pair_elem_type CLOSE_PARENTHESIS;

pair_elem_type:
  base_type
| array_type
| PAIR
;

expr: 
  int_literal
| bool_literal
| char_literal
| string_literal
| pair_literal
| ident
| array_elem
| unary_op expr
| expr bin_op_pr_1 expr
| expr bin_op_pr_2 expr
| expr bin_op_pr_3 expr
| expr bin_op_pr_4 expr
| expr bin_op_pr_5 expr
| expr bin_op_pr_6 expr
| OPEN_PARENTHESIS expr CLOSE_PARENTHESIS
;

unary_op:
  NOT
| MINUS
| LEN
| ORD
| CHR
;

bin_op_pr_1:
  MULTIPLY
| DIVIDE
| MOD
;

bin_op_pr_2:
  PLUS
| MINUS
;

bin_op_pr_3:
  GREATER_THAN
| GREATER_THAN_EQUALS
| LESS_THAN
| LESS_THAN_EQUALS
;

bin_op_pr_4: 
  DOUBLE_EQUALS
| NOT_EQUALS
;

bin_op_pr_5: LOGICAL_AND;

bin_op_pr_6: LOGICAL_OR;

define_ident: IDENT;
ident: IDENT;
func_ident: IDENT;
int_literal: INT_LITERAL;
string_literal: STRING_LITERAL;
char_literal: CHAR_LITERAL;

array_elem: ident (OPEN_SQUAREBRACKET expr CLOSE_SQUAREBRACKET)+;

array_liter: OPEN_SQUAREBRACKET (expr (COMMA expr)* )? CLOSE_SQUAREBRACKET; 

pair_literal: NULL;

bool_literal:
  TRUE
| FALSE
;
