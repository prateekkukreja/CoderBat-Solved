package Warmup2;

public class doubleX {
    public static void main(String[] args) {
        doubleX("testxx");
    }

    static boolean doubleX(String str) {
        int idx = str.indexOf("x");
        if (idx == -1) return false;

        if (idx + 1 >= str.length()) return false;
        return str.substring(idx + 1, idx + 2).equals("x");
    }
}
