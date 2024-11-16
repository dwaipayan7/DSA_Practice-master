package practice;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static int min(int []arr){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int ans = 0;
        while (pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            int sum = first+second;
            ans += sum;
            pq.add(sum);
        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {23, 1, 56, 3, 8};
        int res = min(arr);
        System.out.println(res);

    }
}
