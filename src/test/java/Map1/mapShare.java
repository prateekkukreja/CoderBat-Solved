package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapShare {
    //    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
//    In all cases remove the key "c", leaving the rest of the map unchanged.
//            mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"a", "aaa", "b", "bbb", "c", "ccc"},})
                .collect(Collectors.toMap(data -> data[0], data -> data[1]));
        mapShare(map);
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}