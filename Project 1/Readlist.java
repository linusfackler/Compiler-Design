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
        for (Name n : readlist)
            ret += n.toString(t);
        return ret;
    }
}
