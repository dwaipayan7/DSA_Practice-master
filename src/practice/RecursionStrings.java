package practice;

import java.util.Scanner;

public class RecursionStrings {

    //Palindrome
    static boolean isPalindrome(String s, int l, int r){
        if (l >= r){
            return true;
        }
        if (s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s,l+1,r-1);
    }

   static void powerSet(String s, int i, String curr){
        if (i == s.length()){
            System.out.print(curr+" ");
            return;
        }
        powerSet(s,i+1,curr+s.charAt(i));
        powerSet(s,i+1,curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "mom";
        int l = 0;
        int r = s.length()-1;
        System.out.print(isPalindrome(s,l,r)+"\n");
//        System.out.println("Take input");
//        int a = sc.nextInt();
//        System.out.println(a);

        String a = "abc";
        powerSet(a,0,"");


    }

}
