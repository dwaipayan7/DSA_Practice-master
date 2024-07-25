public class MaxProfit {
    public static int maxProfit(int[] arr ){

        int profit = 0;

        for (int i = 0; i<arr.length-1; i++){

            if (arr[i] > arr[i+1]){

                profit = profit + (arr[i] - arr[i+1]);
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,3,6,1,4};

        System.out.println(maxProfit(arr));

    }
}
