class NameArray extends Name implements TI {
	Expr expression;
  public NameArray(String i, Expr e)
  {
    super(i);
    expression = e;
  }

  public String toString(int t)
  {
  	return(id + "[" + expression.toString(t) + "]");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType expressionType = expression.typeCheck();

    if (!expressionType.isInt()) {
      throw new LanguageException("Error: Expression needs to be of type int.");
    }

    return expressionType;
  }
}
