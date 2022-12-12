class ScopeStmt extends NonWhileStmt implements TI {
	FieldDecls fieldDeclarations;
  Stmts statements;
  Boolean hasSemicolon;
  public ScopeStmt(FieldDecls f, Stmts s)
  {
    fieldDeclarations = f;
    statements = s;
    hasSemicolon = false;
  }

  public ScopeStmt addOptionalSemi(OptionalSemi o) {
    hasSemicolon = o != null;
    return this;
  }

  public String toString(int t)
  {
  	return(T(t) + "{\n" + 
      (fieldDeclarations != null ? fieldDeclarations.toString(t + 1) : "") + 
      (statements != null ? statements.toString(t + 1) : "") + 
      T(t) + "}" + (hasSemicolon ? ";\n" : "\n"));
  }
  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

