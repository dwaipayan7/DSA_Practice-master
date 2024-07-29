import static com.company.WaveSort.swap;

public class WaveSortPractice {

   static void waveSort(int arr[], int n){
        for (int i = 1; i<n-1;i++){
            if (arr[i] > arr[i+1]){
                swap(arr, i, i-1);
            }
            if (arr[i] > arr[i+1] && i <= n-2){
                swap(arr, i, i+1);
            }
        }
    }


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 7, 5, 6, 2};
        int n = arr.length;
        waveSort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
