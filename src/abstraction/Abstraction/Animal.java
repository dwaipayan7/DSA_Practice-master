package abstraction.Abstraction;

public class Animal {
    private int age;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void sayHello(){
        System.out.println("...");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

}
