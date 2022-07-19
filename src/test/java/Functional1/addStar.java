package Functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class addStar {

//    Given a list of strings, return a list where each string has "*" added at its end.
//    Functional1.addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]

    public static void main(String[] args) {
        System.out.println(addStar(Arrays.asList("a*", "bb", "ccc")));
    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}