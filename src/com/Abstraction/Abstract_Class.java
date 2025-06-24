package com.Abstraction;

public class Abstract_Class {
    public static void main(String[] args){

        Onida o = new Onida();
        o.turnOn();
        o.turnOff();
        o.TV();
o.print();

    }
}

abstract class tvRemote{

    String brand = "Panasonic";
    abstract void turnOn();
    abstract void turnOff();

    public void TV(){
        System.out.println("it is a TV");
    }
}

class Onida extends tvRemote{
    @Override
    public void turnOn(){
        System.out.println("TV is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("TV is turned off");
    }



    public void print(){
        System.out.println(brand);
    }
}
