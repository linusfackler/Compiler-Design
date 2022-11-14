class ReturnStatement extends Stmt {
    private Expr expression;

    public ReturnStatement() {
        expression = null;
    }

    public ReturnStatement(Expr e) {
        expression = e;
    }

    public String toString(int t) {
        if (expression == null)
            return getTabs(t) + "return;\n";
        return getTabs(t) + "return " + expression.toString(0) + ";\n";
    }
}
