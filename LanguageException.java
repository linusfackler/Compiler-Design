public class LanguageException extends Exception {
    String error;

    public LanguageException(String s) {
        error = s;
    }

    public String toString() {
        return error;
    }
}
