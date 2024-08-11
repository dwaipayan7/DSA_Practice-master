public class FindMissingValue {

    public static int missingNumber(int n, int []arr){
        int sum = 0;
        for (int i=0; i<n-1; i++){
            sum += arr[i];
        }
        int expectedSum = n*(n-1)/2;
        return sum-expectedSum;
    }

    public static void main(String[] args) {
        int []arr = {2, 3, 5, 6};
        int n = arr.length;
        int res = missingNumber(n,arr);
        System.out.println(res);
    }

}
