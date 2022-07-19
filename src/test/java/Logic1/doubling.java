package Logic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class doubling {
    //    Given a list of integers, return a list where each integer is multiplied by 2.
//    doubling([1, 2, 3]) → [2, 4, 6]
    public static void main(String[] args) {
        doubling(Arrays.asList(1, 2, 3));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        nums.replaceAll(n -> n * 2);
        return nums;
    }
//        return nums.stream()
//                .map(n -> n * 2)
//                .collect(Collectors.toList());
//    }
}