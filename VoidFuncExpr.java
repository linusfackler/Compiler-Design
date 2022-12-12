class VoidFuncExpr extends FuncExpr implements TI {
  public VoidFuncExpr(String i)
  {
    super(i);
  }

  public String toString(int t)
  {
  	return(id + "()");
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.VOID);
	}
}

