package Logic1;

public class more20 {
    //    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
//    more20(20) → false
    public static void main(String[] args) {
        more20(21);
    }

    public static boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2) {
            return true;
        }
        return false;
    }
}