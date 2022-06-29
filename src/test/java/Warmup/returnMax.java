package Warmup;

public class returnMax {
    public static void main(String[] args) {
        intMax(10, 17, 98);
    }

    public static int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

}
