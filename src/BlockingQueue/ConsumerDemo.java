package BlockingQueue;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(1, 2, 3);

        Consumer<List<Integer>> printList = x -> {
            for (int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


        //combined example
        Predicate<Integer> predicate = x-> x%2 == 0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y)%2 == 0;
        System.out.println(isSumEven.test(5, 5));

        BiConsumer<Integer,String> biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String, String, Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("a","bc"));


    }



}