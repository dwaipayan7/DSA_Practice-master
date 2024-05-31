public class Fibonacchi {
    public static int fib(int n){
        if (n <= 1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i<n;i++){
            System.out.print(fib(i)+" ");
        }

    }
}
