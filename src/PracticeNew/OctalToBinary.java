package PracticeNew;

import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Octal Number: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);

        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);

        sc.close();

    }

}
