package Strings;

public class Strings1 {

    static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return fib(num-1) + fib(num-2);
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
        int num = 5;
        System.out.println(fib(num));
    }
}
