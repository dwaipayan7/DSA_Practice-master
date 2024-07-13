package com.company;

//import static com.sun.beans.introspect.PropertyInfo.Name.required;

public class Student {
    double id;
    String name;
    Student(double i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student obj = new Student(8,"Dwaipayan");
        Student obj1 = new Student(9,"Biswas");

        obj.display();
        obj1.display();
    }
}
