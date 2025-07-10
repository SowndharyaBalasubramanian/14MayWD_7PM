package com.exception;

public class Nested_Exception {
    public static void main(String[] args){

        int  a = 2; int b = 0;

        int [] age = new int[2];
        age[1] = 3;
        age[0] = 5;

//        try{
//            int c = a/b;
//            System.out.println(c);
//
//            System.out.println(age[2]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch(ArithmeticException e1){
//            System.out.println(e1);
//        }

        try{
            System.out.println("outer try block");

            try{
                int c = a/b;
                System.out.println(c);
            }catch(ArithmeticException e1){
                System.out.println(e1);
            }


            try{
                System.out.println(age[3]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }


        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("outer catch block");
        }

        System.out.println("welcome to the nested block");
    }
}
