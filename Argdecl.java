abstract class ArgDecl extends Token implements TI {
	ReturnType type;
  String id;
  public ArgDecl(ReturnType t, String i)
  {
    type = t;
    id = i;
  }

  public String toString(int t)
  {
  	return( type.toString() + " " + id);
  }
}

