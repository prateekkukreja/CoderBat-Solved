package Warmup;

public class missingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("nothing", 5));
    }

    public static String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();

//        String first = str.substring(0, n);
//        String back = str.substring(n+1, str.length());
//
//        return first + back;
    }
}
