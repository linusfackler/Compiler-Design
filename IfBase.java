class IfBase extends Token implements TI {
  Expr expression;
  public IfBase(Expr e)
  {
    expression = e;
  }

  public String toString(int t)
  {
  	return ("if (" + expression.toString(t) + ")\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType expressionType = expression.typeCheck();

    if (!expressionType.isBoolOrCoersible()) {
      throw new LanguageException("Expression " + expression.toString() + " is not of type bool.");
    }

    return expressionType;
  }
}

