class AssignStatement extends Stmt {
    public Name variableName;
    public Expr value;

    public AssignStatement(Name n, Expr e) {
        variableName = n;
        value = e;
    }

    public String toString(int t) {
        return getTabs(t) + variableName.toString(0) + " = " + value.toString(0) + ";\n";
    }
}
