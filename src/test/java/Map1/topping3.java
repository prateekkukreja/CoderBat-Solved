package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class topping3 {
    //    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
//    set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
//    topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"ice cream", "cherry"}, {"potato", "ketchup"},}).
                collect(Collectors
                        .toMap(data -> data[0], data -> data[1]));
        topping3(map);
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        String tmp = null;
        if (map.containsKey("potato")) {
            tmp = map.get("potato");
            map.put("fries", tmp);
        }
        if (map.containsKey("salad")) {
            tmp = map.get("salad");
            map.put("spinach", tmp);
        }
        return map;
    }
}