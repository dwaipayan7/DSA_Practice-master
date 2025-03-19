package PracticeNew;

import java.util.Stack;

public class PreviousSmallerElement {

    static void previousSmallerElement(int[] arr) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        System.out.println("Previous Smaller Elements:");
        previousSmallerElement(arr);
    }
}
