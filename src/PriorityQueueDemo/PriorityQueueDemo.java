package PriorityQueueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        //Comparator.reverseOrder()
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        pq.add(23);
        pq.add(11);
        pq.add(5);
        pq.add(8);
        pq.add(55);
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());

//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        System.out.println(pq);

    }
}
