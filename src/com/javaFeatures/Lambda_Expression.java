package com.javaFeatures;

public class Lambda_Expression {
    public static void main(String[]args){
//        Greet g = new Child();
//        g.sayHi();

//        Child c = new Child();
//        c.sayHi();

        Greet g = () -> System.out.println("Say Hi");
        g.sayHi();

        Add sum = (a,b) -> a + b;
        System.out.println(sum.add(4,6));

    }
}

@FunctionalInterface
interface Greet{
    void sayHi();

}

//class Child implements Greet{
//    public void sayHi(){
//        System.out.println("hi");
//    }
//}

@FunctionalInterface
interface Add{
    int add(int a, int b);

}
