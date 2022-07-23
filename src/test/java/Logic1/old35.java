package Logic1;

public class old35 {
    //    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
//    old35(3) → true
    public static void main(String[] args) {
        old35(45);
    }

    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        } else if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }
}