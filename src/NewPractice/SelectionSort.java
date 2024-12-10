package NewPractice;

public class SelectionSort {

    public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i< n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                swap(arr,min,i);
            }
        }
    }

    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[]arr){
        for (int num: arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before Sorting:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

}
