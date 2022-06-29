package Warmup;

public class diff21 {

//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference
//    if n is over 21.

//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0

    public static void main(String[] args) {
        System.out.println(diff21(10));
    }

    public static int diff21(int n) {

        int diff = n - 21;
        if (diff > 0) {
            diff = diff * 2;
        } else {
            diff = Math.abs(diff);
        }
        return diff;
    }
}
