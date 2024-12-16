package QueueDemo;

import com.company.InterFaces;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(1); //enqueue
//        list.addLast(2);
//        list.addLast(3);
//        System.out.println(list);
//
//        Integer i = list.removeFirst(); // dequeue
//        System.out.println(list);
//
//        System.out.println(list.peek());

        Queue<Integer> list = new LinkedList<>();

        list.add(1);

        System.out.println(list.size());
       // System.out.println(list.remove()); // throw exception
        System.out.println(list.poll());

        System.out.println(list.peek());
       // System.out.println(list.element()); // throws exception

        Queue<Integer> list2 = new ArrayBlockingQueue<>(2);
        System.out.println(list2.add(1));
        System.out.println(list2.offer(2));

        System.out.println(list2.offer(3));

    }

}
