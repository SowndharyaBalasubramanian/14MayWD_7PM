package com.inheritance;

public class Super_Keyword {
    public static void main(String[] args){
        Birds b = new Birds();
        b.eat();
        Parrot p = new Parrot("Parrot", "dont fly", "lite green" , "super bird");
        //Parrot p1 = new Parrot();
       // p.speak();
       // p1.speak();
       p.disply();
    }
}
class Birds{

    String name= "Bird";
    String fly = "flying";

    public void eat(){
        System.out.println("The bird is eating insects");
    }
}

class Parrot extends Birds{
    String color = "Green";
  String name = "parrot";

   Parrot(String name, String fly, String color, String nam){
       this.color =color;
       this.name = name;
       super.name = nam;
       this.fly = fly;
   }
    public void speak(){
        System.out.println("The parrot is speaking and it is of type" + " " + super.name + " , the colour is " + color );
    }

    public void disply(){
        System.out.println(super.fly + this.name);
    }
}
