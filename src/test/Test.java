package test;

import OOPs.Dog;

public class Test {

    static void main() {
//        Car car = new Car();
//        car.color = "Blue";
//        car.speed = 60;
//        car.brand = "Tata";
//        car.year = 2024;
//        car.model = "Safari";
//
//        car.accelerate(1);
//        System.out.println(car.speed);
//        Car car = new Car();
//        car.setBrand("Mahindra");
//        System.out.println(car.getBrand());

//        Cat cat = new Cat();
//        cat.name = "Cho";
//        cat.sleep();
//        cat.eat();
//        cat.meow();

        Animal animal1 = new Animal();
        animal1.call();

        Animal animal = new Cat();
//        cat.eat();

        animal.call();

        Cat cat1 = new Cat();
        cat1.call();

        Cat cat2 = (Cat) animal;
        cat2.call();

    }

}
