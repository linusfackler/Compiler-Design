class WhileStatement extends Token {
    private Expr check;
    private Stmts statementList;

    public WhileStatement (Expr e, Stmts s) {
        check = e;
        statementList = s;
    }

    public String toString(int t) {
        return getTabs(t) + "while (" + check.toString(0) + ") {\n" 
        + statementList.toString(t + 1) + getTabs(t) + "\n}\n";
    }
}
