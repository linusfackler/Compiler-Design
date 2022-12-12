class FieldsNMethods extends Token implements TI
{
	FieldDecl fieldDeclaration;
	FieldsNMethods fieldsAndMethods;
	MethodDecl methodDeclaration;
	MethodDecls methodDeclarations;

	public FieldsNMethods(FieldDecl f, FieldsNMethods s)
	{
		fieldDeclaration = f;
		fieldsAndMethods = s;
		methodDeclaration = null;
		methodDeclarations = null;
	}

	public FieldsNMethods(MethodDecl m, MethodDecls s)
	{
		fieldDeclaration = null;
		fieldsAndMethods = null;
		methodDeclaration = m;
		methodDeclarations = s;
	}

	public String toString(int t)
	{
		if (methodDeclaration != null)
			return (methodDeclaration.toString(t) + (methodDeclarations != null ? methodDeclarations.toString(t) : "" ));
    	return( fieldDeclaration.toString(t) + (fieldsAndMethods != null ? fieldsAndMethods.toString(t) : "") );
	}

	public ReturnType typeCheck() throws LanguageException {
		return null;
	}
}
