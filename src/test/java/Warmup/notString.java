package Warmup;

public class notString {

    public static void main(String[] args) {
        notString("nothing");
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
}
