package Warmup;

public class endUp {
    public static void main(String[] args) {
        endUp("leopard");
    }

    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        int val = str.length() - 3;
        String front = str.substring(0, val);
        String last = str.substring(val);
        return front + last.toUpperCase();
    }

}
