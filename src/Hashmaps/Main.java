package Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Dwaipayan");
        map.put(2,"New User");
        map.put(3,"Tatay");

        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        String s = map.get(69);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Tatay"));

        Set<Integer> keys = map.keySet();
        for (int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry: entries){
//            System.out.println(entry.getKey()+": "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

    }
}
