package Functional1;

import java.util.Arrays;
import java.util.List;

public class math1 {
    //    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
//    math1([1, 2, 3]) → [20, 30, 40]
    public static void main(String[] args) {
        math1(Arrays.asList(1, 2, 3));
    }

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
}