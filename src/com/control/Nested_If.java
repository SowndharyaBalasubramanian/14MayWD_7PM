package com.control;

public class Nested_If {
    public static void main(String[] args){

        int age = 7;
        if(age > 17 ){

            System.out.println("eligible to vote");
            if( age >= 60){
                System.out.println("senior citizen");
            }else{
                System.out.println("not a senior citizen");
            }
        }
        else{
            System.out.println("not eligible to vote ");
        }
    }
}
