package String1;

public class extraEnd {
    public static void main(String[] args) {
        extraEnd("Hello");
    }

    public static String extraEnd(String str) {
        String res = "";
        for (int i = 0; i < 3; i++) {
            res = res + str.substring(str.length() - 2, str.length());
        }
        return res;
    }
}
