package PriorityQueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();

        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println("First element: "+ deque1.getFirst());
        System.out.println("Last element: "+ deque1.getLast());


        for (int num : deque1){
            System.out.print(num+" ");
        }

        Deque<Integer> deque = new LinkedList<>();
    }
}
