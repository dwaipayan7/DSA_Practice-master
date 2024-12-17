package NewPractice;

import java.util.PriorityQueue;

public class KthLargest {

    public static int kLargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(a[i]);
        }
        for (int i = k; i < a.length; i++) {
            if (pq.peek() < a[i]) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 4};

        int k = 2;

        int result = kLargest(array, k);
        System.out.println("The " + k + "-th largest element is: " + result);
    }
}
