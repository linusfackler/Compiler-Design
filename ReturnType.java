import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class ReturnType {
    enum TypeEnum { INT, FLOAT, STRING, CHAR, BOOL, VOID, METHOD }

    private TypeEnum typeEnum;
    private boolean _isFinal;
    private boolean _isArray;

    public ReturnType() {
        
    }

    public ReturnType(TypeEnum t) {
        typeEnum = t;
        _isFinal = false;
        _isArray = false;        
    }

    public ReturnType(TypeEnum t, boolean f) {
        typeEnum = t;
        _isFinal = f;
        _isArray = false;
    }

    public ReturnType(TypeEnum t, int s) {
        typeEnum = t;
        _isFinal = false;
        _isArray = (s >= 0 ? true : false);
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public boolean isFinal() {
        return _isFinal;
    }

    public boolean isArray() {
        return _isArray;
    }

    public boolean isInt() {
        return (typeEnum == TypeEnum.INT && !_isArray);
    }

    public boolean isFloat() {
        return (typeEnum == TypeEnum.FLOAT && !_isArray);
    }

    public boolean isNum() {
        return ((typeEnum == TypeEnum.FLOAT || typeEnum == TypeEnum.INT) && !_isArray);
    }

    public boolean isString() {
        return (typeEnum == TypeEnum.STRING && !_isArray);
    }

    public boolean isChar() {
        return (typeEnum == TypeEnum.CHAR && !_isArray);
    }

    public boolean isBool() {
        return (typeEnum == TypeEnum.BOOL && !_isArray);
    }

    public boolean isBoolOrCoersible() {
        return ((typeEnum == TypeEnum.BOOL || typeEnum == TypeEnum.INT) && !_isArray);
    }

    public boolean isVoid() {
        return (typeEnum == TypeEnum.VOID && !_isArray);
    }

    public boolean isSame(ReturnType r) {
        return (typeEnum == r.getTypeEnum());
    }

    public boolean isFunction() {
        return ((typeEnum == TypeEnum.VOID || typeEnum == TypeEnum.METHOD) && !_isArray);
    }

    public boolean isMethod() {
        return (typeEnum == TypeEnum.METHOD);
    }

    public MethodType getMethodType() {
        return (MethodType) this;
    }

    public String toString() {
        if (!_isArray)
            return (typeEnum.toString());
        return (typeEnum.toString() + "[]");
    }
}

class MethodType extends ReturnType {
    TypeEnum methodEnum;
    private LinkedHashMap<String, ReturnType> parameters;

    public MethodType(TypeEnum t) {
        methodEnum = t;
        parameters = new LinkedHashMap<String, ReturnType>();
    }

    public MethodType(TypeEnum t, LinkedHashMap<String, ReturnType> h) {
        super(TypeEnum.METHOD);
        methodEnum = t;
        parameters = h;
    }

    public TypeEnum getMethodEnum() {
        return methodEnum;
    }

    public ReturnType getMethType() {
        return new ReturnType(methodEnum);
    }

    public boolean checkParameters(List<ReturnType> p) {
        if (p.size() != parameters.size()) {
            return false;
        }

        int i = 0;
        for (ReturnType r : parameters.values()) {
            if (!p.get(i).isSame(r))
                return false;
            i++;
        }
        return true;
    }

}