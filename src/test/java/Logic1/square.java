package Logic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class square {
    public static void main(String[] args) {
        System.out.println(square(Arrays.asList(1, 2, 3)));
    }

    public static List<Integer> square(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        nums.replaceAll(n -> n * n);
//        return nums.stream().map(n -> n * n).collect(Collector.toList());
        return nums;
    }
}