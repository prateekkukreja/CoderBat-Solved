package Map1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapAB {
    //    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together and store the result under the key "ab".
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"a", "Hi"}, {"ab", "HiThere"}, {"b", "There"},})
                .collect(Collectors.toMap(data -> data[0], data -> data[1]));
        mapAB(map);
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}