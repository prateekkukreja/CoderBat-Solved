package Array1;

public class has23 {
//    Given an int array length 2, return true if it contains a 2 or a 3.
//    has23([2, 5]) → true

    public static void main(String[] args) {
        has23(new int[]{2, 5});
    }

    public static boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }
}
