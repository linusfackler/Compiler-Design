import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
    ArrayList<HashMap<String, ReturnType>> table;

    public SymbolTable() {
        table = new ArrayList<HashMap<String, ReturnType>>();
    }

    public void startScope() {
        table.add(new HashMap<String, ReturnType>());
    }

    public void endScope() {
        table.remove(table.size()-1);
    }

    public ReturnType get(String s) throws LanguageException {
        for (HashMap<String, ReturnType> h : table) {
            if (h.containsKey(s)) {
                return h.get(s);
            }
        }
        throw new LanguageException("Error: variable not declared " + s); 
    }

    // checking if variable already delcared in current scope
    // only checking top of array, since it's allowed in a different scope
    public void addVar(String id, ReturnType t) throws LanguageException {
        if (table.get(table.size()-1).containsKey(id)) {
            throw new LanguageException("Error: tried to redeclare variable " + id);
        }
        table.get(table.size()-1).put(id, t);
    }


    public ReturnType.TypeEnum getReturnT() throws LanguageException {
        for (HashMap<String, ReturnType> h : table) {
            for (ReturnType r : h.values()) {
                if (r.isMethod())
                    return r.getMethodType().getMethodEnum();
            }
        }
        throw new LanguageException("Error: current scope is no method");
    }


    public String toString() {
        String ret = "";
        String t = "";
        for (HashMap<String, ReturnType> h : table) {
            for (String k : h.keySet()) {
                ret += t + k + " " + h.get(k) + "\n";
            }
            t += "\t";
        }
        return ret;
    }
}
