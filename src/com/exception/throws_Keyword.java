package com.exception;

public class throws_Keyword {
    public static void main(String[] args){
        try{
            divide(15,0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void divide(int a, int b)  {
        System.out.println("Result : " + (a/b));

        System.out.println("hi ");
    }
}
