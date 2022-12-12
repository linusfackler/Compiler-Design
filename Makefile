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

FILE=    Lexer.java      parser.java    sym.java \
		ArgDecl.java ArgDeclArray.java ArgDecls.java ArgDeclSingle.java \
		ArgFuncStmt.java Args.java AssmntStmt.java TI.java BinaryExpr.java \
		BoolLit.java CharLit.java Expr.java FieldDecl.java \
		FieldDeclArray.java FieldDecls.java FieldDeclSingle.java FloatLit.java \
		FuncStmt.java IfBackend.java IfBackendStmt.java IfBase.java IfStmt.java \
		IntLit.java MemberDecls.java MethodDecl.java MethodDecls.java \
		Name.java NameArray.java NonIfStmt.java OptionalExpr.java \
		OptionalFinal.java OptionalSemi.java ParenExpr.java PrintList.java \
		PrintLnList.java PrintLnStmt.java PrintStmt.java Program.java ReadList.java \
		ReadStmt.java ReturnType.java ScopeStmt.java Stmt.java Stmts.java \
		StrLit.java TernaryExpr.java Type.java TypeCastExpr.java TypeLit.java \
		UnaryExpr.java UnaryStmt.java ValueReturn.java VoidFuncStmt.java VoidReturn.java \
		WhileStmt.java FuncExpr.java VoidFuncExpr.java \
		ArgFuncExpr.java FieldStart.java FieldsNMethods.java VoidType.java \
		WhileBase.java Token.java IntType.java FloatType.java \
		CharType.java BoolType.java NonTypeCastExpr.java ActionExpr.java\
		TypeCheckingTest.java \
    LexerTest.java ScannerTest.java

run: returnTypeBad.as redefVarAsMethod.as redefVar.as redefMethod.as reassignFinal.as noReturn.as intArrayToBoolArray.as incompatBinary.as fullValidProgram.as floatToInt.as charToInt.as charToFloat.as callNonExistFunc.as boolToInt.as boolToFloat.as badTernaryTypes.as badTernaryCond.as badString.as badNegation.as badInc.as badDec.as

all: Lexer.java parser.java $(FILE:java=class)

returnTypeBad.as: all
		$(JAVA) -cp $(CP) ScannerTest returnTypeBad.as > returnTypeBad-output.txt
		cat returnTypeBad.as
		cat -n returnTypeBad-output.txt

redefVarAsMethod.as: all
		$(JAVA) -cp $(CP) ScannerTest redefVarAsMethod.as > redefVarAsMethod-output.txt
		cat redefVarAsMethod.as
		cat -n redefVarAsMethod-output.txt

redefVar.as: all
		$(JAVA) -cp $(CP) ScannerTest redefVar.as > redefVar-output.txt
		cat redefVar.as
		cat -n redefVar-output.txt

redefMethod.as: all
		$(JAVA) -cp $(CP) ScannerTest redefMethod.as > redefMethod-output.txt
		cat redefMethod.as
		cat -n redefMethod-output.txt

reassignFinal.as: all
		$(JAVA) -cp $(CP) ScannerTest reassignFinal.as > reassignFinal-output.txt
		cat reassignFinal.as
		cat -n reassignFinal-output.txt

noReturn.as: all
		$(JAVA) -cp $(CP) ScannerTest noReturn.as > noReturn-output.txt
		cat noReturn.as
		cat -n noReturn-output.txt

intArrayToBoolArray.as: all
		$(JAVA) -cp $(CP) ScannerTest intArrayToBoolArray.as > intArrayToBoolArray-output.txt
		cat intArrayToBoolArray.as
		cat -n intArrayToBoolArray-output.txt

incompatBinary.as: all
		$(JAVA) -cp $(CP) ScannerTest incompatBinary.as > incompatBinary-output.txt
		cat incompatBinary.as
		cat -n incompatBinary-output.txt

fullValidProgram.as: all
		$(JAVA) -cp $(CP) ScannerTest fullValidProgram.as > fullValidProgram-output.txt
		cat fullValidProgram.as
		cat -n fullValidProgram-output.txt

floatToInt.as: all
		$(JAVA) -cp $(CP) ScannerTest floatToInt.as > floatToInt-output.txt
		cat floatToInt.as
		cat -n floatToInt-output.txt

charToInt.as: all
		$(JAVA) -cp $(CP) ScannerTest charToInt.as > charToInt-output.txt
		cat charToInt.as
		cat -n charToInt-output.txt

charToFloat.as: all
		$(JAVA) -cp $(CP) ScannerTest charToFloat.as > charToFloat-output.txt
		cat charToFloat.as
		cat -n charToFloat-output.txt

callNonExistFunc.as: all
		$(JAVA) -cp $(CP) ScannerTest callNonExistFunc.as > callNonExistFunc-output.txt
		cat callNonExistFunc.as
		cat -n callNonExistFunc-output.txt

boolToInt.as: all
		$(JAVA) -cp $(CP) ScannerTest boolToInt.as > boolToInt-output.txt
		cat boolToInt.as
		cat -n boolToInt-output.txt

boolToFloat.as: all
		$(JAVA) -cp $(CP) ScannerTest boolToFloat.as > boolToFloat-output.txt
		cat boolToFloat.as
		cat -n boolToFloat-output.txt

badTernaryTypes.as: all
		$(JAVA) -cp $(CP) ScannerTest badTernaryTypes.as > badTernaryTypes-output.txt
		cat badTernaryTypes.as
		cat -n badTernaryTypes-output.txt

badTernaryCond.as: all
		$(JAVA) -cp $(CP) ScannerTest badTernaryCond.as > badTernaryCond-output.txt
		cat badTernaryCond.as
		cat -n badTernaryCond-output.txt

badString.as: all
		$(JAVA) -cp $(CP) ScannerTest badString.as > badString-output.txt
		cat badString.as
		cat -n badString-output.txt

badNegation.as: all
		$(JAVA) -cp $(CP) ScannerTest badNegation.as > badNegation-output.txt
		cat badNegation.as
		cat -n badNegation-output.txt

badInc.as: all
		$(JAVA) -cp $(CP) ScannerTest badInc.as > badInc-output.txt
		cat badInc.as
		cat -n badInc-output.txt

badDec.as: all
		$(JAVA) -cp $(CP) ScannerTest badDec.as > badDec-output.txt
		cat badDec.as
		cat -n badDec-output.txt

test1.as: all
		$(JAVA) -cp $(CP) ScannerTest test1.as > test1-output.txt
		cat test1.as
		cat -n test1-output.txt

test2.as: all
		$(JAVA) -cp $(CP) ScannerTest test2.as > test2-output.txt
		cat test2.as
		cat -n test2-output.txt

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: tokens.jflex
		$(JFLEX) tokens.jflex

parser.java: grammar.cup
		$(CUP) -interface < grammar.cup

parserD.java: grammar.cup
		$(CUP) -interface -dump < grammar.cup
