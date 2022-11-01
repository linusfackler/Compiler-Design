class Program extends Token {
    private Expr expr;

    public Program(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return "Program:\n" + expr.toString(t + 1) + "\n";
    }
}
