package streams;

import java.util.function.Function;
import java.util.function.Predicate;

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

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);

        System.out.println(and.test("ant"));

        System.out.println(isWordStartingWithA.test("afdssa"));

        //Function
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        Integer apply = doubleIt.andThen(tripleIt).apply(100);
        System.out.println(apply);


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
