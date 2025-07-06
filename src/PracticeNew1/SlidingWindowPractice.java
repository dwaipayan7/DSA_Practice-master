package PracticeNew1;

public class SlidingWindowPractice {

    static void printMax(int[]arr, int k){
        int n = arr.length;
        int j , max;

        for (int i = 0; i <= n - k; i++){
            max = arr[i];

            for (j = 1; j < k; j++){
                if (arr[i + j] > max){
                    max = arr[i + j];
                }
            }
            System.out.print(max +" ");

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 6, 4, 10};
        int k = 3;

        System.out.println("Maximum elements in each subarray of size " + k + ":");
        printMax(arr, k);
    }


}
