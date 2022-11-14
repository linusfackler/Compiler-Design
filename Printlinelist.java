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
        for (int i = 0; i < list.size() - 1; i ++)
            ret += list.get(i).toString(t) + ", ";
        ret += list.get(list.size() - 1).toString(t);
        return ret;
    }
}
