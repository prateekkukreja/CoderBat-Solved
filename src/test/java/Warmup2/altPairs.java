package Warmup2;

public class altPairs {
    public static void main(String[] args) {
        altPairs("CodingHorror");
    }
    public static String altPairs(String str) {
        String res="";
        for(int i=0; i<str.length(); i+=4){
            int cnt = i+2;
            if (cnt > str.length()){
                cnt = str.length();
            }
            res = res + str.substring(i, cnt);
        }
        return res;
    }
}
