package NewPractice;

public class FindElementsInfinity {

    static int findInfinity(int[]a, int key){
        int low = 0;
        int high = 1;

        while (a[high] < key){
            low = high;
            high = 2*high;
        }

        high = Math.min(high, a.length-1);

        return binarySearch(a, key, low, high);

    }

    static int binarySearch(
            int[] arr, int low, int high, int x
    ){
        if (low < high){
            int mid = (low + (high-low))/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x){
                return binarySearch(arr, mid+1, high, x);
            }else{
                return binarySearch(arr, low, mid-1,x);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // Example sorted array (simulating infinite size)
        int[] arr = {1, 3, 5, 7, 9, 12, 15, 18, 21, 25, 30, 35, 40, 45, 50, 60, 70, 80};

        // Key to find
        int key = 30;

        // Call the function
        int index = findInfinity(arr, key);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

}
