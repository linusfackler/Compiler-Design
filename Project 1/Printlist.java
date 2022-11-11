import java.util.LinkedList;
import java.util.List;

class Printlist extends Token {
    private List<Expr> printlist;

    public Printlist() {
        printlist = new LinkedList<Expr>();
    }

    public Printlist(Expr e) {
        printlist = new LinkedList<Expr>();
        printlist.add(e);
    }

    public Printlist prepend(Expr e) {
        printlist.add(0, e);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (Expr e : printlist)
            ret += e.toString(t);
        return ret;
    }
}
