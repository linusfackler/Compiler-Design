class TypeExpression extends Expr {
    private int valueI;
    private boolean issetI = false;

    private char valueC;
    private boolean issetC = false;

    private String valueS;
    private boolean issetS = false;

    private float valueF;
    private boolean issetF = false;

    private boolean valueB;
    private boolean issetB = false;

    public TypeExpression(int i) {
        valueI = i;
        issetI = true;
        issetC = issetS = issetF = issetB = false;
    }

    public TypeExpression(char c) {
        valueC = c;
        issetC = true;
        issetI = issetS = issetF = issetB = false;
    }
    
    public TypeExpression(String s) {
        valueS = s;
        issetS = true;
        issetI = issetC = issetF = issetB = false;
    }

    public TypeExpression(float f) {
        valueF = f;
        issetF = true;
        issetI = issetC = issetS = issetB = false;
    }

    public TypeExpression(boolean b) {
        valueB = b;
        issetB = true;
        issetI = issetC = issetS = issetF = false;
    }

    public String toString(int t) {
        if (issetI == true)
            return getTabs(t) + valueI;
        else if (issetC == true)
            return getTabs(t) + valueC;
        else if (issetS == true)
            return getTabs(t) + valueS;
        else if (issetF == true)
            return getTabs(t) + valueF;
        else if (issetB == true)
            return getTabs(t) + valueB;
        else
            return "";
    }
}