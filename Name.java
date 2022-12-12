class Name extends Expr implements TI {
  String id;
  public Name(String i)
  {
    id = i;
  }

  public String toString(int t)
  {
  	return(id);
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}
