package practice;

import java.util.HashMap;

public class Student implements Comparable<Student> {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // Compare students by name in ascending order
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        HashMap<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Dwaipayan", 1));
        studentMap.put(2, new Student("Tatay", 2));

        // Iterate over the map and print each student
        for (Integer key : studentMap.keySet()) {
            System.out.println("Id: " + key + " Student: " + studentMap.get(key));
        }

        // Search for a student by ID
        int searchId = 2;
        Student student = studentMap.get(searchId);
        if (student != null) {
            System.out.println("Found student with ID " + searchId + ": " + student);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }
}
