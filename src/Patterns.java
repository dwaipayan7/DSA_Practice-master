import java.util.Scanner;

public class Patterns {

//    *
//    **
//    ***
//    *****
//    ******

    public static void pattern1(int rows){
        //pattern 1
        int i,j;
//        System.out.println("Enter the rows");
//        Scanner sc = new Scanner(System.in);
//        rows = sc.nextInt();
        for (i = 0; i<= rows; i++){
            for (j=1; j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int rows){
        int i, j;
        for (i = 0; i<= rows; i++){
            for (j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern3(char input){

        char alphabet = 'A';
        int i,j;
        for (i=1;i <= input - 'A'; i++){
            for (j = 1; j<= i; j++){
                System.out.print(alphabet);
            }
            ++alphabet;
            System.out.println();
        }

    }

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            for (int k = 0; k != 2 * i - 1; ++k) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {


        pattern1(4);

        System.out.println();

        pattern2(5);

        System.out.println();

        pattern3('E');

        System.out.println();

        printPyramid(6);
        

    }

}
