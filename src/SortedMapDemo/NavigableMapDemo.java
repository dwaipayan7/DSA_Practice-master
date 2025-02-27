package SortedMapDemo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(5, "Five");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(5));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());

    }

}
