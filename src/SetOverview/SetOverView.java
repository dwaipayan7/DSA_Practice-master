package SetOverview;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverView {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> integers = map.keySet();
        set.add(12);
        set.add(1);
        set.add(16);
//        set.contains(1);
        System.out.println(set);
//        System.out.println(set.contains(1));
//        System.out.println(set.remove(16));
//        set.clear();
//        System.out.println(set.isEmpty());

        for (int i:set){
            System.out.println(i);
        }
        
        //for thread safety
//        Set<Integer> integers = Collections.synchronizedSet(set);

        Set<Integer> set1 = new ConcurrentSkipListSet<>();



    }

}
