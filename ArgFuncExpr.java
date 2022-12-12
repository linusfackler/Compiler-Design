class ArgFuncExpr extends FuncExpr implements TI {
	Args arguments;
  public ArgFuncExpr(String i, Args a)
  {
    super(i);
    arguments = a;
  }

  public String toString(int t)
  {
  	return(id + "(" + arguments.toString(t) + ")");
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

