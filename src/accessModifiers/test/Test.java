package accessModifiers.test;

import accessModifiers.school.Student;
import accessModifiers.zoo.Dog;

public class Test {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.name = "Dwaipayan";
//        student.age = 22;
//        student.sayHello();

//        Student.sayBye();
//        Student student = new Student();

//        School.getInstance();


        Dog dog = new Dog("Name");
        dog.makeSound();
//        dog.changeSound("Woof");
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();
    }

}
