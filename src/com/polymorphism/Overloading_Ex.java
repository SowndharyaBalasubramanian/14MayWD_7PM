package com.polymorphism;

public class Overloading_Ex {
    public static void main(String[] args){
        int result = Example.add(4, 6);
        System.out.println(result);

        System.out.println(Example.add(10.0,2.98));
        System.out.println(Example.add(2,3,4));

        Example e1 = new Example();
        e1.display(001, "Besant");
        e1.display("Sowndharya", 005);
    }
}

class Example{

    int id;
    String name;

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int add(int a, int b , int c){
        return a + b + c;
    }

    public void display(int id, String name){
        System.out.println(id + " " + name);
    }

    public void display(String name , int id){
        System.out.println( name + " " + id);
    }
}
