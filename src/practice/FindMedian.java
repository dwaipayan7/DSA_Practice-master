package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void insertNum(int num){
        if (maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if (maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }

    }

    public double findMedian(){
        if (maxHeap.size() == minHeap.size()){
            return (double) (maxHeap.peek() + minHeap.peek()) /2;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        FindMedian medianFinder = new FindMedian();

        int[] nums = {12, 15, 10, 5, 8, 20};

        System.out.println("Inserting numbers and finding median:");

        for (int num : nums) {
            medianFinder.insertNum(num);
            System.out.println("Inserted: " + num + " | Current Median: " + medianFinder.findMedian());
        }
    }

}
