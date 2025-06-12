package com.obj_initialization;

public class Reference_Variable {
    public static void main(String[] args){
        Electronic phone = new Electronic();
        phone.name = "Apple" ;
        phone.size = 20;

        phone.dispaly();
    }
}

class Electronic{
    public  String name ;
    public int size;

    public void dispaly(){
        System.out.println(name + " " + size);
    }
}
