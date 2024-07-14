package com.company;

public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        int i = 0;
        int binaryNum[] = new int[32];

        while (n > 0) {
            binaryNum[i] = n % 2;
            n /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j] + " ");
        }
    }

    public static int getDecimal(int binary){
        int decimal = 0, n = 0;

        while (true){
            if (binary == 0){
                break;
            }else{
                int temp = binary%10;
                decimal += temp*Math.pow(2,n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {

        int n = 11101;
        int res = getDecimal(n);
        System.out.println(res);

        int i = 11;
        decimalToBinary(i);
    }
}
