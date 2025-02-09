package LamdaFunctions;

public class Test {

    public static void main(String[] args) {

//        EngineeringStudents engineeringStudent = new EngineeringStudents();
//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

        Student engineeringStudent = new Student() {
            @Override
            public void getBio(String name) {
                System.out.println(name + " is Engineering Student");
            }

//            @Override
//            public String getBio(String name) {
//                return name + " Engineering Student";
//            }
        };

//        (String name)

//        Student lawStudent = name -> {
////            return name + " is Law Student";
//            System.out.println(name + " is Law Student");
//        };

//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

        Student lawStudent = name -> System.out.println(name+" is Law Student");

    }

}
