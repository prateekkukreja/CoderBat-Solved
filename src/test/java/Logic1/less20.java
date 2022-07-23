package Logic1;

public class less20 {
    //    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
//    less20(18) → true
    public static void main(String[] args) {
        less20(18);
    }

    public static boolean less20(int n) {
        if (n % 20 == 19 || n % 20 == 18) {
            // if ((n+1) % 20 == 0 || (n+2) % 20 == 0) {
            return true;
        }
        return false;
    }

}