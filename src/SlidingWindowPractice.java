import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowPractice {

    public static void printMax(int[] arr, int n, int k) {
        if (k > n) {
            System.out.println("Window size is larger than array size.");
            return;
        }

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println(); // To move to the next line after printing all max values
    }

    //optimised

    public static void printMaxRec(int[] arr, int n, int k){

        Deque<Integer> Qi = new LinkedList<Integer>();

        int i;

        for(i=0; i<k; i++){
            while (!Qi.isEmpty() && arr[i] > arr[Qi.peek()]){

                Qi.removeLast();
                Qi.add(i);
            }

            for (; i<n;++i){
                System.out.print(arr[Qi.peek()]+" ");
                while ((!Qi.isEmpty() && Qi.peek() <= i-k)){
                    Qi.removeLast();
                    Qi.add(i);
                }
            }
        }
        System.out.print(arr[Qi.peek()]);

    }



    public static void main(String[] args) {
        int arr[] = {8, 9, 34, 5, 98};
        int n = arr.length;
        int k = 3;
        printMaxRec(arr, n, k);
    }
}
