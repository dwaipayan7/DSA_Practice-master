package Vectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);

        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println(vector.capacity());

        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //Arrays.asList(2, 3, 5)
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);

        for (int i = 0; i<vector1.size(); i++){
            System.out.print(vector1.get(i));
        }

    }
}
