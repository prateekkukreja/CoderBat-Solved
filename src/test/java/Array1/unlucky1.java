package Array1;

public class unlucky1 {
    //    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array
//    contains an unlucky 1 in the first 2 or last 2 positions in the array.
//    unlucky1([1, 3, 4, 5]) → true
    public static void main(String[] args) {
        unlucky1(new int[]{1, 3, 4, 5});
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;
        }
        return false;
    }
}