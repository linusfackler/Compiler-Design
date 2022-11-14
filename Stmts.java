import java.util.List;
import java.util.LinkedList;

class Stmts extends Token {
    private List<Stmt> statementList;

    public Stmts() {
        statementList = new LinkedList<Stmt>();
    }

    public Stmts prepend(Stmt s) {
        statementList.add(0, s);
        return this;
    }

    public String toString(int t) {
        String ret = "";
        for (Stmt s : statementList) {
            ret += s.toString(t);
        }
        return ret;
    }
}
