package Warmup2;

public class array667 {
    public static void main(String[] args) {
        array667(new int[]{6, 7, 2, 6});
    }

    public static int array667(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            if (a == 6 && b == 6 || a == 6 && b == 7) {
                cnt++;
            }
        }
        return cnt;
    }
}
