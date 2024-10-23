package practice;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Mango", 3);
        map.put("Orange", 4);

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value by its key
        String fruit = "Mango";
        if(map.containsKey(fruit)) {
            int value = map.get(fruit);
            System.out.println("The value for key '" + fruit + "' is: " + value);
        }

        // Removing a key-value pair
        map.remove("Orange");
        System.out.println("After removing 'Orange': " + map);

        // Iterating over the HashMap (key-value pairs)
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
