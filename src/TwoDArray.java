import java.util.Scanner;

public class TwoDArray {
   public static Scanner sc = new Scanner(System.in);

   public static void input(int[][] number, int rows, int col){
       for (int i = 0; i<rows; i++){
           for (int j = 0; j<col; j++){
               number[i][j] = sc.nextInt();
           }
       }
   }

   public static void searchElement(int[][] number, int rows, int col, int x){
       for (int i = 0; i<rows; i++){
           for (int j = 0; j<col; j++){
               if (number[i][j] == x){
                   System.out.println("x found at position:(" +i+ ","+ j +")");
               }
           }
       }
   }

    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
            int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];

            // Input array elements
            input(numbers, rows, cols);

            // Element to search for
        System.out.println("Enter the element you wanted to search: ");
            int x = sc.nextInt();

            // Search and print the location of the element
            searchElement(numbers, rows, cols, x);
    }

}
