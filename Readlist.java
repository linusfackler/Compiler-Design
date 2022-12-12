class ReadList extends Token implements TI {
	Name name;
  ReadList readList;
  public ReadList(Name n)
  {
    name = n;
    readList = null;
  }

  public ReadList(Name n, ReadList r)
  {
    name = n;
    readList = r;
  }

  public String toString(int t)
  {
  	return(name.toString(t) + (readList != null ? ", " + readList.toString(t) : ""));
  }

  public ReturnType typeCheck() throws LanguageException {
    ReturnType nameType = name.typeCheck();
    if (nameType.isFinal())
      throw new LanguageException("Error: cannot read final variables.");
    else if (nameType.isArray())
      throw new LanguageException("Error: cannot read non-dereferenced array.");
    else if (nameType.isFunction())
      throw new LanguageException("Error: cannot read functions.");
    return nameType;
  }
}
