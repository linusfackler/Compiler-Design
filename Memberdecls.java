class Memberdecls extends Token {
    // private Fielddecls fds;
    // private Methoddecls mds;

    // public Memberdecls (Fielddecls f, Methoddecls m) {
    //     fds = f;
    //     mds = m;
    // }

    // public String toString(int t) {
    //     return getTabs(t) + fds.toString(0) + getTabs(t) + mds.toString(0);
    // }

    private FieldsMethod fm;

    public Memberdecls (FieldsMethod f) {
        fm = f;
    }

    public String toString(int t) {
        return (fm != null ? fm.toString(t) : "");
    }    
}
