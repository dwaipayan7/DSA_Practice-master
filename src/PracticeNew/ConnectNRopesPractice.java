package PracticeNew;

import java.util.PriorityQueue;

public class ConnectNRopesPractice {

    static int minCost(int[]arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i< arr.length; i++){
            pq.add(arr[i]);
        }

        int ans = 0;

        while (pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first+second;
            pq.add(sum);
            ans += sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        int result = minCost(ropes);
        System.out.println("Minimum cost to connect ropes: " + result);
    }


}
