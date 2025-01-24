package HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        if (set.contains(1)){
            System.out.println("Set contains: 1");
        }
        if (!set.contains(6)){
            System.out.println("Does not contains");
        }

        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Does not contains 1");
        }

        for (int i : set){
            System.out.print(i+" ");
        }

        System.out.println("\nSize of the set: "+set.size());

        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }


    }

}
