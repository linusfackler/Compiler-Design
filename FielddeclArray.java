class FieldDeclArray extends FieldDecl implements TI {

	int intlit;
	public FieldDeclArray(FieldStart f, int n)
	{
		super(f);
		intlit = n;
	}

	public String toString(int t)
	{
		return( T(t) + super.toString(t) + "[" + intlit + "];\n");
	}

	public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}
