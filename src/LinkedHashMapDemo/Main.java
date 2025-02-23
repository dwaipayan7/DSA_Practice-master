package LinkedHashMapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);

        HashMap<String,Integer> hashMap = new HashMap<>();

//        hashMap.put("Orange", 10);
//        hashMap.put("Apple", 20);
//        hashMap.put("Guava", 30);

        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 30);


        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


        HashMap<String, Integer> hashMap1 = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap1);


        hashMap1.put("Tatay", 91);
        hashMap1.put("D", 78);
        hashMap1.put("Dwaipayan", 88);

//        Integer res = hashMap1.getOrDefault("JFdj", 0);
//        hashMap1.putIfAbsent("Tatay", 92);
//        System.out.println(hashMap1);
//        System.out.println(res);


    }

}
