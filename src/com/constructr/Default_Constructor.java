package com.constructr;

class Ornament{
    public String type = "Earring";
    public static double price = 67000.67d;

    public void makingOrnaments(){
        System.out.println("the ornament is : " + type + " the price is " + " RS. " + price);
    }
}

public class Default_Constructor {
    public static void main(String[] args){
        Ornament o = new Ornament();
        o.type = "Chain";
        Ornament.price = 56000.89d;
        o.makingOrnaments();
    }
}
