class IDExpression extends Token {
    private String id;
    private Args arguments;

    public IDExpression(String i) {
        id = i;
        arguments = null;
    }

    public IDExpression(String i, Args a) {
        id = i;
        arguments = a;
    }

    public String toString(int t) {
        if (arguments == null)
            return getTabs(t) + id + "()";
        return getTabs(t) + id + "( " + arguments.toString(0) + " )";
    }
}
