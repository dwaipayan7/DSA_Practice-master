package InheritanceDemo.humans;

public class Parent extends GrandParent{

    public Parent(int age, String name){
        super(age, name);
        System.out.println("Parent Constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }

}
