package String1;

public class deFront {
    //    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
//    keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//    deFront("Hello") → "llo"
    public static void main(String[] args) {
        deFront("Hello");
    }

    public static String deFront(String str) {
        str = str.toLowerCase();
        if (str.substring(0, 2).equals("ab")) {
            return str;
        }
        if (str.substring(0, 1).equals("a")) {
            return str.substring(0, 1) + str.substring(2);
        } else if (str.substring(1, 2).equals("b")) {
            return str.substring(1);
        }
        return str.substring(2);
    }
}