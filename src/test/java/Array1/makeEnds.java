package Array1;

public class makeEnds {
//    Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
//    The original array will be length 1 or more.
//    makeEnds([1, 2, 3]) → [1, 3]

    public static void main(String[] args) {
        makeEnds(new int[]{1, 2, 3});
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }
}
