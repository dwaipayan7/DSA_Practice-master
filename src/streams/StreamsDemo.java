package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2 ,3 , 4,6);

        int count = 0;

        for (int i : numbers){
            if (i % 2 == 0){
                count ++;
            }
        }

        System.out.println(count);
        //Streams

        //Source , intermediate operations  & terminal operation
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        //Creating Streams

        //1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> stream = list.stream();

        //2. From Arrays
        String[]array = {"a", "b", "c"};
        //3. using Stream.of()
        Stream<String> stream1 = Stream.of("a", "b");
        //4. Infinite Stream
        Stream.generate(() -> 1).limit(100);
//        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
//        System.out.println(collect);




    }

}
