package AP1;

public class scoresClump {
    //    Given an array of scores, return true if there are scores of 100 next to each other in the array. The array
//    length will be at least 2.
//    scores100([1, 100, 100]) → true
    public static void main(String[] args) {
        scoresClump(new int[]{1, 3, 5, 5});
    }

    public static boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length - 1; i++) {
            if (Math.abs(scores[i - 1] - scores[i + 1]) <= 2) {
                return true;
            }
        }
        return false;
    }
}