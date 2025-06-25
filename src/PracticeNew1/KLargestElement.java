package PracticeNew1;

import java.util.PriorityQueue;

public class KLargestElement {

    static int kLargest(int[]arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<k; i++){
            pq.add(arr[i]);
        }

        for (int i = k; i<arr.length; i++){
            if (pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {

        int[]arr = {20, 10, 30, 50, 40};
        int k = 3;
        System.out.println(kLargest(arr, k));

    }

}
