package RecursionDemo;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorialRec(6));
        System.out.println(sumOfNaturalNumbers(5));

    }

    public static int factorial(int n){
        int res = 1;
        for (int i = 1; i<=n; i++){
            res = res * i;
        }
        return res;
    }

    public static int factorialRec(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumOfNaturalNumbers(int n){

        if (n == 1){
            return n;
        }

        return n + sumOfNaturalNumbers(n-1);

    }

}
