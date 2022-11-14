import java.util.LinkedList;
import java.util.List;

class Args extends Token {
    private List<Expr> arguments;

    public Args() {
        arguments = new LinkedList<Expr>();
    }

    public Args(Expr e) {
        arguments = new LinkedList<Expr>();
        arguments.add(e);
    }

    public Args prepend(Expr e) {
        arguments.add(0, e);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (int i = 0; i < arguments.size() - 1; i++)
            ret += arguments.get(i).toString(t) + ", ";
        ret += arguments.get(arguments.size() - 1).toString(t);
        return ret;
    }
}
