package Array1;

public class maxTriple {
    public static void main(String[] args) {

    }

    public static int maxTriple(int[] nums) {
        int largest = nums[0];
        if (largest < nums[nums.length / 2]) {
            largest = nums[nums.length / 2];
        }
        if (largest < nums[nums.length - 1]) {
            largest = nums[nums.length - 1];
        }
        return largest;
    }
}