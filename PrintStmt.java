class PrintStmt extends NonWhileStmt implements TI {
	PrintList printList;
  public PrintStmt(PrintList p)
  {
    printList = p;
  }

  public String toString(int t)
  {
  	return(T(t) + "print(" + printList.toString(t) + ");\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType printListType = printList.typeCheck();
    return printListType;
  }
}

