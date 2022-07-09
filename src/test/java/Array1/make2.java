package Array1;

public class make2 {
    //    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements
//    from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
//            make2([4, 5], [1, 2, 3]) → [4, 5]
    public static void main(String[] args) {
        make2(new int[]{4, 5}, new int[]{1, 2, 3});
    }

    public static int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[]{b[0], b[1]};
        } else if (a.length == 1) {
            return new int[]{a[0], b[0]};
        }
        return new int[]{a[0], a[1]};
    }
}