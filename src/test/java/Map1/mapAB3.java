package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapAB3 {
    //    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the
//    map (but not both), set the other to have that same value in the map.
//    mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"a", "aaa", "b", "bbb", "c", "cake"},}).
                collect(Collectors.toMap(data -> data[0], data -> data[1]));
        mapAB3(map);
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}