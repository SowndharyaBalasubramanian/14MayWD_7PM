package com.control;

import java.util.Scanner;

public class Decision_Making {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your marks");

        int marks = s.nextInt();

//        if (marks >35){
//            System.out.println("pass mark");
//        }else{
//            System.out.println("fail mark");
//        }

        if(marks >= 35)
            System.out.println("pass mark");
    }

}
