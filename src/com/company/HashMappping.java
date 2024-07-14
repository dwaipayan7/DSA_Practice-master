package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMappping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("USA", 20);
        map.put("China",150);

        System.out.println(map);

        //searching

        if (map.containsKey("China")){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //Iteration

        int arr[] = {12, 15, 18};
        for (int val:arr){
            System.out.print(val+" ");
        }

//        for (Map.Entry<String, Integer> e: map.entrySet()){
//
//        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key+" "+map.get(key));
        }


    }
}
