package InheritanceDemo.humans;

public class GrandParent {

    private String name;

    private int age;

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    private boolean hasSuperPowers;

    public GrandParent(){
        hasSuperPowers = false;
        System.out.println("GrandParent constructor called");
    }

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
}
