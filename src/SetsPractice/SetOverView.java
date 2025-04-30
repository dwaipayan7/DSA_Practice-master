package SetsPractice;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class SetOverView {

    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> integers = map.keySet();
//        Set<Integer> set = new LinkedHashSet<>();

        Set<Integer> set = new LinkedHashSet<>();


        set.add(12);
        set.add(1);
        set.add(9);
        set.add(19);

        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(1));
        set.clear();
        System.out.println(set.isEmpty());

        for (int i : set){
            System.out.println(i);
        }

        Set<Integer> set1 = new ConcurrentSkipListSet<>();


        Set<Integer> syncSet = Collections.synchronizedSet(new TreeSet<>());

        synchronized (syncSet){
            for (Integer i : syncSet){
                System.out.println(i);
            }
        }

        Set.of(1, 2, 3, 4);


    }

}
