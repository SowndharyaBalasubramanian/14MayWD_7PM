package com.scaner;

import java.util.Scanner;

public class User_Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("enter your name");
//
//        String name = scan.nextLine();
//        System.out.println("name entered : " + name);
//
//        System.out.println("enter your name");
//        String institute = scan.next();
//        System.out.println("institute entered : " + institute);

        System.out.println("enter your age");

        byte age = scan.nextByte();
        System.out.println("age entered : " + age);
        scan.close();



    }
}