package String1;

public class withoutEnd2 {
    public static void main(String[] args) {
        withouEnd2("Hello");
    }

    public static String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
