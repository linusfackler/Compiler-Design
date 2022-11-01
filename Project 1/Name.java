class Name extends Token {
    // private Name name;
    String value;

    public Name(String n) {
        value = n;
    }

    public String toString(int t) {
        return getTabs(t) + value;
    }
}
