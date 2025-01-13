package NewPractice;

import java.util.PriorityQueue;

public class FindKthLargestElement {

    static int kthLargest(int[] arr, int k){
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
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = kthLargest(arr, k);
        System.out.println("The " + k + "-th largest element is: " + result);
    }

}
