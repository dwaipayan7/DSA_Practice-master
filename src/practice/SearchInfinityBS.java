package practice;

public class SearchInfinityBS {

    public static int searchInfinity(int[]arr, int key){
        int low = 0;
        int high = 1;

        while (high < arr.length && arr[high] < key){
            low = high;
            high = 2*high;
        }
        return binarySearch(arr, low, high, key);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 12, 15, 18, 20, 25, 30, 35, 40, 50, 60, 70};  // Simulated infinite array

        int key = 25;  // Value to search for

        int result = searchInfinity(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

}
