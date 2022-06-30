package Array1;

public class firstLast6 {
    public static void main(String[] args) {
        firstLast6(new int[]{13, 6, 1, 2, 3});
    }

    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }
}
