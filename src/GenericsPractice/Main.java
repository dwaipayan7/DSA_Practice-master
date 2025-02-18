package GenericsPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[5];
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Dwaipayan");
////        list.add(123);
////        list.add(3.14);
//
//        list.add("Biswas");
//
//        String s = list.get(0);
//        list.get(1);

//        Object o = list.get(0);


//        Box<Integer> box = new Box<>();
//        Box<String> box1 = new Box<>();

//        ArrayList<?> list = new ArrayList<String>();
//        list.add("Hello");

//        System.out.println(sum(Arrays.asList(1,2.3,22)));

//        List<? super Number> numbers = Arrays.asList(1, 2, 4);
        List<? super Integer> numbers = Arrays.asList(1, 2, 4);
        numbers.add(12);
        numbers.add(null);

    }

    public void printArrayList(ArrayList<?> list){ //wildcard generics
        for (Object o : list){
            System.out.println(o);
        }
    }

    public Object getFirst(ArrayList<?> list){
       return list.get(0);
    }


    public <T> void  copy(ArrayList<T> source, ArrayList<T> destination){
        for (T item : source){
            destination.add(item);
        }
    }

    public static double sum(List<? extends Number> numbers){
        int sum = 0;
        for (Number o : numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }

}
