package com.inheritance;

public class Super_Ex {
    public static void main(String[] args){
     //   Child c1 = new Child("Daughter", "Mom");
    //    c1.childDis();
      //  c1.callRole();

        Child c = new Child();
        c.childDis();
        c.callRole();
    }
}
class Parent{
    String name ;

    Parent(){
        System.out.println("I am parent class constructor");
    }

    public void role(){
        System.out.println("I am a mother");
    }

}
class Child extends Parent{
    String name;

//    Child(String Cname, String pName){
//        name = Cname;
//        super.name = pName;
//    }

    Child(){
        super();
        System.out.println("i am from child class constructor");
    }

    public void childDis(){
        System.out.println("The child name is " + name );
        System.out.println(" The parent name is " + super.name);
    }

    public void role(){
        System.out.println(" i am a child");
    }

    public void callRole(){
        super.role();
    }
}
