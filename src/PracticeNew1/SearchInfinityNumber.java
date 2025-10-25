package PracticeNew1;

public class SearchInfinityNumber {

    static int searchInfinity(int[]arr, int key){
        int low = 0;
        int high = 1;

        while (arr[high] < key){
            low = high;
            high = 2 * high;
        }

        return binarySearch(arr, key, low, high);

    }

    static int binarySearch(int []arr, int key, int low, int high){

        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] == key){
                return mid;
            }else if (arr[mid] < key){
                low = mid+1;
            }else{
                high = mid-1;
            }


        }

        return -1;

    }

    public static void main(String[] args) {
        int[]arr = {2, 45, 67, 123, 5555, 45454, 34234234, 324334344};

        int key = 5555;

        int result = searchInfinity(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }


}
