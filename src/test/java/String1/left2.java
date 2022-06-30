package String1;


//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
// The string length will be at least 2.
//        left2("Hello") → "lloHe"

public class left2 {
    public static void main(String[] args) {
        left2("Hello");
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }
}
