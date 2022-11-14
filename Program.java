class Program extends Token {
    private String id;
    private Memberdecls memberdecls;

    public Program(String i, Memberdecls m) {
        id = i;
        memberdecls = m;
    }

    public String toString(int t) {
        return "Program:\n" + getTabs(t + 1) + "class " + id + "{\n" + memberdecls.toString(0) + "\n" + getTabs(t + 1) + "}";
    }
}
