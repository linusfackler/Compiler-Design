class MemberDecls extends Token implements TI {
	FieldsNMethods fieldsAndMethods;
  public MemberDecls( FieldsNMethods f)
  {
  	fieldsAndMethods = f;
  }

  public String toString(int t)
  {
  	return (fieldsAndMethods != null ? fieldsAndMethods.toString(t) : "");
  }

  public ReturnType typeCheck() throws LanguageException {
    return null;
	}
}

