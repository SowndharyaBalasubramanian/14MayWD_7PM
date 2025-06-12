package com.obj_initialization;

public class Method_Init {
    public static void main(String[] args){
        Car BMW = new Car();
        BMW.carDetails(4 , "BMW");
    }
}

class Car{
    public  int tyres ;
    public String name;

    public void carDetails(int tyre , String n){
        this.name = n;
        this.tyres = tyre;
        System.out.println("The name of the car is " + name + " it has " + tyres +" tyres");
    }
}
