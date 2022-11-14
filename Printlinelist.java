import java.util.LinkedList;
import java.util.List;

class Printlinelist extends Token {
    private List<Printlist> list;

    public Printlinelist() {
        list = new LinkedList<Printlist>();
    }

    public Printlinelist(Printlist pl) {
        list = new LinkedList<Printlist>();
        list.add(pl);
    }

    public String toString(int t) {
        String ret = "";
        for (Printlist pl : list)
            ret += pl.toString(t);
        return ret;
    }
}
