package PracticeNew1;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    static void main() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Dragon Fruit");
        fruits.add("Apple");

        System.out.println("Fruits: "+ fruits);
        System.out.println("Contains Banana?"+fruits.contains("Banana"));

        fruits.remove("Apple");
        System.out.println("After Removing the fruits: "+ fruits);

    }

}
