package String1;

public class conCat {
//    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
//    conCat("abc", "cat") → "abcat"

    public static void main(String[] args) {
        conCat("abc", "cat");
    }

    public static String conCat(String a, String b) {
        if (a.length() < 1) return b;
        if (b.length() < 1) return a;
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }
}