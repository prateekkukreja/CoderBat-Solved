package String1;

public class theEnd {
    public static void main(String[] args) {
        theEnd("Hello", false);
    }

    public static String theEnd(String str, boolean front) {
        char res;
        if (front == false) {
            res = str.charAt(str.length() - 1);
        } else
            res = str.charAt(0);
        return String.valueOf(res);
    }
}
