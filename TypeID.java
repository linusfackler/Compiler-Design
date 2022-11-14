class TypeID extends Token {
    private String type;
    private String id;

    public TypeID (String t, String i) {
        type = t;
        id = i;
    }

    public String toString(int t) {
        return getTabs(t) + type + " " + id;
    }
}
