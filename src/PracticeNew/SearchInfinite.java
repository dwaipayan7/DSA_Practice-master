package PracticeNew;

public class SearchInfinite {

    public static int searchInfinite(int[]arr, int key){

        int low = 0;
        int high = 1;

        while (arr[high] < key){
            low = high;
            high = 2*high;
        }

        if (high >= arr.length) {
            high = arr.length - 1;
        }

        return binarySearch(arr, key, low, high);

    }

    private static int binarySearch(int[] arr, int key, int low, int high) {


        if (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] == key){
                return mid;
            }

            if (arr[mid] > key){
               return binarySearch(arr, key, low, mid-1);
            }else{
                return binarySearch(arr, key, mid+1, high);
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        // Simulating an infinite sorted array (example)
        int[] arr = {1, 3, 5, 7, 9, 10, 15, 20, 25, 30, 35, 40, 50, 60, 70, 80, 90};
        int key = 25;

        int index = searchInfinite(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
