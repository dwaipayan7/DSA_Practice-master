package Encapsulation;

public class Test {

    public static void main(String[] args) {
//        Student student = new Student();
//
//        student.setAge(12);
//        System.out.println(student.getAge());

//        StudentPractice student = new StudentPractice();

//        student.name = "Dwaipayan";
//        student.age = 12;
//        student.rollNumber = 8;

//        System.out.println(student.name);
//        student.setAge(-15);
//        System.out.println(student.getAge());

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(5555.0);
        bankAccount.withdraw(800);
        bankAccount.getBalance();

    }

}
