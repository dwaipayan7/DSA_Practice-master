package PracticeNew1;

public class SlidingWindowNewPractice {

    static void printKMax(int[] arr, int n, int k){
        int j,max;
        for (int i = 0; i<= n - k; i++){
            max = arr[i];
            for (j = 1;  j < k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }

    static void main() {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        printKMax(arr, arr.length, k);

    }

}
