class Methoddecl extends Token {
    private String returntype;
    private String id;
    private Argdecls als;
    private Fielddecls fls;
    private Stmts statements;
    private String optionalSemi;

    public Methoddecl(String rt, String i, Argdecls as, Fielddecls fs, Stmts ss, String o) {
        returntype = rt;
        id = i;
        als = as;
        fls = fs;
        statements = ss;
        optionalSemi = o;
    }

    public String toString(int t) {
        return getTabs(t) + returntype + " " + id + "(" + als.toString(0) + ") {\n" + fls.toString(0)
        + statements.toString(0) + "\n}" + optionalSemi;
    }
}
