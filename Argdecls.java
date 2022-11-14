import java.util.LinkedList;
import java.util.List;

class Argdecls extends Token {
    private List<ArgdeclList> list;

    public Argdecls() {
        list = new LinkedList<ArgdeclList>();
    }

    public Argdecls(ArgdeclList al) {
        list = new LinkedList<ArgdeclList>();
        list.add(al);
    }

    public String toString(int t) {
        String ret = "";
        for (int i = 0; i < list.size() - 1; i ++)
            ret += list.get(i).toString(t) + ", ";
        ret += list.get(list.size() - 1).toString(t);
        return ret;
    }
}
