package Encapsulation;

public class Student {

    private String name;

    private int rollNumber;

    private int age;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int x){
        if (age < 0){
            x = 0;
        }
        this.age = x;
    }

}
