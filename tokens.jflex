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
tab             = \\t
newline         = \\n
slash           = \\
apos            = {slash}'
quote           = {slash}\"

letter          = [A-Za-z]
digit           = [0-9]
id              = {letter}[{letter}|{digit}]*
intlit          = {digit}+
floatlit        = {intlit}+\.{intlit}+

charchar        = [[^\\]&&[^']]|{newline}|{tab}|{apos}|{slash}{slash}
charlit         = '{charchar}'

stringchar      = [[[^\\]&&[^\"]]&&[[^\n]&&[^\t]]]|{newline}|{tab}|{quote}|{slash}{slash}
stringlit       = \"{stringchar}*\"

blockcommentS   = {slash}\*
blockcommentE   = \*{slash}
commentbody		= ([^\*]|(\*+[^\\]))
blockcomment    = {blockcommentS}{commentbody}*?{blockcommentE}
inlinecomment 	= {slash}{slash}.*(\n|\r|\r\n)
whitespace      = [ \n\t\r]



%%
/**
 * LEXICAL RULES:
 */
class           {return newSym(sym.CLASS, "class");}
final 		    {return newSym(sym.FINAL, "final");}
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
"("             {return newSym(sym.LEFT_PAREN, "(");}
")"             {return newSym(sym.RIGHT_PAREN, ")");}
"["             {return newSym(sym.LEFT_BRACKET, "[");}
"]"             {return newSym(sym.RIGHT_BRACKET, "]");}
"{"             {return newSym(sym.LEFT_BRACE, "{");}
"}"             {return newSym(sym.RIGHT_BRACE, "}");}
";"             {return newSym(sym.SEMI, ";");}
"&&"            {return newSym(sym.AND, "&&");}
"||"            {return newSym(sym.OR, "||");}
"*"             {return newSym(sym.TIMES, "*");}
"+"             {return newSym(sym.PLUS, "+");}
"+" 		    {return newSym(sym.PREFIXPLUS, "+");}
"++"            {return newSym(sym.PLUSPLUS, "++");}
"-"             {return newSym(sym.MINUS, "-");}
"-"		        {return newSym(sym.PREFIXMINUS, "-");}
"--"		    {return newSym(sym.MINUSMINUS, "--");}
"/"             {return newSym(sym.DIVIDE, "/");}
"=="            {return newSym(sym.EQUAL, "==");}
"<"             {return newSym(sym.LESS, "<");}
">"             {return newSym(sym.GREATER, ">");}
"<="            {return newSym(sym.LESS_EQ, "<=");}
">="            {return newSym(sym.GREATER_EQ, ">=");}
"<>"            {return newSym(sym.NOT_EQ, "<>");}
"~"             {return newSym(sym.NOT, "~");}
"?"             {return newSym(sym.QUESTION, "?");}
":"             {return newSym(sym.COLON, ":");}
"="             {return newSym(sym.ASSIGN, "=");}
","             {return newSym(sym.COMMA, ",");}
true            {return newSym(sym.TRUE, "true");}
false           {return newSym(sym.FALSE, "false");}
{id}            {return newSym(sym.ID, yytext());}
{intlit}        {return newSym(sym.INTLIT, new Integer(yytext()));}
{floatlit}      {return newSym(sym.FLOATLIT, new Float(yytext()));}
{charlit}       {return newSym(sym.CHARLIT, yytext());}
{stringlit}	    {return newSym(sym.STRINGLIT, yytext());}
{inlinecomment} {/* For this stand-alone lexer, print out comments. */}
{blockcomment}	{/* For this stand-alone lexer, print out comments. */}
{whitespace}    {/* Ignore whitespace. */}
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); } 