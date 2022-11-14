class Optionalexpr extends Token {
    private Expr expression;

    public Optionalexpr(Expr e) {
        expression = e;
    }

    public Optionalexpr() {
        expression = null;
    }

    public String toString(int t) {
        if (expression == null)
            return "";
        else
            return " = " + expression.toString(t);
    }    
}
