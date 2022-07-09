package String1;

public class startWord {
    //    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front
//    of the string, except its first char does not need to match exactly. On a match, return the front of the string,
//    or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
//    startWord("hippo", "hi") → "hi"
    public static void main(String[] args) {
        startWord("hippo", "hi");
    }

    public static String startWord(String str, String word) {
        if (str.length() < 1) {
            return "";
        }
        String compare1 = str.substring(1);
        String compare2 = word.substring(1);
        if (str.length() >= 1 && compare1.startsWith(compare2)) {
            return str.substring(0, word.length());
        }
        return "";
    }
}