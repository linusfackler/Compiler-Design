class FielddeclSingle extends Fielddecl {
    Boolean isFinal;
	Optionalexpr expression;
	public FielddeclSingle(OptionalFinal f, TypeID t, Optionalexpr e)
	{
		super(t);
		isFinal = true;
		expression = e;
	}

	public FielddeclSingle(TypeID t, Optionalexpr e)
	{
		super(t);
		isFinal = false;
		expression = e;
	}

	public String toString(int t)
	{
		return( getTabs(t) + (isFinal ? "final " : "") + super.toString(t) + 
			(expression != null ? expression.toString(t) : "") + ";\n");
	}
}
