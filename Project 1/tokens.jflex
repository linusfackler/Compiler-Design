/*-***
 *
 * This file defines a stand-alone lexical analyzer for a subset of the Pascal
 * programming language.  This is the same lexer that will later be integrated
 * with a CUP-based parser.  Here the lexer is driven by the simple Java test
 * program in ./PascalLexerTest.java, q.v.  See 330 Lecture Notes 2 and the
 * Assignment 2 writeup for further discussion.
 *
 */


import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class Lexer

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
 */

id = [a-zA-Z][[a-zA-z]|[0-9]]*
integer = -?[0-9]
letter = [[[^\n]&&[^\t]]&&[[[^\r]&&[^\\]]&&[[^\"]&&[^']]]]|\\n|\\t|\\r|\\\\|\\\"|\\'
character = \'{letter}\'
floatpoint = -?[0-9]+\.[0-9]+
stringliteral = \"{letter}*\"
whitespace = [ \n\t\r]
comment = \\\\.*|\\\*[^\*\\]*\*\\


%%
/**
 * LEXICAL RULES:
 */
{comment}       {return newSym(sym.COMMENT);}
class           {return newSym(sym.CLASS, "class");}
void            {return newSym(sym.VOID, "void");}
int             {return newSym(sym.INT, "int");}
float           {return newSym(sym.FLOAT, "float");}
bool            {return newSym(sym.BOOL, "bool");}
char            {return newSym(sym.CHAR, "char");}
else            {return newSym(sym.ELSE, "else");}
if              {return newSym(sym.IF, "if");}
while           {return newSym(sym.WHILE, "while");}
read            {return newSym(sym.READ, "read");}
print           {return newSym(sym.PRINT, "print");}
printline       {return newSym(sym.PRINT, "printline");}
return          {return newSym(sym.RETURN, "return");}
"("             {return newSym(sym.LPAREN, "(");}
")"             {return newSym(sym.RPAREN, ")");}
"["             {return newSym(sym.LBRACKET, "[");}
"]"             {return newSym(sym.RBRACKET, "]");}
"{"             {return newSym(sym.LBRACE, "{");}
"}"             {return newSym(sym.RBRACE, "}");}
";"             {return newSym(sym.SEMI, ";");}
"&&"            {return newSym(sym.AND, "&&");}
"||"            {return newSym(sym.OR, "||");}
"*"             {return newSym(sym.ASTERIKS, "*");}
"+"             {return newSym(sym.PLUS, "+");}
"-"             {return newSym(sym.MINUS, "-");}
"/"             {return newSym(sym.SLASH, "/");}
"++"            {return newSym(sym.INCREMENT, "++");}
"<"             {return newSym(sym.LTHAN, "<");}
">"             {return newSym(sym.GTHAN, ">");}
"<="            {return newSym(sym.LTHANEQ, "<=");}
">="            {return newSym(sym.RTHANEQ, ">=");}
"<>"            {return newSym(sym.NOTEQUAL, "<>");}
"~"             {return newSym(sym.NOT, "~");}
"?"             {return newSym(sym.QUESTION, "?");}
":"             {return newSym(sym.COLON, ":");}
"="             {return newSym(sym.EQUAL, "=");}
","             {return newSym(sym.COMMA, ",");}
true            {return newSym(sym.TRUE, "true");}
false           {return newSym(sym.FALSE, "false");}
{id}            {return newSym(sym.ID, yytext());}
{integer}       {return newSym(sym.INTLIT, new Integer(yytext()));}
{floatpoint}    {return newSym(sym.FLOATLIT, new Float(yytext()));}
{character}     {return newSym(sym.CHARLIT, yytext());}
{stringliteral} {return newSym(sym.STRINGLIT, yytext());}
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); } 