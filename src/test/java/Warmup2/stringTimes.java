package Warmup2;

public class stringTimes {
    public static void main(String[] args) {
        stringTimes("hello", 4);
    }

    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(str);
        }

        // String sb = "";
        // for(int i=0;i<n;i++){
        //   sb = sb + str;
        // }
        return sb.toString();
    }

}
