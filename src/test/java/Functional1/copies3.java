package Functional1;

import java.util.Arrays;
import java.util.List;

public class copies3 {
    //    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated
//    together.
//    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    public static void main(String[] args) {
        copies3(Arrays.asList("a", "bb", "ccc"));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}