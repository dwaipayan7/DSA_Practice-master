package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianPractice {

   static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
   static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    static void insertNum(int num){
        if (maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }

    }

    public static double findMedian(){
        if (maxHeap.size() == minHeap.size()){
            return maxHeap.peek()+minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {5, 15, 1, 3, 10, 20};

        System.out.println("Adding numbers and finding the median:");
        for (int num : nums) {
            insertNum(num);
            System.out.println("Added: " + num + ", Median: " + findMedian());
        }
    }
}
