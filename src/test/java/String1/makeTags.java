package String1;

public class makeTags {
    public static void main(String[] args) {
        makeTags("i", "Yay");
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
