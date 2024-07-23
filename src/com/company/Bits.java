package com.company;

import java.util.Scanner;

public class Bits {

    //BitMask Operation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);

//        if ((bitMask & n) == 0){
//            System.out.println("Bit was Zero");
//
//        }else{
//            System.out.println("Bit was One");
//        }

        //Set Bit
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

        //Clear Bit
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);

        // Update Operation
        if (oper == 1){
            int number = bitMask | n;
            System.out.println(number);
        }else {
            int newBitMask =  ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


    }
}
