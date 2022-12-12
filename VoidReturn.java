class VoidReturn extends NonWhileStmt implements TI {
  public VoidReturn()
  {
  }

  public String toString(int t)
  {
  	return(T(t) + "return;\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.VOID);
	}
}

