package comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Dwaipayan", 3.5));
        students.add(new Student("Tatay", 4.0));
        students.add(new Student("Biswas", 3.7));
        students.add(new Student("ZaXe", 3.8));

//        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//
//        students.sort(comparing);

        students.sort((a,b) -> {
            if (b.getGpa() - a.getGpa() > 0){
                return 1;
            } else if ((b.getGpa() - a.getGpa() < 0)) {
                return -1;
            }else{
                return a.getName().compareTo(b.getName());
            }
        });

        for (Student s : students){
            System.out.println(s.getName()+": "+s.getGpa());
        }

    }

}
