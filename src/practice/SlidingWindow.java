package practice;

public class SlidingWindow {

    public static void printMax(int[]arr, int n, int k){
        int max=0;
        for (int i=0; i<n-k; i++){
            max = arr[i];
            for (int j = 1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 11, 2, 3};
        int n = arr.length;
        int k = 3;
       printMax(arr,n,k);
    }

}
