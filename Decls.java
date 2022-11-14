import java.util.LinkedList;
import java.util.List;

class Decls extends Token {
    protected List<Decl> list;

    public Decls() {
        list = new LinkedList<Decl>();
    }

    public Decls(Decl d) {
        list = new LinkedList<Decl>();
        list.add(d);
    }

    public Decls prepend(Decl d) {
        list.add(0, d);
        return this;
    }

    public Decls prepend(Decls ds) {
        for (Decl d : ds.list)
            list.add(0, d);
        return this;
    }

    public String toString(int t) {
        String ret = "";

        boolean childF = false;
        boolean childM = false;

        for(Decl d : list) {
            if (d instanceof Fielddecl)
                if (!childF) {
                    ret += getTabs(t) + "Fields:\n";
                    childF = true;
                }
            else if (d instanceof Methoddecl)
                if (!childM) {
                    ret += getTabs(t) + "Method:\n";
                    childM = true;
                }
            ret += d.toString(t + 1);
        }

        return ret;            
    }
}
