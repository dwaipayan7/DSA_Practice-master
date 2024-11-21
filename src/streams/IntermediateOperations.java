package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","C");
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));

        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        list.stream().sorted();

        Stream<String> sortedStream = list.stream().sorted((a,b) -> a.length() - b.length());

        System.out.println(list.stream().filter(x->x.startsWith("A")).count());

        System.out.println(Stream.iterate(1,x->x+1).limit(10).count());

        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());

        //peek
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

    }

}
