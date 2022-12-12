class FieldStart extends Token implements TI
{
	Type type;
	String id;

	public FieldStart(Type t, String i)
	{
		type = t;
		id = i;
	}

	public String toString(int t)
	{
    	return( type.toString() + " " + id);
	}

	public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}
