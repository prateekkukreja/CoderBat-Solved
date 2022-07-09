package Array1;

public class frontPiece {
    //    Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than
//    length 2, use whatever elements are present.
//            frontPiece([1, 2, 3]) → [1, 2]
    public static void main(String[] args) {
        frontPiece(new int[]{1, 2, 3});
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }
}