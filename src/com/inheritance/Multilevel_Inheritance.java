package com.inheritance;

import static com.inheritance.Animal.show1;

public class Multilevel_Inheritance {
    public static void main(String[] args){
//        Animal animal = new Animal();
//        show1();

        Elephant e = new Elephant();
        e.eat();

//        African a = new African();
//        a.sleep();
//        a.eat();
//        Animal.show1();

    }
}

class Animal{
    int legs ;
    String colour;

    public static void show1(){
        Animal A = new Animal();
        A.legs = 4;
        A.colour = "Black";
        System.out.println(A.colour + " " + A.legs);
    }
}


class Elephant extends Animal{

    public void eat(){
        System.out.println("The elephant is eating");
      //  show1();
        System.out.println(legs = 3);
    }
}

class African extends Elephant{

    public void sleep(){
        System.out.println("it is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("The African elephant is eating banana");
    }
}
