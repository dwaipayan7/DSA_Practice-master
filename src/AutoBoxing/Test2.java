package AutoBoxing;

public class Test2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        fun(student);
        System.out.println(student.id);
    }

    private static void fun(Student a){
//        Student student = new Student();
//        student.id = 2;
//        a = student;
        a.id = 2;
    }
}

class Student {
    public int id;
}
