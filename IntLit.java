class IntLit extends TypeLit implements TI {
	int integer;
  public IntLit(int i)
  {
    integer = i;
  }

  public String toString(int t)
  {
  	return Integer.toString(integer);
  }

  public ReturnType typeCheck() throws LanguageException {
    return new ReturnType(ReturnType.TypeEnum.INT);
	}
}