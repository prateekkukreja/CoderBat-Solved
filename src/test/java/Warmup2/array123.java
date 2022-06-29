package Warmup2;

public class array123 {
    public static void main(String[] args) {
        array123(new int[]{1, 1, 1, 3, 4, 2, 1, 2, 3});
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}
