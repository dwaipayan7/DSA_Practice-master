

import java.util.*;


public class QueueBasic {
    public static void main(String[] args) {
//        Queue<Integer> Q = new LinkedList<>();
//
//        Q.offer(10);
//        Q.offer(20);
//        Q.offer(30);
//        Q.offer(40);
//        Q.offer(50);
//
//        while (!Q.isEmpty()){
//            System.out.println(Q.poll());
//        }

//        System.out.println(Q);
//
//        System.out.println(Q.poll());
//
//        System.out.println(Q);
//
//        System.out.println(Q.peek());
//
//        System.out.println(Q);


//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//
//            dq.offer(10);
//            dq.offerFirst(23);
//            dq.offerLast(88);
//
//        System.out.println(dq);
//
//        System.out.println(dq.pollFirst());
//
//        System.out.println(dq.offerLast(33));



//ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        stack.push(34);
//        stack.push(55);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

//        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
//
//        pq.add(34);
//        pq.add(10);
//        pq.add(45);
//
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);





        Set<Student> set = new HashSet<>();

       set.add((new Student(1,"Tatay")));
       set.add((new Student(1,"Tatay")));
       set.add((new Student(1,"Tatay")));
       set.add((new Student(1,"Tatay")));
       set.add((new Student(1,"Tatay")));
       set.add((new Student(1,"Tatay")));

        System.out.println(set);
//
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(20);
//        set.add(10);
//
//
//        System.out.println(set);
//        set.remove(10);
//        System.out.println(set);



    }
}

 class Student{
    int roll;
    String name;

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }


}
