package practice;

import java.util.HashMap;

public class Student {

    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }


    public String toString(){
        return "Student{"+
                "name="+name+'\''+
                ", id ="+id+
                "}";
    }

    public static void main(String[] args) {
        HashMap<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1,new Student("Dwaipayan",1));
        studentMap.put(2,new Student("Tatay",2));

        for (Integer key : studentMap.keySet()){
            System.out.println("Id: "+key+" Student: "+studentMap.get(key));
        }
        int searchId = 2;
        Student student = studentMap.get(searchId);
        if (student != null) {
            System.out.println("Found student with ID " + searchId + ": " + student);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }

}
