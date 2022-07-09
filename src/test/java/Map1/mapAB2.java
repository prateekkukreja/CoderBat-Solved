package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapAB2 {
    //    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
//    remove them both.
//            mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"ice cream", "cherry"}, {"potato", "ketchup"},}).
                collect(Collectors.toMap(data -> data[0], data -> data[1]));
        mapAB2(map);
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}