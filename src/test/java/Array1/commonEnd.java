package Array1;

public class commonEnd {
    public static void main(String[] args) {
        commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2});
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
