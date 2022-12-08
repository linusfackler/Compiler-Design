class TypeID extends Token {
    private Type type;
    private String id;

    public TypeID (Type t, String i) {
        type = t;
        id = i;
    }

    public String toString(int t) {
        return (type.toString(t) + " " + id);
    }
}
