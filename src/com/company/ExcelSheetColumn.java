package com.company;

public class ExcelSheetColumn {

    public static int titleNum(String s){
        int result = 0;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);      //"AB"
            int value = ch - 'A' + 1;
            result = result * 26 +value;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AB";
        System.out.println(titleNum(s));
    }

}
