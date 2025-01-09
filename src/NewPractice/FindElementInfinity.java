package NewPractice;

public class FindElementInfinity {

    static int searchInfinite(int[]a, int key){
        int low = 0;
        int high = 1;
        while (high < a.length && a[high] < key){
            low = high;
            high = 2*high;
        }
        return binarySearch(a, key, low, high);
    }

    static int binarySearch(int[]arr, int low, int high, int target){

        if (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                return binarySearch(arr, mid+1, high, target);
            }else{
                return  binarySearch(arr, low, mid-1, target);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};

        int key = 19;

        int result = searchInfinite(array, key);

        if (result != -1) {
            System.out.println("Key " + key + " found at index: " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

}
