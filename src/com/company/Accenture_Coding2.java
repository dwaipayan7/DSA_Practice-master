package com.company;

public class Accenture_Coding2 {

    public static int armValue(int input1, int []input2){

        int evenSum = 0;
        int oddSum = 0;

        for (int i:input2){
            if (i%2==0){
                evenSum+=i;
            }
            else {
                oddSum +=i;
            }
        }
        if (oddSum % 2==0){
            return (oddSum+evenSum);
        }else{
            return Math.abs(evenSum - oddSum);
        }
    }

    public static void main(String[] args) {
        int input1 = 5;
        int []input2 = {1, 2, 3, 4, 5};
        System.out.println(armValue(input1,input2));
    }

}
