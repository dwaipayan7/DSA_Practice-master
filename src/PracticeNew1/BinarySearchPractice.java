package PracticeNew1;

public class BinarySearchPractice {

    static int binarySearch(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }



    static int binarySearchRecursion(int[]arr, int k, int low, int high){

        if (low > high) return -1;

        int mid = (low+high)/2;
        if (arr[mid] == k){
            return mid;
        }
        if (k > arr[mid]){
            return binarySearchRecursion(arr, k, mid+1, high);
        }else{
            return binarySearchRecursion(arr, k, low, mid-1);
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13}; // Must be sorted
        int target = 7;

        // Iterative Binary Search
        int iterativeResult = binarySearch(arr, target);
        System.out.println("Iterative Binary Search: Element found at index = " + iterativeResult);

        // Recursive Binary Search
        int recursiveResult = binarySearchRecursion(arr, target, 0, arr.length - 1);
        System.out.println("Recursive Binary Search: Element found at index = " + recursiveResult);
    }


}
