class Methoddecls extends Token {
    private Methoddecl md;
    private Methoddecls mds;

    public Methoddecls (Methoddecl m1) {
        md = m1;
        mds = null;
    }

    public Methoddecls (Methoddecl m1, Methoddecls m2) {
        md = m1;
        mds = m2;
    }

    public String toString(int t) {
        return (md.toString(t) + (mds != null ? mds.toString(t) : ""));
    }
}