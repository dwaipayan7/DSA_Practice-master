package NewPractice;

import java.util.Scanner;

public class JosephusProblem {

    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println("Dwaipayan - Josephus Problem Solver");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the step size (k): ");
        int k = scanner.nextInt();

        int safePosition = jos(n, k) + 1;
        System.out.println("The safe position is: " + safePosition);

        scanner.close();
    }
}
