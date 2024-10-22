package practice;

import java.util.Scanner;

public class RomanToInt {

    static int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

            default:return 0;
        }

    }

    static int romanToInt(String s){
        int n = s.length();
        int sum = 0;

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            if ((i+1) < n && getValue(ch) < getValue(s.charAt(i+1))){
                sum = sum - getValue(ch);
            }else{
                sum = sum + getValue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        int val = romanToInt(s);
        System.out.println(val);
    }
}