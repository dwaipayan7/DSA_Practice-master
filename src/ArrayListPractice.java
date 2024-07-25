import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.add(1,2);
        System.out.println(list);

        list.set(0,0);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        list.add(0);
        Collections.sort(list);
        System.out.println(list);

    }

}
