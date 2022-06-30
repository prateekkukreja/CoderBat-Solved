package String1;

public class hasBad {
    public static void main(String[] args) {
        hasBad("xxbadxx");
    }

    public static boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
        } else if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
