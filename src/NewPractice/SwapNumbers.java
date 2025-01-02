package NewPractice;

public class SwapNumbers {

    public static void swap(int a, int b){

        System.out.println("Before swapping: "+a);
        System.out.println("Before swapping: "+b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: "+a);
        System.out.println("After swapping: "+b);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        swap(a,b);
    }
}
