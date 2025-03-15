package PracticeNew;

public class PushZerosToEnd {

    static void pushZerosToEnd(int[]arr, int n){
        int j = 0;

        for (int i = 0; i <n; i++){
            if (arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for (int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int n = arr.length;

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array after pushing zeros to the end: ");
        pushZerosToEnd(arr, n);
    }


}
