//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class StackUsingQueue {
//
//  Queue<Integer> q1;
//  Queue<Integer> q2;
//
//  void push(int data){
//      while (!q1.isEmpty()){
//          q2.push
//      }
//
//
//
//
//
////
////  void push(int x){
////      q.add(x);
////      for (int i = 0; i<q.size()-1; i++){
////          q.add(q.poll());
////      }
////  }
////  int pop(){
////      return q.poll();
////  }
////  int top(){
////      return q.peek();
////  }
////  int size(){
////      return q.size();
//  }
//
//    public static void main(String[] args) {
//        StackUsingQueue s = new StackUsingQueue();
//        s.push(3);
//        s.push(2);
//        s.push(4);
//        s.push(1);
//        System.out.println("Top of the stack: " + s.top());
//        System.out.println("Size of the stack before removing element: " + s.size());
//        System.out.println("The deleted element is: " + s.pop());
//        System.out.println("Top of the stack after removing element: " + s.top());
//        System.out.println("Size of the stack after removing element: " + s.size());
//    }
//
//}


import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    public void push(int x) {
        queue.add(x);
        for(int i=0; i<queue.size()-1; i++){
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {



    }

}
