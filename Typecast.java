class Typecast extends Expr {
    private String type;
    private Expr expr;

    public Typecast(String t, Expr e) {
        type = t;
        expr = e;
    }

    public String toString(int t) {
        return getTabs(t) + "( " + type + " ) " + expr.toString(0);
    }
}
