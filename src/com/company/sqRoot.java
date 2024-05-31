package com.company;

public class sqRoot {
   static int sQRoot(int x){
        int i= 1;
        while (i*i <= x){
            i++;
        }
        return (i-1);

   }

    public static void main(String[] args) {

      sqRoot obj = new sqRoot();
        System.out.println("The Square Root is: "+obj.sQRoot(5));
    }
}
