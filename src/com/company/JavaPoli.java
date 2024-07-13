package com.company;

import java.util.Scanner;

public class JavaPoli {

    void area(int a){
        double r =  (3.14*a*a);
        System.out.println("The area of the circle is: "+r);
    }

    void area(int a, int b){
        int r = a*b;
        System.out.println("The area of square is: "+r);
    }



    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        a = sc.nextInt();

        System.out.println("Enter the length of a side: ");
        b = sc.nextInt();

        System.out.println("Enter the length of another side: ");
        c = sc.nextInt();

        JavaPoli obj = new JavaPoli();
        obj.area(a);
        obj.area(b,c);

    }
}

