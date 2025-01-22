package NewPractice;

public class FindMissingNumber {

    static int missingNumber(int []arr){
        int n = arr.length+1;

        int sum = 0;

        for (int i = 0; i<n-1; i++){
            sum += arr[i];
        }

        int expectedSum = (n*(n+1))/2;

        return expectedSum - sum;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3,  5};
        System.out.println(missingNumber(arr));
    }

}
