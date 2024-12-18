package NewPractice;

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
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 23};
        int res = minCost(arr);
        System.out.println(res);
    }

}
