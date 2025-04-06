package PracticeNew;

import java.util.PriorityQueue;

public class PriorityQueueKthLargest {

    static int kthLargest(int[]arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<k; i++){
            pq.add(arr[i]);
        }

        for (int i = k; i< arr.length; i++){
            if (pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthLargest(arr, k);
        System.out.println("The " + k + "rd largest element is: " + result);
    }


}
