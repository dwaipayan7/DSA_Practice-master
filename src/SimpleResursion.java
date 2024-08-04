public class SimpleResursion {

    static void printNumber(int n){

        if (n == 0){
//            System.out.println(5);
            return;
        }

        System.out.println(n);
        printNumber(n-1);

    }

    public static void main(String[] args) {
        printNumber(5);
    }

}
