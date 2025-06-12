package com.constructr;

class IndianStates{
    public String language ;
    public String name;
    public float area;

    public void displayStates(){
        System.out.println("The area of " + name + " is " + area + " km2 and the langauge spoken here is : " + language );
    }

    IndianStates(String l , float a, String n){
        language = l;
        this.area = a;
        this.name = n;
    }
}

public class Parametrised_Constructor {
    public static void main(String[] args){
        IndianStates Kerala = new IndianStates("Malayalam" , 10000.90f,"Kerala");
        Kerala.displayStates();

        IndianStates TN = new IndianStates("Tamil" , 13000.90f,"TamilNadu");
        TN.displayStates();
    }
}
