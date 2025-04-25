package PracticeNew;

public class SelectionSortPractice {

    static void selectionSort(int[]arr){

        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int min = i;
            for (int j = i+1; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            if (min != i){
                swap(arr, min, i);
            }
        }

    }

    static void swap(int []arr, int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {


        int[]arr = {9, 3, 10};
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }

    }

}
