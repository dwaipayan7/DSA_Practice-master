package InheritanceDemo.test;

import InheritanceDemo.animals.Cat;
import InheritanceDemo.animals.Dog;
import InheritanceDemo.humans.Child;
import InheritanceDemo.humans.Parent;

public class Test {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//
//        dog.setAge(12);
//        dog.setName("Tom");
//        dog.eat();
//        dog.sayHello();
//        System.out.println(dog.getAge());
//        System.out.println(dog.getName());


//        Child child = new Child();
//        child.setName("Dwaipayan");
//        child.setAge(22);
//
//        Parent parent = new Parent();
//        parent.setName("D");
//        parent.setAge(55);

//        Cat cat = new Cat();
//        cat.sayHello();

//        Child child = new Child();

//        System.out.println(child.hasSuperPowers());
//
//        child.setAge(12);
//        child.childMethod();


        Child child = new Child(22, "Dwaipayan");
        System.out.println(child.getAge());
        System.out.println(child.getName());
        child.childMethod();

    }

}
