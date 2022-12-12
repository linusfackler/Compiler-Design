class PrintList extends Token implements TI {
	Expr expression;
  PrintList printList;
  public PrintList(Expr e)
  {
    expression = e;
    printList = null;
  }

  public PrintList(Expr e, PrintList p)
  {
    expression = e;
    printList = p;
  }

  public String toString(int t)
  {
  	return(expression.toString(t) + (printList != null ? ", " + printList.toString(t) : ""));
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType expressionType = expression.typeCheck();
    if (expressionType.isArray())
      throw new LanguageException("Error: cannot print non-dereferenced array.");
    else if (expressionType.isVoid())
      throw new LanguageException("Error: cannot print expressions of type void.");
    return expressionType;
  }
}
