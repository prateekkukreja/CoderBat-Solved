package String1;

public class endsLy {
    public static void main(String[] args) {
        endsLy("oddy");
    }

    public static boolean endsLy(String str) {
        if (str.length() < 2)
            return false;

        return (str.substring(str.length() - 2, str.length()).equals("ly"));
    }
}
