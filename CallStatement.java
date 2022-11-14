class CallStatement extends Stmt {
    private String callName;
    private Args arguments;

    public CallStatement (String id) {
        callName = id;
        arguments = null;
    }

    public CallStatement (String id, Args a) {
        callName = id;
        arguments = a;
    }

    public String toString(int t) {
        if (arguments == null)
            return getTabs(t) + callName + "();\n";
        return getTabs(t) + callName + "( " + arguments.toString(0) + " );\n";
    }
}
