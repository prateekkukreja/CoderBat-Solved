package Functional1;

import java.util.Arrays;
import java.util.List;

public class moreY {
    //    Given a list of strings, return a list where each string has "y" added at its start and end.
//    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    public static void main(String[] args) {
        moreY(Arrays.asList("a", "b", "c"));
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}