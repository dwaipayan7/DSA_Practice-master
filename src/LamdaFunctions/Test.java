package LamdaFunctions;

public class Test {

    public static void main(String[] args) {

//        EngineeringStudents engineeringStudent = new EngineeringStudents();
//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

//        Student engineeringStudent = new Student() {
//            @Override
//            public void getBio(String name) {
//                System.out.println(name + " is Engineering Student");
//            }

//            @Override
//            public String getBio(String name) {
//                return name + " Engineering Student";
//            }


//        (String name)

//        Student lawStudent = name -> {
////            return name + " is Law Student";
//            System.out.println(name + " is Law Student");
//        };

//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

//        Student lawStudent = name -> System.out.println(name+" is Law Student");


//    }

//        EngineeringStudents engineeringStudent = new EngineeringStudents();
//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

        Student engineeringStudent = new Student() {
            @Override
            public void getBio(String name) {
                System.out.println(name + " is a Engineering student");
            }
        };



        Student lawStudent = name -> System.out.println(name + " is LawStudent");

//        String bio = engineeringStudent.getBio("Ram");
//        System.out.println(bio);
        engineeringStudent.getBio("Tatay");
        lawStudent.getBio("User");


        Thread t1 = new Thread(() ->{
           for (int i = 0; i<10; i++){
               System.out.println("Dwaipayan");
           }
        });

        Runnable task = () ->{

            for (int i = 0; i<10; i++){
                System.out.println("Hello World");
            }

        };


        task.run();
        t1.start();

    }
}
