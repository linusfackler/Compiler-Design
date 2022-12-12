class AssmntStmt extends NonWhileStmt implements TI {
	Name name;
  Expr expression;
  public AssmntStmt(Name n, Expr e)
  {
    name = n;
    expression = e;
  }

  public String toString(int t)
  {
  	return(T(t) + name.toString(t) + " = " + expression.toString(t) + ";\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType nameType = name.typeCheck();
    ReturnType expressionType = expression.typeCheck();

    if (!nameType.isSame(expressionType)) {
      throw new LanguageException("Name " + name.toString() + " needs to be of the same type as " + expression.toString());
    }
    else if (nameType.isFinal()) {
      throw new LanguageException("Cannot assign value to final variable.");
    }

    return nameType;
  }
}

