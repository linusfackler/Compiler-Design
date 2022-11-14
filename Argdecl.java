class Argdecl extends Token {
    private String type;
    private String id;
    private String option;

    public Argdecl(String t, String i) {
        type = t;
        id = i;
        option = "";
    }

    public Argdecl(String t, String i, String o) {
        type = t;
        id = i;
        option = o;
    }

    public String toString(int t) {
        return getTabs(t) + type + " " + id + option;
    }
}
