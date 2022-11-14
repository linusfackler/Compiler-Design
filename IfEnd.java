class IfEnd extends Stmt {
    private Fielddecls fds;
    private Stmts statementList;
    
    public IfEnd() {
        fds = null;
        statementList = null;
    }

    public IfEnd(Fielddecls f, Stmts ss) {
        fds = f;
        statementList = ss;
    }

    public String toString(int t) {
        if (statementList == null)
            return "";
        else
            return getTabs(t) + "else {\n" + fds.toString(t + 1) + statementList.toString(t + 1) + getTabs(t) + "}\n";
    }
}
