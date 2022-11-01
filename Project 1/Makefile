JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
		$(JAVAC) -cp $(CP) $*.java

FILE=    Lexer.java      parser.java	sym.java	\
	LexerTest.java		ScannerTest.java	Token.java	\
	Program.java	Expression.java		Name.java

#run: basicTest.txt
#run: basicRegex.txt basicTerminals.txt basicFails.txt
#run: Phase1_expressions.txt Phase1_order_of_ops.txt Phase1_statements.txt
run: sampleFile1.txt

all: Lexer.java parser.java $(FILE:java=class)

sampleFile1.txt: all
		$(JAVA) -cp $(CP) ScannerTest sampleFile1.txt > sampleFile1-output.txt
		cat sampleFile1.txt
		cat -n sampleFile1-output.txt

# basicTest.txt: all
# 		$(JAVA) -cp $(CP) LexerTest basicTest.txt > basicTest-output.txt
# 		cat -n basicTest.txt
# 		cat -n basicTest-output.txt

# basicRegex.txt: all
# 		$(JAVA) -cp $(CP) LexerTest basicRegex.txt > basicRegex-output.txt
# 		cat -n basicRegex.txt
# 		cat -n basicRegex-output.txt

# basicTerminals.txt: all
# 		$(JAVA) -cp $(CP) LexerTest basicTerminals.txt > basicTerminals-output.txt
# 		cat -n basicTerminals.txt
# 		cat -n basicTerminals-output.txt

# basicFails.txt: all
# 		$(JAVA) -cp $(CP) LexerTest basicFails.txt > basicFails-output.txt
# 		cat -n basicFails.txt
# 		cat -n basicFails-output.txt

# Phase1_expressions.txt: all
# 		$(JAVA) -cp $(CP) LexerTest Phase1_expressions.txt > Phase1_expressions-output.txt
# 		cat -n Phase1_expressions.txt
# 		cat -n Phase1_expressions-output.txt

# Phase1_order_of_ops.txt: all
# 		$(JAVA) -cp $(CP) LexerTest Phase1_order_of_ops.txt > Phase1_order_of_ops-output.txt
# 		cat -n Phase1_order_of_ops.txt
# 		cat -n Phase1_order_of_ops-output.txt

# Phase1_statements.txt: all
# 		$(JAVA) -cp $(CP) LexerTest Phase1_statements.txt > Phase1_statements-output.txt
# 		cat -n Phase1_statements.txt
# 		cat -n Phase1_statements-output.txt

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: tokens.jflex
		$(JFLEX) tokens.jflex

parser.java: grammar.cup
		$(CUP) -interface < grammar.cup

parserD.java: grammar.cup
		$(CUP) -interface -dump < grammar.cup
