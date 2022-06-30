package String1;

public class extraFont {
    public static void main(String[] args) {
        extraFront("Temp");
    }

    public static String extraFront(String str) {
        if (str.length() < 1) return "";
        if (str.length() < 2) {
            return str + str + str;
        }
        String firstTwo = str.substring(0, 2);
        return firstTwo + firstTwo + firstTwo;
    }
}
