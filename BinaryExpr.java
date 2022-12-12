class BinaryExpr extends NonTypeCastExpr implements TI {
	Expr leftHandSide;
	String operator;
	Expr rightHandSide;

  public BinaryExpr(Expr l, String b, Expr r)
  {
    leftHandSide = l;
    operator = b;
    rightHandSide = r;
  }

  public String toString(int t)
  {
  	return ("(" + leftHandSide.toString(t) + " " + operator + " " + rightHandSide.toString(t) + ")");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType lhsType = leftHandSide.typeCheck();
    ReturnType rhsType = rightHandSide.typeCheck();

    switch(operator) {
      case "+": if (lhsType.isString() && rhsType.isString()) return new ReturnType(ReturnType.TypeEnum.STRING);
      case "-":
      case "/":
      case "*": {
        if (lhsType.isInt() && rhsType.isInt())
          return new ReturnType(ReturnType.TypeEnum.INT);
        else if (lhsType.isFloat() && rhsType.isInt() || lhsType.isInt() && rhsType.isFloat())
          return new ReturnType(ReturnType.TypeEnum.FLOAT);
        else if (lhsType.isFloat() && rhsType.isFloat())
          return new ReturnType(ReturnType.TypeEnum.FLOAT);
        throw new LanguageException("Error: cannot use " + operator + " on " + lhsType.toString() + " with " + rhsType.toString());
      }
      case "<":
      case ">":
      case "<=":
      case ">=":
      case "==":
      case "<>": {
        if (lhsType.isNum() && rhsType.isNum())
          return new ReturnType(ReturnType.TypeEnum.BOOL);
        throw new LanguageException("Error: cannot use " + operator + " on " + lhsType.toString() + " with " + rhsType.toString());
      }
      case "||":
      case "&&": {
        if (lhsType.isBoolOrCoersible() && rhsType.isBoolOrCoersible())
          return new ReturnType(ReturnType.TypeEnum.BOOL);
        throw new LanguageException("Error: cannot use " + operator + " on " + lhsType.toString() + " with " + rhsType.toString());
      }
      default:
        throw new LanguageException("Operator " + operator + " unknown.");
    }

  }
}

