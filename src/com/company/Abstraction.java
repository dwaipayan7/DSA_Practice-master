package com.company;


abstract class Abs{
    abstract void show();
    void display(){
        System.out.println("Hii");
    }
}

public class Abstraction extends Abs{
    @Override
    void show() {

        System.out.println("Implementation");

    }

    public static void main(String[] args) {
        Abstraction abs = new Abstraction();
        abs.show();
        abs.display();
    }
}
