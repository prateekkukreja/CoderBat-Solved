package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapAB4 {
    //    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
//    then set "c" to have the longer value. If the values exist and have the same length, change them both to
//    the empty string in the map.
//    mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"a", "aaa", "b", "bbb", "c", "cake"},}).
                collect(Collectors.toMap(data -> data[0], data -> data[1]));
        mapAB4(map);
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()) {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }
}