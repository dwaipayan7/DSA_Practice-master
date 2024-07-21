public class SortingAlgorithms {
    public static void selectionSort(int[] arr, int n) {
        // Iterate over the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    public static void bubbleSort(int[] arr, int n){
        for (int i=0; i< n-1; i++){
            for (int j = i+1; j<n;j++ ){
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr, n);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
