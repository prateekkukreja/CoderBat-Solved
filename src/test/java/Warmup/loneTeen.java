package Warmup;

public class loneTeen {
    public static void main(String[] args) {
        loneTeen(13, 99);
    }

    public static boolean loneTeen(int a, int b) {
        boolean aa = (a >= 13 && a <= 19);
        boolean bb = (b >= 13 && b <= 19);
        return (aa && !bb) || (!aa && bb);
    }
}
