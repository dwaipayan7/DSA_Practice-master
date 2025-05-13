package PracticeNew1;

public class SearchInfinity {

    static int searchInfinity(int[]arr, int key){
        int low = 0;
        int high = 1;
        while (arr[high] < key){
            low = high;
            high = 2 * high;
        }
        return binarySearch(arr, key,low, high);
    }

    static int binarySearch(int[]arr, int target, int low, int high){

        low = 0;
        high = arr.length - 1;

        while (low <= high){

            int mid = low + (high-low)/2;

            if (arr[mid] == target){
                return  mid;
            }
            if (arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 15, 18, 21, 25, 30, 35, 40, 45, 50, 55, 60};
        int key = 30;

        int result = searchInfinity(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }


}
