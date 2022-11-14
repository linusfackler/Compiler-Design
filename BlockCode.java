class BlockCode extends Stmt {
    private Stmts statementlist;
    private String semi;

    public BlockCode (Stmts ss, String s) {
        statementlist = ss;
        semi = s;
    }

    public String toString(int t) {
        return getTabs(t) + "{ " + statementlist.toString(t + 1) + getTabs(t) + " }" + semi + "\n";
    }
}
