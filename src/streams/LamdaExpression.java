package streams;

public class LamdaExpression {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Dwaipayan");
        });

        t1.start();

        MathOperations sumOperations = (int a , int b) ->{
            return a+b;
        };

        MathOperations sumOperation = (int a , int b) -> a+b;

        int res = sumOperation.operate(1, 2);
        System.out.println(res);


    }

}

 class SumOperations implements MathOperations{

     @Override
     public int operate(int a, int b) {
         return a + b ;
     }
 }


interface MathOperations {
    int operate(int a, int b);
}
