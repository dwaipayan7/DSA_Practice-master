package com.company;


class Operation {

    public static int searchInfinite(int a[], int key) {
        int low = 0;
        int high = 1;
        while (a[high] < key) {
            low = high;
            high = 2 * high;
        }
        return binarySearch(a, key, low, high);// updation
    }

    public static int binarySearch(int arr[], int key, int low, int high) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}




public class FindElement_Infinite_Sorted_Array {
    public static void main(String[] args) {

//        Operation op = new Operation();

        int[] arr = new int[]{
                3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170
        };
        int findKey = 90;
        int ans = Operation.searchInfinite(arr,findKey);

        if (ans != -1){
            System.out.println("Key: "+findKey+" found at: "+ans);
        }else{
            System.out.println("Key: "+findKey+" not found in the array");
        }



    }
}
