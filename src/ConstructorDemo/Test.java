package ConstructorDemo;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("Dwaipayan", 8, 22);

//        student.getAge();
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());

        Student student1 = new Student("Tatay");
        System.out.println(student1.getName());

        Student student2 = new Student(8);
        System.out.println(student2.getRollNumber());

    }

}
