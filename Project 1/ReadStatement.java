class ReadStatement extends Token {
    public Readlist readlist;

    public ReadStatement (Readlist rl) {
        readlist = rl;
    }

    public String toString(int t) {
        return getTabs(t) + "read ( " + readlist.toString(0) + " );\n";
    }
}
