package NewPractice;

public class RecursionPractice {

    static void printNum(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    static void fun(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        fun(n+1);
    }

    static void printSum(int i, int n, int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }

    static int printFact(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int fact = n * printFact(n-1);
        return fact;
    }

    public static void main(String[] args) {
//        int n = 10;
//        printNum(n);
        int n1 = 1;
        fun(n1);
        printSum(1, 5, 0);

        int fact = 5;
        System.out.println(printFact(fact));

    }
}
