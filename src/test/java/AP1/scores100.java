package AP1;

public class scores100 {

    //    Given an array of scores, return true if there are scores of 100 next to each other in the array.
//    The array length will be at least 2.
//    scores100([1, 100, 100]) → true
    public static void main(String[] args) {
        scores100(new int[]{1, 100, 100});
    }

    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }
}