package InheritanceDemo.humans;

public class Child extends Parent{

    public Child(int age, String name){
        super(age, name);
        System.out.println("Child Constructor called");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("Child method called");
    }

}
