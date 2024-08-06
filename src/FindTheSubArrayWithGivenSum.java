import java.util.HashMap;

public class FindTheSubArrayWithGivenSum {

    public static void subArraySum(int a[], int sum){
        int currSum = 0;
        int start = 0;
        int end = -1;
        int n = a.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n-1; i++){
            currSum += a[i];

            if (currSum - sum == 0){
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end = i;
                break;
            }
            map.put(currSum,i);

        }
        if (end == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("["+start+", "+end+"]");
        }
    }

    public static int findLargest(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxlen = 0;
        int sum = 0;

        //base case
        map.put(0, -1);

        for (int i=0; i<nums.length; i++){
            sum += nums[i] == 0 ? -1: 1;
            if (map.containsKey(sum)){
                int length = i - map.get(sum);
                maxlen = Math.max(maxlen, length);
            }else{
                map.put(sum , i);
            }
        }

        return maxlen;
    }


    public static void main(String[] args) {
        int arr[] = {10, 15, -5, 15, -10, 5};
        int sum = 5;
        System.out.println("Answer: ");
        subArraySum(arr,sum);

        int a[] = {1, 0, 1, 0, 1, 1,0};
        int res = findLargest(a);
        System.out.println("Maximum Length is: "+res);

    }

}
