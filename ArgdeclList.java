import java.util.LinkedList;
import java.util.List;

class ArgdeclList extends Token {
    private List<Argdecl> list;

    public ArgdeclList() {
        list = new LinkedList<Argdecl>();
    }

    public ArgdeclList(Argdecl a) {
        list = new LinkedList<Argdecl>();
        list.add(a);
    }

    public ArgdeclList prepend(Argdecl a) {
        list.add(0, a);
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
