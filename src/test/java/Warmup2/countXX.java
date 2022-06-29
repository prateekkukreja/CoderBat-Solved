package Warmup2;

public class countXX {
    public static void main(String[] args) {
        countXX("abcxx");
    }

    public static int countXX(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
                cnt++;
        }
        return cnt;
    }

}
