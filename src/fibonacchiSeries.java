public class fibonacchiSeries {
    public static int fib(int n){
        if (n <= 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }

    //sum of digits optimised

    static int sumofDig(int n){
        if (n==0){
            return n;
        }else{
           return n%10 + sumofDig(n/10);
        }
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(fib(n));
        System.out.println(sumofDig(n));
    }
}
