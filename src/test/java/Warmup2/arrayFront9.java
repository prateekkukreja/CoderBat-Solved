package Warmup2;

public class arrayFront9 {
    public static void main(String[] args) {
        arrayFront9(new int[]{1, 2, 3, 4, 5});
    }

    public static boolean arrayFront9(int[] nums) {
        int len = nums.length;
        if (len > 4) len = 4;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}
