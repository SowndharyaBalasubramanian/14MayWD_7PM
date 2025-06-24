package com.Abstraction;

public class Abstract_Ex2 {
    public static void main(String[] args){

        Vehicle v1 = new Car("BMW");
        v1.start();
        v1.fuelType();
       // v1.colour();

        Vehicle v2 = new Scooty("Activa");
        v2.start();
        v2.fuelType();

    }
}

abstract class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }
    abstract void fuelType();

    void start(){
        System.out.println(brand + " is starting");
    }
}

class Car extends Vehicle{

    Car(String brand){
        super(brand);
    }
    void fuelType(){
        System.out.println("it uses diesel");
        System.out.println(brand = "Honda");
    }

    void colour(){
        System.out.println("the car is black in colour");
    }

}

class Scooty extends Vehicle{

    Scooty(String brand){
        super(brand);
    }

    void fuelType(){
        System.out.println("it uses petrol");
    }
}