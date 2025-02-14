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

        Animal dog = new Dog(); //upcasting
        dog.sayHello();
//        dog.saybye(); --> Bcz reference of Animal

        Animal cat = new Cat();
        cat.sayHello();

        double d = 2.323232;
        int e = (int)d;
        System.out.println(e);

        Dog myDog = (Dog) dog; //down-casting

    }

}
