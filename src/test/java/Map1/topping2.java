package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class topping2 {
    //    Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
//    has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
//    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"ice cream", "cherry"},}).collect(Collectors
                .toMap(data -> data[0], data -> data[1]));
        topping2(map);
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            String tmp = map.get("ice cream");
            map.put("yogurt", tmp);
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}