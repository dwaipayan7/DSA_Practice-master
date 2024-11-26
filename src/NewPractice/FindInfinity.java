package NewPractice;

public class FindInfinity {

    static int searchInfinity(int[]a, int key){
        int low = 0;
        int high = 1;

        while (high < a.length && a[high] < key){
            low = high;
            high = 2*high;
        }
        return binarySearch(a, key, low, high);
    }

    static int binarySearch(int[]arr, int low, int high, int x){
        if (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x){
                return binarySearch(arr, mid+1, high, x);
            }else{
                return binarySearch(arr, low, mid-1, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};

        int key = 19;

        int result = searchInfinity(array, key);

        if (result != -1) {
            System.out.println("Key " + key + " found at index: " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

}
