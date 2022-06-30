package String1;

public class firstTwo {
    public static void main(String[] args) {
        firstTwo("abcdefg");
    }

    public static String firstTwo(String str) {
        if (str.length() < 2 || str == "") {
            return str;
        }
        return str.substring(0, 2);
    }
}
