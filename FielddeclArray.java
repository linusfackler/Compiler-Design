class FielddeclArray extends Fielddecl {
    int intlit;

    public FielddeclArray(TypeID t, int n) {
        super(t);
        intlit = n;
    }

    public String toString(int t) {
        return (getTabs(t) + super.toString(t) + "[" + intlit + "];\n");
    }
}
