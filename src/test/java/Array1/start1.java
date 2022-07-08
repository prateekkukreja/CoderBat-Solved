package Array1;

public class start1 {
//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//    start1([1, 2, 3], [1, 3]) → 2

    public static void main(String[] args) {
        start1(new int[]{1, 2, 3}, new int[]{1, 3});
    }

    public static int start1(int[] a, int[] b) {
        int c = 0;
        if (a.length != 0) {
            if (a[0] == 1) c++;
        }
        if (b.length != 0) {
            if (b[0] == 1) c++;
        }
        return c;
    }
}