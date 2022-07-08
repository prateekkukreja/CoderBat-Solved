package Array1;

public class double23 {
//    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//    double23([2, 2]) → true

    public static void main(String[] args) {
        double23(new int[]{2, 3});
    }

    public static boolean double23(int[] nums) {
        if (nums.length <= 1) return false;
        if (nums[0] == 2 && nums[1] == 2) {
            return true;
        } else if (nums[0] == 3 && nums[1] == 3) {
            return true;
        }
        return false;
    }
}
