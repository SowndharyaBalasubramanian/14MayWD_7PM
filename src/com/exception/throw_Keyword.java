package com.exception;

public class throw_Keyword {
    public static void main(String[] args){
        int age = 15;
        if(age < 18){
            throw new ArithmeticException();
        }else{
            System.out.println("you are major");
        }

        System.out.println("ended");
    }
}
