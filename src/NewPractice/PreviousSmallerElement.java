package NewPractice;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void previousSmaller(int[]a){
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i<a.length; i++){
            while (!s.isEmpty() && s.peek() >= a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(s.peek()+" ");
            }
            s.push(a[i]);
        }

    }

    public static void main(String[] args) {
        // Test case: array of integers
        int[] array = {4, 10, 5, 8, 2, 1};

        // Call the previousSmaller method with the array
        System.out.print("Previous Smaller Elements: ");
        previousSmaller(array);
    }


}
