class VoidFuncStmt extends FuncStmt implements TI {
  public VoidFuncStmt(String i)
  {
    super(i);
  }

  public String toString(int t)
  {
  	return(T(t) + id + "();\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.VOID);
	}
}

