package NewPractice;

import java.util.Scanner;

public class ChocolateFactory {

    public static void pushZeroToEnd(int[]arr, int n){
        int count = 0;
        for (int i = 0; i<n; i++){
            if (arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while (count < n){
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        pushZeroToEnd(arr, n);

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
