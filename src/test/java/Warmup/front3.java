package Warmup;

public class front3 {
    public static void main(String[] args) {
        front3("testing");
    }

    public static String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }
}
