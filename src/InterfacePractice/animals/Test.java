package InterfacePractice.animals;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);


        Animal.info();
        dog.run();

    }

}
