package com.inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args){
        Bike b = new Bike();
        b.ride();

        Hero H =new Hero();
        H.bikeName = "Hero Honda";
        H.speed = 70;
        H.ride();
        H.hero();

        Scooty S =new Scooty();
        S.bikeName = "pleasure";
        S.speed = 50;
        S.ride();
        S.dis();
    }
}

class Bike{

    String bikeName = "Duke";
    int speed = 45;

    public void ride(){
        System.out.println(bikeName + " "  + speed);
    }
}

class Hero extends Bike{

    String colour =  " red";
    public void hero(){
        System.out.println("it is red");
       // ride();
    }
}

class Scooty extends Bike{
    int weight = 93;
    public void dis(){
        System.out.println("The weight is " + weight);
    }
}
