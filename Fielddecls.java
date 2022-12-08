class Fielddecls extends Token {
    private Fielddecl fd;
    private Fielddecls fds;

    public Fielddecls (Fielddecl f1, Fielddecls f2) {
        fd= f1;
        fds = f2;
    }

    public Fielddecls(Fielddecl f1) {
        fd = f1;
        fds = null;
    }

    public String toString(int t) {
        return (fd.toString(t) + (fds != null ? fds.toString(t) : ""));
    }
}
