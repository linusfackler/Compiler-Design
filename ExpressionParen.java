class ExpressionParen extends Expr {
    Expr expression;

    public ExpressionParen(Expr e) {
        expression = e;
    }

    public String toString(int t) {
        return getTabs(t) + "( " + expression.toString(0) + " )";
    }
}
