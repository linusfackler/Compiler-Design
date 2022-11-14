class PrintStatement extends Stmt {
    public Printlist printlist;

    public PrintStatement (Printlist pl) {
        printlist = pl;
    }

    public String toString (int t) {
        return getTabs(t) + "print ( " + printlist.toString(0) + " );\n";
    }
}
