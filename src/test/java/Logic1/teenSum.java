package Logic1;

public class teenSum {
    //    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
    //    So if either value is a teen, just return 19.
//    teenSum(3, 4) → 7
    public static void main(String[] args) {
        teenSum(3, 4);
    }

    public static int teenSum(int a, int b) {
        if (a <= 19 && a >= 13 || b <= 19 && b >= 13) {
            return 19;
        }
        return a + b;
    }
}