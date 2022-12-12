class OptionalExpr extends Token implements TI {

	Expr expression;
	public OptionalExpr(Expr e)
	{
		expression = e;
	}

	public String toString(int t)
	{
		return( " = " + expression.toString(t));
	}

	public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}
