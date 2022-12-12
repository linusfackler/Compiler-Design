class PrintLnStmt extends NonWhileStmt implements TI {
	PrintLnList printLineList;
  public PrintLnStmt(PrintLnList p)
  {
    printLineList = p;
  }

  public String toString(int t)
  {
  	return(T(t) + "printline(" + printLineList.toString(t) + ");\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType printLineListType = printLineList.typeCheck();
    return printLineListType;
  }
}

