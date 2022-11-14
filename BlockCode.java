class BlockCode extends Stmt {
    private Fielddecls fds;
    private Stmts statementlist;
    private String semi;

    public BlockCode (Fielddecls f, Stmts ss, String s) {
        fds = f;
        statementlist = ss;
        semi = s;
    }

    public String toString(int t) {
        return getTabs(t) + "{\n" + fds.toString(t + 1) + statementlist.toString(t + 1) + getTabs(t) + "}" + semi + "\n";
    }
}
