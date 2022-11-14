import java.util.List;
import java.util.LinkedList;

class Fielddecls extends Token {
    private List<Fielddecl> list;

    public Fielddecls() {
        list = new LinkedList<Fielddecl>();
    }

    public Fielddecls prepend(Fielddecl f) {
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
    // private Fielddecls fds;

    // public Fielddecls (Fielddecl f1, Fielddecls f2) {
    //     fd= f1;
    //     fds = f2;
    // }

    // public Fielddecls(Fielddecl f1) {
    //     fd = f1;
    //     fds = null;
    // }

    // public String toString(int t) {
    //     return fd.toString(t) + (fds != null ? fds.toString(t) : "");
    // }
}
