class Fielddecl extends Token {
    private String option;
    private String type;
    private String id;
    private Optionalexpr opex;
    private int index;
    private boolean indexSet = false;
    //private TypeID typeid;
    //private OptionalFinal ofinal;
    
    public Fielddecl(String o, String t, String ia, Optionalexpr oe) {
        option = o;
        type = t;
        id = ia;
        opex = oe;
        indexSet = false;
        //ofinal = of;
    }

    public Fielddecl(String t, String i, int in) {
        option = "";
        type = t;
        id = i;
        opex = null;
        index = in;
        indexSet = true;
    }

    public String toString(int t) {
        if (indexSet == false)
            return getTabs(t) + option + " " + type + " " + id + opex.toString(t) + ";";
        else
            return getTabs(t) +  type + " " + id + "[" + index + "];";
    }
}
