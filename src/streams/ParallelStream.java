package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Stream.iterate;

public class ParallelStream {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

       List<Integer> list = iterate(1,x->x+1).limit(20000).toList();
        List<Long>factorialList = list.stream().map(ParallelStream :: factorial).toList();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken with stream: "+(endTime-startTime) + "ms");

        System.out.println(factorialList);




        startTime = System.currentTimeMillis();

        factorialList = list.parallelStream().map(ParallelStream :: factorial).sequential().toList();
//        factorialList = list.parallelStream().map(ParallelStream :: factorial).toList();

        endTime = System.currentTimeMillis();

        System.out.println("Time taken with stream: "+(endTime-startTime) + "ms");

        System.out.println(factorialList);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(x-> sum.addAndGet(x)).toList();
//        System.out.println(cumulativeSum); --> not independent so not working correctly




    }

    private static long factorial(int n){
        long result = 1;
        for (int i=2; i<=n; i++){
            result = result * i;
        }
        return result;
    }
}
