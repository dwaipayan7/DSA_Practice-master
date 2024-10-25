package practice;

public class RecursionBasic {

    static void printNumber(int n){
        if (n == 0) return;

        System.out.println(n);
        printNumber(n-1);
    }

    static int fact(int n){

        if (n == 0 || n == 1){
            return 1;
        }

       return n * fact(n-1);
    }

    static int fib(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    static int calPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int xPow = calPower(x, n-1);
        int xPown = x * xPow;

        return xPown;
    }

    static int calcPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        if (n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }

    }

    public static void main(String[] args) {
        int n = 4;
        printNumber(n);
        System.out.println(fact(n));
        System.out.println(fib(n));

        int x = 2, y = 5;
        int ans = calPower(x,y);
        System.out.println(ans);

        int ans2 = calcPower(x,y);
        System.out.println(ans2);

    }
}
