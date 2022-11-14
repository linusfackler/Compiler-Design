class BinaryExpression extends Expr {
    private Expr e1, e2;
    private String binary;

    public BinaryExpression(Expr eleft, String b, Expr eright) {
        e1 = eleft;
        binary = b;
        e2 = eright;
    }

    public String toString(int t) {
        return getTabs(t) + e1.toString(0) + " " + binary + " " + e2.toString(0);
    }
}
