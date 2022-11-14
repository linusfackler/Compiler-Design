class PrintlnStatement extends Token {
    private Printlinelist printlist;

    public PrintlnStatement (Printlinelist pll) {
        printlist = pll;
    }

    public String toString (int t) {
        return getTabs(t) + "printline ( " + printlist.toString(0) + " );\n";
    }
}
