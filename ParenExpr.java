class ParenExpr extends Expr implements TI {
	Expr expression;
  public ParenExpr(Expr e)
  {
    expression = e;
  }

  public String toString(int t)
  {
  	return("(" + expression.toString(t) + ")");
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

