public class Constructor_1 {

    public static void main(String[] args) {
        Student1 s1 = new Student1(2,"Dwaipayan",7888);
        Student1 s2 = new Student1(8,"Tatay",90000);
        s1.display();
        s2.display();
    }

}

class Student1{
    int roll;
    String  name;
    float fee;
    Student1(int roll, String name, float fee){
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(roll+" "+name+" "+fee);
    }
}
