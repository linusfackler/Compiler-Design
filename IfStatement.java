class IfStatement extends Stmt {
    private Expr check;
    private Fielddecls fds;
    private Stmts statementList;
    private IfEnd elseBlock;

    public IfStatement(Expr e, Fielddecls f, Stmts s, IfEnd ie) {
        check = e;
        fds = f;
        statementList = s;
        elseBlock = ie;
    }

    public String toString(int t) {
        return getTabs(t) + "if (" + check.toString(0) + ") {\n" + fds.toString(t + 1)
        + statementList.toString(t + 1) + getTabs(t) + "}\n\n" + elseBlock.toString(t);
    }
}