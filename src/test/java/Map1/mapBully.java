package Map1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapBully {

    //    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
//    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
//    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][]{{"a", "candy"}, {"b", "carrot"}, {"c", "meh"},}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println(mapBully(map));
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}