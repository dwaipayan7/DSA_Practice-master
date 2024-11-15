package practice;

import java.util.PriorityQueue;

public class kLargestElement {

    static int kLargest(int[]a, int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i=0; i<k; i++){
            pq.add(a[i]);
        }

        for (int i = k; i<a.length; i++){
            if (pq.peek() < a[i]){
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {20, 60, 40, 10};
        int k = 2;
        int res = kLargest(arr,k);
        System.out.print(res);
    }

}
