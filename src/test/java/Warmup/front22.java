package Warmup;

public class front22 {

//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
//    -- see Introduction to Mod
//
//    or35(3) → true
//    or35(10) → true
//    or35(8) → false

    public static void main(String[] args) {
        front22("kitty");
    }

    public static String front22(String str) {
        int len = 2;
        if (len > str.length()) {
            len = str.length();
        }
        String first = str.substring(0, len);
        return first + str + first;
    }
}
