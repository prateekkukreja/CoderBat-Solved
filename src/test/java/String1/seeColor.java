package String1;

public class seeColor {
    public static void main(String[] args) {
        seeColor("blueTimes");
    }
    public static String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }
}
