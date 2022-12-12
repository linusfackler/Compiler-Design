class Stmts extends Token implements TI {
  Stmt statement;
  Stmts statements;
  public Stmts(Stmt s, Stmts x)
  {
    statement = s;
    statements = x;
  }

  public String toString(int t)
  {
  	return (statement.toString(t) + (statements != null ? statements.toString(t) : ""));
  }

  public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}

