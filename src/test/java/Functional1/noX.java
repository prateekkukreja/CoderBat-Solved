package Functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class noX {
    //    Given a list of strings, return a list where each string has all its "x" removed.
//            noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    public static void main(String[] args) {
        noX(Arrays.asList("ax", "bb", "cx"));
    }

    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
}