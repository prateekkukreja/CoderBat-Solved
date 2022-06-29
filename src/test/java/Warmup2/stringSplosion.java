package Warmup2;

public class stringSplosion {
    public static void main(String[] args) {
        stringSplosion("Kitten");
    }

    public static String stringSplosion(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res = res + str.substring(0, i + 1);
        }
        return res;
    }

}
