package com.datatype;

class Mobile{
    int camera = 67;

    public void takingPic(){
        System.out.println("taking selfie");
    }
}

public class Obj {
    public static void main(String[] args){
        Mobile samsung = new Mobile();

        System.out.println(samsung.camera = 90);
        samsung.takingPic();

        Mobile iphone = new Mobile();
        System.out.println(iphone.camera = 190);
        iphone.takingPic();
    }
}
