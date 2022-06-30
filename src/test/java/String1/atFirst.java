package String1;

public class atFirst {
    public static void main(String[] args) {
        atFirst("hello");
    }

    public static String atFirst(String str) {
        if (str == "") {
            return "@@";
        } else if (str.length() < 2) {
            return str + "@";
        }
        return str.substring(0, 2);
    }
}
