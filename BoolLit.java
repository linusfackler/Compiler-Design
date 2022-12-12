class BoolLit extends TypeLit implements TI {
	String bool;
  public BoolLit(String b)
  {
    bool = b;
  }

  public String toString(int t)
  {
  	return bool;
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.BOOL);
	}
}

