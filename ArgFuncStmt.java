class ArgFuncStmt extends FuncStmt implements TI {
	Args arguments;
  public ArgFuncStmt(String i, Args a)
  {
    super(i);
    arguments = a;
  }

  public String toString(int t)
  {
  	return(T(t) + id + "(" + arguments.toString(t) + ");\n");
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

