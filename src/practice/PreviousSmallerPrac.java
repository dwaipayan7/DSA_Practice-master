package practice;

import java.util.Stack;

public class PreviousSmallerPrac {

    public static void previousSmaller(int[]a){
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<a.length; i++){
            while (!stack.isEmpty() && stack.peek() >= a[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(stack.peek()+" ");
            }
            stack.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        System.out.println("Previous smaller elements:");
        previousSmaller(arr);
    }


}
