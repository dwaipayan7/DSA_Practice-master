package arraylist;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list.get(2));
        System.out.println(list.size());

//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        for (int x : list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(5));

        list.set(2,50);
        System.out.println(list);


    }

}
