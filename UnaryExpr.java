class UnaryExpr extends NonTypeCastExpr implements TI {
	String operator;
  Expr expression;
  public UnaryExpr(String o, Expr e)
  {
    operator = o;
    expression = e;
  }

  public String toString(int t)
  {
  	return("(" + operator + expression.toString(t) + ")");
  }

  public ReturnType typeCheck() throws LanguageException {
    return null;
	}
}

