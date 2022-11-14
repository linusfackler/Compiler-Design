import java.util.LinkedList;
import java.util.List;

class Readlist extends Token {
    private List<Name> readlist;

    public Readlist(Name n) {
        readlist = new LinkedList<Name>();
        readlist.add(n);
    }

    public Readlist prepend(Name n) {
        readlist.add(0, n);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (int i = 0; i < readlist.size() - 1; i++)
            ret += readlist.get(i).toString(t) + ", ";
        ret += readlist.get(readlist.size() - 1).toString(t);
        return ret;
    }
}
