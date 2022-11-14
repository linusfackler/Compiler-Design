class WhileStatement extends Stmt {
    private Expr check;
    private Fielddecls fds;
    private Stmts statementList;

    public WhileStatement (Expr e, Fielddecls f, Stmts s) {
        check = e;
        fds = f;
        statementList = s;
    }

    public String toString(int t) {
        return getTabs(t) + "while (" + check.toString(0) + ") {\n" 
        + fds.toString(t + 1) + statementList.toString(t + 1) + getTabs(t) + "}\n";
    }
}
