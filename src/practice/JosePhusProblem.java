package practice;

public class JosePhusProblem {

    static int count(int m, int n){
        if (m == 1 || n == 1){
            return 1;
        }
       return count(m-1,n) + count(m,n-1);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        System.out.println(count(m,n));
    }


}
