class Name extends Token {
    // private Name name;
    private String id;
    private Expr expression;

    public Name(String n) {
        id = n;
        expression = null;
    }

    public Name(String n, Expr e) {
        id = n;
        expression = e;
    }

    public String toString(int t) {
        if (expression == null)
            return getTabs(t) + id;
        return getTabs(t) + id + " [ " + expression.toString(0) + " ]";
    }
}
