package comparable;

import practice.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Dwaipayan", 12));
        list.add(new Student("Tatay", 13));
        list.add(new Student("New", 14));
        list.add(new Student("Dialog", 15));
        list.add(new Student("Flow", 16));

        list.sort(null);
        System.out.println(list);

    }

}
