class WhileStmt extends NonIfStmt implements TI {
	WhileBase whileBase;
  ScopeStmt body;
  public WhileStmt(WhileBase w, ScopeStmt s)
  {
    whileBase = w;
    body = s;
  }

  public String toString(int t)
  {
  	return whileBase.toString(t) + body.toString(t);
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType whileBaseType = whileBase.typeCheck();

    if (!whileBaseType.isBoolOrCoersible()) {
      throw new LanguageException("Expression " + whileBase.toString() + " is not of type bool.");
    }

    return whileBaseType;
  }
}

