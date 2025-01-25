package NewPractice;

public class FoundElement {
    static void found() {
        int N = 5;
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        boolean found = false;

        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        found();
    }
}
