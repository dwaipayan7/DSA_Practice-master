package SortedMapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(99,"Dwaipayan");
        map.put(90,"Tatay");
        map.put(80,"D");
//        map.put(null, "TB");
        map.put(78,"B");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(90));
        System.out.println(map.tailMap(90));

    }

}
