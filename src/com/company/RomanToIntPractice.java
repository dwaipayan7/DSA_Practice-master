package com.company;

public class RomanToIntPractice {

    public int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

            default: return 0;
        }
    }

    public int romanToInt(String s){
        int n = s.length();
        int sum = 0;

        for (int i=0; i<n;i++){
            char ch1 = s.charAt(i);
            if ((i+1) < n && getValue(ch1)< getValue(s.charAt(i+1))){
                sum = sum-getValue(ch1);
            }else{
                sum = sum+getValue(ch1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToIntPractice romanToIntPractice = new RomanToIntPractice();

        String romanNumeral = "MCMXCIV"; // Example: 1994 in Roman numerals
        int result = romanToIntPractice.romanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }

}
