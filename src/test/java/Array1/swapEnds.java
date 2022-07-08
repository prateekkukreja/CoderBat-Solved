package Array1;

public class swapEnds {
//    Given an array of ints, swap the first and last elements in the array. Return the modified array.
//    The array length will be at least 1.
//    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]

    public static void main(String[] args) {
        swapEnds(new int[]{1, 2, 3, 4});
    }

    public static int[] swapEnds(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = tmp;
        return nums;
    }
}
