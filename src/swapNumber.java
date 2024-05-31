import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of First number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of Second number: ");
        int y = sc.nextInt();
        System.out.println("Before Swapping the number: "+x+","+y);

        //swapping
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping: "+x+","+y);
    }
}
