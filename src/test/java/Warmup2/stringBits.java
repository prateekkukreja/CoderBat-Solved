package Warmup2;

public class stringBits {
    public static void main(String[] args) {
        stringBits("Heelloooo");
    }

    public static String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res = res + str.charAt(i);
        }
        return res;
    }
}
