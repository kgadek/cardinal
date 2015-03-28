program ::= module

module ::= simple\_statement+

simple\_statement ::= "print" expression ("," expression)

unary\_op ::= "+" | "-"

binary\_op ::= "+" | "-" | "**" | "/" | "%" | "****"**

expression ::= integer
> | unary\_op expression
> | expression binary\_op expression
> | "(" expression ")"
> | "input" "(" ")"

unaryop ::= "not"

binaryop ::= "<" | ">" | "==" | ">=" | "<=" | "!=" | "or" | "and"

expression ::= float | "True" | "False"
> | expression "if" expression "else" expression

letter ::= lowercase | uppercase

lowercase ::= ”a”...”z”

uppercase ::= ”A”...”Z”

digit ::= ”0”...”9”

expression ::= identifier

simple\_statement ::= "pass"
> | identifier "=" expression
> | expression

compound\_statement ::= "if" expression ":" suite "else" ":" suite
> | "while" expression ":" suite

stmt\_list ::= simple\_statement (";" simple\_statement)

statement ::= stmt\_list NEWLINE | compound\_stmt

suite ::= stmt\_list NEWLINE | NEWLINE INDENT statement+ DEDENT

module ::= (NEWLINE | statement)

expression ::= "[" expression ("," expression)**"]"
> | "{" key\_datum ("," key\_datum)** "}"
> | subscription
> | expression "is" expression

key\_datum ::= expression ":" expression

subscription ::= expression "[" expression "]"

simple\_statement ::= target "=" expression

target ::= identifier
> | subscription

expression ::= expression "(" [("," expression)\*](expression.md) ")"
> | "lambda" [("," identifier)\*](identifier.md) ":" expression

statement ::= "return" expression
> | "def" identifier "(" [("," identifier)\*](identifier.md) ")" ":"
statement

expression ::= expression "." identifier

expression\_list ::= expression ( "," expression )**[","]**

statement ::= "class" name ["(" expression\_list ")"] ":" statement

target ::= expression "." identifier