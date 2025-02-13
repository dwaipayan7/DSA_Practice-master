package abstraction;

public class Test {

    public static void main(String[] args) {

//        Animal animal = new Animal() {
//            @Override
//            public void sayHello() {
//
//            }
//        }

        animals animal = new animals();
        animal.sayHello();

        Animal dog = new Dog();
        dog.sayHello();

    }

}
