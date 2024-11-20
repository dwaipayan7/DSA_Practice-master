package streams;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        //1. collect
        list.stream().skip(1).toList();

        //2. forEach
        list.forEach(System.out::println);

        //3. reduce
     Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x+y);
     System.out.println(optionalInteger.get());

     //5. anyMatch, allMatch, noneMatch

        boolean b = list.stream().anyMatch(x->x%2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        //example
        List<String> names = Arrays.asList("Dwaipayan", "Tatay", "biswas", "hey");
        System.out.println(names.stream().filter(x->x.length() > 3).toList());

        //example squaring and sorting number
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        //summing value
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().reduce(Integer :: sum).get());

        //example: counting occurrence
        String sentence = "Dwaipayan";
        System.out.println(sentence.chars().filter(x-> x == 'a').count());

    }

}
