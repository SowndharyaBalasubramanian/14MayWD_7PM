package com.Abstraction;

public class Interface_Ex2 {
    public static void main(String[] args){

        Music b = new Lorry();
        b.playMusic();
        b.color();

       // b.display();
    }
}

interface Music{

    String sizeMusic = "large";
    void playMusic();

    default void color(){
        System.out.println("the vehicle is red in colour");
    }
}

interface road extends Music{
    void road();
}

class Lorry implements Music, road{
    public void playMusic(){
        System.out.println("music system is present in lorry" + " " + sizeMusic);
      // System.out.println(Music.sizeMusic = "small");
    }


    public void road(){
        System.out.println("it is running in highway");
    }

    public void display(){
        System.out.println("it is lorry" );
    }
}