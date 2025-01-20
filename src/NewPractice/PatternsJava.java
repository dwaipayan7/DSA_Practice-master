package NewPractice;

public class PatternsJava {

    static void printPattern(int n){
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j<n; j++){
//                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void printTriangle(int rows){
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < rows; i++){
            row.append("* ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

}
