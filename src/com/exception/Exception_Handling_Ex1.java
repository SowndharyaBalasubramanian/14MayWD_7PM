package com.exception;

public class Exception_Handling_Ex1 {
    public static void main(String [] args){

        int a = 15;
        int b = 0;
//       int result = a/b;
//
//        System.out.println(result);
//
//        System.out.println("The code finished execution");

        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException ex){
            System.out.println(ex);
            throw new ArithmeticException("division by zero");  //rethrowing the exception
        }finally {
            System.out.println("I am from finally block");
            System.out.println("closing the file");
        }

      System.out.println("I am finished the execution");
        System.out.println("close the file");
    }
}
