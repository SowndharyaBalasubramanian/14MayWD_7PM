package com.constructr;

class Showroom{
    public String brand ;
    public String colour ;

    public void carDetails(){
        System.out.println("the model is : " + brand + " and the colour is " + colour);
    }

    public Showroom(){
        brand = "BMW";
        colour = "black";

       // System.out.println(brand);
    }
}

public class NoArg_Constructor {
    public static void main(String[] args){
        Showroom car1 = new Showroom();
        car1.carDetails();
    }
}
