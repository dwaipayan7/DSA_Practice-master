package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(5);
//        list.add(80);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
////        for (int i=0; i<list.size(); i++){
////            System.out.println(list.get(i));
////        }
////
////        for (int x : list){
////            System.out.println(x);
////        }
////        System.out.println(list.contains(5));
//
//        list.set(2,50);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday","Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1,"wed");
        System.out.println(list1.get(1));



        String[]arr = {"Apple","Banana","Cherry"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2.getClass().getName());

       List<Integer> list3 = List.of(1, 2, 3, 4);
//       list3.add(50);

       List<String> list4 = new ArrayList<>(list2);
       list4.add("Mango");
        System.out.println(list4);




    }

}
