package com.obj_initialization;

public class Constructr {
    public static void main(String[] args){
        Electronics e1 = new Electronics("Mobile" , 30);
        Electronics e2 = new Electronics("Laptop" , 67);
        e2.display();
        System.out.println("Hi");

        int age = 56;
        if(age > 17){
            System.out.println("to vote");
        }
        e1.display();
    }
}

class Electronics{
    public  String name ;
    public int size;

    public void display(){
        System.out.println(name + " " + size);
    }

    public Electronics(String n, int size){
        this.name= n;
        this.size = size;
    }
}

