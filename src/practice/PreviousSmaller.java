package practice;

import java.util.Stack;

public class PreviousSmaller {

    static void previousSmaller(int[]a){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<a.length; i++){
            if (!stack.isEmpty() && stack.peek() >= a[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                System.out.print(-1);
            }else{
                System.out.print(stack.peek()+" ");
            }
            stack.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};

        System.out.println("Previous smaller elements for the array:");
        previousSmaller(arr);
    }

}
