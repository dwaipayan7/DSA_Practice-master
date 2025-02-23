package LinkedHashMapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
       return size() > capacity;
    }

    public static void main(String[] args) {


        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Tatay", 99);
        studentMap.put("Dwaipayan", 89);
        studentMap.put("D", 91);
        studentMap.put("TB", 94);

        studentMap.get("Tatay");

        System.out.println(studentMap);


    }

}
