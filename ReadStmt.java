class ReadStmt extends NonWhileStmt implements TI {
	ReadList readList;
  public ReadStmt(ReadList r)
  {
    readList = r;
  }

  public String toString(int t)
  {
  	return(T(t) + "read(" + readList.toString(t) + ");\n");
  }

  public ReturnType typeCheck() throws LanguageException {
    return readList.typeCheck();
  }
}

