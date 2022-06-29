package Warmup2;

public class noTriplets {
    public static void main(String[] args) {
        noTriples(new int[]{1, 1, 1, 2, 2, 2, 1});
    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (a == b && a == c) {
                return false;
            }
        }
        return true;
    }
}
