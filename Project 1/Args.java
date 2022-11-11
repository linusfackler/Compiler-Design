import java.util.LinkedList;
import java.util.List;

class Args extends Token {
    private List<Expr> arguments;

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
        for (Expr e : arguments)
            ret += e.toString(t);
        return ret;
    }
}
