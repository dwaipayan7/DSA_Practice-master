package com.company;

interface A{
    final static int x = 5;
     void show();
}
interface B{
    final static int y = 3;
    void display();
}

class C implements A,B{

    @Override
    public void display() {
        System.out.println("This is Displaying interface: B");
    }

    @Override
    public void show() {

        System.out.println("This is show interface: A");

    }

    void print(){
       int Z = x*y;
        System.out.println(Z);
    }
}

public class InterFaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
        obj.print();
    }

}
