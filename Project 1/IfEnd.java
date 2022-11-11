class IfEnd extends Token {
    private Stmts statementList;
    
    public IfEnd() {
        statementList = null;
    }

    public IfEnd(Stmts s) {
        statementList = s;
    }

    public String toString(int t) {
        if (statementList == null)
            return "";
        else
            return getTabs(t) + "else {\n" + statementList.toString(t + 1) + getTabs(t) + "}\n";
    }
}
