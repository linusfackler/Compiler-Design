class ConditionalExpression extends Token {
    private Expr condition, exprTrue, exprFalse;

    public ConditionalExpression(Expr e1, Expr e2, Expr e3) {
        condition = e1;
        exprTrue = e2;
        exprFalse = e3;
    }

    public String toString(int t) {
        return getTabs(t) + "( " + condition.toString(0) + " ? " + exprTrue.toString(0) + " : " + exprFalse.toString(0) + " )";
    }
}
