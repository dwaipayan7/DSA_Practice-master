package NewPractice;

import java.util.PriorityQueue;

public class ConnectNRopes {

    static int minCost(int[]a){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i=0; i<a.length; i++){
            pq.add(a[i]);
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
        int arr[] = { 2, 7, 3, 44, 2, 5};
        int ans = minCost(arr);
        System.out.println(ans);
    }

}
