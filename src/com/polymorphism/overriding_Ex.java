package com.polymorphism;

public class overriding_Ex {
    public static void main(String[] args){
//        Subjects s = new Subjects();
//        s.read();

        Exam e = new Exam();
        e.course = "Mathematics";
        e.exam();

//        Subjects s = new Exam();
//
//        s.read();
    }
}

 class Subjects{
    String course = "Science";

     final void read(){
        System.out.println(course);
    }
}

class Exam extends Subjects{


    public void exam(){
        System.out.println("the exam is going on");
        read();
    }
 //   @Override
//    public void read(){
//        System.out.println("Jagadheesh is reading " + course + " for exam");
//    }

}