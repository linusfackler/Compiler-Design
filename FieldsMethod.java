public class FieldsMethod {
    private Fielddecl fd;
    private FieldsMethod fm;
    private Methoddecl md;
    private Methoddecls mds;

    public FieldsMethod(Fielddecl f1, FieldsMethod f2) {
        fd = f1;
        fm = f2;
        md = null;
        mds = null;
    }

    public FieldsMethod(Methoddecl m1, Methoddecls m2) {
        fd = null;
        fm = null;
        md = m1;
        mds = m2;
    }

    public String toString(int t) {
        if (md != null) {
            return (md.toString(t) + (mds != null ? mds.toString(t) : ""));
        }

        return (fd.toString(t) + (fm != null ? fm.toString(t) : ""));
    }
}
