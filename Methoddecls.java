import java.util.List;
import java.util.LinkedList;

class Methoddecls extends Token {
    private List<Methoddecl> list;

    public Methoddecls() {
        list = new LinkedList<Methoddecl>();
    }

    public Methoddecls prepend(Methoddecl m) {
        list.add(0, m);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (Methoddecl m : list) {
            ret += m.toString(t);
        }
        return ret;
    }

    // private Methoddecl md;
    // private Methoddecls mds;

    // public Methoddecls (Methoddecl m1) {
    //     md = m1;
    //     mds = null;
    // }

    // public Methoddecls (Methoddecl m1, Methoddecls m2) {
    //     md = m1;
    //     mds = m2;
    // }

    // public String toString(int t) {
    //     return getTabs(t) + md.toString(t) + (mds != null ? mds.toString(t) : "");
    // }
}
