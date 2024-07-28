package com.company;

import java.util.Stack;

public class ReverserString {
    public static void main(String[] args) {
//        String str = "Dwaipayan";
//        char[] ch = str.toCharArray();
//
//        for (int i=ch.length-1; i>=0;i--){
//            System.out.print(ch[i]+" ");
//        }

        String s = "tatay";
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            stack.push(c);
        }

        String temp = "";

        while (!stack.isEmpty()){
            temp = temp + stack.pop();
        }
        System.out.println(temp);

    }
}
