package abstraction;

public abstract class Animal {

    private String name;
    private int age;

    private boolean hasSuperPowers;

    protected Animal(){
        this.hasSuperPowers = false;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();


    public void sleep(){
        System.out.println("zzz....");
    }

}
