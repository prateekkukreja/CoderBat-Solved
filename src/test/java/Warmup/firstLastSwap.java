package Warmup;

public class firstLastSwap {

    public static void main(String[] args) {
        frontBack("TEstng");
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
}
