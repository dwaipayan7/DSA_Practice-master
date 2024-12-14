package SortedMapDemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b-a);

        //TreeMap -> self-balancing binary search tree

//        map.put("Tatay", 91);
//        map.put("Dwaipayan", 99);
//        map.put("New", 81);
//
        map.put(91,"Tatay");
        map.put(99,"Dwaipayan");
        map.put(81,"New");
        map.put(77,"New User");

//        System.out.println(map);
//
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(91));
//        System.out.println(map.tailMap(91));
//        System.out.println(map.subMap(78, 91));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(2,"Two");

        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingKey(2));
        System.out.println(navigableMap.higherEntry(3));
        System.out.println(navigableMap.descendingMap());


    }

}
