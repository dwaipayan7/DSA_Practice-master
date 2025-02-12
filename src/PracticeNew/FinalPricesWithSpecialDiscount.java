package PracticeNew;

import java.util.Stack;

public class FinalPricesWithSpecialDiscount {

    public static int[] finalPrices(int[] prices){
        Stack<Integer> stack = new Stack<>();
        int[]res = new int[prices.length];

        for (int i = 0; i<prices.length; i++){
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                res[index] = prices[index] - prices[i];
            }
            stack.push(i);
            res[i] = prices[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] result = finalPrices(prices);

        System.out.println("Final Prices after Discount:");

        for (int price : result){
            System.out.print(price+" ");
        }

    }
}
