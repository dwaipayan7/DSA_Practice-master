package PracticeNew;

public class Heap {

    static void insert(int[]arr, int n, int value){

        n = n+1;
        arr[n] = value;
        int i = n;

        while (i > 1){
            int parent = i/2;
            if (arr[parent] < arr[i]){
                swap(arr, parent, i);
                i = parent;
            }else{
                return;
            }
        }

    }

    static void delete(int[]arr, int n){
        arr[1] = arr[n];
        n = n-1;
        int i = 1;
        while (i *2 <= n){
            int left = 2*i;
            int right = 2 * i+1;
            int larger = left > right ? 2*i : 2*i+1;

            if (arr[i] < arr[larger]){
                swap(arr, i, larger);
                i = larger;
            }else{
                return;
            }

        }
    }

    static void swap(int[]arr, int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    static void printHeap(int[]arr, int size){

        for (int i = 1; i<= size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] heap = new int[100];
        int size = 0;

        int[] valuesToInsert = { 50, 30, 20, 15, 10, 8, 16 };

        for (int value : valuesToInsert) {
            insert(heap, size, value);
            size++;
        }

        System.out.println("Heap after insertions:");
        printHeap(heap, size);

        delete(heap, size);
        System.out.println("Heap after deleting root:");
        printHeap(heap, size);

    }


}
