package Array1;

public class rotateLeft3 {
    public static void main(String[] args) {
        rotateLeft3(new int[]{5, 11, 9});
    }

    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
}
