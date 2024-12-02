package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
//        list.add(0,0);
//        System.out.println(list);
//
//        List<Integer> list1 = List.of(4, 5, 7, 8, 9);
//
//        list.addAll(list1);

//        list.remove(Integer.valueOf(1));

//        list.toArray(new Integer[0]);
//
//        System.out.println(list);

//        List<String> fruits =  new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Apple");
//        fruits.add("Cherry");
//        fruits.add("Banana");
//        fruits.add("Grape");
//        fruits.add("Date");
//
//        fruits.remove("Apple");
//
//        System.out.println(fruits);

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);

//        Collections.sort(list);
        list.sort(null);
        System.out.println(list);


    }
}
