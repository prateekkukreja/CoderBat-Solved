package String1;

public class minCat {
    public static void main(String[] args) {
        minCat("Hello", "java");
    }

    public static String minCat(String a, String b) {
        int length = 0;
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() > b.length()) {
            length = b.length();
            return a.substring(a.length() - length) + b;
        } else {
            length = a.length();
            return a + b.substring(b.length() - length);
        }
    }
}
