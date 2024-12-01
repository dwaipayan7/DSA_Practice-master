package NewPractice;

public class SlidingWindow {

    public static void printMax(int[]arr, int k){
        int j,max;
        int n = arr.length;

        for (int i=0; i<= n -k; i++){
            max = arr[i];
            for (j = 1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
                System.out.print(max+" ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 4, 2};
        int k = 3;
        printMax(arr,k);
    }

}
