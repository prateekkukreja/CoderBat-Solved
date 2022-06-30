package String1;

public class twoChars {
    public static void main(String[] args) {
        twoChar("java", 3);
    }

    public static String twoChar(String str, int index) {
        if (index <= 0) {
            return str.substring(0, 2);
        } else if (index > 2 && index > str.length() - 2) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
