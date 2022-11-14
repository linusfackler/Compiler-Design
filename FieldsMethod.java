import java.util.List;
import java.util.LinkedList;

public class FieldsMethod {
    private List<Fielddecl> list;

    public FieldsMethod() {
        list = new LinkedList<Fielddecl>();
    }

    public FieldsMethod prepend(Fielddecl f) {
        list.add(0, f);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (Fielddecl f : list) {
            ret += f.toString(t);
        }
        return ret;
    }


    // private Fielddecl fd;
    // private FieldsMethod fm;
    // private Methoddecl md;
    // private Methoddecls mds;

    // public FieldsMethod(Fielddecl f1, FieldsMethod f2) {
    //     fd = f1;
    //     fm = f2;
    //     md = null;
    //     mds = null;
    // }

    // public FieldsMethod(Methoddecl m1, Methoddecls m2) {
    //     fd = null;
    //     fm = null;
    //     md = m1;
    //     mds = m2;
    // }

    // public String toString(int t) {
    //     if (md != null) {
    //         return md.toString(t) + (mds != null ? mds.toString(t) : "");
    //     }

    //     return fd.toString(t) + (fm != null ? fm.toString(t) : "");
    // }
}
