class UnaryExpression extends Expr {
    private String symbol;
    private Expr expression;

    public UnaryExpression(String s, Expr e) {
        symbol = s;
        expression = e;
    }

    public String toString(int t) {
        return getTabs(t) + symbol + expression.toString(0); 
    }
}
