package practice;

public class JosePhusProblem {

    static int count(int m, int n){
        if (m == 1 || n == 1){
            return 1;
        }
       return count(m-1,n) + count(m,n-1);
    }

    static int jos(int n, int k){
        if (n==1){
            return 0;
        }
        return (jos(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
//        int m = 3;
//        int n = 3;
//
//        System.out.println(count(m,n));

        int n = 5;
        int k = 3;
        System.out.println(jos(n,k));
    }



}
