package abstraction.Abstraction;

public class Test {

    public static void main(String[] args) {
//        Dog dog = new Dog();

        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog();
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

    }

}
