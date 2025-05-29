package InterfaceUpdated.animals;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();

        System.out.println(Cat.MAX_AGE);
        System.out.println(Dog.MAX_AGE);

        dog.run();
        cat.run();

    }

}
