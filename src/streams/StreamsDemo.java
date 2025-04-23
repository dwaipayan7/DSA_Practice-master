package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2 ,3 , 4,6);

        int count = 0;

        //Streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

    }

}
