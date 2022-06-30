package Array1;

public class sameFirstLast {
    public static void main(String[] args) {
        sameFirstLast(new int[]{1, 2, 3, 1});
    }

    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
}
