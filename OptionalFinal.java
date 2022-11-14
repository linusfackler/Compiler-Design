class OptionalFinal extends Token {
    private String f;

    public OptionalFinal() {
        f = "";
    }

    public OptionalFinal(String a) {
        f = a;
    }

    public String toString(int t) {
        return getTabs(t) + f;
    }
}
