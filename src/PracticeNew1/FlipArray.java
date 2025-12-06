package PracticeNew1;

public class FlipArray {

    static void main() {
        int[]arr = {0,0,0,1,0,1,1};

        for (int i = 0; i<arr.length; i++){
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }

        for (int num : arr){
            System.out.print(num+" ");
        }

    }

}
