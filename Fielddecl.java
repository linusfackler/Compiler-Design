abstract class FieldDecl extends Token implements TI {
	FieldStart fieldStart;

  public FieldDecl(FieldStart f)
  {
  	fieldStart = f;
  }

  public String toString(int t)
  {
    return fieldStart.toString(t);
  }

}

