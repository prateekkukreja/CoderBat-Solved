package String1;

public class withoutX2 {
    //    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
//    otherwise return the string unchanged. This is a little harder than it looks.
//    withoutX2("xHi") → "Hi"
    public static void main(String[] args) {
        withoutX2("xHi");
    }

    public static String withoutX2(String str) {
        if (str.length() < 2) return "";
        if (str.substring(0, 2).equals("xx")) {
            return str.substring(2);
        } else if (str.substring(0, 1).equals("x")) {
            return str.substring(1);
        } else if (str.substring(1, 2).equals("x")) {
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}