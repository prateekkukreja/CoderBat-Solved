package Logic1;

public class nearTen {
    //    Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
//    nearTen(12) → true
    public static void main(String[] args) {
        nearTen(19);
    }

    public static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }
        return false;
    }
}