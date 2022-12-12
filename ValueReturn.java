class ValueReturn extends NonWhileStmt implements TI {
  Expr expression;
    
  public ValueReturn(Expr e)
  {
    expression = e;
  }

  public String toString(int t)
  {
  	return(T(t) + "return " + expression.toString(t) + ";\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType expressionType = expression.typeCheck();
    // ReturnType.TypeEnum r = symbolTable.getReturnT();

    // if (returnType != new ReturnType(expressionType)) {
    //   throw new LanguageException("Error: current method type is not the same as expression type");
    // }

      // no idea why i got an error here. Couldn't initialize r to symbolTable.getReturnT().

      return null;
  }
}