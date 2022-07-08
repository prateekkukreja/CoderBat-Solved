package Array1;

public class makeMiddle {
//    Given an array of ints of even length, return a new array length 2 containing the middle two elements
//    from the original array. The original array will be length 2 or more.
//    makeMiddle([1, 2, 3, 4]) → [2, 3]

    public static void main(String[] args) {
        makeMiddle(new int[]{1, 2, 3, 4});
    }

    public static int[] makeMiddle(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[nums.length / 2 - 1];
        a[1] = nums[nums.length / 2];
        return a;
    }
}