package com.control;

import java.util.Scanner;

public class IfElse_Ladder {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();


        if(age >= 0 && age <=5){
            System.out.println("infant");
        } else if (age > 5 && age < 13) {
            System.out.println("child");
        } else if (age >= 13 && age <=19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 40) {
            System.out.println("Adult");

        } else if (age>40 && age <=55) {
            System.out.println("Not a senior citizen");
        }else {
            System.out.println("senior citizen");
        }

        s.close();
    }
}
