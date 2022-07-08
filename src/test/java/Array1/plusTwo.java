package Array1;

public class plusTwo {
//    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]

    public static void main(String[] args) {
        plusTwo(new int[]{1, 2}, new int[]{3, 4});
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }
}