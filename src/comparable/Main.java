package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

//        list.sort(new MyComparator());
        list.sort((a,b) -> b-a);
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort(new StringLengthComparator());
        words.sort((a,b) -> b.length() - a.length());
        System.out.println(words);

    }

}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
        return o2.length() - o1.length();
    }
}

class  MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
