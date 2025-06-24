package com.Abstraction;

public class Example_Interface {
    public static void main(String[] args){

        Rat r = new Rat();
        r.sound();
        r.eat();
    }
}

interface Animal{
   final int leg = 4;
    void sound();

    default void eat(){
        System.out.println(123);
    }

    static void info(){
        System.out.println("static metod");
    }
}

interface plants extends Animal{
    void color();

}

class Rat implements Animal, plants{
    @Override
    public void sound() {
        System.out.println("Rat is makin sound " + Animal.leg);
    }

    public void color(){
        System.out.println("brown colour");
    }

}


