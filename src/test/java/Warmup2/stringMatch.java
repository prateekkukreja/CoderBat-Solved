package Warmup2;

public class stringMatch {
    public static void main(String[] args) {
        stringMatch("xxcaazz", "xxbaaz");
    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int cnt = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                cnt++;
            }
        }
        return cnt++;
    }
}