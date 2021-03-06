package Array1;

public class front11 {
    //    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//    If either array is length 0, ignore that array.
//            front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    public static void main(String[] args) {
        front11(new int[]{1, 2, 3}, new int[]{7, 9, 8});
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        } else if (a.length == 0) {
            return new int[]{b[0]};
        } else if (b.length == 0) {
            return new int[]{a[0]};
        }
        return new int[]{a[0], b[0]};
    }
}