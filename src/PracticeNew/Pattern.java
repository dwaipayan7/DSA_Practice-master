package PracticeNew;

public class Pattern {

    public static void printPattern(int n){
        int i,j;
        int num = 1;
        for (i = 1; i<=n; i++){
            for (j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for (j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n-1; i>= 0; i--){
            for (j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        printPattern(n);

    }

}
