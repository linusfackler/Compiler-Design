class Expr extends Token {
    String value;


    public Expr(String i) {
        value = i;
    }

    public String toString(int t) {
        return getTabs(t) + value;
    }
}
