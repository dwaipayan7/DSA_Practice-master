package ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B",2);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);

//        map2.put("C", 3);
//        System.out.println(map2);
        Map<String, Integer> map3 = Map.of("Tatay", 98, "dwaipayan", 88);
        map3.put("Akshant", 88);

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Dwaipayan", 99), Map.entry("tatay", 89));


        System.out.println(map4);

    }
}
