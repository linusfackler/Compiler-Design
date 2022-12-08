import java.util.LinkedList;
import java.util.List;

class Printlist extends Token {
    private List<Expr> list;

    public Printlist() {
        list = new LinkedList<Expr>();
    }

    public Printlist(Expr e) {
        list = new LinkedList<Expr>();
        list.add(e);
    }

    public Printlist prepend(Expr e) {
        list.add(0, e);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (int i = 0; i < list.size() - 1; i++)
            ret += list.get(i).toString(t) + ", ";
        ret += list.get(list.size() - 1).toString(t);
        return ret;
    }
}