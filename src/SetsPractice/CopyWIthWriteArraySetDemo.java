package SetsPractice;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyWIthWriteArraySetDemo {

    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        //Thread Safe
        for (int i = 1; i<=5; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: "+copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: "+concurrentSkipListSet);


        for (Integer num : copyOnWriteSet){
            System.out.println("Reading from CopyOnWriteArraySet: "+num);
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);


        for (Integer num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet: "+num);
            concurrentSkipListSet.add(6);
        }
//        System.out.println(concurrentSkipListSet);

    }

}
