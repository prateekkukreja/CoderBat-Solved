package Functional1;

import java.util.Arrays;
import java.util.List;

public class rightDigit {
    //    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
//    rightDigit([1, 22, 93]) → [1, 2, 3]
    public static void main(String[] args) {
        rightDigit(Arrays.asList(1, 22, 93));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(i -> i % 10);
        return nums;
    }
}