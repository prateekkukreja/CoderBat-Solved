package Array1;

public class no23 {

//    Given an int array length 2, return true if it does not contain a 2 or 3.
//    no23([4, 5]) → true

    public static void main(String[] args) {
        no23(new int[]{4, 5});
    }

    public static boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }
}
