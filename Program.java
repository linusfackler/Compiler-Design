class Program extends Token implements TI {
	String id;
	MemberDecls memberDeclarations;
  public Program(String i, MemberDecls m)
  {
  	id = i;
  	memberDeclarations = m;
  }

  public String toString(int t)
  {
  	return("class " + id + "\n{\n" + memberDeclarations.toString(t + 1) + "}\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    return memberDeclarations.typeCheck();
  }
}

