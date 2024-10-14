package practice;

import java.util.PriorityQueue;

public class KthLargestElement {

    static int kLargest(int a[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<k; i++){
            pq.add(a[i]);
        }
        for (int i=k; i<a.length; i++){
            if (pq.peek() < a[i]){
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {12, 55, 3, 6};
        int k = 2;
        System.out.print(kLargest(arr, k));
    }

}
