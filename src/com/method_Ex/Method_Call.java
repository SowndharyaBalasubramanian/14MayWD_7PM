package com.method_Ex;

public class Method_Call {
    public static void main(String[] args){
      //  System.out.println("hi");
      //  example();
//        Method_Call obj = new Method_Call();
//        obj.instaMethod();

        Method_Call object = new Method_Call();
        object.instaMethod1();
    }

//    public void instaMethod(){
//        System.out.println("this is an instance method");
//    }

    public static void example(){
        System.out.println("this is an example method");
        Method_Call object = new Method_Call();
       object.instaMethod1();
    }

    public void instaMethod1(){
        System.out.println("also an instance method");
        example();
        //instaMethod();
    }

}
