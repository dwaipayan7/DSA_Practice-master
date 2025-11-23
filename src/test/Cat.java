package test;

public class Cat extends Animal {
    String breed;

    void meow(){
        System.out.println("Cat is meowing");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating biscuits");
    }

    @Override
    void call() {
        System.out.println("This is called Cat");
    }
}
