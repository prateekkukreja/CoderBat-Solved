package AP1;

public class wordsCount {
    //    Given an array of strings, return the count of the number of strings with the given length.
//            wordsCount(["a", "bb", "b", "ccc"], 1) → 2
    public static void main(String[] args) {
        wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1);
    }

    public static int wordsCount(String[] words, int len) {
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                n++;
            }
        }
        return n;
    }
}