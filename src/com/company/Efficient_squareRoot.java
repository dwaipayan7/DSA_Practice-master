package com.company;

import java.util.Scanner;

public class Efficient_squareRoot {
    int sqRoot(int x){
        int low = 1, high = x, ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            int msq = mid * mid;
            if (msq == x){
                return mid;
            }
            else if (msq > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

}

class Main2{
    public static void main(String[] args) {
        Efficient_squareRoot obj = new Efficient_squareRoot();
        int x;
        System.out.print("Enter the value for the Square Root: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("The Square Root of the value is: "+obj.sqRoot(x));
    }
}
