package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int count = 0;
        for (int i:numbers){
            if (i%2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(numbers.stream().filter(x->x%2 == 0).count());

        String[]array = {"a", "b", "c"};

        Arrays.stream(array);

        Stream.of("a","b");

        //infinite streams
        Stream.generate(() -> 1).limit(100);

        Stream.iterate(1,x -> x + 1).limit(100).collect(Collectors.toList());



    }
}
