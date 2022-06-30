package String1;

public class middleThree {
    public static void main(String[] args) {
        middleThree("Temper");
    }

    public static String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }
}

