class MethodDecls extends Token implements TI {
	MethodDecl methodDeclaration;
	MethodDecls methodDeclarations;

  public MethodDecls(MethodDecl m, MethodDecls s)
  {
  	methodDeclaration = m;
  	methodDeclarations = s;
  }

  public MethodDecls(MethodDecl m)
  {
    methodDeclaration = m;
    methodDeclarations = null;
  }

  public String toString(int t)
  {
  	return(methodDeclaration.toString(t) + 
      (methodDeclarations != null ? methodDeclarations.toString(t) : "") );
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

