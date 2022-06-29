package Warmup2;

public class arrayCount9 {
    public static void main(String[] args) {
        arrayCount9(new int[]{1, 3, 5, 6, 7, 8, 9, 9,});
    }

    public static int arrayCount9(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                cnt++;
            }
        }
        return cnt;
    }
}
