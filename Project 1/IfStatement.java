class IfStatement extends Token {
    private Expr check;
    private Stmts statementList;
    private IfEnd elseBlock;

    public IfStatement(Expr e, Stmts s, IfEnd ie) {
        check = e;
        statementList = s;
        elseBlock = ie;
    }

    public String toString(int t) {
        return getTabs(t) + "if (" + check.toString(0) + ") {\n" + statementList.toString(t + 1) 
        + getTabs(t) + "}\n\n" + elseBlock.toString(t);
    }
}