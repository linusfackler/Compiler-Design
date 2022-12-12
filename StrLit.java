class StrLit extends TypeLit implements TI {
	String string;
  public StrLit(String s)
  {
    string  = s;
  }

  public String toString(int t)
  {
  	return string;
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.STRING);
	}
}

