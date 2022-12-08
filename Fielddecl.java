abstract class Fielddecl extends Token {
    TypeID typeid;

    public Fielddecl(TypeID t) {
        typeid = t;
    }

    public String toString(int t) {
        return typeid.toString(t);
    }
}
