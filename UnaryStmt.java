class UnaryStmt extends NonWhileStmt implements TI {
	Name name;
  String operator;
  public UnaryStmt(Name n, String o)
  {
    name = n;
    operator = o;
  }

  public String toString(int t)
  {
  	return(T(t) + name.toString(t) + operator + ";\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType nameType = name.typeCheck();

    switch (operator) {
      case "++":
      case "--": { 
        if (!nameType.isNum() || nameType.isFinal())
          throw new LanguageException("Error: cannot use " + operator + " if variable is not int, not float, or final.");
      }
      case "+":
      case "-": {
        if (nameType.isNum())
          return nameType;
        throw new LanguageException("Error: cannot use " + operator + " if variable is not numeric.");
      }
      case "~": {
        if (nameType.isBoolOrCoersible()) {
          return new ReturnType(ReturnType.TypeEnum.BOOL);
        }
        throw new LanguageException("Error: cannot use " + operator + " if variable is not bool or coersible.");
      }
      default:
        throw new LanguageException("Operator " + operator + " unknown.");
    }
  }
}

