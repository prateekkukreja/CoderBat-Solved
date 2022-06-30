package String1;

public class firstHalf {
    public static void main(String[] args) {
        firstHalf("HelloThere");
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
