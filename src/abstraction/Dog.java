package abstraction;

public class Dog extends Animal{
    @Override
    public void sayHello() {

        System.out.println("Woof");
    }

    public void sayBye(){
        System.out.println("Woof Woof");
    }

}
