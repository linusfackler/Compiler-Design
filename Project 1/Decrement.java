class Decrement extends Token {
    public Name variableName;

    public Decrement (Name n) {
        variableName = n;
    }

    public String toString(int t) {
        return getTabs(t) + variableName.toString(0) + "--;\n";
    }
}
