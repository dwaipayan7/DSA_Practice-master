package NewPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianPractice {

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void insertNum(int num){
        if (maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }

    }

    public  double findMedian(){
        if (maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2;
        }
        return maxHeap.peek();
    }


    public static void main(String[] args) {

        FindMedianPractice findMedian = new FindMedianPractice();
        findMedian.insertNum(1);
        findMedian.insertNum(2);
        findMedian.insertNum(3);
        findMedian.insertNum(4);
        findMedian.insertNum(5);
        System.out.println(findMedian.findMedian());

    }

}
