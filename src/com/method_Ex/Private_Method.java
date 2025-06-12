package com.method_Ex;


class Testing{

    public static void test(){
        System.out.println("testing");

    }
}
public class Private_Method {
    public static void main(String[] args){
        System.out.println("hi");
        sample();
        Private_Method o = new Private_Method();
        o.sample1();
    }

    private static void sample(){
        System.out.println("this is a sample method");
    }

    private  void sample1(){
        System.out.println("this is a sample method 1");
    }
}
