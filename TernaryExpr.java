class TernaryExpr extends Expr implements TI {
	Expr condition;
	Expr whenTrue;
	Expr whenFalse;

  public TernaryExpr(Expr a, Expr b, Expr c)
  {
    condition = a;
    whenTrue = b;
    whenFalse = c;
  }

  public String toString(int t)
  {
  	return ("(" + condition.toString(t) + " ? "  + whenTrue.toString(t) + " : " + whenFalse.toString(t) + ")");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType conditionType = condition.typeCheck();
    ReturnType trueType = whenTrue.typeCheck();
    ReturnType falseType = whenFalse.typeCheck();

    if (!conditionType.isBoolOrCoersible())
      throw new LanguageException("Error: cannot use ? operator if " + condition.toString() + " is not boolean.");
    if (trueType.isSame(falseType))
      return trueType;
    throw new LanguageException("Error: cannot use ? operator if " + whenTrue.toString() + " is not equal to " + whenFalse.toString());
  }
}

