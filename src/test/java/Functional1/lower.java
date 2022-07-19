package Functional1;

import java.util.Arrays;
import java.util.List;

public class lower {
    //    Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase()
//    method).
//    lower(["Hello", "Hi"]) → ["hello", "hi"]
    public static void main(String[] args) {
        lower(Arrays.asList("Hello", "Hi"));
    }

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
}