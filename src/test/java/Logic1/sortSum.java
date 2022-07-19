package Logic1;

public class sortSum {

    //    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
//    so in that case just return 20.
//    sortaSum(3, 4) → 7
    public static void main(String[] args) {
        sortaSum(3, 4);
    }

    public static int sortaSum(int a, int b) {
        int num = a + b;
        if (num >= 10 && num <= 19) {
            num = 20;
        }
        return num;
    }
}